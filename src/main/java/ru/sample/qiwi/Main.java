package ru.sample.qiwi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import net.javacrumbs.json2xml.JsonXmlReader;
import org.apache.commons.io.IOUtils;
import org.apache.http.util.TextUtils;
import org.json.JSONML;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import ru.sample.qiwi.Helpers.XMLHelper;

import javax.imageio.ImageIO;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.sax.SAXSource;
import java.awt.image.BufferedImage;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Дмитрий Астахов on 29.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        TestAxilinkSoap invoker = new TestAxilinkSoap();

        String json = "{  \n" +
                "   \"id\":10.10,\n" +
                "   \"created\":\"2016-12-06T12:13:08.600658Z\",\n" +
                "   \"status\":\"PAID\",\n" +
                "   \"surname\":\"ЗАБРОДИН\",\n" +
                "   \"name\":\"ИВАН\",\n" +
                "   \"patronymic\":\"ВАЛЕРЬЕВИЧ\",\n" +
                "   \"birth_date\":\"1990-10-10\",\n" +
                "   \"passport\":\"8701353582\",\n" +
                "   \"passport_date\":\"2008-01-01\",\n" +
                "   \"pdf_link\":\"https://unicom24.ru/api/equifax_check/v1/pdf/572/\",\n" +
                "   \"response\":{  \n" +
                "      \"responsestring\":\"Заемщик найден\",\n" +
                "      \"title_part\":{  \n" +
                "         \"private\":{  \n" +
                "            \"lastname\":\"ЗАБРОДИН\",\n" +
                "            \"firstname\":\"ИВАН\",\n" +
                "            \"middlename\":\"ВАЛЕРЬЕВИЧ\",\n" +
                "            \"birthday\":\"06.06.1972\",\n" +
                "            \"birthplace\":\"ГОРОД ВОРКУТА КОМИ АССР\",\n" +
                "            \"doc\":{  \n" +
                "               \"doctype\":\"1\",\n" +
                "               \"docno\":\"8701353582\",\n" +
                "               \"docdate\":\"08.02.2002\",\n" +
                "               \"docplace\":\"УПРАВЛЕНИЕМ ВНУТРЕННИХ ДЕЛ ГОРОДА ВОРКУТЫ РЕСПУБЛИКИ КОМИ 112-003\"\n" +
                "            }\n" +
                "         }\n" +
                "      },\n" +
                "      \"base_part\":{  \n" +
                "         \"addr_reg\":\"RU, 169901, 87, Г ВОРКУТА, УЛ.ПИОНЕРСКАЯ, Д.25, КВ.(ОФИС).42\",\n" +
                "         \"addr_fact\":\"RU, 169901, 87, Г ВОРКУТА, УЛ.ПИОНЕРСКАЯ, Д.25, КВ.(ОФИС).42\",\n" +
                "         \"addr_requests\":{  \n" +
                "            \"address\":[  \n" +
                "               {  \n" +
                "                  \"@addr_type\":\"reg\",\n" +
                "                  \"@date\":\"06.12.2016\",\n" +
                "                  \"#text\":\"169915, Г ВОРКУТА , УЛ ЛЕРМОНТОВА, Д 20, 54\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"@addr_type\":\"fact\",\n" +
                "                  \"@date\":\"06.12.2016\",\n" +
                "                  \"#text\":\"169915, Г ВОРКУТА , УЛ ЛЕРМОНТОВА, Д 20, 54\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"@addr_type\":\"reg\",\n" +
                "                  \"@date\":\"06.12.2016\",\n" +
                "                  \"#text\":\"169915, 169915, КОМИ РЕСП, ВОРКУТА Г, ЛЕРМОНТОВА, Д.20, КВ.54\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"@addr_type\":\"fact\",\n" +
                "                  \"@date\":\"06.12.2016\",\n" +
                "                  \"#text\":\"169915, 169915, КОМИ РЕСП, ВОРКУТА Г, ЛЕРМОНТОВА, Д.20, КВ.54\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"@addr_type\":\"reg\",\n" +
                "                  \"@date\":\"05.12.2016\",\n" +
                "                  \"#text\":\"169915, РОССИЯ, ВОРКУТА, ЛЕРМОНТОВА, Д. 20\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"@addr_type\":\"fact\",\n" +
                "                  \"@date\":\"05.12.2016\",\n" +
                "                  \"#text\":\"169915, РОССИЯ, ВОРКУТА, ЛЕРМОНТОВА, Д. 20\"\n" +
                "               }\n" +
                "            ]\n" +
                "         }\n" +
                "      },\n" +
                "      \"add_part\":{  \n" +
                "         \"interest\":{  \n" +
                "            \"hour\":\"0\",\n" +
                "            \"day\":\"4\",\n" +
                "            \"week\":\"0\",\n" +
                "            \"month\":\"0\",\n" +
                "            \"quarter\":\"0\",\n" +
                "            \"year\":\"0\"\n" +
                "         },\n" +
                "         \"own_interest\":{  \n" +
                "            \"hour\":\"0\",\n" +
                "            \"day\":\"0\",\n" +
                "            \"week\":\"0\",\n" +
                "            \"month\":\"0\",\n" +
                "            \"quarter\":\"0\",\n" +
                "            \"year\":\"0\"\n" +
                "         },\n" +
                "         \"info_requests\":{  \n" +
                "            \"request\":[  \n" +
                "               {  \n" +
                "                  \"timeslot\":\"day\",\n" +
                "                  \"cred_partner_type\":\"1\",\n" +
                "                  \"request_owner\":\"0\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"timeslot\":\"day\",\n" +
                "                  \"cred_partner_type\":\"3\",\n" +
                "                  \"request_owner\":\"0\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"timeslot\":\"day\",\n" +
                "                  \"cred_type\":\"19\",\n" +
                "                  \"cred_sum\":\"1000.00\",\n" +
                "                  \"cred_duration\":\"14.00\",\n" +
                "                  \"cred_partner_type\":\"3\",\n" +
                "                  \"request_owner\":\"0\"\n" +
                "               },\n" +
                "               {  \n" +
                "                  \"timeslot\":\"day\",\n" +
                "                  \"cred_partner_type\":\"3\",\n" +
                "                  \"request_owner\":\"0\"\n" +
                "               }\n" +
                "            ]\n" +
                "         },\n" +
                "         \"scorings\":{  \n" +
                "            \"scoring\":{  \n" +
                "               \"scor_id\":\"1481026388095\",\n" +
                "               \"scor_card_id\":\"14\",\n" +
                "               \"scor_name\":\"Скоринг для МФО 2.0 (плановые платежи)\",\n" +
                "               \"score\":\"545\"\n" +
                "            }\n" +
                "         }\n" +
                "      }\n" +
                "   }\n" +
                "}";
        try {
            Document doc = XMLHelper.generateXmlFromJson(json, "response");
            String s = XMLHelper.convertToString(doc);
            System.out.print(s);
        } catch (ParserConfigurationException | UnsupportedEncodingException | TransformerException e) {
            e.printStackTrace();
        }

//        if (args.length != 2) {
//            System.out.printf("Неверное количество аргументов\n");
//            return;
//        }

        try {
            invoker.main();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

