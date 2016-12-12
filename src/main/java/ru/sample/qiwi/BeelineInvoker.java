package ru.sample.qiwi;

import com.sun.xml.internal.ws.client.BindingProviderProperties;
import org.w3c.dom.Document;
import ru.sample.qiwi.Externalsystems.AbstractExternalSystem;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;
import ru.sample.qiwi.beelinesoap.*;

import javax.xml.ws.BindingProvider;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Created by Дмитрий Астахов on 30.11.2016.
 */
public class BeelineInvoker extends AbstractExternalSystem {
    static final int HTTP_REQUEST_TIMEOUT = 30000;

    public BeelineInvoker() {
        super("");
    }

    public void main() throws Exception {
        String input = "phone=79994561221;name=Тест;surname=Тестов;patronymic=Тестович";
        Map<String, String> inputParams = StringHelper.splitParamsStringToMap(input);

        ScoringAndVerificationInterface port = new ScoringAndVerificationService().getScoringAndVerificationPort();
        ((BindingProvider) port).getRequestContext().put(BindingProviderProperties.CONNECT_TIMEOUT, HTTP_REQUEST_TIMEOUT);
        ((BindingProvider) port).getRequestContext().put(BindingProviderProperties.REQUEST_TIMEOUT, HTTP_REQUEST_TIMEOUT);

        GetScoringAndVerification3SdPartyRequest request = createRequest(inputParams);

        GetScoringAndVerification3SdPartyResponse response = null;
        Fault fault = null;
        Exception exception = null;
        try {
            response = port.getScoringAndVerification3SdParty(request);
        } catch (LogicFault logicFault) {
            fault = logicFault.getFaultInfo();
            exception = logicFault;
        } catch (SystemFault systemFault) {
            fault = systemFault.getFaultInfo();
            exception = systemFault;
        } catch (ValidationFault validationFault) {
            fault = validationFault.getFaultInfo();
            exception = validationFault;
        } finally {
            if (fault != null) {
                throw new Exception("(Beeline)Сетевая ошибка отправки запроса к сервису Beeline (" +
                        fault.getFaultCode() + ", " + fault.getFaultMessage() + ")", exception);
            }
        }

//    } catch (LogicFault | SystemFault | ValidationFault e) {
//        throw new Exception("(Beeline)Сетевая ошибка отправки запроса к сервису Beeline", e);
//    }

        String responseXml = parseResponse(response);

        //return responseXml;
    }

    public GetScoringAndVerification3SdPartyRequest createRequest(Map<String, String> inputParams) {
        GetScoringAndVerification3SdPartyRequest request = new GetScoringAndVerification3SdPartyRequest();
        request.setLogin("login"); //request.setLogin(this.getConnectionParams().get("login"));
        request.setPwd("pwd");//request.setPwd(this.getConnectionParams().get("pwd"));
        request.setApproval(true);
        request.setMsisdn(inputParams.get("phone"));
        request.setRequestId(randInt());

        GetScoringAndVerification3SdPartyRequest.Request tmpRequest = new GetScoringAndVerification3SdPartyRequest.Request();
        Scoring scoring = new Scoring();
        scoring.setProduct("scoring");//scoring.setProduct(this.getConnectionParams().get("scoring"));
        tmpRequest.setScoring(scoring);
        request.setRequest(tmpRequest);

        Client client = new Client();
        Individual individual = new Individual();
        individual.setName(inputParams.get("name"));
        individual.setPatronymic(inputParams.get("patronymic"));
        individual.setSurname(inputParams.get("surname"));
        client.setIndividual(individual);
        request.setClient(client);

        return request;
    }

    public String parseResponse(GetScoringAndVerification3SdPartyResponse response) {
        Map<String, String> params = new HashMap<String, String>();
        params.put("resultApproval", response.getResultApproval());
        params.put("resultScoring", response.getResultScoring().getScore());
        params.put("getCallBackResponse", response.getCallBackResponse());

        String responseXML = null;
        try {
            Document doc = XMLHelper.generateXmlFromParams(params, "getScoringAndVerification3SdPartyResponse");
            responseXML = XMLHelper.convertToString(doc);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return responseXML;
    }

    /**
     * Рандомное целое число
     *
     * @return Целое число
     */
    public static int randInt() {
        Random rand = new Random();
        int randomNum = rand.nextInt();

        return randomNum < 0 ? -randomNum : randomNum;
    }
}
