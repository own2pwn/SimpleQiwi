package ru.sample.qiwi.encryptnormmodule;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;
import ru.sample.qiwi.Helpers.HashHelper;
import ru.sample.qiwi.Helpers.XMLHelper;
import ru.sample.qiwi.encryptnormmodule.normalizers.*;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.xpath.XPathConstants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.util.*;
import java.util.Map.Entry;

/**
 * Created by Дмитрий Астахов on 01.09.2016.
 */
public class EncryptNormModule {
    private final Map<NbchNormalizer, List<String>> normalizedField;

    public EncryptNormModule() {
        // Заполняем какие поля должны проверяться каким валидатором
        normalizedField = new HashMap<NbchNormalizer, List<String>>();

        // TODO: данные поля могут понадобится при валидации корректности XML
//        normalizedField.put(new DatesNormalizer(),
//                Arrays.asList("/Applications/Application/date",
//                        "/Applications/Application/requestDate",
//                        "/Applications/Application/client/birthdate",
//                        "/Applications/Application/client/doc/issueDate",
//                        "/Applications/Application/client/address/startDate",
//                        "/Applications/Application/details/creditDate"));

//        normalizedField.put(new MemberCodeNormalizer(),
//                Arrays.asList("/Applications/Application/memberCode"));

        normalizedField.put(new SurnamesNormalizer(),
                Arrays.asList("/Applications/Application/client/surname",
                        "/Applications/Application/client/prevSurname"));

        normalizedField.put(new FirstnameNormalizer(),
                Arrays.asList("/Applications/Application/client/firstname",
                        "/Applications/Application/client/prevFirstname"));

        normalizedField.put(new MiddlenameNormalizer(),
                Arrays.asList("/Applications/Application/client/middlename",
                        "/Applications/Application/client/prevMiddlename"));

        normalizedField.put(new DocsNormalizer(),
                Arrays.asList("/Applications/Application/client/doc/seriesNumber",
                        "/Applications/Application/client/vehicle/regNum"));

        normalizedField.put(new PhonesNormalizer(),
                Arrays.asList("/Applications/Application/client/phone/number",
                        "/Applications/Application/client/employer/phone/number"));

        normalizedField.put(new NumbersNormalizer(),
                Arrays.asList("/Applications/Application/client/employer/inn"));

        normalizedField.put(new EmailsNormalizer(),
                Arrays.asList("/Applications/Application/client/email/email"));

        normalizedField.put(new DocsEnNormalizer(),
                Arrays.asList("/Applications/Application/client/vehicle/VIN"));
    }

    /**
     * Запуск модуля хэширования-нормализации AFS
     * @param inputXML Входной XML файл
     * @return Обработанный XML файл
     * @throws IOException
     * @throws SAXException
     * @throws ParserConfigurationException
     * @throws NoSuchAlgorithmException
     * @throws TransformerException
     */
    public String run (String inputXML) throws IOException, SAXException, ParserConfigurationException, NoSuchAlgorithmException, TransformerException {
        String resultXML = null;
        Document doc = XMLHelper.parseXml(inputXML);

        normalizeHashDoc(doc);

        resultXML = XMLHelper.convertToString(doc);

        return resultXML;
    }

    /**
     * Нормализация и хэширования полей документа
     * @param doc Обрабатываемый документ
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    private void normalizeHashDoc(Document doc) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        NbchNormalizer normalizer = null; // Валидатор поля
        List<String> listField = null; // Массив полей для обработки валидатором
        List<String> resultFieldsNormalized = null; // Массив нормализованных данных
        Node processingNode = null; // Нормализуемый узел

        for (Map.Entry<NbchNormalizer, List<String>> field: normalizedField.entrySet()) {
            normalizer = field.getKey();
            listField = field.getValue();

            for (String fieldName : listField) {
                processingNode = (Node)XMLHelper.evaluateXPath(doc, fieldName, XPathConstants.NODE);

                if (processingNode == null) {
                    System.out.println("Тег " + fieldName + " не был найден во время разбора XML файла"); // TODO: записывать в log? Нужно ли?
                    continue;
                }

                // Нормализация
                resultFieldsNormalized = normalizer.normalize(processingNode.getChildNodes().item(0).getNodeValue());

                for (int i = 0; i < resultFieldsNormalized.size(); ++i) {
                    if (i != 0) {
                        processingNode = (Node)XMLHelper.evaluateXPath(doc, fieldName + "_" + i, XPathConstants.NODE);
                        processingNode.appendChild(doc.createTextNode("tmp"));
                    }

                    // Хеширование
                    processingNode.getChildNodes().item(0).setNodeValue(getHashString(resultFieldsNormalized.get(i)));
                }
            }
        }
    }

    /**
     * Получение хэша строки
     * @param input Входная строка
     * @return Хэш длинной 64 символа (512 бит)
     * @throws NoSuchAlgorithmException
     * @throws UnsupportedEncodingException
     */
    private String getHashString(String input) throws NoSuchAlgorithmException, UnsupportedEncodingException{
        String result = null;

        byte[] e = HashHelper.getGOST1994Hash(input);
        char[] fb = new char[64];

        for(int i = 0; i < 32; ++i) {
            fb[i * 2] = (char)(97 + ((e[i] & 255) >> 4));
            fb[i * 2 + 1] = (char)(97 + (e[i] & 15));
        }

        result = new String(fb);

        return result;
    }
}

