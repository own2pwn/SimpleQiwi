package ru.sample.qiwi;

import com.sun.org.apache.xerces.internal.impl.dv.util.Base64;
import com.sun.xml.internal.ws.client.BindingProviderProperties;
import org.apache.axis2.client.Options;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.message.BasicNameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.sample.qiwi.Externalsystems.HTTPSExternalSystem;
import ru.sample.qiwi.axilink.ws.AxiLinkServiceStub;

import javax.xml.ws.BindingProvider;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Дмитрий Астахов on 09.11.2016.
 */
public class TestAxilinkSoap extends HTTPSExternalSystem {
    private Logger log = LoggerFactory.getLogger(getClass());

    TestAxilinkSoap() {
        super(null);
    }

    @Override
    protected String getUrl() {

//        return "https://reqxml.f-karta.ru/prod/request.php";
        return "http://localhost:8080/axilink-service/CreateApplicationRequest";
//        return "https://demo.axicredit.ru/ps/services/ProcessServer";
    }

    @Override
    protected HttpEntity getHttpEntity(List<NameValuePair> requestParams) throws Exception {
            StringEntity se = new StringEntity(requestParams.get(0).getValue());
            return se;
//        MultipartEntityBuilder builder = null;
//
//        try {
//            builder = MultipartEntityBuilder.create();
////            byte[] request = Hex.decodeHex(requestParams.get(0).getValue().toCharArray());
//
////            builder.addBinaryBody("file", request, ContentType.APPLICATION_OCTET_STREAM, archiveName);
//            builder.addTextBody("xml", requestParams.get(0).getValue(), ContentType.APPLICATION_XML);
//            builder.setBoundary("wayDxR2Q62aZDeJOGimw5sD6gQWJH6Ko5LvaVF0K");
//            builder.setCharset(Consts.UTF_8);
//        } catch (Exception e) {
//            throw new Exception("(Финкарта)Ошибка формирования запроса к сервису Финкарта", e);
//        }
//
//        return builder.build();
    }

    @Override
    public void setHeaders(HttpPost httpPost) {
//        httpPost.setHeader(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=wayDxR2Q62aZDeJOGimw5sD6gQWJH6Ko5LvaVF0K");
//        httpPost.setHeader(HttpHeaders.ACCEPT_ENCODING, "gzip, deflate, br");
//        httpPost.setHeader(HttpHeaders.USER_AGENT, "Mozilla/5.0 (Windows NT 6.3; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/52.0.2743.116 Safari/537.36");
//        httpPost.setHeader(HttpHeaders.ACCEPT, "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,*/*;q=0.8");
//        httpPost.setHeader(HttpHeaders.HOST, "dd.axicredit.ru");
    }

    public void main() throws Exception {
        String input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                "<Application DeliveryOptionCode=\"INT\" ProcessingRequestType=\"DA\">\n" +
                "\t<CreditRequest ProductCategory=\"test_category\" ProductCode=\"code1\"/>\n" +
                "\t<AXI>\n" +
                "\t\t<application_e age=\"50\" add_doc_inn=\"\" add_doc_snils=\"13545473059\" approve_outer_request_flg=\"Y\" bank_account_bik=\"\" bank_account_number=\"\" call_name=\"PRE\" card_exp_date=\"2016-12-31\" card_number=\"1234567891234567\" client_birthdate=\"1988-11-25\" client_middlename=\"ВАДИМОВИЧ\" client_name=\"ПАВЕЛ\" client_surname=\"АБРАМОВ\" consentDate=\"2016-10-04\" consentExpirDate=\"2050-01-01\" consentFlag=\"Y\" consentPurpose=\"1\" email=\"ky3mi488@maik.ru\" gender=\"1\" initial_limit=\"7000.00\" initial_maturity=\"7\" liability=\"Y\" liv_address_city=\"г Подольск, мкр Климовск\" liv_address_flat=\"63\" liv_address_house=\"д 16 \" liv_address_house_bld=\"\" liv_address_house_corp=\"\" liv_address_index=\"142184\" liv_address_region=\"50\" liv_address_street=\"пр-кт 50- летия Октября\" method_credit=\"01\" mob_phone_num=\"9262648873\" otherConsentPurpose=\"\" pasp_birthplace=\"г Подольск \" pass_code=\"500-124\" pass_date_issue=\"2010-05-20\" pass_issued=\"отделением в гор. климовске оуфмс россии по московской обл. в гор. подольск\" pass_number=\"389591\" pass_seria=\"4611\" qiwi_wallet_num=\"\" reg_address_city=\"г Подольск, мкр Климовск\" reg_address_flat=\"63\" reg_address_house=\"д 16\" reg_address_house_bld=\"\" reg_address_house_corp=\"\" reg_address_index=\"142184\" reg_address_region=\"50\" reg_address_street=\"пр-кт 50- летия Октября\" reportUser=\"DD_online\" ya_wallet_num=\"\">\n" +
                "\t\t\t<Equifax>\n" +
                "\t\t\t\t<response_Eq responsecode=\"1\" responsestring=\"Заемщик найден\">\n" +
                "\t\t\t\t\t<title_part_Eq>\n" +
                "\t\t\t\t\t\t<private_Eq birthday=\"25.11.1988\" birthplace=\"Г ПОДОЛЬСК \" firstname=\"ПАВЕЛ\" lastname=\"АБРАМОВ\" middlename=\"ВАДИМОВИЧ\">\n" +
                "\t\t\t\t\t\t\t<doc_Eq docdate=\"20.05.2010\" docno=\"4611389591\" docplace=\"ОТДЕЛЕНИЕМ В ГОР. КЛИМОВСКЕ ОУФМС РОССИИ ПО МОСКОВСКОЙ ОБЛ. В ГОР. ПОДОЛЬСК\" doctype=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<history_title_Eq date=\"04.09.2013\" firstname=\"ПАВЕЛ\" lastname=\"АБРАМОВ\" middlename=\"ВАДИМОВИЧ\">\n" +
                "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"20.05.2010\" docno=\"4611022053\" docplace=\"ОТД.В ГОРОДЕ КЛИМОВСКЕ ОУФМС РОССИИ ПО МО.В Г.ПОДОЛЬСКЕ ОТД.В ГОРОДЕ КЛИМОВСКЕ ОУФМС Р\" doctype=\"1\"/>\n" +
                "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                "\t\t\t\t\t\t</private_Eq>\n" +
                "\n" +
                "\t\t\t\t\t</title_part_Eq>\n" +
                "\t\t\t\t\t<add_part_Eq>\n" +
                "\t\t\t\t\t\t<interest_Eq day=\"3\" hour=\"0\" month=\"0\" quarter=\"0\" week=\"2\" year=\"0\"/>\n" +
                "\t\t\t\t\t\t<own_interest_Eq day=\"3\" hour=\"0\" month=\"0\" quarter=\"0\" week=\"2\" year=\"0\"/>\n" +
                "\t\t\t\t\t\t<scorings_Eq>\n" +
                "\t\t\t\t\t\t\t<scoring_Eq scor_card_id=\"16\" scor_id=\"1476284631015\" scor_name=\"Скоринг для МФО 2.0 (одноразовое погашение)\" score=\"554\"/>\n" +
                "\n" +
                "\t\t\t\t\t\t</scorings_Eq>\n" +
                "\t\t\t\t\t\t<info_requests_Eq>\n" +
                "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"week\"/>\n" +
                "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"day\"/>\n" +
                "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"week\"/>\n" +
                "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"day\"/>\n" +
                "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"day\"/>\n" +
                "\n" +
                "\t\t\t\t\t\t</info_requests_Eq>\n" +
                "\n" +
                "\t\t\t\t\t</add_part_Eq>\n" +
                "\n" +
                "\t\t\t\t</response_Eq>\n" +
                "\n" +
                "\t\t\t</Equifax>\n" +
                "\t\t\t<FPS>\n" +
                "\t\t\t\t<outputVectorResponse_FPS applicationid=\"1813299411\" applicationsfound=\"85\" mainrules=\"1.11=&gt;0;1.12=&gt;0;1.13=&gt;0;1.14=&gt;0;1.15=&gt;0;1.16=&gt;0;1.17=&gt;0;1.18=&gt;0;1.19=&gt;0;1.20=&gt;0;1.21=&gt;0;2.11=&gt;0;2.12=&gt;0;2.13=&gt;0;2.14=&gt;0;2.15=&gt;0;2.16=&gt;0;2.17=&gt;0;2.18=&gt;0;2.19=&gt;0;2.20=&gt;0;2.21=&gt;0;2.22=&gt;0;2.23=&gt;0;2.24=&gt;0;2.25=&gt;0;2.26=&gt;0;2.27=&gt;0;2.28=&gt;0;2.29=&gt;0;2.30=&gt;0;2.31=&gt;0;2.32=&gt;0;2.33=&gt;0;2.34=&gt;0;2.35=&gt;0;2.36=&gt;0;2.37=&gt;0;2.38=&gt;0;\" mainscorevalue=\"0\" specificrules=\"\" status=\"0\"/>\n" +
                "\n" +
                "\t\t\t</FPS>\n" +
                "\t\t\t<AFS>\n" +
                "\t\t\t\t<response_AFS action=\"matchupdate\" appId=\"QH01LL:1355813632\" appVersion=\"1\" appsCount=\"1\" correlationId=\"\" duration=\"13\" matchCount=\"1\" ruleSetId=\"MAIN_2\" rulesCount=\"1\">\n" +
                "\t\t\t\t\t<matchResult_AFS>\n" +
                "\t\t\t\t\t\t<match_MR_AFS appId=\"74947627\" appVersion=\"1\" rule=\"RULE_19_2\"/>\n" +
                "\n" +
                "\t\t\t\t\t</matchResult_AFS>\n" +
                "\n" +
                "\t\t\t\t</response_AFS>\n" +
                "\n" +
                "\t\t\t</AFS>\n" +
                "\t\t\t<FinKarta check_hash=\"\" xsd=\"\">\n" +
                "\t\t\t\t<response_FK>\n" +
                "\t\t\t\t\t<person_FK record_id=\"1\">\n" +
                "\t\t\t\t\t\t<rules_FK rule=\"\">\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A1\" level_3=\"\" rule_date=\"2016-10-10 00:00:00\" rule_flag=\"1\" rule_id=\"1\" rule_name=\"SA\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A9\" level_3=\"\" rule_date=\"\" rule_flag=\"0\" rule_id=\"2\" rule_name=\"Num_srcs\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"\" rule_date=\"\" rule_flag=\"0\" rule_id=\"3\" rule_name=\"Num_All_PL\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.0\" rule_date=\"\" rule_flag=\"0\" rule_id=\"4\" rule_name=\"Num_All_PL_0\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"5\" rule_name=\"Num_All_PL_1\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"6\" rule_name=\"Num_All_PL_2\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"7\" rule_name=\"Num_All_PL_3\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"8\" rule_name=\"Num_All_PL_4\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"9\" rule_name=\"Num_All_PL_5\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"10\" rule_name=\"Num_All_PL_6\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"11\" rule_name=\"Num_All_PL_7\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.8\" rule_date=\"\" rule_flag=\"0\" rule_id=\"12\" rule_name=\"Num_All_PL_8\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.9\" rule_date=\"\" rule_flag=\"0\" rule_id=\"13\" rule_name=\"Num_All_PL_9\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A2\" level_3=\"A2.10\" rule_date=\"\" rule_flag=\"0\" rule_id=\"14\" rule_name=\"Num_All_PL_10\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"\" rule_date=\"\" rule_flag=\"0\" rule_id=\"15\" rule_name=\"Num_PL\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.0\" rule_date=\"\" rule_flag=\"0\" rule_id=\"16\" rule_name=\"Num_PL_0\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"17\" rule_name=\"Num_PL_1\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"18\" rule_name=\"Num_PL_2\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"19\" rule_name=\"Num_PL_3\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"20\" rule_name=\"Num_PL_4\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"21\" rule_name=\"Num_PL_5\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"22\" rule_name=\"Num_PL_6\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"23\" rule_name=\"Num_PL_7\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.8\" rule_date=\"\" rule_flag=\"0\" rule_id=\"24\" rule_name=\"Num_PL_8\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.9\" rule_date=\"\" rule_flag=\"0\" rule_id=\"25\" rule_name=\"Num_PL_9\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A3\" level_3=\"A3.10\" rule_date=\"\" rule_flag=\"0\" rule_id=\"26\" rule_name=\"Num_PL_10\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"27\" rule_name=\"Num_Req_All\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_all\" rule_date=\"\" rule_flag=\"0\" rule_id=\"28\" rule_name=\"NumR_OD_all\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_30\" rule_date=\"\" rule_flag=\"0\" rule_id=\"29\" rule_name=\"NumR_OD_30\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_60\" rule_date=\"\" rule_flag=\"0\" rule_id=\"30\" rule_name=\"NumR_OD_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_90\" rule_date=\"\" rule_flag=\"0\" rule_id=\"31\" rule_name=\"NumR_OD_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_120\" rule_date=\"\" rule_flag=\"0\" rule_id=\"32\" rule_name=\"NumR_OD_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_180\" rule_date=\"\" rule_flag=\"0\" rule_id=\"33\" rule_name=\"NumR_OD_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_360\" rule_date=\"\" rule_flag=\"0\" rule_id=\"34\" rule_name=\"NumR_OD_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.1_360more\" rule_date=\"\" rule_flag=\"0\" rule_id=\"35\" rule_name=\"NumR_OD_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_all\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"36\" rule_name=\"NumR_DIL_all\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_30\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"37\" rule_name=\"NumR_DIL_30\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_60\" rule_date=\"\" rule_flag=\"0\" rule_id=\"38\" rule_name=\"NumR_DIL_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_90\" rule_date=\"\" rule_flag=\"0\" rule_id=\"39\" rule_name=\"NumR_DIL_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_120\" rule_date=\"\" rule_flag=\"0\" rule_id=\"40\" rule_name=\"NumR_DIL_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_180\" rule_date=\"\" rule_flag=\"0\" rule_id=\"41\" rule_name=\"NumR_DIL_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_360\" rule_date=\"\" rule_flag=\"0\" rule_id=\"42\" rule_name=\"NumR_DIL_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A4\" level_3=\"A4.2_360more\" rule_date=\"\" rule_flag=\"0\" rule_id=\"43\" rule_name=\"NumR_DIL_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A10\" level_3=\"\" rule_date=\"\" rule_flag=\"0\" rule_id=\"44\" rule_name=\"PID\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"\" rule_date=\"\" rule_flag=\"0\" rule_id=\"45\" rule_name=\"Num_Type_Contact\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"46\" rule_name=\"Num_Type_Contact_1\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"47\" rule_name=\"Num_Type_Contact_2\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"48\" rule_name=\"Num_Type_Contact_3\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"49\" rule_name=\"Num_Type_Contact_4\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"50\" rule_name=\"Num_Type_Contact_5\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"51\" rule_name=\"Num_Type_Contact_7\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.8\" rule_date=\"\" rule_flag=\"0\" rule_id=\"52\" rule_name=\"Num_Type_Contact_8\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.9\" rule_date=\"\" rule_flag=\"0\" rule_id=\"53\" rule_name=\"Num_Type_Contact_9\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C3\" level_3=\"C3.10\" rule_date=\"\" rule_flag=\"0\" rule_id=\"54\" rule_name=\"Num_Type_Contact_10\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"55\" rule_name=\"Num_Cont_Inf_Mob\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"56\" rule_name=\"Num_Cont_Inf_Home\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.3\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"57\" rule_name=\"Num_Cont_Inf_Work\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"58\" rule_name=\"Num_Cont_Inf_Other\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.5\" rule_date=\"\" rule_flag=\"1\" rule_id=\"59\" rule_name=\"Num_Cont_Inf_Email\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"60\" rule_name=\"Num_Cont_Inf_Soc\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"61\" rule_name=\"Num_Cont_Inf_addrH\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"C6.8\" rule_date=\"\" rule_flag=\"0\" rule_id=\"62\" rule_name=\"Num_Cont_Inf_addrR\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"C\" level_2=\"C6\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"63\" rule_name=\"Num_Cont_Inf\" rule_value=\"3\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"64\" rule_name=\"Num_LastPayment\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1.1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"65\" rule_name=\"Num_LastPayment_30\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"66\" rule_name=\"Num_LastPayment_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"67\" rule_name=\"Num_LastPayment_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"68\" rule_name=\"Num_LastPayment_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"69\" rule_name=\"Num_LastPayment_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"70\" rule_name=\"Num_LastPayment_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D1\" level_3=\"D1.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"71\" rule_name=\"Num_LastPayment_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"72\" rule_name=\"Sum_LastPayment\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2.1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"73\" rule_name=\"Sum_LastPayment_30\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"74\" rule_name=\"Sum_LastPayment_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"75\" rule_name=\"Sum_LastPayment_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"76\" rule_name=\"Sum_LastPayment_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"77\" rule_name=\"Sum_LastPayment_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"78\" rule_name=\"Sum_LastPayment_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"D\" level_2=\"D2\" level_3=\"D2.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"79\" rule_name=\"Sum_LastPayment_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"80\" rule_name=\"Num_promise\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1.1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"81\" rule_name=\"Num_promise_30\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"82\" rule_name=\"Num_promise_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"83\" rule_name=\"Num_promise_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"84\" rule_name=\"Num_promise_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"85\" rule_name=\"Num_promise_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"86\" rule_name=\"Num_promise_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E1\" level_3=\"E1.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"87\" rule_name=\"Num_promise_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"88\" rule_name=\"Sum_promise\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2.1\" rule_date=\"\" rule_flag=\"0\" rule_id=\"89\" rule_name=\"Sum_promise_30\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"90\" rule_name=\"Sum_promise_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"91\" rule_name=\"Sum_promise_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"92\" rule_name=\"Sum_promise_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"93\" rule_name=\"Sum_promise_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"94\" rule_name=\"Sum_promise_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E2\" level_3=\"E2.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"95\" rule_name=\"Sum_promise_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"E\" level_2=\"E4\" level_3=\"\" rule_date=\"\" rule_flag=\"0\" rule_id=\"96\" rule_name=\"Debt_NumAlloc\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"97\" rule_name=\"Num_passprt_SP\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"A12.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"98\" rule_name=\"Num_passprt_SP30\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"A12.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"99\" rule_name=\"Num_passprt_SP60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"A12.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"100\" rule_name=\"Num_passprt_SP90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"A12.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"101\" rule_name=\"Num_passprt_SP120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"A12.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"102\" rule_name=\"Num_passprt_SP180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"A12.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"103\" rule_name=\"Num_passprt_SP360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A12\" level_3=\"A12.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"104\" rule_name=\"Num_passprt_SP360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"105\" rule_name=\"Num_Passprt_Contact\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"A13.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"106\" rule_name=\"Num_Passprt_Contact30\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"A13.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"107\" rule_name=\"Num_Passprt_Contact60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"A13.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"108\" rule_name=\"Num_Passprt_Contact90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"A13.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"109\" rule_name=\"Num_Passprt_Contact120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"A13.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"110\" rule_name=\"Num_Passprt_Contact180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"A13.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"111\" rule_name=\"Num_Passprt_Contact360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"\" level_1=\"A\" level_2=\"A13\" level_3=\"A13.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"112\" rule_name=\"Num_Passprt_Contact360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"113\" rule_name=\"Num_cellph_SP\" rule_value=\"15976\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"114\" rule_name=\"Num_cellph_SP30\" rule_value=\"95\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.2\" rule_date=\"2016-09-11 00:00:00\" rule_flag=\"1\" rule_id=\"115\" rule_name=\"Num_cellph_SP60\" rule_value=\"69\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.3\" rule_date=\"2016-08-11 00:00:00\" rule_flag=\"1\" rule_id=\"116\" rule_name=\"Num_cellph_SP90\" rule_value=\"61\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.4\" rule_date=\"2016-07-13 00:00:00\" rule_flag=\"1\" rule_id=\"117\" rule_name=\"Num_cellph_SP120\" rule_value=\"52\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.5\" rule_date=\"2016-06-13 00:00:00\" rule_flag=\"1\" rule_id=\"118\" rule_name=\"Num_cellph_SP180\" rule_value=\"28\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.6\" rule_date=\"2016-02-25 00:00:00\" rule_flag=\"1\" rule_id=\"119\" rule_name=\"Num_cellph_SP360\" rule_value=\"14000\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.7\" rule_date=\"2015-08-07 00:00:00\" rule_flag=\"1\" rule_id=\"120\" rule_name=\"Num_cellph_SP360more\" rule_value=\"1676\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"\" rule_date=\"2016-10-10 00:00:00\" rule_flag=\"1\" rule_id=\"121\" rule_name=\"Num_Cont_Phn\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.1\" rule_date=\"2016-10-10 00:00:00\" rule_flag=\"1\" rule_id=\"122\" rule_name=\"Num_Cont_Phn30\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"123\" rule_name=\"Num_Cont_Phn60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"124\" rule_name=\"Num_Cont_Phn90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"125\" rule_name=\"Num_Cont_Phn120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"126\" rule_name=\"Num_Cont_Phn180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"127\" rule_name=\"Num_Cont_Phn360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"128\" rule_name=\"Num_Cont_Phn360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"129\" rule_name=\"Num_cellph_SP\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"130\" rule_name=\"Num_cellph_SP30\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"131\" rule_name=\"Num_cellph_SP60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"132\" rule_name=\"Num_cellph_SP90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"133\" rule_name=\"Num_cellph_SP120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"134\" rule_name=\"Num_cellph_SP180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"135\" rule_name=\"Num_cellph_SP360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I3\" level_3=\"I3.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"136\" rule_name=\"Num_cellph_SP360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"\" rule_date=\"2016-10-10 00:00:00\" rule_flag=\"1\" rule_id=\"137\" rule_name=\"Num_Cont_Phn\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.1\" rule_date=\"2016-10-10 00:00:00\" rule_flag=\"1\" rule_id=\"138\" rule_name=\"Num_Cont_Phn30\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"139\" rule_name=\"Num_Cont_Phn60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"140\" rule_name=\"Num_Cont_Phn90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"141\" rule_name=\"Num_Cont_Phn120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"142\" rule_name=\"Num_Cont_Phn180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"143\" rule_name=\"Num_Cont_Phn360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"I\" level_2=\"I8\" level_3=\"I8.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"144\" rule_name=\"Num_Cont_Phn360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M1\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"0\" rule_id=\"145\" rule_name=\"cardFound\" rule_value=\"false\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M21\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"146\" rule_name=\"cntcardusers\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"147\" rule_name=\"cntusercards_all\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"M22.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"148\" rule_name=\"cntusercards_30\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"M22.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"149\" rule_name=\"cntusercards_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"M22.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"150\" rule_name=\"cntusercards_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"M22.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"151\" rule_name=\"cntusercards_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"M22.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"152\" rule_name=\"cntusercards_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"M22.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"153\" rule_name=\"cntusercards_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M22\" level_3=\"M22.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"154\" rule_name=\"cntusercards_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"155\" rule_name=\"NumCrdPhone_all\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"156\" rule_name=\"NumCrdPhone_30\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"157\" rule_name=\"NumCrdPhone_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"158\" rule_name=\"NumCrdPhone_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"159\" rule_name=\"NumCrdPhone_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"160\" rule_name=\"NumCrdPhone_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"161\" rule_name=\"NumCrdPhone_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850541\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"162\" rule_name=\"NumCrdPhone_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"163\" rule_name=\"NumCrdPhone_all\" rule_value=\"572\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"164\" rule_name=\"NumCrdPhone_30\" rule_value=\"96\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.2\" rule_date=\"2016-09-10 00:00:00\" rule_flag=\"1\" rule_id=\"165\" rule_name=\"NumCrdPhone_60\" rule_value=\"95\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.3\" rule_date=\"2016-08-11 00:00:00\" rule_flag=\"1\" rule_id=\"166\" rule_name=\"NumCrdPhone_90\" rule_value=\"81\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.4\" rule_date=\"2016-07-12 00:00:00\" rule_flag=\"1\" rule_id=\"167\" rule_name=\"NumCrdPhone_120\" rule_value=\"68\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.5\" rule_date=\"2016-06-11 00:00:00\" rule_flag=\"1\" rule_id=\"168\" rule_name=\"NumCrdPhone_180\" rule_value=\"28\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.6\" rule_date=\"2016-04-09 00:00:00\" rule_flag=\"1\" rule_id=\"169\" rule_name=\"NumCrdPhone_360\" rule_value=\"146\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"2850540\" level_1=\"M\" level_2=\"M23\" level_3=\"M23.7\" rule_date=\"2015-10-02 00:00:00\" rule_flag=\"1\" rule_id=\"170\" rule_name=\"NumCrdPhone_360more\" rule_value=\"75\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"171\" rule_name=\"NumCrdPassprt_all\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"M24.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"172\" rule_name=\"NumCrdPassprt_30\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"M24.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"173\" rule_name=\"NumCrdPassprt_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"M24.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"174\" rule_name=\"NumCrdPassprt_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"M24.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"175\" rule_name=\"NumCrdPassprt_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"M24.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"176\" rule_name=\"NumCrdPassprt_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"M24.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"177\" rule_name=\"NumCrdPassprt_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M24\" level_3=\"M24.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"178\" rule_name=\"NumCrdPassprt_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"179\" rule_name=\"NumCrdEmail_all\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"M25.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"180\" rule_name=\"NumCrdEmail_30\" rule_value=\"2\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"M25.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"181\" rule_name=\"NumCrdEmail_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"M25.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"182\" rule_name=\"NumCrdEmail_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"M25.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"183\" rule_name=\"NumCrdEmail_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"M25.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"184\" rule_name=\"NumCrdEmail_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"M25.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"185\" rule_name=\"NumCrdEmail_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"16193\" level_1=\"M\" level_2=\"M25\" level_3=\"M25.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"186\" rule_name=\"NumCrdEmail_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"187\" rule_name=\"cntcardsourses_all\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"M28.1\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"188\" rule_name=\"cntcardsourses_30\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"M28.2\" rule_date=\"\" rule_flag=\"0\" rule_id=\"189\" rule_name=\"cntcardsourses_60\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"M28.3\" rule_date=\"\" rule_flag=\"0\" rule_id=\"190\" rule_name=\"cntcardsourses_90\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"M28.4\" rule_date=\"\" rule_flag=\"0\" rule_id=\"191\" rule_name=\"cntcardsourses_120\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"M28.5\" rule_date=\"\" rule_flag=\"0\" rule_id=\"192\" rule_name=\"cntcardsourses_180\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"M28.6\" rule_date=\"\" rule_flag=\"0\" rule_id=\"193\" rule_name=\"cntcardsourses_360\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M28\" level_3=\"M28.7\" rule_date=\"\" rule_flag=\"0\" rule_id=\"194\" rule_name=\"cntcardsourses_360more\" rule_value=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<rule_FK data_record_id=\"1\" level_1=\"M\" level_2=\"M36\" level_3=\"\" rule_date=\"2016-10-12 00:00:00\" rule_flag=\"1\" rule_id=\"195\" rule_name=\"cntallcardsusers\" rule_value=\"1\"/>\n" +
                "\t\t\t\t\t\t</rules_FK>\n" +
                "\t\t\t\t\t</person_FK>\n" +
                "\t\t\t\t</response_FK>\n" +
                "\n" +
                "\t\t\t</FinKarta>\n" +
                "\t\t\t<FSSP/>\n" +
                "\t\t\t<Response_QIWI Description=\"Успешно\" ExtId=\"4aef8c2a9103018b4fc7\" Result=\"OK\">\n" +
                "\t\t\t\t<Data_QIWI Startdate=\"2015-01-01\" type=\"y\">\n" +
                "\t\t\t\t\t<Period_QIWI firstdate=\"2015-01-01\" number=\"0\">\n" +
                "\t\t\t\t\t\t<Bank_QIWI count=\"0\" sum=\"0\"/>\n" +
                "\t\t\t\t\t\t<Utility_QIWI count=\"0\" sum=\"0\"/>\n" +
                "\t\t\t\t\t\t<Phone_QIWI count=\"2\" sum=\"1000\"/>\n" +
                "\t\t\t\t\t</Period_QIWI>\n" +
                "\t\t\t\t</Data_QIWI>\n" +
                "\t\t\t\t<AggregatedData_QIWI ActualDate=\"2016-01-01\" AverageSum=\"500\" FirstPayDate=\"2015-06-02\" FirstPaymentRegion=\"Московская обл\" LastPayDate=\"2015-07-01\" LastPaymentRegion=\"Московская обл\" MAXGAPDAYS=\"0\" MaxDifferenceInDays=\"29\" MaxPayHour=\"20\" MaxPayment1Month=\"0\" MaxPayment3Month=\"0\" MaxPayment6Month=\"500\" MaxPaymentRegion=\"Московская обл\" Payments1MonthCount=\"0\" Payments1MonthSum=\"0\" Payments3MonthCount=\"0\" Payments3MonthSum=\"0\" Payments6MonthCount=\"1\" Payments6MonthSum=\"500\" PaymentsForMaxPaymentsCountProvider=\"2\" PhoneNumber=\"9262648873\" ProviderWithMaximumPaymentsCount=\"Столичный филиал ОАО «МегаФон»\" ProviderWithMaximumPaymentsSum=\"Столичный филиал ОАО «МегаФон»\" RosSvyaz_Operator=\"\" RosSvyaz_Region=\"\" TotalMaxPayment=\"500\" TotalPaymentsCount=\"2\" TotalPaymentsSum=\"1000\" life_period=\"2\" pay_time=\"20\" prob_def=\"0\" prob_resp=\"0\" region_maxpays=\"Московская обл\" region_maxpayscount=\"2\" region_percent=\"100\"/>\n" +
                "\t\t\t</Response_QIWI>\n" +
                "\n" +
                "\t\t\t<NBKI>\n" +
                "\t\t\t\t<product_NBKI>\n" +
                "\t\t\t\t\t<prequest_NBKI>\n" +
                "\t\t\t\t\t\t<req_NBKI IOType=\"B2B\" OutputFormat=\"XML\" lang=\"ru\">\n" +
                "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" apartment=\"63\" city=\"г Подольск, мкр Климовск\" houseNumber=\"д 16\" postal=\"142184\" street=\"пр-кт 50- летия Октября\"/>\n" +
                "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" apartment=\"63\" city=\"г Подольск, мкр Климовск\" houseNumber=\"д 16 \" postal=\"142184\" street=\"пр-кт 50- летия Октября\"/>\n" +
                "\t\t\t\t\t\t\t<Id_NBKI idNum=\"389591\" idType=\"21\" idTypeText=\"Паспорт гражданина РФ\" issueAuthority=\"отделением в гор. климовске оуфмс россии по московской обл. в гор. подольск\" issueCountry=\"отделением в гор. климовске оуфмс россии по московской обл. в гор. подольск\" issueDate=\"2010-05-20\" seriesNumber=\"4611\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" inqAmount=\"7000\" inqPurpose=\"99\">\n" +
                "\t\t\t\t\t\t\t\t<ConsentReq_NBKI consentDate=\"2007-05-28\" consentExpireDate=\"2018-05-28\" consentFlag=\"Y\" consentPurpose=\"2\" liability=\"Y\" reportUser=\"ООО Микрофинансовая организация &#34;Домашние деньги&#34;\"/>\n" +
                "\t\t\t\t\t\t\t</Inquiry_NBKI>\n" +
                "\t\t\t\t\t\t\t<Person_NBKI birthDt=\"1988-11-25\" first=\"ПАВЕЛ\" name1=\"АБРАМОВ\" paternal=\"ВАДИМОВИЧ\" placeOfBirth=\"г Подольск \"/>\n" +
                "\t\t\t\t\t\t\t<Requestor_NBKI MemberCode=\"QH01LL000000\" UserID=\"QH01LL000003\"/>\n" +
                "\t\t\t\t\t\t\t<Ref_NBKI product=\"CHST\"/>\n" +
                "\t\t\t\t\t\t</req_NBKI>\n" +
                "\t\t\t\t\t</prequest_NBKI>\n" +
                "\t\t\t\t\t<preply_NBKI>\n" +
                "\t\t\t\t\t\t<report_NBKI MemberCodeStatus=\"\" addOns=\"\" groups=\"\" inqControlNum=\"687672218\">\n" +
                "\t\t\t\t\t\t\t<Subject_NBKI fileSinceDt=\"2013-04-22\" lastUpdatedDt=\"2013-04-22\"/>\n" +
                "\t\t\t\t\t\t\t<Person_NBKI birthDt=\"1988-11-25\" dataValidity=\"\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2013-04-22\" first=\"ПАВЕЛ\" freezeFlag=\"0\" lastUpdatedDt=\"2013-04-22\" name1=\"АБРАМОВ\" nationality=\"\" paternal=\"ВАДИМОВИЧ\" placeOfBirth=\"КЛИМОВСК\" serialNum=\"69355524\" suppressFlag=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<Id_NBKI dataValidity=\"\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2013-04-22\" freezeFlag=\"0\" idNum=\"022053\" idType=\"21\" idTypeText=\"Паспорт гражданина РФ\" issueAuthority=\"НЕТ\" issueCountry=\"НЕТ\" issueDate=\"2010-05-20\" lastUpdatedDt=\"2013-04-22\" serialNum=\"251164369\" seriesNumber=\"4611\" suppressFlag=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" addressTypeText=\"Адрес прописки\" apartment=\"\" block=\"\" building=\"\" city=\"НЕТ\" countryCode=\"\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2013-04-22\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2013-04-22\" serialNum=\"497109450\" street=\"НЕТ\" suppressFlag=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" addressTypeText=\"Адрес проживания\" apartment=\"\" block=\"\" building=\"\" city=\"НЕТ\" countryCode=\"\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2013-04-22\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2013-04-22\" serialNum=\"497109452\" street=\"НЕТ\" suppressFlag=\"0\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687672212\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687636325\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687636318\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687634847\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687634836\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687625962\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687625957\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687609920\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687609911\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687519222\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"687519202\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"665691811\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 60 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"329507938\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"более 1 года\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"290086785\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"более 1 года\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"240079938\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"более 1 года\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                "\t\t\t\t\t\t\t<OwnInquiries_NBKI>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687672212\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687636325\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687636318\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687634847\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687634836\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687625962\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687625957\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687609920\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687609911\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687519222\"/>\n" +
                "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"687519202\"/>\n" +
                "\t\t\t\t\t\t\t</OwnInquiries_NBKI>\n" +
                "\t\t\t\t\t\t\t<Calculations_NBKI collectionsInquiries=\"12\" mostRecentInqText=\"последние 7 дней\" negativeRating=\"0\" recentInquiries=\"11\" reportIssueDateTime=\"2016-10-12\" totalAccts=\"0\" totalActiveBalanceAccounts=\"0\" totalApprovedIPRecords=\"0\" totalBankruptcies=\"0\" totalDefaultFlagIPRecords=\"0\" totalDisputedAccounts=\"0\" totalDisputedBankruptcy=\"0\" totalDisputedIPItem=\"0\" totalDisputedLegalItem=\"0\" totalDisputedOfficialInfo=\"0\" totalIPRecords=\"0\" totalInquiries=\"15\" totalLegalItems=\"0\" totalOfficialInfo=\"0\" totalRejectedIPRecords=\"0\"/>\n" +
                "\t\t\t\t\t\t</report_NBKI>\n" +
                "\t\t\t\t\t</preply_NBKI>\n" +
                "\t\t\t\t</product_NBKI>\n" +
                "\t\t\t</NBKI>\n" +
                "\t\t</application_e>\n" +
                "\t</AXI>\n" +
                "</Application>";

            // Валидный запрос
            input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<Application DeliveryOptionCode=\"INT\" ProcessingRequestType=\"DA\" StrategySelectionRandomNumber=\"28\" Timestamp=\"2016-11-10T13:58:38+03:00\" TransactionId=\"167772191:-206e7265:157fc77d05d:-e7a\">\n" +
                    "\t<MessageList StatusCode=\"0\" StatusDescription=\"Successful\"/>\n" +
                    "\t<CreditRequest ProductCategory=\"test_category\" ProductCode=\"code1\"/>\n" +
                    "\t<DecisionResponse>\n" +
                    "\t\t<Product DecisionFlowName=\"df_NBKI_CS\" LastStepName=\"set_next_steps\" OriginType=\"Request\" ProductCategory=\"PDL\" ProductCode=\"pdln_CS\" ProductStatusIndicator=\"Complete\" StrategyName=\"ps_pdl_CS\">\n" +
                    "\t\t\t<Decision DecisionIndex=\"0\" DecisionResult=\"Decline\" DecisionStatusIndicator=\"Final\" ImplementationName=\"rs_NBKI_stops2_CS\" ImplementationType=\"Ruleset\">\n" +
                    "\t\t\t\t<Reason RankOrderNumber=\"1\">\n" +
                    "\t\t\t\t\t<ReasonText>nbki_0001</ReasonText>\n" +
                    "\t\t\t\t</Reason>\n" +
                    "\t\t\t</Decision>\n" +
                    "\t\t</Product>\n" +
                    "\t</DecisionResponse>\n" +
                    "\t<AXI>\n" +
//                    "\t\t<application_e age=\"50\" add_doc_inn=\"\" add_doc_snils=\"\" approve_outer_request_flg=\"Y\" bank_account_bik=\"044206604\" bank_account_number=\"40817810635000525072\" call_name=\"PRE\" card_exp_date=\"\" card_number=\"\" card_region_flg=\"0\" client_birthdate=\"1991-06-06\" client_middlename=\"ВИКТОРОВИЧ\" client_name=\"АЛЕКСАНДР\" client_surname=\"КАМАКИН\" consentDate=\"2016-11-10\" consentExpirDate=\"2050-01-01\" consentFlag=\"Y\" consentPurpose=\"1\" email=\"kamakin7@yandex.ru\" gender=\"1\" initial_limit=\"15000.00\" initial_maturity=\"30\" liability=\"Y\" liv_address_city=\"г Елец \" liv_address_flat=\"2\" liv_address_house=\"д 2 \" liv_address_house_bld=\"\" liv_address_house_corp=\"\" liv_address_index=\"399773\" liv_address_region=\"48\" liv_address_street=\"ул Яна Фабрициуса\" method_credit=\"04\" mob_phone_num=\"9046991069\" otherConsentPurpose=\"\" pasp_birthplace=\"Елец\" pass_code=\"480-012\" pass_date_issue=\"2013-10-17\" pass_issued=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" pass_number=\"837837\" pass_seria=\"4213\" qiwi_wallet_num=\"\" reg_address_city=\"г Елец \" reg_address_flat=\"2\" reg_address_house=\"д 2 \" reg_address_house_bld=\"\" reg_address_house_corp=\"\" reg_address_index=\"399773\" reg_address_region=\"48\" reg_address_street=\"ул Яна Фабрициуса\" reportUser=\"DD_online\" ya_wallet_num=\"\">\n" +
                    "<application_e ApplicationDate=\"2016-12-14\" ApplicationId=\"c28a3adf-c153-4fee-973b-bc81cc991992\" CallFailed=\"false\" add_doc_inn=\"\" add_doc_snils=\"\" approve_outer_request_flg=\"Y\" bank_account_bik=\"047102651\" bank_account_number=\"40817810167101071670\" call_name=\"FPS\" card_bl_flg=\"0\" card_current_flg=\"0\" card_exp_date=\"\" card_number=\"\" card_region_flg=\"0\" client_birthdate=\"1993-08-11\" client_middlename=\"СЕРГЕЕВНА\" client_name=\"ЕЛЕНА\" client_surname=\"ЧУБА\" consentDate=\"2016-12-14\" consentExpirDate=\"2017-12-14\" consentFlag=\"Y\" consentPurpose=\"1\" cook_bl_flg=\"0\" cook_current_flg=\"0\" email=\"chuba-1987@mail.ru\" email_bl_flg=\"0\" gender=\"0\" initial_limit=\"7000.00\" initial_maturity=\"30\" inner_ip_bl_flg=\"0\" ip_pass_bl_flg=\"0\" ip_pay_bl_flg=\"0\" ip_temp_pass_bl_flg=\"0\" ip_temp_pay_bl_flg=\"0\" liability=\"Y\" liv_address_city=\"г Тобольск \" liv_address_flat=\"14\" liv_address_house=\"23\" liv_address_house_bld=\"\" liv_address_house_corp=\"\" liv_address_index=\"626150\" liv_address_region=\"72\" liv_address_street=\"мкр 7-й А\" method_credit=\"04\" mob_phone_num=\"9827805443\" otherConsentPurpose=\"\" pasp_birthplace=\"тобольск\" pass_code=\"720-028\" pass_date_issue=\"2015-10-08\" pass_issued=\"межрайонным отделом уфмс россии по тюменской области в городе тобольске\" pass_number=\"177888\" pass_seria=\"7115\" qiwi_wallet_num=\"\" reg_address_city=\"г Тобольск \" reg_address_flat=\"14\" reg_address_house=\"23\" reg_address_house_bld=\"\" reg_address_house_corp=\"\" reg_address_index=\"626150\" reg_address_region=\"72\" reg_address_street=\"мкр 7-й А\" reportUser=\"DD_online\" user_bl_flg=\"0\" user_id=\"1481704584\" ya_wallet_num=\"\">" +
                    "\t\t\t<product_e program_max_lim=\"15000.0\"/>\n" +
                    "\t\t\t<calc payment_method_cnt=\"1\" pre_limit=\"2000.0\"/>\n" +
                    "\t\t\t<innerCH DD_active_app_flg=\"0\" DD_died_flg=\"0\" DD_last_cred_live_addr_is_equal_flg=\"0\" DD_last_cred_mobile_is_equal_flg=\"0\" DD_last_cred_pass_is_equal_flg=\"0\" DD_last_cred_reg_addr_is_equal_flg=\"0\" DD_live_addr_is_equal_flg=\"0\" DD_many_apps_flg=\"1\" DD_mobile_is_equal_flg=\"0\" DD_pass_is_equal_flg=\"0\" DD_reg_addr_is_equal_flg=\"0\" NumPaid=\"0\" account_current_limit=\"0.00\" active_app_flg=\"1\" active_cred_balance=\"0\" active_cred_current_DD_overdue_days=\"0\" active_cred_max_DD_overdue_days=\"0\" active_cred_overdue_sum=\"0\" active_cred_ratio_balance=\"0\" active_cred_ratio_term=\"0\" age=\"25\" applicant_bl_flg=\"0\" card_current_limit=\"0.00\" close_active_cred_flg=\"0\" current_cred_DD_flg=\"0\" current_cred_flg=\"0\" day_current_limit=\"86000.00\" fms_decline_flg=\"0\" id_device=\"\" inn_is_valid_flg=\"1\" ip_device=\"\" is_client_DD_flg=\"0\" is_preapproved=\"0\" last_cred_close_dt=\"1991-01-01\" last_cred_is_cession_flg=\"0\" last_cred_is_fraud_flg=\"0\" last_cred_is_paid_flg=\"0\" last_cred_max_overdue_days=\"0\" live_addr_bl_flg=\"0\" live_addr_sum=\"0.00\" live_region_bl_flg=\"0\" max_total_overdue_days=\"0\" mob_phone_bl_flg=\"0\" moratory_flg=\"0\" num_paid_credits=\"0\" pass_bl_flg=\"0\" preapproved_limit=\"0\" qiwi_current_limit=\"0.00\" recent_agent_decline_flg=\"0\" recent_client_decline_flg=\"0\" recent_postver_decline_flg=\"0\" recent_score_decline_flg=\"0\" recent_verif_decline_flg=\"0\" reg_addr_bl_flg=\"0\" reg_addr_sum=\"0.00\" reg_region_bl_flg=\"0\" region_mob_bl_flg=\"0\" region_site_bl_flg=\"0\" repeated_DD_flg=\"0\" repeated_flg=\"0\" snils_is_valid_flg=\"1\" terrorist_flg=\"0\" unistream_current_limit=\"0.00\" yandex_current_limit=\"0.00\">\n" +
                    "\t\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t\t<Name>dm_dd_last_cred</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>9445.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t\t<Name>dm_dd_last_cred</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>9445.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t\t<Name>dm_dd_last_cred</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>9445.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodHistory>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</innerCH>\n" +
                    "\t\t\t<decision_e/>\n" +
                    "\t\t\t<policyRules stop_factors=\"nbki_0001;\"/>\n" +
                    "\t\t\t<score/>\n" +
                    "\t\t\t<verif/>\n" +
                    "\t\t\t<Equifax>\n" +
                    "\t\t\t\t<response_Eq dateofreport=\"2016-11-10\" num=\"1\" report_type=\"28343\" responsecode=\"1\" responsestring=\"Клиент найден и у него есть кредитная история\">\n" +
                    "\t\t\t\t\t<title_part_Eq>\n" +
                    "\t\t\t\t\t\t<private_Eq birthday=\"1991-06-06\" birthplace=\"ГОР.ЕЛЕЦ ЛИПЕЦКОЙ ОБЛ.\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-19\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-21\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-21\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛ. В Г. ЕЛЬЦЕ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-21\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-22\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"480-012\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-28\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОУФМС РФ ПО ЛИПЕЦКОЙ ОБЛ В Г ЕЛЬЦЕ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-29\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2012-12-14\" docno=\"4211729365\" docplace=\"480-012 ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2013-12-13\" firstname=\"АЛЕКСАНДР\" lastname=\"КАМАКИН\" middlename=\"ВИКТОРОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2005-07-21\" docno=\"4205218712\" docplace=\"482-010 ОВД Г ЕЛЬЦА\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t</private_Eq>\n" +
                    "\n" +
                    "\t\t\t\t\t</title_part_Eq>\n" +
                    "\t\t\t\t\t<base_part_Eq addr_fact=\"RU, 399770, 42, ЕЛЕЦ, ЯНА-ФАБРИЦИУСА, Д.2, КВ.2\" addr_reg=\"RU, 399770, 42, ЕЛЕЦ, ЯНА-ФАБРИЦИУСА, Д.2, КВ.2\">\n" +
                    "\t\t\t\t\t\t<history_addr_Eq>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"ЕЛЕЦ,ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2011-06-05\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 399773, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-29\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"ЕЛЕЦ,ЯНА ФАБРИЦИУСА,2,2\" date=\"2012-03-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 399774, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, Д.2\" date=\"2016-10-28\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 399770, 42, ЕЛЕЦ Г, ЯНА-ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 399773, 42, Г ЕЛЕЦ, УЛ ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 000000, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 399774, 42, Г ЕЛЕЦ, УЛ.ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 399774, 42, Г ЕЛЕЦ, УЛ.ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 000000, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 399773, 42, Г ЕЛЕЦ, УЛ ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 399770, 42, ЕЛЕЦ Г, ЯНА-ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 399774, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, Д.2\" date=\"2016-10-28\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"ЕЛЕЦ,ЯНА ФАБРИЦИУСА,2,2\" date=\"2012-03-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 399773, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-29\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"ЕЛЕЦ,ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2011-06-05\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t\t</history_addr_Eq>\n" +
                    "\t\t\t\t\t\t<addr_requests_Eq>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"117418, РОССИЯ, МОСКВА, УЛ. МАРГАРИТОК 42/1, 118\" date=\"2016-08-25\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"399770, 399770, ЛИПЕЦКАЯ ОБЛ., ЕЛЕЦ, ЯНА-ФАБРИЦИУСА, 2\" date=\"2016-11-02\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"117418, РОССИЯ, МОСКВА, УЛ. МАРГАРИТОК 42/1, 118\" date=\"2016-08-25\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"399770, 399770, ЛИПЕЦКАЯ ОБЛ., ЕЛЕЦ, ЯНА-ФАБРИЦИУСА, 2\" date=\"2016-11-02\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"399774, РОССИЯ, ЛИПЕЦКАЯ, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2016-08-29\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"000000, RU, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"399774, РОССИЯ, ЛИПЕЦКАЯ, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2016-08-29\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"000000, RU, 42, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"399774, ЕЛЕЦ Г, ЯНА ФАБРИЦИУСА УЛ, ДОМ 2, СТР , КВ 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"399774, RU, 42, Г ЕЛЕЦ, EMPTY, УЛ ЯНА ФАБРИЦИУСА, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"399774, ЕЛЕЦ Г, ЯНА ФАБРИЦИУСА УЛ, ДОМ 2, СТР , КВ 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"399774, RU, 42, Г ЕЛЕЦ, УЛ ЯНА ФАБРИЦИУСА, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"000000, Г ЕЛЕЦ, УЛ.ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"111111, 111111, ЛИПЕЦКАЯ ОБЛАСТЬ, ЕЛЕЦ, ЯНА-ФАБРИЦИУСА, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"000000, Г ЕЛЕЦ, УЛ.ЯНА ФАБРИЦИУСА, Д.2, КВ.2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"111111, 111111, ЛИПЕЦКАЯ ОБЛАСТЬ, ЕЛЕЦ, ЯНА-ФАБРИЦИУСА, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"399773, RU, 42, Г ЕЛЕЦ, УЛ ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"399773, РОССИЯ, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, 2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"399773, RU, 42, Г ЕЛЕЦ, УЛ ЯНА ФАБРИЦИУСА, 2, 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"399773, РОССИЯ, ЕЛЕЦ, ЯНА ФАБРИЦИУСА, 2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"000000, РОССИЯ, , , , \" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"000000, РОССИЯ, ЕЛЕЦ, ЯНА-ФАБРИЦИУСА, 2, \" date=\"2016-10-18\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t\t</addr_requests_Eq>\n" +
                    "\t\t\t\t\t\t<phones_Eq>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-28\" phone_number=\"+79191609012\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-29\" phone_number=\"79046991069\" phone_type=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-29\" phone_number=\"70000000000\" phone_type=\"9\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-29\" phone_number=\"79205341562\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-28\" phone_number=\"+79205341562\" phone_type=\"2\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-20\" phone_number=\"79191609012\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-28\" phone_number=\"+79046991069\" phone_type=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-19\" phone_number=\"89046991069\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-24\" phone_number=\"9046991069\" phone_type=\"1\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t\t</phones_Eq>\n" +
                    "\t\t\t\t\t\t<credit_Eq cred_active=\"1\" cred_active_date=\"2016-03-05\" cred_collateral=\"0\" cred_currency=\"RUR\" cred_date=\"2011-05-05\" cred_date_payout=\"2011-05-15\" cred_day_overdue=\"1948\" cred_enddate=\"2021-05-06\" cred_first_load=\"2011-05-24\" cred_id=\"529420543\" cred_max_overdue=\"3011.7\" cred_owner=\"0\" cred_partner_type=\"1\" cred_person_num=\"1\" cred_prolong=\"0\" cred_ratio=\"0\" cred_sum=\"3020.00\" cred_sum_debt=\"0.00\" cred_sum_limit=\"8.30\" cred_sum_overdue=\"3011.7\" cred_sum_payout=\"6210.00\" cred_sum_type=\"0\" cred_type=\"04\" cred_update=\"2016-03-05\" delay30=\"0\" delay5=\"0\" delay60=\"0\" delay90=\"0\" delay_more=\"0\"/>\n" +
                    "\t\t\t\t\t\t<credit_Eq cred_active=\"1\" cred_active_date=\"2016-10-21\" cred_collateral=\"0\" cred_currency=\"RUR\" cred_date=\"2016-10-21\" cred_date_payout=\"1900-02-01\" cred_day_overdue=\"0\" cred_enddate=\"2016-11-20\" cred_first_load=\"2016-10-23\" cred_full_cost=\"730.000\" cred_id=\"1931350827\" cred_max_overdue=\"0\" cred_owner=\"0\" cred_partner_type=\"3\" cred_person_num=\"1\" cred_prolong=\"0\" cred_ratio=\"0\" cred_sum=\"4000.00\" cred_sum_debt=\"4000.00\" cred_sum_limit=\"0.00\" cred_sum_overdue=\"0\" cred_sum_payout=\"0.00\" cred_sum_type=\"0\" cred_type=\"19\" cred_update=\"2016-11-07\" delay30=\"0\" delay5=\"0\" delay60=\"0\" delay90=\"0\" delay_more=\"0\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t</base_part_Eq>\n" +
                    "\t\t\t\t\t<add_part_Eq>\n" +
                    "\t\t\t\t\t\t<interest_Eq day=\"0\" hour=\"0\" month=\"12\" quarter=\"3\" week=\"0\" year=\"0\"/>\n" +
                    "\t\t\t\t\t\t<own_interest_Eq day=\"0\" hour=\"0\" month=\"0\" quarter=\"0\" week=\"0\" year=\"0\"/>\n" +
                    "\t\t\t\t\t\t<scorings_Eq>\n" +
                    "\t\t\t\t\t\t\t<scoring_Eq scor_card_id=\"15\" scor_id=\"1478775503862\" scor_name=\"Скоринг для МФО 2.0 (одноразовое погашение)\" score=\"487\"/>\n" +
                    "\n" +
                    "\t\t\t\t\t\t</scorings_Eq>\n" +
                    "\t\t\t\t\t\t<attrs_Eq>\n" +
                    "\t\t\t\t\t\t\t<package_Eq id=\"27\" name=\"Расширение базового кредитного отчета\">\n" +
                    "\t\t\t\t\t\t\t\t<section_Eq id=\"23\" name=\"Кредитная часть (расширенная)\">\n" +
                    "\t\t\t\t\t\t\t\t\t<period_Eq>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"529420543\" n=\"831\" v=\"--------BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB9876543200\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"1931350827\" n=\"705\" v=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"529420543\" n=\"706\" v=\"302\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"1931350827\" n=\"706\" v=\"5800.00\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"529420543\" n=\"705\" v=\"6210\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"1931350827\" n=\"831\" v=\"00\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t\t\t\t\t</period_Eq>\n" +
                    "\n" +
                    "\t\t\t\t\t\t\t\t</section_Eq>\n" +
                    "\n" +
                    "\t\t\t\t\t\t\t</package_Eq>\n" +
                    "\n" +
                    "\t\t\t\t\t\t</attrs_Eq>\n" +
                    "\t\t\t\t\t\t<info_requests_Eq>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"quarter\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"1.00\" cred_partner_type=\"3\" cred_sum=\"6000.00\" cred_type=\"19\" timeslot=\"quarter\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" request_reason=\"0\" timeslot=\"quarter\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"1.00\" cred_partner_type=\"3\" cred_sum=\"4000.00\" cred_type=\"19\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"12.00\" cred_partner_type=\"1\" cred_sum=\"30000.00\" cred_type=\"18\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"0.65\" cred_partner_type=\"3\" cred_sum=\"10000.00\" cred_type=\"19\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t\t</info_requests_Eq>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t</add_part_Eq>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</response_Eq>\n" +
                    "\n" +
                    "\t\t\t</Equifax>\n" +
                    "\t\t\t<NBKI>\n" +
                    "\t\t\t\t<product_NBKI>\n" +
                    "\t\t\t\t\t<prequest_NBKI>\n" +
                    "\t\t\t\t\t\t<req_NBKI IOType=\"B2B\" OutputFormat=\"XML\" lang=\"ru\">\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" apartment=\"2\" city=\"г Елец \" houseNumber=\"д 2 \" postal=\"399773\" street=\"ул Яна Фабрициуса\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" apartment=\"2\" city=\"г Елец \" houseNumber=\"д 2 \" postal=\"399773\" street=\"ул Яна Фабрициуса\"/>\n" +
                    "\t\t\t\t\t\t\t<Id_NBKI idNum=\"837837\" idType=\"21\" idTypeText=\"Паспорт гражданина РФ\" issueAuthority=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" issueCountry=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" issueDate=\"2013-10-17\" seriesNumber=\"4213\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" inqAmount=\"15000\" inqPurpose=\"99\">\n" +
                    "\t\t\t\t\t\t\t\t<ConsentReq_NBKI consentDate=\"2007-05-28\" consentExpireDate=\"2018-05-28\" consentFlag=\"Y\" consentPurpose=\"2\" liability=\"Y\" reportUser=\"ООО Микрофинансовая организация  &#34;Домашние деньги&#34;\"/>\n" +
                    "\t\t\t\t\t\t\t</Inquiry_NBKI>\n" +
                    "\t\t\t\t\t\t\t<Person_NBKI birthDt=\"1991-06-06\" first=\"АЛЕКСАНДР\" name1=\"КАМАКИН\" paternal=\"ВИКТОРОВИЧ\" placeOfBirth=\"Елец\"/>\n" +
                    "\t\t\t\t\t\t\t<Requestor_NBKI MemberCode=\"QH01LL000000\" UserID=\"QH01LL000003\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t\t\t<Ref_NBKI product=\"CHST\"/>\n" +
                    "\t\t\t\t\t\t</req_NBKI>\n" +
                    "\n" +
                    "\t\t\t\t\t</prequest_NBKI>\n" +
                    "\t\t\t\t\t<preply_NBKI>\n" +
                    "\t\t\t\t\t\t<report_NBKI MemberCodeStatus=\"\" addOns=\"\" groups=\"\" inqControlNum=\"698035042\">\n" +
                    "\t\t\t\t\t\t\t<Subject_NBKI fileSinceDt=\"2013-12-12\" lastUpdatedDt=\"2013-12-12\"/>\n" +
                    "\t\t\t\t\t\t\t<Person_NBKI birthDt=\"1991-06-05\" dataValidity=\"\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2013-12-12\" first=\"АЛЕКСАНДР\" freezeFlag=\"0\" lastUpdatedDt=\"2016-11-06\" name1=\"КАМАКИН\" nationality=\"\" paternal=\"ВИКТОРОВИЧ\" placeOfBirth=\"ГОР. ЕЛЕЦ ЛИПЕЦКОЙ ОБЛ.\" serialNum=\"75988040\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Id_NBKI dataValidity=\"\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2013-12-12\" freezeFlag=\"0\" idNum=\"837837\" idType=\"21\" idTypeText=\"Паспорт гражданина РФ\" issueAuthority=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ  ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" issueCountry=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ЕЛЬЦЕ\" issueDate=\"2013-10-17\" lastUpdatedDt=\"2016-10-20\" serialNum=\"273695526\" seriesNumber=\"4213\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" addressTypeText=\"Адрес проживания\" apartment=\"\" block=\"\" building=\"\" city=\"Г ЕЛЕЦ\" countryCode=\"\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894216597\" street=\"УЛ ЯНА ФАБРИЦИУСА\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" addressTypeText=\"Адрес проживания\" apartment=\"\" block=\"\" building=\"\" city=\"ЛИПЕЦКАЯ ОБЛ.\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894467781\" street=\"ЕЛЕЦ Г.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" addressTypeText=\"Адрес проживания\" apartment=\"2\" block=\"0\" building=\"\" city=\"ЕЛЕЦ\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-08-31\" freezeFlag=\"0\" houseNumber=\"2\" lastUpdatedDt=\"2016-10-31\" postal=\"399770\" prov=\"48\" provText=\"Липетская обл.\" resStat=\"5\" resStatText=\"Другое\" serialNum=\"868920539\" street=\"ЯНА ФАБРИЦИУСА\" streetType=\"28\" streetTypeText=\"ул.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" addressTypeText=\"Адрес прописки\" apartment=\"\" block=\"\" building=\"\" city=\"Г ЕЛЕЦ\" countryCode=\"\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894216595\" street=\"УЛ ЯНА ФАБРИЦИУСА\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" addressTypeText=\"Адрес прописки\" apartment=\"2\" block=\"0\" building=\"\" city=\"ЕЛЕЦ\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-08-31\" freezeFlag=\"0\" houseNumber=\"2\" lastUpdatedDt=\"2016-10-31\" postal=\"399770\" prov=\"48\" provText=\"Липетская обл.\" serialNum=\"868920537\" street=\"ЯНА ФАБРИЦИУСА\" streetType=\"28\" streetTypeText=\"ул.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" addressTypeText=\"Адрес прописки\" apartment=\"\" block=\"\" building=\"\" city=\"ЛИПЕЦКАЯ ОБЛ.\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894467779\" street=\"ЕЛЕЦ Г.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"0\" accountRatingDate=\"2016-11-05\" accountRatingText=\"Активный\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtOutstanding=\"5150\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" creditLimit=\"5150\" creditTotalAmt=\"5150\" curBalanceAmt=\"0\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-11-06\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-12-05\" lastPaymtDt=\"1900-01-02\" lastUpdatedDt=\"2016-11-06\" monthsReviewed=\"1\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-11-05\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-12-05\" paymtPat=\"0\" paymtPatStartDt=\"2016-11-05\" reportingDt=\"2016-11-05\" serialNum=\"218562992\" suppressFlag=\"0\" termsAmt=\"6695\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-11-05\" accountRatingText=\"Счет закрыт\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" completePerformDt=\"2016-11-05\" creditLimit=\"5150\" creditTotalAmt=\"6695\" curBalanceAmt=\"6695\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-10-11\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-11-06\" lastPaymtDt=\"2016-11-05\" lastUpdatedDt=\"2016-11-06\" monthsReviewed=\"2\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-10-07\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-11-06\" paymtPat=\"10\" paymtPatStartDt=\"2016-11-05\" reportingDt=\"2016-11-05\" serialNum=\"215904727\" suppressFlag=\"0\" termsAmt=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-10-28\" accountRatingText=\"Счет закрыт\" acctType=\"16\" acctTypeText=\"Микрокредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MFO\" closedDt=\"2016-10-28\" completePerformDt=\"2016-10-28\" creditLimit=\"2000\" creditTotalAmt=\"719\" curBalanceAmt=\"2280\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-10-31\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-10-28\" interestPaymentFrequencyCode=\"7\" interestPaymentFrequencyText=\"Особые условия (единовременная выплата/и т.п.)\" lastPaymtDt=\"2016-10-28\" lastUpdatedDt=\"2016-10-31\" monthsReviewed=\"1\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-10-21\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-10-28\" paymtFreqText=\"Особые условия (единовременная выплата/и т.п.)\" paymtPat=\"0\" paymtPatStartDt=\"2016-10-31\" reportingDt=\"2016-10-31\" serialNum=\"217898329\" suppressFlag=\"0\" termsAmt=\"0\" termsFrequency=\"7\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"0\" accountRatingDate=\"2016-10-21\" accountRatingText=\"Активный\" acctType=\"16\" acctTypeText=\"Микрокредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MFO\" creditLimit=\"4000\" creditTotalAmt=\"730,000\" curBalanceAmt=\"0\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-11-20\" lastPaymtDt=\"1900-01-02\" lastUpdatedDt=\"2016-10-24\" monthsReviewed=\"1\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-10-21\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-11-20\" paymtFreqText=\"Особые условия (единовременная выплата/и т.п.)\" paymtPat=\"0\" paymtPatStartDt=\"2016-10-23\" reportingDt=\"2016-10-23\" serialNum=\"216989500\" suppressFlag=\"0\" termsAmt=\"0\" termsFrequency=\"7\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-10-06\" accountRatingText=\"Счет закрыт\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" completePerformDt=\"2016-10-06\" creditLimit=\"3650\" creditTotalAmt=\"4745\" curBalanceAmt=\"4745\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-09-12\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-10-06\" lastPaymtDt=\"2016-10-06\" lastUpdatedDt=\"2016-10-11\" monthsReviewed=\"2\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-09-06\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-10-06\" paymtPat=\"10\" paymtPatStartDt=\"2016-10-06\" reportingDt=\"2016-10-06\" serialNum=\"213102714\" suppressFlag=\"0\" termsAmt=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-09-05\" accountRatingText=\"Счет закрыт\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" creditLimit=\"1000\" creditTotalAmt=\"\" curBalanceAmt=\"1070\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-09-04\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"\" interestPaymentDueDate=\"2016-09-28\" lastPaymtDt=\"2016-09-05\" lastUpdatedDt=\"2016-09-12\" monthsReviewed=\"2\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-08-29\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-09-28\" paymtPat=\"10\" paymtPatStartDt=\"2016-09-05\" reportingDt=\"2016-09-05\" serialNum=\"212489404\" suppressFlag=\"0\" termsAmt=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"691726435\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 21 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"2000\" inqControlNum=\"689862965\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"665126423\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"689869779\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"4000\" inqControlNum=\"664276902\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"690109209\" inqPurpose=\"07\" inqPurposeText=\"Кредитная карта \" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"10000\" inqControlNum=\"663958097\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"690560006\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"10000\" inqControlNum=\"663958098\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"10000\" inqControlNum=\"690654173\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"315715504\" inqPurpose=\"07\" inqPurposeText=\"Кредитная карта \" inquiryPeriod=\"более 1 года\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"20000\" inqControlNum=\"690749235\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"665736081\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"15000\" inqControlNum=\"690753180\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"693503057\" inqPurpose=\"07\" inqPurposeText=\"Кредитная карта \" inquiryPeriod=\"последние 21 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"690870978\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"15000\" inqControlNum=\"698035030\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"690878751\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"698029836\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"6000\" inqControlNum=\"690891479\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"15000\" inqControlNum=\"698016312\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"45000\" inqControlNum=\"690900413\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"695889501\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 14 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"6000\" inqControlNum=\"690905451\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"695065972\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 14 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"20000\" inqControlNum=\"691062776\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"20000\" inqControlNum=\"695022632\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 14 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"691495780\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 21 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<OwnInquiries_NBKI>\n" +
                    "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"698035030\"/>\n" +
                    "\t\t\t\t\t\t\t</OwnInquiries_NBKI>\n" +
                    "\t\t\t\t\t\t\t<Calculations_NBKI collectionsInquiries=\"27\" mostRecentAcc=\"2016-11-05\" mostRecentInqText=\"последние 7 дней\" negativeRating=\"0\" oldest=\"2016-08-29\" recentInquiries=\"22\" reportIssueDateTime=\"2016-11-10\" totalAccts=\"6\" totalActiveBalanceAccounts=\"2\" totalApprovedIPRecords=\"0\" totalBankruptcies=\"0\" totalDefaultFlagIPRecords=\"0\" totalDisputedAccounts=\"0\" totalDisputedBankruptcy=\"0\" totalDisputedIPItem=\"0\" totalDisputedLegalItem=\"0\" totalDisputedOfficialInfo=\"0\" totalIPRecords=\"0\" totalInquiries=\"28\" totalLegalItems=\"0\" totalOfficialInfo=\"0\" totalRejectedIPRecords=\"0\">\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalHighCredit Code=\"RUB\" Value=\"20950\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalCurrentBalance Code=\"RUB\" Value=\"14790\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalPastDueBalance Code=\"RUB\" Value=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalOutstandingBalance Code=\"RUB\" Value=\"5150\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalScheduledPaymnts Code=\"RUB\" Value=\"6695\"/>\n" +
                    "\t\t\t\t\t\t\t</Calculations_NBKI>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t\t</report_NBKI>\n" +
                    "\n" +
                    "\t\t\t\t\t</preply_NBKI>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</product_NBKI>\n" +
                    "\n" +
                    "\t\t\t</NBKI>\n" +
                    "\t\t\t<FPS>\n" +
                    "\t\t\t\t<outputVectorResponse_FPS applicationid=\"1918251505\" applicationsfound=\"18\" mainrules=\"1.11=&gt;0;1.12=&gt;0;1.13=&gt;0;1.14=&gt;0;1.15=&gt;0;1.16=&gt;0;1.17=&gt;0;1.18=&gt;0;1.19=&gt;0;1.20=&gt;0;1.21=&gt;0;2.11=&gt;0;2.12=&gt;0;2.13=&gt;0;2.14=&gt;0;2.15=&gt;0;2.16=&gt;0;2.17=&gt;0;2.18=&gt;0;2.19=&gt;0;2.20=&gt;0;2.21=&gt;1;2.22=&gt;1;2.23=&gt;0;2.24=&gt;1;2.25=&gt;1;2.26=&gt;1;2.27=&gt;1;2.28=&gt;0;2.29=&gt;0;2.30=&gt;0;2.31=&gt;0;2.32=&gt;1;2.33=&gt;1;2.34=&gt;1;2.35=&gt;0;2.36=&gt;0;2.37=&gt;1;2.38=&gt;0;\" mainscorevalue=\"525\" specificrules=\"\" status=\"0\"/>\n" +
                    "\n" +
                    "\t\t\t</FPS>\n" +
                    "\t\t\t<AFS>\n" +
                    "\t\t\t\t<response_AFS action=\"matchupdate\" appId=\"QH01LL:713990645\" appVersion=\"1\" appsCount=\"2\" correlationId=\"\" duration=\"10\" matchCount=\"7\" ruleSetId=\"MAIN_2\" rulesCount=\"6\">\n" +
                    "\t\t\t\t\t<matchResult_AFS>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_138_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_13_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_137_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_14_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"949a7c9ca778baac83d84001aee3c013\" appVersion=\"1\" rule=\"RULE_103_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"949a7c9ca778baac83d84001aee3c013\" appVersion=\"1\" rule=\"RULE_19_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_19_2\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t\t</matchResult_AFS>\n" +
                    "\n" +
                    "\t\t\t\t</response_AFS>\n" +
                    "\n" +
                    "\t\t\t</AFS>\n" +
                    "\t\t\t<FSSP>\n" +
                    "\t\t\t\t<FSSP_response begin_dt=\"2016-02-16\" debt_sum=\"0\" end_descr=\"ст. 46 ч. 1 п. 3\" end_dt=\"2016-08-11\" exec_prod_reason=\"Задолженность\" id_exec_production=\"8697/16/48011-ИП\"/>\n" +
                    "\t\t\t\t<FSSP_response begin_dt=\"2014-05-12\" debt_sum=\"0\" end_descr=\"ст. 46 ч. 1 п. 3\" end_dt=\"2014-12-12\" exec_prod_reason=\"Задолженность по платежам за жилую площадь, коммунальные платежи, включая пени\" id_exec_production=\"19124/14/11/48\"/>\n" +
                    "\t\t\t\t<FSSP_response begin_dt=\"2014-07-09\" debt_sum=\"0\" end_descr=\"ст. 46 ч. 1 п. 4\" end_dt=\"2014-12-18\" exec_prod_reason=\"Задолженность по платежам за жилую площадь, коммунальные платежи, включая пени\" id_exec_production=\"29873/14/11/48\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</FSSP>\n" +
                    "\t\t\t<DoubleData>\n" +
                    "\t\t\t\t<sa_response_DD sa_1=\"4\" sa_10=\"0\" sa_100=\"-\" sa_101=\"-\" sa_102=\"-\" sa_103=\"-\" sa_104=\"-\" sa_105=\"-\" sa_106=\"-\" sa_107=\"-\" sa_108=\"-\" sa_109=\"-\" sa_11=\"2\" sa_110=\"-\" sa_111=\"-\" sa_112=\"-\" sa_113=\"-\" sa_114=\"-\" sa_115=\"-\" sa_116=\"-\" sa_117=\"-\" sa_118=\"-\" sa_119=\"-\" sa_12=\"0\" sa_120=\"-\" sa_121=\"-\" sa_122=\"-\" sa_123=\"-\" sa_124=\"-\" sa_125=\"-\" sa_126=\"-\" sa_127=\"-\" sa_128=\"-\" sa_129=\"-\" sa_13=\"0\" sa_130=\"-\" sa_131=\"-\" sa_132=\"-\" sa_133=\"-\" sa_134=\"-\" sa_135=\"-\" sa_136=\"-\" sa_137=\"-\" sa_138=\"-\" sa_139=\"-\" sa_14=\"0\" sa_140=\"-\" sa_141=\"-\" sa_142=\"-\" sa_143=\"-\" sa_144=\"-\" sa_145=\"-\" sa_146=\"-\" sa_147=\"-\" sa_148=\"-\" sa_149=\"-\" sa_15=\"0\" sa_150=\"-\" sa_151=\"-\" sa_152=\"-\" sa_153=\"-\" sa_154=\"-\" sa_155=\"-\" sa_156=\"-\" sa_157=\"-\" sa_158=\"-\" sa_159=\"-\" sa_16=\"4\" sa_160=\"-\" sa_161=\"-\" sa_162=\"-\" sa_163=\"-\" sa_164=\"-\" sa_165=\"-\" sa_166=\"-\" sa_167=\"-\" sa_168=\"-\" sa_169=\"-\" sa_17=\"0.08011\" sa_170=\"-\" sa_171=\"-\" sa_172=\"-\" sa_173=\"-\" sa_174=\"-\" sa_175=\"-\" sa_176=\"-\" sa_177=\"-\" sa_178=\"-\" sa_179=\"-\" sa_18=\"0.25691\" sa_180=\"-\" sa_181=\"-\" sa_182=\"-\" sa_183=\"-\" sa_184=\"-\" sa_185=\"-\" sa_186=\"-\" sa_187=\"-\" sa_188=\"-\" sa_189=\"-\" sa_19=\"0.1768\" sa_190=\"-\" sa_191=\"-\" sa_192=\"-\" sa_193=\"-\" sa_194=\"-\" sa_195=\"-\" sa_196=\"-\" sa_197=\"-\" sa_198=\"-\" sa_199=\"-\" sa_2=\"0\" sa_20=\"140\" sa_200=\"-\" sa_21=\"9\" sa_22=\"7\" sa_23=\"0\" sa_24=\"1\" sa_25=\"1\" sa_26=\"0\" sa_27=\"0.06433\" sa_28=\"0.54545\" sa_29=\"0.0\" sa_3=\"2\" sa_30=\"0.0\" sa_31=\"0.0\" sa_32=\"3\" sa_33=\"3\" sa_34=\"6\" sa_35=\"0\" sa_36=\"0.15069\" sa_37=\"-\" sa_38=\"134\" sa_39=\"727\" sa_4=\"2\" sa_40=\"-\" sa_41=\"1\" sa_42=\"2\" sa_43=\"118\" sa_44=\"3.43\" sa_45=\"0\" sa_46=\"1,2,2,0,1,5,2,1,2,4,0,0,5,0,0,3,10,8,0,1,0,0,0,0,0\" sa_47=\"1550\" sa_48=\"0.15958\" sa_49=\"0.28748\" sa_5=\"1\" sa_50=\"0.16531\" sa_51=\"0.05341\" sa_52=\"-\" sa_53=\"-\" sa_54=\"-\" sa_55=\"-\" sa_56=\"-\" sa_57=\"-\" sa_58=\"-\" sa_59=\"-\" sa_6=\"0\" sa_60=\"-\" sa_61=\"-\" sa_62=\"-\" sa_63=\"-\" sa_64=\"-\" sa_65=\"-\" sa_66=\"-\" sa_67=\"-\" sa_68=\"-\" sa_69=\"-\" sa_7=\"1\" sa_70=\"-\" sa_71=\"-\" sa_72=\"-\" sa_73=\"-\" sa_74=\"-\" sa_75=\"-\" sa_76=\"-\" sa_77=\"-\" sa_78=\"-\" sa_79=\"-\" sa_8=\"2013-10-15\" sa_80=\"-\" sa_81=\"-\" sa_82=\"-\" sa_83=\"-\" sa_84=\"-\" sa_85=\"-\" sa_86=\"-\" sa_87=\"-\" sa_88=\"-\" sa_89=\"-\" sa_9=\"2011-04-20\" sa_90=\"-\" sa_91=\"-\" sa_92=\"-\" sa_93=\"-\" sa_94=\"-\" sa_95=\"-\" sa_96=\"-\" sa_97=\"-\" sa_98=\"-\" sa_99=\"-\" social_hit=\"1\" status=\"1\"/>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DoubleData>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_sum_debt_hard</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_count_debt_very_hard</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_sum_debt</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_pass_seria</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>42.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_pass_year_issue</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_full_house</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>30000.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:20.697+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.009+03:00\">\n" +
                    "\t\t\t\t<Name>dm_approve</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.009+03:00\">\n" +
                    "\t\t\t\t<Name>dm_pay_cnt</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.009+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.621+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal6</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal3</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal8</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>487.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal4</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal7</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal5</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.063+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_bankrot</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.063+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_current_overdue_sum</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_sum_current_pay</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>5800.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid2</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value>5800.00</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value>1931350827.000000@</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_microcred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_current_overdue_days</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.125+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_very_bad_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_current_overdue_days</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_date_issue</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_percent_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_close_cred_last_year</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_status_date</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:29.127+03:00\">\n" +
                    "\t\t\t\t<Name>dm_AFS</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:36.371+03:00\">\n" +
                    "\t\t\t\t<Name>dm_FPS</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:29.127+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:28.288+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:37.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_DOUBLE_DATA_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2000.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:36.386+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_sum_debt_very_hard</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal7</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal6</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal5</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal4</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal3</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:37.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_bankrot</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_current_overdue_sum</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_sum_current_pay</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6695.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xVal</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>6695.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid2</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value/>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value/>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_microcred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_max_current_overdue_days</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_very_bad_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_current_overdue_days_0</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_max_date_issue</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_percent_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.33333333333333337</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_close_cred_last_year</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_max_status_date</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<Dummy/> \n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "\t\t\t<Response_QIWI Description=\"Успешно\" ExtId=\"464f83363361c0dce1bb\" Result=\"OK\">\n" +
                    "\t\t\t\t<Data_QIWI Startdate=\"2015-01-01\" type=\"y\">\n" +
                    "\t\t\t\t\t<Period_QIWI firstdate=\"2015-01-01\" number=\"0\">\n" +
                    "\t\t\t\t\t\t<Bank_QIWI count=\"0\" sum=\"0\"/>\n" +
                    "\t\t\t\t\t\t<Utility_QIWI count=\"4\" sum=\"222\"/>\n" +
                    "\t\t\t\t\t\t<Phone_QIWI count=\"3\" sum=\"110\"/>\n" +
                    "\t\t\t\t\t</Period_QIWI>\n" +
                    "\t\t\t\t</Data_QIWI>\n" +
                    "\t\t\t\t<AggregatedData_QIWI ActualDate=\"2016-01-01\" AverageSum=\"47\" FirstPayDate=\"2015-07-19\" FirstPaymentRegion=\"Липецкая обл\" LastPayDate=\"2015-12-02\" LastPaymentRegion=\"Липецкая обл\" MAXGAPDAYS=\"123\" MaxDifferenceInDays=\"123\" MaxPayHour=\"18\" MaxPayment1Month=\"32\" MaxPayment3Month=\"100\" MaxPayment6Month=\"100\" MaxPaymentRegion=\"Липецкая обл\" Payments1MonthCount=\"1\" Payments1MonthSum=\"32\" Payments3MonthCount=\"4\" Payments3MonthSum=\"222\" Payments6MonthCount=\"7\" Payments6MonthSum=\"332\" PaymentsForMaxPaymentsCountProvider=\"4\" PhoneNumber=\"9046991069\" ProviderWithMaximumPaymentsCount=\"Электронная коммерция\" ProviderWithMaximumPaymentsSum=\"Электронная коммерция\" RosSvyaz_Operator=\"\" RosSvyaz_Region=\"\" TotalMaxPayment=\"100\" TotalPaymentsCount=\"7\" TotalPaymentsSum=\"332\" life_period=\"2\" pay_time=\"18\" prob_def=\"0.102976\" prob_resp=\"0.0236955\" region_maxpays=\"Липецкая обл\" region_maxpayscount=\"7\" region_percent=\"100\"/>\n" +
                    "\t\t\t</Response_QIWI>\n" +
                    "\t\t\t<Dummy/>\n" +
                    "\t\t</application_e>    \n" +
                    "\n" +
                    "\t</AXI> \n" +
                    "\n" +
                    "\n" +
                    "</Application>";

            // Тестовый
            input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<Application DeliveryOptionCode=\"INT\" ProcessingRequestType=\"DA\" StrategySelectionRandomNumber=\"28\" Timestamp=\"2016-11-10T13:58:38+03:00\" TransactionId=\"167772191:-206e7265:157fc77d05d:-e7a\">\n" +
                    "\t<MessageList StatusCode=\"0\" StatusDescription=\"Successful\"/>\n" +
                    "\t<CreditRequest ProductCategory=\"test_category\" ProductCode=\"code1\"/>\n" +
                    "\t<DecisionResponse>\n" +
                    "\t\t<Product DecisionFlowName=\"df_NBKI_CS\" LastStepName=\"set_next_steps\" OriginType=\"Request\" ProductCategory=\"PDL\" ProductCode=\"pdln_CS\" ProductStatusIndicator=\"Complete\" StrategyName=\"ps_pdl_CS\">\n" +
                    "\t\t\t<Decision DecisionIndex=\"0\" DecisionResult=\"Decline\" DecisionStatusIndicator=\"Final\" ImplementationName=\"rs_NBKI_stops2_CS\" ImplementationType=\"Ruleset\">\n" +
                    "\t\t\t\t<Reason RankOrderNumber=\"1\">\n" +
                    "\t\t\t\t\t<ReasonText>nbki_0001</ReasonText>\n" +
                    "\t\t\t\t</Reason>\n" +
                    "\t\t\t</Decision>\n" +
                    "\t\t</Product>\n" +
                    "\t</DecisionResponse>\n" +
                    "\t<AXI>\n" +
//                    "\t\t<application_e age=\"50\" add_doc_inn=\"\" add_doc_snils=\"\" approve_outer_request_flg=\"Y\" bank_account_bik=\"044000000\" bank_account_number=\"4081700000000000000\" call_name=\"PRE\" card_exp_date=\"\" card_number=\"\" card_region_flg=\"0\" client_birthdate=\"1991-01-16\" client_middlename=\"Тестов\" client_name=\"Тест\" client_surname=\"Тестович\" consentDate=\"2016-11-10\" consentExpirDate=\"2050-01-01\" consentFlag=\"Y\" consentPurpose=\"1\" email=\"kamakin7@yandex.ru\" gender=\"1\" initial_limit=\"15000.00\" initial_maturity=\"30\" liability=\"Y\" liv_address_city=\"г тест \" liv_address_flat=\"2\" liv_address_house=\"д 2 \" liv_address_house_bld=\"\" liv_address_house_corp=\"\" liv_address_index=\"111222\" liv_address_region=\"48\" liv_address_street=\"ул Тестовая\" method_credit=\"04\" mob_phone_num=\"9040000000\" otherConsentPurpose=\"\" pasp_birthplace=\"Тест\" pass_code=\"111-000\" pass_date_issue=\"2014-10-10\" pass_issued=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" pass_number=\"123123\" pass_seria=\"4444\" qiwi_wallet_num=\"\" reg_address_city=\"г Тест \" reg_address_flat=\"2\" reg_address_house=\"д 2 \" reg_address_house_bld=\"\" reg_address_house_corp=\"\" reg_address_index=\"222333\" reg_address_region=\"48\" reg_address_street=\"ул Тестовая\" reportUser=\"online\" ya_wallet_num=\"\" user_id=\"\" ip_device=\"\">\n" +
//                    "<application_e age=\"50\" CallFailed=\"false\" add_doc_inn=\"\" add_doc_snils=\"\" approve_outer_request_flg=\"Y\" bank_account_bik=\"047102651\" bank_account_number=\"40817810167101071670\" call_name=\"PRE\" card_bl_flg=\"0\" card_current_flg=\"0\" card_exp_date=\"\" card_number=\"\" card_region_flg=\"0\" client_birthdate=\"1993-08-11\" client_middlename=\"СЕРГЕЕВНА\" client_name=\"ЕЛЕНА\" client_surname=\"ЧУБА\" consentDate=\"2016-12-14\" consentExpirDate=\"2017-12-14\" consentFlag=\"Y\" consentPurpose=\"1\" cook_bl_flg=\"0\" cook_current_flg=\"0\" email=\"chuba-1987@mail.ru\" email_bl_flg=\"0\" gender=\"0\" initial_limit=\"7000.00\" initial_maturity=\"30\" inner_ip_bl_flg=\"0\" ip_pass_bl_flg=\"0\" ip_pay_bl_flg=\"0\" ip_temp_pass_bl_flg=\"0\" ip_temp_pay_bl_flg=\"0\" liability=\"Y\" liv_address_city=\"г Тобольск \" liv_address_flat=\"14\" liv_address_house=\"23\" liv_address_house_bld=\"\" liv_address_house_corp=\"\" liv_address_index=\"626150\" liv_address_region=\"72\" liv_address_street=\"мкр 7-й А\" method_credit=\"04\" mob_phone_num=\"9827805443\" otherConsentPurpose=\"\" pasp_birthplace=\"тобольск\" pass_code=\"720-028\" pass_date_issue=\"2015-10-08\" pass_issued=\"межрайонным отделом уфмс россии по тюменской области в городе тобольске\" pass_number=\"177888\" pass_seria=\"7115\" qiwi_wallet_num=\"\" reg_address_city=\"г Тобольск \" reg_address_flat=\"14\" reg_address_house=\"23\" reg_address_house_bld=\"\" reg_address_house_corp=\"\" reg_address_index=\"626150\" reg_address_region=\"72\" reg_address_street=\"мкр 7-й А\" reportUser=\"DD_online\" user_bl_flg=\"0\" user_id=\"1481704584\" ya_wallet_num=\"\">" +
                    "<application_e age=\"50\" client_id=\"123456\"  add_doc_inn=\"\" add_doc_snils=\"12345678901\" agreementSignatureMethod=\"2\" applicationSourceMethod=\"2\" applicationSourceType=\"1\" approve_outer_request_flg=\"Y\" call_name=\"PRE\" channel=\"LID\" client_birthdate=\"1984-03-08\" client_middlename=\"АЛИМОВНА\" client_name=\"АЛЕНА\" client_surname=\"АЛЕКСАНДРОВА\" color_d=\"\" consentDate=\"2016-12-21\" consentExpirDate=\"2021-12-21\" consentFlag=\"Y\" consentPurpose=\"1\" cook_bl_flg=\"0\" cook_current_flg=\"0\" cookie=\"\" day30DelayRepaymentAmount=\"10570.00\" dayRate=\"1.70\" email=\"555.alena@list.ru\" email_bl_flg=\"0\" fullRepaymentAmount=\"10570.000000\" gender=\"0\" initial_limit=\"7000.00\" initial_maturity=\"30\" inner_ip_bl_flg=\"0\" ip_pass_bl_flg=\"0\" ip_temp_pass_bl_flg=\"0\" is_js=\"1\" liability=\"Y\" liv_address_city=\"г Лесосибирск \" liv_address_flat=\"38\" liv_address_house=\"д 19 \" liv_address_house_bld=\"\" liv_address_house_corp=\"\" liv_address_index=\"662543\" liv_address_region=\"24\" liv_address_street=\"ул Белинского\" mob_phone_num=\"9261311299\" numberLoansRepaid=\"0\" otherConsentPurpose=\"\" pasp_birthplace=\"Лесосибирск \" pass_code=\"243-003\" pass_date_issue=\"2005-10-26\" pass_issued=\"Новоенисейским поселковым отделением милиции красноярского края \" pass_number=\"899435\" pass_seria=\"0404\" plugins=\"[]\" referrer=\"http://xn--80adjieieofqvh4l.xn--p1ai/goto/dd-online.html\" reg_address_city=\"г Лесосибирск \" reg_address_flat=\"38\" reg_address_house=\"д 19 \" reg_address_house_bld=\"\" reg_address_house_corp=\"\" reg_address_index=\"662543\" reg_address_region=\"24\" reg_address_street=\"ул Белинского\" repaymentAmount=\"10570.000000\" repaymentDate=\"2017-01-20\" reportUser=\"DD_online\" screen_h=\"360\" screen_w=\"640\" system_fonts=\"\" time_zone=\"\" user_bl_flg=\"0\" user_id=\"1482309099\" useragent=\"Mozilla/5.0 (Linux; Android 5.1.1; SM-J320F Build/LMY47V) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/55.0.2883.91 Mobile Safari/537.36\">" +
                    "\t\t\t<product_e program_max_lim=\"15000.0\"/>\n" +
                    "\t\t\t<calc payment_method_cnt=\"1\" pre_limit=\"2000.0\"/>\n" +
                    "\t\t\t<innerCH DD_active_app_flg=\"0\" DD_died_flg=\"0\" DD_last_cred_live_addr_is_equal_flg=\"0\" DD_last_cred_mobile_is_equal_flg=\"0\" DD_last_cred_pass_is_equal_flg=\"0\" DD_last_cred_reg_addr_is_equal_flg=\"0\" DD_live_addr_is_equal_flg=\"0\" DD_many_apps_flg=\"1\" DD_mobile_is_equal_flg=\"0\" DD_pass_is_equal_flg=\"0\" DD_reg_addr_is_equal_flg=\"0\" NumPaid=\"0\" account_current_limit=\"0.00\" active_app_flg=\"1\" active_cred_balance=\"0\" active_cred_current_DD_overdue_days=\"0\" active_cred_max_DD_overdue_days=\"0\" active_cred_overdue_sum=\"0\" active_cred_ratio_balance=\"0\" active_cred_ratio_term=\"0\" age=\"25\" applicant_bl_flg=\"0\" card_current_limit=\"0.00\" close_active_cred_flg=\"0\" current_cred_DD_flg=\"0\" current_cred_flg=\"0\" day_current_limit=\"86000.00\" fms_decline_flg=\"0\" id_device=\"\" inn_is_valid_flg=\"1\" is_client_DD_flg=\"0\" is_preapproved=\"0\" last_cred_close_dt=\"1991-01-01\" last_cred_is_cession_flg=\"0\" last_cred_is_fraud_flg=\"0\" last_cred_is_paid_flg=\"0\" last_cred_max_overdue_days=\"0\" live_addr_bl_flg=\"0\" live_addr_sum=\"0.00\" live_region_bl_flg=\"0\" max_total_overdue_days=\"0\" mob_phone_bl_flg=\"0\" moratory_flg=\"0\" num_paid_credits=\"0\" pass_bl_flg=\"0\" preapproved_limit=\"0\" qiwi_current_limit=\"0.00\" recent_agent_decline_flg=\"0\" recent_client_decline_flg=\"0\" recent_postver_decline_flg=\"0\" recent_score_decline_flg=\"0\" recent_verif_decline_flg=\"0\" reg_addr_bl_flg=\"0\" reg_addr_sum=\"0.00\" reg_region_bl_flg=\"0\" region_mob_bl_flg=\"0\" region_site_bl_flg=\"0\" repeated_DD_flg=\"0\" repeated_flg=\"0\" snils_is_valid_flg=\"1\" terrorist_flg=\"0\" unistream_current_limit=\"0.00\" yandex_current_limit=\"0.00\" ip_device=\"94.78.207.228\">\n" +
                    "\t\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t\t<Name>dm_dd_last_cred</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>9445.0</Value>\n" +
                    "\t\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t\t<Name>dm_dd_last_cred</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>9445.0</Value>\n" +
                    "\t\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t\t<Name>dm_dd_last_cred</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>9445.0</Value>\n" +
                    "\t\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t</innerCH>\n" +
                    "\t\t\t<decision_e/>\n" +
                    "\t\t\t<policyRules stop_factors=\"nbki_0001;\"/>\n" +
                    "\t\t\t<score/>\n" +
                    "\t\t\t<verif/>\n" +
                    "\t\t\t<Equifax>\n" +
                    "\t\t\t\t<response_Eq dateofreport=\"2016-11-10\" num=\"1\" report_type=\"28343\" responsecode=\"1\" responsestring=\"Клиент найден и у него есть кредитная история\">\n" +
                    "\t\t\t\t\t<title_part_Eq>\n" +
                    "\t\t\t\t\t\t<private_Eq birthday=\"1991-06-06\" birthplace=\"ГОР.ТЕСТ ЛИПЕЦКОЙ ОБЛ.\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-19\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-21\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-21\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛ. В Г. ТЕСТ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-21\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-22\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"480-012\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-28\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2013-10-17\" docno=\"4213837837\" docplace=\"ОУФМС РФ ПО ЛИПЕЦКОЙ ОБЛ В Г ТЕСТ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2016-10-29\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2012-12-14\" docno=\"4211729365\" docplace=\"480-012 ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t\t<history_title_Eq date=\"2013-12-13\" firstname=\"ТЕСТ\" lastname=\"ТЕСТОВ\" middlename=\"ТЕСТОВИЧ\">\n" +
                    "\t\t\t\t\t\t\t\t<doc_Eq docdate=\"2005-07-21\" docno=\"4205218712\" docplace=\"482-010 ОВД Г ЕЛЬЦА\" doctype=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t</history_title_Eq>\n" +
                    "\t\t\t\t\t\t</private_Eq>\n" +
                    "\t\t\t\t\t</title_part_Eq>\n" +
                    "\t\t\t\t\t<base_part_Eq addr_fact=\"RU, 777555, 42, ТЕСТ, ТЕСТОВАЯ, Д.2, КВ.2\" addr_reg=\"RU, 777555, 42, ТЕСТ, ТЕСТОВАЯ, Д.2, КВ.2\">\n" +
                    "\t\t\t\t\t\t<history_addr_Eq>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"ТЕСТ,ТЕСТОВАЯ, 2, 2\" date=\"2011-06-05\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 111222, 42, ТЕСТ, ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-29\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"ТЕСТ,ТЕСТОВАЯ,2,2\" date=\"2012-03-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 222333, 42, ТЕСТ, ТЕСТОВАЯ, Д.2\" date=\"2016-10-28\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 777555, 42, ТЕСТ Г, ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 111222, 42, Г ТЕСТ, УЛ ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 000000, 42, ТЕСТ, ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_reg_Eq addr_reg=\"RU, 222333, 42, Г ТЕСТ, УЛ.ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 222333, 42, Г ТЕСТ, УЛ.ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 000000, 42, ТЕСТ, ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-21\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 111222, 42, Г ТЕСТ, УЛ ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 777555, 42, ТЕСТ Г, ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 222333, 42, ТЕСТ, ТЕСТОВАЯ, Д.2\" date=\"2016-10-28\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"ТЕСТ,ТЕСТОВАЯ,2,2\" date=\"2012-03-24\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"RU, 111222, 42, ТЕСТ, ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-29\"/>\n" +
                    "\t\t\t\t\t\t\t<addr_fact_Eq addr_fact=\"ТЕСТ,ТЕСТОВАЯ, 2, 2\" date=\"2011-06-05\"/>\n" +
                    "\t\t\t\t\t\t</history_addr_Eq>\n" +
                    "\t\t\t\t\t\t<addr_requests_Eq>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"444555, РОССИЯ, МОСКВА, УЛ. МАРГАРИТОК 42/1, 118\" date=\"2016-08-25\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"777555, 777555, ЛИПЕЦКАЯ ОБЛ., ТЕСТ, ТЕСТОВАЯ, 2\" date=\"2016-11-02\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"444555, РОССИЯ, МОСКВА, УЛ. МАРГАРИТОК 42/1, 118\" date=\"2016-08-25\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"777555, 777555, ЛИПЕЦКАЯ ОБЛ., ТЕСТ, ТЕСТОВАЯ, 2\" date=\"2016-11-02\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"222333, РОССИЯ, ЛИПЕЦКАЯ, ТЕСТ, ТЕСТОВАЯ, 2, 2\" date=\"2016-08-29\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"000000, RU, 42, ТЕСТ, ТЕСТОВАЯ, 2, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"222333, РОССИЯ, ЛИПЕЦКАЯ, ТЕСТ, ТЕСТОВАЯ, 2, 2\" date=\"2016-08-29\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"000000, RU, 42, ТЕСТ, ТЕСТОВАЯ, 2, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"222333, ТЕСТ Г, ТЕСТОВАЯ УЛ, ДОМ 2, СТР , КВ 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"222333, RU, 42, Г ТЕСТ, EMPTY, УЛ ТЕСТОВАЯ, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"222333, ТЕСТ Г, ТЕСТОВАЯ УЛ, ДОМ 2, СТР , КВ 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"222333, RU, 42, Г ТЕСТ, УЛ ТЕСТОВАЯ, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"000000, Г ТЕСТ, УЛ.ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"111111, 111111, ЛИПЕЦКАЯ ОБЛАСТЬ, ТЕСТ, ТЕСТОВАЯ, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"000000, Г ТЕСТ, УЛ.ТЕСТОВАЯ, Д.2, КВ.2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"111111, 111111, ЛИПЕЦКАЯ ОБЛАСТЬ, ТЕСТ, ТЕСТОВАЯ, 2\" date=\"2016-10-20\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"111222, RU, 42, Г ТЕСТ, УЛ ТЕСТОВАЯ, 2, 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"111222, РОССИЯ, ТЕСТ, ТЕСТОВАЯ, 2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"111222, RU, 42, Г ТЕСТ, УЛ ТЕСТОВАЯ, 2, 2\" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"111222, РОССИЯ, ТЕСТ, ТЕСТОВАЯ, 2\" date=\"2016-10-19\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"fact\" address=\"000000, РОССИЯ, , , , \" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t\t<address_Eq addr_type=\"reg\" address=\"000000, РОССИЯ, ТЕСТ, ТЕСТОВАЯ, 2, \" date=\"2016-10-18\"/>\n" +
                    "\t\t\t\t\t\t</addr_requests_Eq>\n" +
                    "\t\t\t\t\t\t<phones_Eq>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-28\" phone_number=\"+79191234565\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-29\" phone_number=\"79041234565\" phone_type=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-29\" phone_number=\"70000000000\" phone_type=\"9\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-29\" phone_number=\"79041234565\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-28\" phone_number=\"+79041234565\" phone_type=\"2\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-20\" phone_number=\"79191234565\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-28\" phone_number=\"+79041234565\" phone_type=\"1\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-19\" phone_number=\"89041234565\" phone_type=\"3\"/>\n" +
                    "\t\t\t\t\t\t\t<phone_number_Eq date=\"2016-10-24\" phone_number=\"9041234565\" phone_type=\"1\"/>\n" +
                    "\t\t\t\t\t\t</phones_Eq>\n" +
                    "\t\t\t\t\t\t<credit_Eq cred_active=\"1\" cred_active_date=\"2016-03-05\" cred_collateral=\"0\" cred_currency=\"RUR\" cred_date=\"2011-05-05\" cred_date_payout=\"2011-05-15\" cred_day_overdue=\"1948\" cred_enddate=\"2021-05-06\" cred_first_load=\"2011-05-24\" cred_id=\"529420543\" cred_max_overdue=\"3011.7\" cred_owner=\"0\" cred_partner_type=\"1\" cred_person_num=\"1\" cred_prolong=\"0\" cred_ratio=\"0\" cred_sum=\"3020.00\" cred_sum_debt=\"0.00\" cred_sum_limit=\"8.30\" cred_sum_overdue=\"3011.7\" cred_sum_payout=\"6210.00\" cred_sum_type=\"0\" cred_type=\"04\" cred_update=\"2016-03-05\" delay30=\"0\" delay5=\"0\" delay60=\"0\" delay90=\"0\" delay_more=\"0\"/>\n" +
                    "\t\t\t\t\t\t<credit_Eq cred_active=\"1\" cred_active_date=\"2016-10-21\" cred_collateral=\"0\" cred_currency=\"RUR\" cred_date=\"2016-10-21\" cred_date_payout=\"1900-02-01\" cred_day_overdue=\"0\" cred_enddate=\"2016-11-20\" cred_first_load=\"2016-10-23\" cred_full_cost=\"730.000\" cred_id=\"1931350827\" cred_max_overdue=\"0\" cred_owner=\"0\" cred_partner_type=\"3\" cred_person_num=\"1\" cred_prolong=\"0\" cred_ratio=\"0\" cred_sum=\"4000.00\" cred_sum_debt=\"4000.00\" cred_sum_limit=\"0.00\" cred_sum_overdue=\"0\" cred_sum_payout=\"0.00\" cred_sum_type=\"0\" cred_type=\"19\" cred_update=\"2016-11-07\" delay30=\"0\" delay5=\"0\" delay60=\"0\" delay90=\"0\" delay_more=\"0\"/>\n" +
                    "\t\t\t\t\t</base_part_Eq>\n" +
                    "\t\t\t\t\t<add_part_Eq>\n" +
                    "\t\t\t\t\t\t<interest_Eq day=\"0\" hour=\"0\" month=\"12\" quarter=\"3\" week=\"0\" year=\"0\"/>\n" +
                    "\t\t\t\t\t\t<own_interest_Eq day=\"0\" hour=\"0\" month=\"0\" quarter=\"0\" week=\"0\" year=\"0\"/>\n" +
                    "\t\t\t\t\t\t<scorings_Eq>\n" +
                    "\t\t\t\t\t\t\t<scoring_Eq scor_card_id=\"15\" scor_id=\"1478775503862\" scor_name=\"Скоринг для МФО 2.0 (одноразовое погашение)\" score=\"487\"/>\n" +
                    "\t\t\t\t\t\t</scorings_Eq>\n" +
                    "\t\t\t\t\t\t<attrs_Eq>\n" +
                    "\t\t\t\t\t\t\t<package_Eq id=\"27\" name=\"Расширение базового кредитного отчета\">\n" +
                    "\t\t\t\t\t\t\t\t<section_Eq id=\"23\" name=\"Кредитная часть (расширенная)\">\n" +
                    "\t\t\t\t\t\t\t\t\t<period_Eq>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"529420543\" n=\"831\" v=\"--------BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB9876543200\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"1931350827\" n=\"705\" v=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"529420543\" n=\"706\" v=\"302\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"1931350827\" n=\"706\" v=\"5800.00\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"529420543\" n=\"705\" v=\"6210\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t\t<attr_Eq c_i=\"1931350827\" n=\"831\" v=\"00\"/>\n" +
                    "\t\t\t\t\t\t\t\t\t</period_Eq>\n" +
                    "\t\t\t\t\t\t\t\t</section_Eq>\n" +
                    "\t\t\t\t\t\t\t</package_Eq>\n" +
                    "\t\t\t\t\t\t</attrs_Eq>\n" +
                    "\t\t\t\t\t\t<info_requests_Eq>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"quarter\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"1.00\" cred_partner_type=\"3\" cred_sum=\"6000.00\" cred_type=\"19\" timeslot=\"quarter\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" request_reason=\"0\" timeslot=\"quarter\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"1.00\" cred_partner_type=\"3\" cred_sum=\"4000.00\" cred_type=\"19\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"12.00\" cred_partner_type=\"1\" cred_sum=\"30000.00\" cred_type=\"18\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"1\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_currency=\"RUR\" cred_duration=\"0.65\" cred_partner_type=\"3\" cred_sum=\"10000.00\" cred_type=\"19\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t\t<request_Eq cred_partner_type=\"3\" timeslot=\"month\"/>\n" +
                    "\t\t\t\t\t\t</info_requests_Eq>\n" +
                    "\t\t\t\t\t</add_part_Eq>\n" +
                    "\t\t\t\t</response_Eq>\n" +
                    "\t\t\t</Equifax>\n" +
                    "\t\t\t<NBKI>\n" +
                    "\t\t\t\t<product_NBKI>\n" +
                    "\t\t\t\t\t<prequest_NBKI>\n" +
                    "\t\t\t\t\t\t<req_NBKI IOType=\"B2B\" OutputFormat=\"XML\" lang=\"ru\">\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" apartment=\"2\" city=\"г ТЕСТ \" houseNumber=\"д 2 \" postal=\"111222\" street=\"ул ТЕСТОВАЯ\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" apartment=\"2\" city=\"г ТЕСТ \" houseNumber=\"д 2 \" postal=\"111222\" street=\"ул ТЕСТОВАЯ\"/>\n" +
                    "\t\t\t\t\t\t\t<Id_NBKI idNum=\"837837\" idType=\"21\" idTypeText=\"Паспорт гражданина РФ\" issueAuthority=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" issueCountry=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" issueDate=\"2013-10-17\" seriesNumber=\"4213\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" inqAmount=\"15000\" inqPurpose=\"99\">\n" +
                    "\t\t\t\t\t\t\t\t<ConsentReq_NBKI consentDate=\"2007-05-28\" consentExpireDate=\"2018-05-28\" consentFlag=\"Y\" consentPurpose=\"2\" liability=\"Y\" reportUser=\"ООО Микрофинансовая организация  &#34;Домашние деньги&#34;\"/>\n" +
                    "\t\t\t\t\t\t\t</Inquiry_NBKI>\n" +
                    "\t\t\t\t\t\t\t<Person_NBKI birthDt=\"1991-06-06\" first=\"ТЕСТ\" name1=\"ТЕСТОВ\" paternal=\"ТЕСТОВИЧ\" placeOfBirth=\"ТЕСТ\"/>\n" +
                    "\t\t\t\t\t\t\t<Requestor_NBKI MemberCode=\"QH01LL000000\" UserID=\"QH01LL000003\"/>\n" +
                    "\t\t\t\t\t\t\t<Ref_NBKI product=\"CHST\"/>\n" +
                    "\t\t\t\t\t\t</req_NBKI>\n" +
                    "\t\t\t\t\t</prequest_NBKI>\n" +
                    "\t\t\t\t\t<preply_NBKI>\n" +
                    "\t\t\t\t\t\t<report_NBKI MemberCodeStatus=\"\" addOns=\"\" groups=\"\" inqControlNum=\"698035042\">\n" +
                    "\t\t\t\t\t\t\t<Subject_NBKI fileSinceDt=\"2013-12-12\" lastUpdatedDt=\"2013-12-12\"/>\n" +
                    "\t\t\t\t\t\t\t<Person_NBKI birthDt=\"1991-06-05\" dataValidity=\"\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2013-12-12\" first=\"ТЕСТ\" freezeFlag=\"0\" lastUpdatedDt=\"2016-11-06\" name1=\"ТЕСТОВ\" nationality=\"\" paternal=\"ТЕСТОВИЧ\" placeOfBirth=\"ГОР. ТЕСТ ЛИПЕЦКОЙ ОБЛ.\" serialNum=\"75988040\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Id_NBKI dataValidity=\"\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2013-12-12\" freezeFlag=\"0\" idNum=\"837837\" idType=\"21\" idTypeText=\"Паспорт гражданина РФ\" issueAuthority=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ  ОБЛАСТИ В ГОРОДЕ ТЕСТ\" issueCountry=\"ОТДЕЛОМ УФМС РОССИИ ПО ЛИПЕЦКОЙ ОБЛАСТИ В ГОРОДЕ ТЕСТ\" issueDate=\"2013-10-17\" lastUpdatedDt=\"2016-10-20\" serialNum=\"273695526\" seriesNumber=\"4213\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" addressTypeText=\"Адрес проживания\" apartment=\"\" block=\"\" building=\"\" city=\"Г ТЕСТ\" countryCode=\"\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894216597\" street=\"УЛ ТЕСТОВАЯ\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" addressTypeText=\"Адрес проживания\" apartment=\"\" block=\"\" building=\"\" city=\"ЛИПЕЦКАЯ ОБЛ.\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894467781\" street=\"ТЕСТ Г.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"2\" addressTypeText=\"Адрес проживания\" apartment=\"2\" block=\"0\" building=\"\" city=\"ТЕСТ\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-08-31\" freezeFlag=\"0\" houseNumber=\"2\" lastUpdatedDt=\"2016-10-31\" postal=\"777555\" prov=\"48\" provText=\"Липетская обл.\" resStat=\"5\" resStatText=\"Другое\" serialNum=\"868920539\" street=\"ТЕСТОВАЯ\" streetType=\"28\" streetTypeText=\"ул.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" addressTypeText=\"Адрес прописки\" apartment=\"\" block=\"\" building=\"\" city=\"Г ТЕСТ\" countryCode=\"\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894216595\" street=\"УЛ ТЕСТОВАЯ\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" addressTypeText=\"Адрес прописки\" apartment=\"2\" block=\"0\" building=\"\" city=\"ТЕСТ\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-08-31\" freezeFlag=\"0\" houseNumber=\"2\" lastUpdatedDt=\"2016-10-31\" postal=\"777555\" prov=\"48\" provText=\"Липетская обл.\" serialNum=\"868920537\" street=\"ТЕСТОВАЯ\" streetType=\"28\" streetTypeText=\"ул.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Address_NBKI addressType=\"1\" addressTypeText=\"Адрес прописки\" apartment=\"\" block=\"\" building=\"\" city=\"ЛИПЕЦКАЯ ОБЛ.\" countryCode=\"RU\" countryCodeText=\"Российская Федерация\" disputedRemarks=\"\" disputedStatus=\"\" district=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" houseNumber=\"\" lastUpdatedDt=\"2016-10-24\" serialNum=\"894467779\" street=\"ТЕСТ Г.\" suppressFlag=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"0\" accountRatingDate=\"2016-11-05\" accountRatingText=\"Активный\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtOutstanding=\"5150\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" creditLimit=\"5150\" creditTotalAmt=\"5150\" curBalanceAmt=\"0\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-11-06\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-12-05\" lastPaymtDt=\"1900-01-02\" lastUpdatedDt=\"2016-11-06\" monthsReviewed=\"1\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-11-05\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-12-05\" paymtPat=\"0\" paymtPatStartDt=\"2016-11-05\" reportingDt=\"2016-11-05\" serialNum=\"218562992\" suppressFlag=\"0\" termsAmt=\"6695\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-11-05\" accountRatingText=\"Счет закрыт\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" completePerformDt=\"2016-11-05\" creditLimit=\"5150\" creditTotalAmt=\"6695\" curBalanceAmt=\"6695\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-10-11\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-11-06\" lastPaymtDt=\"2016-11-05\" lastUpdatedDt=\"2016-11-06\" monthsReviewed=\"2\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-10-07\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-11-06\" paymtPat=\"10\" paymtPatStartDt=\"2016-11-05\" reportingDt=\"2016-11-05\" serialNum=\"215904727\" suppressFlag=\"0\" termsAmt=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-10-28\" accountRatingText=\"Счет закрыт\" acctType=\"16\" acctTypeText=\"Микрокредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MFO\" closedDt=\"2016-10-28\" completePerformDt=\"2016-10-28\" creditLimit=\"2000\" creditTotalAmt=\"719\" curBalanceAmt=\"2280\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-10-31\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-10-28\" interestPaymentFrequencyCode=\"7\" interestPaymentFrequencyText=\"Особые условия (единовременная выплата/и т.п.)\" lastPaymtDt=\"2016-10-28\" lastUpdatedDt=\"2016-10-31\" monthsReviewed=\"1\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-10-21\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-10-28\" paymtFreqText=\"Особые условия (единовременная выплата/и т.п.)\" paymtPat=\"0\" paymtPatStartDt=\"2016-10-31\" reportingDt=\"2016-10-31\" serialNum=\"217898329\" suppressFlag=\"0\" termsAmt=\"0\" termsFrequency=\"7\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"0\" accountRatingDate=\"2016-10-21\" accountRatingText=\"Активный\" acctType=\"16\" acctTypeText=\"Микрокредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MFO\" creditLimit=\"4000\" creditTotalAmt=\"730,000\" curBalanceAmt=\"0\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-10-24\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-11-20\" lastPaymtDt=\"1900-01-02\" lastUpdatedDt=\"2016-10-24\" monthsReviewed=\"1\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-10-21\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-11-20\" paymtFreqText=\"Особые условия (единовременная выплата/и т.п.)\" paymtPat=\"0\" paymtPatStartDt=\"2016-10-23\" reportingDt=\"2016-10-23\" serialNum=\"216989500\" suppressFlag=\"0\" termsAmt=\"0\" termsFrequency=\"7\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-10-06\" accountRatingText=\"Счет закрыт\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtOutstanding=\"0\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"N\" bankGuaranteeIndicatorCodeText=\"Нет\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" completePerformDt=\"2016-10-06\" creditLimit=\"3650\" creditTotalAmt=\"4745\" curBalanceAmt=\"4745\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-09-12\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"N\" guarantorIndicatorCodeText=\"Нет\" interestPaymentDueDate=\"2016-10-06\" lastPaymtDt=\"2016-10-06\" lastUpdatedDt=\"2016-10-11\" monthsReviewed=\"2\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-09-06\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-10-06\" paymtPat=\"10\" paymtPatStartDt=\"2016-10-06\" reportingDt=\"2016-10-06\" serialNum=\"213102714\" suppressFlag=\"0\" termsAmt=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Account_NBKI accountRating=\"13\" accountRatingDate=\"2016-09-05\" accountRatingText=\"Счет закрыт\" acctType=\"9\" acctTypeText=\"Потребит.кредит\" amtPastDue=\"0\" bankGuaranteeIndicatorCode=\"\" bankGuaranteeVolumeCode=\"\" businessCategory=\"MKK\" creditLimit=\"1000\" creditTotalAmt=\"\" curBalanceAmt=\"1070\" currencyCode=\"RUB\" disputedRemarks=\"\" disputedStatus=\"\" fileSinceDt=\"2016-09-04\" freezeFlag=\"0\" guaranteeVolumeCode=\"\" guarantorIndicatorCode=\"\" interestPaymentDueDate=\"2016-09-28\" lastPaymtDt=\"2016-09-05\" lastUpdatedDt=\"2016-09-12\" monthsReviewed=\"2\" numDays30=\"0\" numDays60=\"0\" numDays90=\"0\" openedDt=\"2016-08-29\" ownerIndic=\"1\" ownerIndicText=\"Личный\" paymentDueDate=\"2016-09-28\" paymtPat=\"10\" paymtPatStartDt=\"2016-09-05\" reportingDt=\"2016-09-05\" serialNum=\"212489404\" suppressFlag=\"0\" termsAmt=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"691726435\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 21 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"2000\" inqControlNum=\"689862965\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"665126423\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"689869779\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"4000\" inqControlNum=\"664276902\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"690109209\" inqPurpose=\"07\" inqPurposeText=\"Кредитная карта \" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"10000\" inqControlNum=\"663958097\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"7000\" inqControlNum=\"690560006\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"10000\" inqControlNum=\"663958098\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"10000\" inqControlNum=\"690654173\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"315715504\" inqPurpose=\"07\" inqPurposeText=\"Кредитная карта \" inquiryPeriod=\"более 1 года\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"20000\" inqControlNum=\"690749235\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"665736081\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 90 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"15000\" inqControlNum=\"690753180\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"0\" inqControlNum=\"693503057\" inqPurpose=\"07\" inqPurposeText=\"Кредитная карта \" inquiryPeriod=\"последние 21 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"690870978\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"15000\" inqControlNum=\"698035030\" inqPurpose=\"99\" inqPurposeText=\"Неизвестно\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"690878751\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"698029836\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"6000\" inqControlNum=\"690891479\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"15000\" inqControlNum=\"698016312\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 7 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"45000\" inqControlNum=\"690900413\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"5000\" inqControlNum=\"695889501\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 14 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"6000\" inqControlNum=\"690905451\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"695065972\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 14 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"20000\" inqControlNum=\"691062776\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 30 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"20000\" inqControlNum=\"695022632\" inqPurpose=\"16\" inqPurposeText=\"Микрокредит\" inquiryPeriod=\"последние 14 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"\"/>\n" +
                    "\t\t\t\t\t\t\t<Inquiry_NBKI currencyCode=\"RUB\" freezeFlag=\"0\" inqAmount=\"30000\" inqControlNum=\"691495780\" inqPurpose=\"09\" inqPurposeText=\"Потребительский кредит\" inquiryPeriod=\"последние 21 дней\" serialNum=\"0\" suppressFlag=\"0\" userReference=\"NONE\"/>\n" +
                    "\t\t\t\t\t\t\t<OwnInquiries_NBKI>\n" +
                    "\t\t\t\t\t\t\t\t<Inquiry_NBKI inqControlNum=\"698035030\"/>\n" +
                    "\t\t\t\t\t\t\t</OwnInquiries_NBKI>\n" +
                    "\t\t\t\t\t\t\t<Calculations_NBKI collectionsInquiries=\"27\" mostRecentAcc=\"2016-11-05\" mostRecentInqText=\"последние 7 дней\" negativeRating=\"0\" oldest=\"2016-08-29\" recentInquiries=\"22\" reportIssueDateTime=\"2016-11-10\" totalAccts=\"6\" totalActiveBalanceAccounts=\"2\" totalApprovedIPRecords=\"0\" totalBankruptcies=\"0\" totalDefaultFlagIPRecords=\"0\" totalDisputedAccounts=\"0\" totalDisputedBankruptcy=\"0\" totalDisputedIPItem=\"0\" totalDisputedLegalItem=\"0\" totalDisputedOfficialInfo=\"0\" totalIPRecords=\"0\" totalInquiries=\"28\" totalLegalItems=\"0\" totalOfficialInfo=\"0\" totalRejectedIPRecords=\"0\">\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalHighCredit Code=\"RUB\" Value=\"20950\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalCurrentBalance Code=\"RUB\" Value=\"14790\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalPastDueBalance Code=\"RUB\" Value=\"0\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalOutstandingBalance Code=\"RUB\" Value=\"5150\"/>\n" +
                    "\t\t\t\t\t\t\t\t<calc_totalScheduledPaymnts Code=\"RUB\" Value=\"6695\"/>\n" +
                    "\t\t\t\t\t\t\t</Calculations_NBKI>\n" +
                    "\t\t\t\t\t\t</report_NBKI>\n" +
                    "\t\t\t\t\t</preply_NBKI>\n" +
                    "\t\t\t\t</product_NBKI>\n" +
                    "\t\t\t</NBKI>\n" +
                    "\t\t\t<FPS>\n" +
                    "\t\t\t\t<outputVectorResponse_FPS applicationid=\"1918251505\" applicationsfound=\"18\" mainrules=\"1.11=&gt;0;1.12=&gt;0;1.13=&gt;0;1.14=&gt;0;1.15=&gt;0;1.16=&gt;0;1.17=&gt;0;1.18=&gt;0;1.19=&gt;0;1.20=&gt;0;1.21=&gt;0;2.11=&gt;0;2.12=&gt;0;2.13=&gt;0;2.14=&gt;0;2.15=&gt;0;2.16=&gt;0;2.17=&gt;0;2.18=&gt;0;2.19=&gt;0;2.20=&gt;0;2.21=&gt;1;2.22=&gt;1;2.23=&gt;0;2.24=&gt;1;2.25=&gt;1;2.26=&gt;1;2.27=&gt;1;2.28=&gt;0;2.29=&gt;0;2.30=&gt;0;2.31=&gt;0;2.32=&gt;1;2.33=&gt;1;2.34=&gt;1;2.35=&gt;0;2.36=&gt;0;2.37=&gt;1;2.38=&gt;0;\" mainscorevalue=\"525\" specificrules=\"\" status=\"0\"/>\n" +
                    "\t\t\t</FPS>\n" +
                    "\t\t\t<AFS>\n" +
                    "\t\t\t\t<response_AFS action=\"matchupdate\" appId=\"QH01LL:713990645\" appVersion=\"1\" appsCount=\"2\" correlationId=\"\" duration=\"10\" matchCount=\"7\" ruleSetId=\"MAIN_2\" rulesCount=\"6\">\n" +
                    "\t\t\t\t\t<matchResult_AFS>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_138_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_13_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_137_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_14_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"949a7c9ca778baac83d84001aee3c013\" appVersion=\"1\" rule=\"RULE_103_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"949a7c9ca778baac83d84001aee3c013\" appVersion=\"1\" rule=\"RULE_19_2\"/>\n" +
                    "\t\t\t\t\t\t<match_MR_AFS appId=\"76653387\" appVersion=\"1\" rule=\"RULE_19_2\"/>\n" +
                    "\t\t\t\t\t</matchResult_AFS>\n" +
                    "\t\t\t\t</response_AFS>\n" +
                    "\t\t\t</AFS>\n" +
                    "\t\t\t<FSSP>\n" +
                    "\t\t\t\t<FSSP_response begin_dt=\"2016-02-16\" debt_sum=\"0\" end_descr=\"ст. 46 ч. 1 п. 3\" end_dt=\"2016-08-11\" exec_prod_reason=\"Задолженность\" id_exec_production=\"8697/16/48011-ИП\"/>\n" +
                    "\t\t\t\t<FSSP_response begin_dt=\"2014-05-12\" debt_sum=\"0\" end_descr=\"ст. 46 ч. 1 п. 3\" end_dt=\"2014-12-12\" exec_prod_reason=\"Задолженность по платежам за жилую площадь, коммунальные платежи, включая пени\" id_exec_production=\"19124/14/11/48\"/>\n" +
                    "\t\t\t\t<FSSP_response begin_dt=\"2014-07-09\" debt_sum=\"0\" end_descr=\"ст. 46 ч. 1 п. 4\" end_dt=\"2014-12-18\" exec_prod_reason=\"Задолженность по платежам за жилую площадь, коммунальные платежи, включая пени\" id_exec_production=\"29873/14/11/48\"/>\n" +
                    "\t\t\t</FSSP>\n" +
                    "\t\t\t<DoubleData>\n" +
                    "\t\t\t\t<sa_response_DD sa_1=\"4\" sa_10=\"0\" sa_100=\"-\" sa_101=\"-\" sa_102=\"-\" sa_103=\"-\" sa_104=\"-\" sa_105=\"-\" sa_106=\"-\" sa_107=\"-\" sa_108=\"-\" sa_109=\"-\" sa_11=\"2\" sa_110=\"-\" sa_111=\"-\" sa_112=\"-\" sa_113=\"-\" sa_114=\"-\" sa_115=\"-\" sa_116=\"-\" sa_117=\"-\" sa_118=\"-\" sa_119=\"-\" sa_12=\"0\" sa_120=\"-\" sa_121=\"-\" sa_122=\"-\" sa_123=\"-\" sa_124=\"-\" sa_125=\"-\" sa_126=\"-\" sa_127=\"-\" sa_128=\"-\" sa_129=\"-\" sa_13=\"0\" sa_130=\"-\" sa_131=\"-\" sa_132=\"-\" sa_133=\"-\" sa_134=\"-\" sa_135=\"-\" sa_136=\"-\" sa_137=\"-\" sa_138=\"-\" sa_139=\"-\" sa_14=\"0\" sa_140=\"-\" sa_141=\"-\" sa_142=\"-\" sa_143=\"-\" sa_144=\"-\" sa_145=\"-\" sa_146=\"-\" sa_147=\"-\" sa_148=\"-\" sa_149=\"-\" sa_15=\"0\" sa_150=\"-\" sa_151=\"-\" sa_152=\"-\" sa_153=\"-\" sa_154=\"-\" sa_155=\"-\" sa_156=\"-\" sa_157=\"-\" sa_158=\"-\" sa_159=\"-\" sa_16=\"4\" sa_160=\"-\" sa_161=\"-\" sa_162=\"-\" sa_163=\"-\" sa_164=\"-\" sa_165=\"-\" sa_166=\"-\" sa_167=\"-\" sa_168=\"-\" sa_169=\"-\" sa_17=\"0.08011\" sa_170=\"-\" sa_171=\"-\" sa_172=\"-\" sa_173=\"-\" sa_174=\"-\" sa_175=\"-\" sa_176=\"-\" sa_177=\"-\" sa_178=\"-\" sa_179=\"-\" sa_18=\"0.25691\" sa_180=\"-\" sa_181=\"-\" sa_182=\"-\" sa_183=\"-\" sa_184=\"-\" sa_185=\"-\" sa_186=\"-\" sa_187=\"-\" sa_188=\"-\" sa_189=\"-\" sa_19=\"0.1768\" sa_190=\"-\" sa_191=\"-\" sa_192=\"-\" sa_193=\"-\" sa_194=\"-\" sa_195=\"-\" sa_196=\"-\" sa_197=\"-\" sa_198=\"-\" sa_199=\"-\" sa_2=\"0\" sa_20=\"140\" sa_200=\"-\" sa_21=\"9\" sa_22=\"7\" sa_23=\"0\" sa_24=\"1\" sa_25=\"1\" sa_26=\"0\" sa_27=\"0.06433\" sa_28=\"0.54545\" sa_29=\"0.0\" sa_3=\"2\" sa_30=\"0.0\" sa_31=\"0.0\" sa_32=\"3\" sa_33=\"3\" sa_34=\"6\" sa_35=\"0\" sa_36=\"0.15069\" sa_37=\"-\" sa_38=\"134\" sa_39=\"727\" sa_4=\"2\" sa_40=\"-\" sa_41=\"1\" sa_42=\"2\" sa_43=\"118\" sa_44=\"3.43\" sa_45=\"0\" sa_46=\"1,2,2,0,1,5,2,1,2,4,0,0,5,0,0,3,10,8,0,1,0,0,0,0,0\" sa_47=\"1550\" sa_48=\"0.15958\" sa_49=\"0.28748\" sa_5=\"1\" sa_50=\"0.16531\" sa_51=\"0.05341\" sa_52=\"-\" sa_53=\"-\" sa_54=\"-\" sa_55=\"-\" sa_56=\"-\" sa_57=\"-\" sa_58=\"-\" sa_59=\"-\" sa_6=\"0\" sa_60=\"-\" sa_61=\"-\" sa_62=\"-\" sa_63=\"-\" sa_64=\"-\" sa_65=\"-\" sa_66=\"-\" sa_67=\"-\" sa_68=\"-\" sa_69=\"-\" sa_7=\"1\" sa_70=\"-\" sa_71=\"-\" sa_72=\"-\" sa_73=\"-\" sa_74=\"-\" sa_75=\"-\" sa_76=\"-\" sa_77=\"-\" sa_78=\"-\" sa_79=\"-\" sa_8=\"2013-10-15\" sa_80=\"-\" sa_81=\"-\" sa_82=\"-\" sa_83=\"-\" sa_84=\"-\" sa_85=\"-\" sa_86=\"-\" sa_87=\"-\" sa_88=\"-\" sa_89=\"-\" sa_9=\"2011-04-20\" sa_90=\"-\" sa_91=\"-\" sa_92=\"-\" sa_93=\"-\" sa_94=\"-\" sa_95=\"-\" sa_96=\"-\" sa_97=\"-\" sa_98=\"-\" sa_99=\"-\" social_hit=\"1\" status=\"1\"/>\n" +
                    "\t\t\t</DoubleData>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_sum_debt_hard</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_count_debt_very_hard</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_sum_debt</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_pass_seria</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>42.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_pass_year_issue</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_dd_full_house</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>30000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.496+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:20.697+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.009+03:00\">\n" +
                    "\t\t\t\t<Name>dm_approve</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.009+03:00\">\n" +
                    "\t\t\t\t<Name>dm_pay_cnt</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.009+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:21.621+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal6</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal3</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal8</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>487.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal4</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal7</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal5</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.063+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_bankrot</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.063+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_current_overdue_sum</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_sum_current_pay</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>5800.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid2</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value>5800.00</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value>1931350827.000000@</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_microcred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.078+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_current_overdue_days</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.125+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_very_bad_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_current_overdue_days</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_date_issue</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_percent_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_close_cred_last_year</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_max_status_date</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_eqi_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:23.141+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:29.127+03:00\">\n" +
                    "\t\t\t\t<Name>dm_AFS</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:36.371+03:00\">\n" +
                    "\t\t\t\t<Name>dm_FPS</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:29.127+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:28.288+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:37.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_DOUBLE_DATA_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>2000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:36.386+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:57:30.255+03:00\">\n" +
                    "\t\t\t\t<Name>dm_fssp_sum_debt_very_hard</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_add_limit</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal7</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal6</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal5</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal4</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal3</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>15000.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xprelim</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:37.48+03:00\">\n" +
                    "\t\t\t\t<Name>dm_set_next_step_CS</Name>\n" +
                    "\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_bankrot</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_current_overdue_sum</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_sum_current_pay</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6695.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xVal</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>6695.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid2</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value/>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xid</Name>\n" +
                    "\t\t\t\t\t<DataType>string</DataType>\n" +
                    "\t\t\t\t\t<Value/>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_microcred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>1.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.248+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_max_current_overdue_days</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_very_bad_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_current_overdue_days_0</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>false</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmax_overdue</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_max_date_issue</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_percent_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>0.33333333333333337</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal2</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xLocal1</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_close_cred_last_year</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.262+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>6.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_max_status_date</Name>\n" +
                    "\t\t\t\t<DataType>boolean</DataType>\n" +
                    "\t\t\t\t<Value>true</Value>\n" +
                    "\t\t\t\t<DataMethodOutput>\n" +
                    "\t\t\t\t\t<Name>xmin</Name>\n" +
                    "\t\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t\t<Value>0.0</Value>\n" +
                    "\t\t\t\t</DataMethodOutput>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_active_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>2.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<DataMethodHistory Timestamp=\"2016-11-10T13:58:38.277+03:00\">\n" +
                    "\t\t\t\t<Name>dm_nbki_count_close_cred</Name>\n" +
                    "\t\t\t\t<DataType>numeric</DataType>\n" +
                    "\t\t\t\t<Value>4.0</Value>\n" +
                    "\t\t\t</DataMethodHistory>\n" +
                    "\t\t\t<Dummy/>\n" +
                    "\t\t\t<Response_QIWI Description=\"Успешно\" ExtId=\"464f83363361c0dce1bb\" Result=\"OK\">\n" +
                    "\t\t\t\t<Data_QIWI Startdate=\"2015-01-01\" type=\"y\">\n" +
                    "\t\t\t\t\t<Period_QIWI firstdate=\"2015-01-01\" number=\"0\">\n" +
                    "\t\t\t\t\t\t<Bank_QIWI count=\"0\" sum=\"0\"/>\n" +
                    "\t\t\t\t\t\t<Utility_QIWI count=\"4\" sum=\"222\"/>\n" +
                    "\t\t\t\t\t\t<Phone_QIWI count=\"3\" sum=\"110\"/>\n" +
                    "\t\t\t\t\t</Period_QIWI>\n" +
                    "\t\t\t\t</Data_QIWI>\n" +
                    "\t\t\t\t<AggregatedData_QIWI ActualDate=\"2016-01-01\" AverageSum=\"47\" FirstPayDate=\"2015-07-19\" FirstPaymentRegion=\"Липецкая обл\" LastPayDate=\"2015-12-02\" LastPaymentRegion=\"Липецкая обл\" MAXGAPDAYS=\"123\" MaxDifferenceInDays=\"123\" MaxPayHour=\"18\" MaxPayment1Month=\"32\" MaxPayment3Month=\"100\" MaxPayment6Month=\"100\" MaxPaymentRegion=\"Липецкая обл\" Payments1MonthCount=\"1\" Payments1MonthSum=\"32\" Payments3MonthCount=\"4\" Payments3MonthSum=\"222\" Payments6MonthCount=\"7\" Payments6MonthSum=\"332\" PaymentsForMaxPaymentsCountProvider=\"4\" PhoneNumber=\"9041234565\" ProviderWithMaximumPaymentsCount=\"Электронная коммерция\" ProviderWithMaximumPaymentsSum=\"Электронная коммерция\" RosSvyaz_Operator=\"\" RosSvyaz_Region=\"\" TotalMaxPayment=\"100\" TotalPaymentsCount=\"7\" TotalPaymentsSum=\"332\" life_period=\"2\" pay_time=\"18\" prob_def=\"0.102976\" prob_resp=\"0.0236955\" region_maxpays=\"Липецкая обл\" region_maxpayscount=\"7\" region_percent=\"100\"/>\n" +
                    "\t\t\t</Response_QIWI>\n" +
                    "\t\t\t<Dummy/>\n" +
                    "\t\t</application_e>\n" +
                    "\t</AXI>\n" +
                    "</Application>";

//            input = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
//                    "<Application DeliveryOptionCode=\"INT\" ProcessingRequestType=\"DA\">\n" +
//                    "\t<CreditRequest ProductCategory=\"test_category\" ProductCode=\"code1\"/>\n" +
//                    "\t<AXI>\n" +
//                    "\t\t<application_e age=\"50\" call_name=\"PRE\" client_surname=\"Сидоров\" client_name=\"Александр\" client_middlename=\"Леонидович\" client_birthdate=\"1981-01-23\" pass_seria=\"1234\" pass_number=\"456789\" liv_address_region=\"-1\"/>\n" +
//                    "\t</AXI>\n" +
//                    "</Application>";


            AxiLinkServiceStub soap = new AxiLinkServiceStub();
            for(int i = 0; i < 1; i++) {
                    AxiLinkServiceStub.CreateApplicationRequest request = new AxiLinkServiceStub.CreateApplicationRequest();
                    request.setXml(input);

                    AxiLinkServiceStub.CreateApplicationResponse response = soap.createApplication(request);

                    log.info(response.getApplicationId());
//
//                    try {
//                            Thread.sleep(randInt(10, 3000));
//                    } catch (InterruptedException e) {
//                            throw new Exception("(Dummy)Ошибка при приостоновлении работы заявки", e);
//                    }
            }
    }

        /**
         * Генерация случаного числа в заданных пределах
         * @param min Минимальное значение
         * @param max Максимальное значение
         * @return Случайное целое число в заданном пределе
         */
        public static int randInt(int min, int max) {
                Random rand = new Random();
                int randomNum = 0;

                do {
                        randomNum = rand.nextInt();
                        randomNum = randomNum < 0 ? -randomNum : randomNum;
                } while(!(min <= randomNum && randomNum <= max));

                return randomNum;
        }
}
