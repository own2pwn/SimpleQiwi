package ru.sample.qiwi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xml.internal.serialize.XMLSerializer;
import net.javacrumbs.json2xml.JsonXmlReader;
import net.sf.saxon.Configuration;
import net.sf.saxon.lib.FeatureKeys;
import net.sf.saxon.s9api.XsltTransformer;
import org.apache.commons.io.IOUtils;
import org.apache.http.util.TextUtils;
import org.custommonkey.xmlunit.DetailedDiff;
import org.custommonkey.xmlunit.XMLUnit;
import org.json.JSONML;
import org.json.JSONObject;
import org.json.XML;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import ru.sample.qiwi.Helpers.StringHelper;
import ru.sample.qiwi.Helpers.XMLHelper;
import sun.util.logging.resources.logging;

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
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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

        BufferedReader br = null;
        String everything = null;
        try {
            br = new BufferedReader(new FileReader("tmp.xml"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }
            everything = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        everything = XML.toJSONObject(everything).toString();

        json = "{\n" +
                "  \"anagrafica\": {\n" +
                "    \"testata\": {\n" +
                "      \"nomemercato\": {\n" +
                "        \"-id\": \"007\",\n" +
                "        \"#text\": \"Mercato di test\"\n" +
                "      },\n" +
                "      \"data\": \"Giovedi 18 dicembre 2003 16.05.29\"\n" +
                "    },\n" +
                "    \"record\": [\n" +
                "      {\n" +
                "        \"codice_cliente\": \"5\",\n" +
                "        \"rag_soc\": \"Miami American Cafe\",\n" +
                "        \"codice_fiscale\": \"IT07654930130\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"casa\",\n" +
                "          \"#text\": \"Viale Carlo Espinasse 5, Como\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"13\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"302\",\n" +
                "        \"rag_soc\": \"Filiberto Gilardi\",\n" +
                "        \"codice_fiscale\": \"IT87654770157\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"ufficio\",\n" +
                "          \"#text\": \"Via Biancospini 20, Messina\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"8\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"1302\",\n" +
                "        \"rag_soc\": \"Eidon\",\n" +
                "        \"codice_fiscale\": \"IT887511231\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"ufficio\",\n" +
                "          \"#text\": \"Via Bassini 17/2, Milano\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"18\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"202\",\n" +
                "        \"rag_soc\": \"SkillNet\",\n" +
                "        \"codice_fiscale\": \"IT887642131\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"ufficio\",\n" +
                "          \"#text\": \"Via Chiasserini 11A, Milano\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"24\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"12\",\n" +
                "        \"rag_soc\": \"Eidon\",\n" +
                "        \"codice_fiscale\": \"IT04835710965\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"casa\",\n" +
                "          \"#text\": \"Via Cignoli 17/2, Roma\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"1112\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"5\",\n" +
                "        \"rag_soc\": \"Miami American Cafe\",\n" +
                "        \"codice_fiscale\": \"IT07654930130\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"casa\",\n" +
                "          \"#text\": \"Viale Carlo Espinasse 5, Como\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"13\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"302\",\n" +
                "        \"rag_soc\": \"Filiberto Gilardi\",\n" +
                "        \"codice_fiscale\": \"IT87654770157\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"ufficio\",\n" +
                "          \"#text\": \"Via Biancospini 20, Messina\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"8\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"1302\",\n" +
                "        \"rag_soc\": \"Eidon\",\n" +
                "        \"codice_fiscale\": \"IT887511231\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"ufficio\",\n" +
                "          \"#text\": \"Via Bassini 17/2, Milano\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"18\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"202\",\n" +
                "        \"rag_soc\": \"SkillNet\",\n" +
                "        \"codice_fiscale\": \"IT887642131\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"ufficio\",\n" +
                "          \"#text\": \"Via Chiasserini 11A, Milano\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"24\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"202\",\n" +
                "        \"rag_soc\": \"SkillNet\",\n" +
                "        \"codice_fiscale\": \"IT887642131\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"ufficio\",\n" +
                "          \"#text\": \"Via Chiasserini 11A, Milano\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"24\"\n" +
                "      },\n" +
                "      {\n" +
                "        \"codice_cliente\": \"12\",\n" +
                "        \"rag_soc\": \"Eidon\",\n" +
                "        \"codice_fiscale\": \"IT04835710965\",\n" +
                "        \"indirizzo\": {\n" +
                "          \"-tipo\": \"casa\",\n" +
                "          \"#text\": \"Via Cignoli 17/2, Roma\"\n" +
                "        },\n" +
                "        \"num_prodotti\": \"1112\"\n" +
                "      }\n" +
                "    ]\n" +
                "  }\n" +
                "}";

        String xslt = "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n" +
                "<xsl:stylesheet xmlns:xsl=\"http://www.w3.org/1999/XSL/Transform\" version=\"2.0\" xmlns:xs=\"http://www.w3.org/2001/XMLSchema\" xmlns:foo=\"my.foo.org\">\n" +
                "    <xsl:variable name=\"str1\">Иванов Иван Иванович</xsl:variable>\n" +
                "    <xsl:variable name=\"str2\">Иванов Иван Ивановис</xsl:variable>\n" +
                "\n" +
                "    <xsl:template match=\"/\">\n" +
                "        Checksum 1: <xsl:value-of select=\"foo:checksum($str1)\"/>\n" +
                "        Checksum 2: <xsl:value-of select=\"foo:checksum($str2)\"/>\n" +
                "        <!--<xsl:value-of select=\"math:sqrt('121')\" xmlns:math=\"java:java.lang.Math\"/>-->\n" +
                "        <!--Checksum 4: <xsl:value-of select=\"hash:getSHA1Hash2($str2)\"/>-->\n" +
                "    </xsl:template>\n" +
                "    <xsl:function name=\"foo:checksum\" as=\"xs:integer\">\n" +
                "        <xsl:param name=\"str\" as=\"xs:string\"/>\n" +
                "        <xsl:variable name=\"codepoints\" select=\"string-to-codepoints($str)\"/>\n" +
                "        <xsl:value-of select=\"foo:fletcher16($codepoints, count($codepoints), 1, 0, 0)\"/>\n" +
                "    </xsl:function>\n" +
                "    <!-- can I change some xs:integers to xs:int and help performance? -->\n" +
                "    <xsl:function name=\"foo:fletcher16\">\n" +
                "        <xsl:param name=\"str\" as=\"xs:integer*\"/>\n" +
                "        <xsl:param name=\"len\" as=\"xs:integer\"/>\n" +
                "        <xsl:param name=\"index\" as=\"xs:integer\"/>\n" +
                "        <xsl:param name=\"sum1\" as=\"xs:integer\"/>\n" +
                "        <xsl:param name=\"sum2\" as=\"xs:integer\"/>\n" +
                "        <xsl:choose>\n" +
                "            <xsl:when test=\"$index gt $len\">\n" +
                "                <xsl:sequence select=\"$sum2 * 256 + $sum1\"/>\n" +
                "            </xsl:when>\n" +
                "            <xsl:otherwise>\n" +
                "                <xsl:variable name=\"newSum1\" as=\"xs:integer\" select=\"($sum1 + $str[$index]) mod 255\"/>\n" +
                "                <xsl:sequence select=\"foo:fletcher16($str, $len, $index + 1, $newSum1, ($sum2 + $newSum1) mod 255)\"/>\n" +
                "            </xsl:otherwise>\n" +
                "        </xsl:choose>\n" +
                "    </xsl:function>\n" +
                "</xsl:stylesheet>";


//        String s = null;
//        try {
//            Document doc = XMLHelper.convertJsonToXml(json, "response");
//            s = XMLHelper.convertToString(doc);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        json = "{\"MatchingLevel\":0,\"Date\":\"20170120\",\"Score\":0.72,\"warning\":{\"message\":\"fields with bad values\",\"data\":[[\"Phones\",\"Phones field has bad value\"]]}}";

        String result = null;
        try {
            result = XMLHelper.convertToString(XMLHelper.convertJsonToXml(json, "response"));
        } catch (Exception e) {
            e.printStackTrace();
        }

//        try {
//            br = new BufferedReader(new FileReader("tmp.xml"));
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//        try {
//            StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                sb.append(line);
//                sb.append(System.lineSeparator());
//                line = br.readLine();
//            }
//            everything = sb.toString();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                br.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }

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

