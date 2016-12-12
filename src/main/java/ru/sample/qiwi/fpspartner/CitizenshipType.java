/**
 * CitizenshipType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.3  Built on : May 30, 2016 (04:09:26 BST)
 */
package ru.sample.qiwi.fpspartner;


/**
 *  CitizenshipType bean class
 */
@SuppressWarnings({"unchecked",
    "unused"
})
public class CitizenshipType implements org.apache.axis2.databinding.ADBBean {
    public static final javax.xml.namespace.QName MY_QNAME = new javax.xml.namespace.QName("http://example.org/FPSPartner",
            "CitizenshipType", "ns1");
    private static java.util.HashMap _table_ = new java.util.HashMap();
    public static final java.lang.String _value1 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AU");
    public static final java.lang.String _value2 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AT");
    public static final java.lang.String _value3 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AZ");
    public static final java.lang.String _value4 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AX");
    public static final java.lang.String _value5 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AL");
    public static final java.lang.String _value6 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DZ");
    public static final java.lang.String _value7 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AS");
    public static final java.lang.String _value8 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AI");
    public static final java.lang.String _value9 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AO");
    public static final java.lang.String _value10 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AD");
    public static final java.lang.String _value11 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AG");
    public static final java.lang.String _value12 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AR");
    public static final java.lang.String _value13 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AM");
    public static final java.lang.String _value14 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AW");
    public static final java.lang.String _value15 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AF");
    public static final java.lang.String _value16 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BS");
    public static final java.lang.String _value17 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BD");
    public static final java.lang.String _value18 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BB");
    public static final java.lang.String _value19 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BH");
    public static final java.lang.String _value20 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BY");
    public static final java.lang.String _value21 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BZ");
    public static final java.lang.String _value22 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BE");
    public static final java.lang.String _value23 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BJ");
    public static final java.lang.String _value24 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BM");
    public static final java.lang.String _value25 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BG");
    public static final java.lang.String _value26 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BO");
    public static final java.lang.String _value27 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BA");
    public static final java.lang.String _value28 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BW");
    public static final java.lang.String _value29 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BR");
    public static final java.lang.String _value30 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IO");
    public static final java.lang.String _value31 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BN");
    public static final java.lang.String _value32 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BV");
    public static final java.lang.String _value33 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BF");
    public static final java.lang.String _value34 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BI");
    public static final java.lang.String _value35 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BT");
    public static final java.lang.String _value36 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VU");
    public static final java.lang.String _value37 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VA");
    public static final java.lang.String _value38 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GB");
    public static final java.lang.String _value39 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "HU");
    public static final java.lang.String _value40 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VE");
    public static final java.lang.String _value41 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VG");
    public static final java.lang.String _value42 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VI");
    public static final java.lang.String _value43 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UM");
    public static final java.lang.String _value44 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TL");
    public static final java.lang.String _value45 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VN");
    public static final java.lang.String _value46 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GA");
    public static final java.lang.String _value47 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GY");
    public static final java.lang.String _value48 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "HT");
    public static final java.lang.String _value49 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GM");
    public static final java.lang.String _value50 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GH");
    public static final java.lang.String _value51 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GP");
    public static final java.lang.String _value52 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GT");
    public static final java.lang.String _value53 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GF");
    public static final java.lang.String _value54 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GN");
    public static final java.lang.String _value55 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GW");
    public static final java.lang.String _value56 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DE");
    public static final java.lang.String _value57 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GG");
    public static final java.lang.String _value58 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GI");
    public static final java.lang.String _value59 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "HN");
    public static final java.lang.String _value60 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "HK");
    public static final java.lang.String _value61 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GD");
    public static final java.lang.String _value62 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GL");
    public static final java.lang.String _value63 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GR");
    public static final java.lang.String _value64 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GE");
    public static final java.lang.String _value65 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GU");
    public static final java.lang.String _value66 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DK");
    public static final java.lang.String _value67 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "JE");
    public static final java.lang.String _value68 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DJ");
    public static final java.lang.String _value69 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DM");
    public static final java.lang.String _value70 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "DO");
    public static final java.lang.String _value71 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EG");
    public static final java.lang.String _value72 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ZM");
    public static final java.lang.String _value73 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EH");
    public static final java.lang.String _value74 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ZW");
    public static final java.lang.String _value75 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "YE");
    public static final java.lang.String _value76 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IL");
    public static final java.lang.String _value77 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IN");
    public static final java.lang.String _value78 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ID");
    public static final java.lang.String _value79 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "JO");
    public static final java.lang.String _value80 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IQ");
    public static final java.lang.String _value81 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IR");
    public static final java.lang.String _value82 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IE");
    public static final java.lang.String _value83 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IS");
    public static final java.lang.String _value84 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ES");
    public static final java.lang.String _value85 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IT");
    public static final java.lang.String _value86 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CV");
    public static final java.lang.String _value87 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KZ");
    public static final java.lang.String _value88 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KY");
    public static final java.lang.String _value89 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KH");
    public static final java.lang.String _value90 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CM");
    public static final java.lang.String _value91 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CA");
    public static final java.lang.String _value92 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "QA");
    public static final java.lang.String _value93 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KE");
    public static final java.lang.String _value94 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CY");
    public static final java.lang.String _value95 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KG");
    public static final java.lang.String _value96 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KI");
    public static final java.lang.String _value97 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CN");
    public static final java.lang.String _value98 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KP");
    public static final java.lang.String _value99 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CC");
    public static final java.lang.String _value100 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CO");
    public static final java.lang.String _value101 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KM");
    public static final java.lang.String _value102 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CD");
    public static final java.lang.String _value103 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CG");
    public static final java.lang.String _value104 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CR");
    public static final java.lang.String _value105 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CI");
    public static final java.lang.String _value106 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CU");
    public static final java.lang.String _value107 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KW");
    public static final java.lang.String _value108 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CK");
    public static final java.lang.String _value109 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LA");
    public static final java.lang.String _value110 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LV");
    public static final java.lang.String _value111 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LS");
    public static final java.lang.String _value112 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LR");
    public static final java.lang.String _value113 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LB");
    public static final java.lang.String _value114 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LY");
    public static final java.lang.String _value115 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LT");
    public static final java.lang.String _value116 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LI");
    public static final java.lang.String _value117 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LU");
    public static final java.lang.String _value118 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MU");
    public static final java.lang.String _value119 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MR");
    public static final java.lang.String _value120 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MG");
    public static final java.lang.String _value121 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "YT");
    public static final java.lang.String _value122 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MO");
    public static final java.lang.String _value123 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MW");
    public static final java.lang.String _value124 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MY");
    public static final java.lang.String _value125 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ML");
    public static final java.lang.String _value126 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MV");
    public static final java.lang.String _value127 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MT");
    public static final java.lang.String _value128 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MA");
    public static final java.lang.String _value129 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MQ");
    public static final java.lang.String _value130 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MH");
    public static final java.lang.String _value131 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MX");
    public static final java.lang.String _value132 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MZ");
    public static final java.lang.String _value133 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MD");
    public static final java.lang.String _value134 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MC");
    public static final java.lang.String _value135 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MN");
    public static final java.lang.String _value136 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MS");
    public static final java.lang.String _value137 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MM");
    public static final java.lang.String _value138 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NA");
    public static final java.lang.String _value139 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NR");
    public static final java.lang.String _value140 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NP");
    public static final java.lang.String _value141 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NE");
    public static final java.lang.String _value142 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NG");
    public static final java.lang.String _value143 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AN");
    public static final java.lang.String _value144 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NL");
    public static final java.lang.String _value145 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NI");
    public static final java.lang.String _value146 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NU");
    public static final java.lang.String _value147 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NZ");
    public static final java.lang.String _value148 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NC");
    public static final java.lang.String _value149 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NO");
    public static final java.lang.String _value150 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "NF");
    public static final java.lang.String _value151 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "AE");
    public static final java.lang.String _value152 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "OM");
    public static final java.lang.String _value153 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "IM");
    public static final java.lang.String _value154 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "HM");
    public static final java.lang.String _value155 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PK");
    public static final java.lang.String _value156 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PW");
    public static final java.lang.String _value157 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PS");
    public static final java.lang.String _value158 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PA");
    public static final java.lang.String _value159 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PG");
    public static final java.lang.String _value160 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PY");
    public static final java.lang.String _value161 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PE");
    public static final java.lang.String _value162 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PN");
    public static final java.lang.String _value163 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PL");
    public static final java.lang.String _value164 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PT");
    public static final java.lang.String _value165 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PR");
    public static final java.lang.String _value166 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KR");
    public static final java.lang.String _value167 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MK");
    public static final java.lang.String _value168 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RE");
    public static final java.lang.String _value169 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CX");
    public static final java.lang.String _value170 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RU");
    public static final java.lang.String _value171 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RW");
    public static final java.lang.String _value172 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RO");
    public static final java.lang.String _value173 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SV");
    public static final java.lang.String _value174 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "WS");
    public static final java.lang.String _value175 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SM");
    public static final java.lang.String _value176 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ST");
    public static final java.lang.String _value177 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SA");
    public static final java.lang.String _value178 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SZ");
    public static final java.lang.String _value179 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MF");
    public static final java.lang.String _value180 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SH");
    public static final java.lang.String _value181 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "MP");
    public static final java.lang.String _value182 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SC");
    public static final java.lang.String _value183 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "BL");
    public static final java.lang.String _value184 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SN");
    public static final java.lang.String _value185 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PM");
    public static final java.lang.String _value186 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "VC");
    public static final java.lang.String _value187 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "KN");
    public static final java.lang.String _value188 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LC");
    public static final java.lang.String _value189 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "RS");
    public static final java.lang.String _value190 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SG");
    public static final java.lang.String _value191 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SY");
    public static final java.lang.String _value192 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SK");
    public static final java.lang.String _value193 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SI");
    public static final java.lang.String _value194 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SB");
    public static final java.lang.String _value195 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SO");
    public static final java.lang.String _value196 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SD");
    public static final java.lang.String _value197 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SR");
    public static final java.lang.String _value198 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "US");
    public static final java.lang.String _value199 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SL");
    public static final java.lang.String _value200 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TJ");
    public static final java.lang.String _value201 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TW");
    public static final java.lang.String _value202 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TH");
    public static final java.lang.String _value203 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TZ");
    public static final java.lang.String _value204 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TC");
    public static final java.lang.String _value205 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TG");
    public static final java.lang.String _value206 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TK");
    public static final java.lang.String _value207 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TO");
    public static final java.lang.String _value208 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TT");
    public static final java.lang.String _value209 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TV");
    public static final java.lang.String _value210 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TN");
    public static final java.lang.String _value211 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TM");
    public static final java.lang.String _value212 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TR");
    public static final java.lang.String _value213 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UG");
    public static final java.lang.String _value214 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UZ");
    public static final java.lang.String _value215 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UA");
    public static final java.lang.String _value216 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "WF");
    public static final java.lang.String _value217 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "UY");
    public static final java.lang.String _value218 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FO");
    public static final java.lang.String _value219 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FM");
    public static final java.lang.String _value220 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FJ");
    public static final java.lang.String _value221 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PH");
    public static final java.lang.String _value222 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FI");
    public static final java.lang.String _value223 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FK");
    public static final java.lang.String _value224 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "FR");
    public static final java.lang.String _value225 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "PF");
    public static final java.lang.String _value226 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TF");
    public static final java.lang.String _value227 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "HR");
    public static final java.lang.String _value228 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CF");
    public static final java.lang.String _value229 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "TD");
    public static final java.lang.String _value230 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ME");
    public static final java.lang.String _value231 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CZ");
    public static final java.lang.String _value232 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CL");
    public static final java.lang.String _value233 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "CH");
    public static final java.lang.String _value234 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "SE");
    public static final java.lang.String _value235 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "LK");
    public static final java.lang.String _value236 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EC");
    public static final java.lang.String _value237 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GQ");
    public static final java.lang.String _value238 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ER");
    public static final java.lang.String _value239 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "EE");
    public static final java.lang.String _value240 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ET");
    public static final java.lang.String _value241 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "GS");
    public static final java.lang.String _value242 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "ZA");
    public static final java.lang.String _value243 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "JM");
    public static final java.lang.String _value244 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "JP");
    public static final java.lang.String _value245 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "98");
    public static final java.lang.String _value246 = org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
            "99");
    public static final CitizenshipType value1 = new CitizenshipType(_value1,
            true);
    public static final CitizenshipType value2 = new CitizenshipType(_value2,
            true);
    public static final CitizenshipType value3 = new CitizenshipType(_value3,
            true);
    public static final CitizenshipType value4 = new CitizenshipType(_value4,
            true);
    public static final CitizenshipType value5 = new CitizenshipType(_value5,
            true);
    public static final CitizenshipType value6 = new CitizenshipType(_value6,
            true);
    public static final CitizenshipType value7 = new CitizenshipType(_value7,
            true);
    public static final CitizenshipType value8 = new CitizenshipType(_value8,
            true);
    public static final CitizenshipType value9 = new CitizenshipType(_value9,
            true);
    public static final CitizenshipType value10 = new CitizenshipType(_value10,
            true);
    public static final CitizenshipType value11 = new CitizenshipType(_value11,
            true);
    public static final CitizenshipType value12 = new CitizenshipType(_value12,
            true);
    public static final CitizenshipType value13 = new CitizenshipType(_value13,
            true);
    public static final CitizenshipType value14 = new CitizenshipType(_value14,
            true);
    public static final CitizenshipType value15 = new CitizenshipType(_value15,
            true);
    public static final CitizenshipType value16 = new CitizenshipType(_value16,
            true);
    public static final CitizenshipType value17 = new CitizenshipType(_value17,
            true);
    public static final CitizenshipType value18 = new CitizenshipType(_value18,
            true);
    public static final CitizenshipType value19 = new CitizenshipType(_value19,
            true);
    public static final CitizenshipType value20 = new CitizenshipType(_value20,
            true);
    public static final CitizenshipType value21 = new CitizenshipType(_value21,
            true);
    public static final CitizenshipType value22 = new CitizenshipType(_value22,
            true);
    public static final CitizenshipType value23 = new CitizenshipType(_value23,
            true);
    public static final CitizenshipType value24 = new CitizenshipType(_value24,
            true);
    public static final CitizenshipType value25 = new CitizenshipType(_value25,
            true);
    public static final CitizenshipType value26 = new CitizenshipType(_value26,
            true);
    public static final CitizenshipType value27 = new CitizenshipType(_value27,
            true);
    public static final CitizenshipType value28 = new CitizenshipType(_value28,
            true);
    public static final CitizenshipType value29 = new CitizenshipType(_value29,
            true);
    public static final CitizenshipType value30 = new CitizenshipType(_value30,
            true);
    public static final CitizenshipType value31 = new CitizenshipType(_value31,
            true);
    public static final CitizenshipType value32 = new CitizenshipType(_value32,
            true);
    public static final CitizenshipType value33 = new CitizenshipType(_value33,
            true);
    public static final CitizenshipType value34 = new CitizenshipType(_value34,
            true);
    public static final CitizenshipType value35 = new CitizenshipType(_value35,
            true);
    public static final CitizenshipType value36 = new CitizenshipType(_value36,
            true);
    public static final CitizenshipType value37 = new CitizenshipType(_value37,
            true);
    public static final CitizenshipType value38 = new CitizenshipType(_value38,
            true);
    public static final CitizenshipType value39 = new CitizenshipType(_value39,
            true);
    public static final CitizenshipType value40 = new CitizenshipType(_value40,
            true);
    public static final CitizenshipType value41 = new CitizenshipType(_value41,
            true);
    public static final CitizenshipType value42 = new CitizenshipType(_value42,
            true);
    public static final CitizenshipType value43 = new CitizenshipType(_value43,
            true);
    public static final CitizenshipType value44 = new CitizenshipType(_value44,
            true);
    public static final CitizenshipType value45 = new CitizenshipType(_value45,
            true);
    public static final CitizenshipType value46 = new CitizenshipType(_value46,
            true);
    public static final CitizenshipType value47 = new CitizenshipType(_value47,
            true);
    public static final CitizenshipType value48 = new CitizenshipType(_value48,
            true);
    public static final CitizenshipType value49 = new CitizenshipType(_value49,
            true);
    public static final CitizenshipType value50 = new CitizenshipType(_value50,
            true);
    public static final CitizenshipType value51 = new CitizenshipType(_value51,
            true);
    public static final CitizenshipType value52 = new CitizenshipType(_value52,
            true);
    public static final CitizenshipType value53 = new CitizenshipType(_value53,
            true);
    public static final CitizenshipType value54 = new CitizenshipType(_value54,
            true);
    public static final CitizenshipType value55 = new CitizenshipType(_value55,
            true);
    public static final CitizenshipType value56 = new CitizenshipType(_value56,
            true);
    public static final CitizenshipType value57 = new CitizenshipType(_value57,
            true);
    public static final CitizenshipType value58 = new CitizenshipType(_value58,
            true);
    public static final CitizenshipType value59 = new CitizenshipType(_value59,
            true);
    public static final CitizenshipType value60 = new CitizenshipType(_value60,
            true);
    public static final CitizenshipType value61 = new CitizenshipType(_value61,
            true);
    public static final CitizenshipType value62 = new CitizenshipType(_value62,
            true);
    public static final CitizenshipType value63 = new CitizenshipType(_value63,
            true);
    public static final CitizenshipType value64 = new CitizenshipType(_value64,
            true);
    public static final CitizenshipType value65 = new CitizenshipType(_value65,
            true);
    public static final CitizenshipType value66 = new CitizenshipType(_value66,
            true);
    public static final CitizenshipType value67 = new CitizenshipType(_value67,
            true);
    public static final CitizenshipType value68 = new CitizenshipType(_value68,
            true);
    public static final CitizenshipType value69 = new CitizenshipType(_value69,
            true);
    public static final CitizenshipType value70 = new CitizenshipType(_value70,
            true);
    public static final CitizenshipType value71 = new CitizenshipType(_value71,
            true);
    public static final CitizenshipType value72 = new CitizenshipType(_value72,
            true);
    public static final CitizenshipType value73 = new CitizenshipType(_value73,
            true);
    public static final CitizenshipType value74 = new CitizenshipType(_value74,
            true);
    public static final CitizenshipType value75 = new CitizenshipType(_value75,
            true);
    public static final CitizenshipType value76 = new CitizenshipType(_value76,
            true);
    public static final CitizenshipType value77 = new CitizenshipType(_value77,
            true);
    public static final CitizenshipType value78 = new CitizenshipType(_value78,
            true);
    public static final CitizenshipType value79 = new CitizenshipType(_value79,
            true);
    public static final CitizenshipType value80 = new CitizenshipType(_value80,
            true);
    public static final CitizenshipType value81 = new CitizenshipType(_value81,
            true);
    public static final CitizenshipType value82 = new CitizenshipType(_value82,
            true);
    public static final CitizenshipType value83 = new CitizenshipType(_value83,
            true);
    public static final CitizenshipType value84 = new CitizenshipType(_value84,
            true);
    public static final CitizenshipType value85 = new CitizenshipType(_value85,
            true);
    public static final CitizenshipType value86 = new CitizenshipType(_value86,
            true);
    public static final CitizenshipType value87 = new CitizenshipType(_value87,
            true);
    public static final CitizenshipType value88 = new CitizenshipType(_value88,
            true);
    public static final CitizenshipType value89 = new CitizenshipType(_value89,
            true);
    public static final CitizenshipType value90 = new CitizenshipType(_value90,
            true);
    public static final CitizenshipType value91 = new CitizenshipType(_value91,
            true);
    public static final CitizenshipType value92 = new CitizenshipType(_value92,
            true);
    public static final CitizenshipType value93 = new CitizenshipType(_value93,
            true);
    public static final CitizenshipType value94 = new CitizenshipType(_value94,
            true);
    public static final CitizenshipType value95 = new CitizenshipType(_value95,
            true);
    public static final CitizenshipType value96 = new CitizenshipType(_value96,
            true);
    public static final CitizenshipType value97 = new CitizenshipType(_value97,
            true);
    public static final CitizenshipType value98 = new CitizenshipType(_value98,
            true);
    public static final CitizenshipType value99 = new CitizenshipType(_value99,
            true);
    public static final CitizenshipType value100 = new CitizenshipType(_value100,
            true);
    public static final CitizenshipType value101 = new CitizenshipType(_value101,
            true);
    public static final CitizenshipType value102 = new CitizenshipType(_value102,
            true);
    public static final CitizenshipType value103 = new CitizenshipType(_value103,
            true);
    public static final CitizenshipType value104 = new CitizenshipType(_value104,
            true);
    public static final CitizenshipType value105 = new CitizenshipType(_value105,
            true);
    public static final CitizenshipType value106 = new CitizenshipType(_value106,
            true);
    public static final CitizenshipType value107 = new CitizenshipType(_value107,
            true);
    public static final CitizenshipType value108 = new CitizenshipType(_value108,
            true);
    public static final CitizenshipType value109 = new CitizenshipType(_value109,
            true);
    public static final CitizenshipType value110 = new CitizenshipType(_value110,
            true);
    public static final CitizenshipType value111 = new CitizenshipType(_value111,
            true);
    public static final CitizenshipType value112 = new CitizenshipType(_value112,
            true);
    public static final CitizenshipType value113 = new CitizenshipType(_value113,
            true);
    public static final CitizenshipType value114 = new CitizenshipType(_value114,
            true);
    public static final CitizenshipType value115 = new CitizenshipType(_value115,
            true);
    public static final CitizenshipType value116 = new CitizenshipType(_value116,
            true);
    public static final CitizenshipType value117 = new CitizenshipType(_value117,
            true);
    public static final CitizenshipType value118 = new CitizenshipType(_value118,
            true);
    public static final CitizenshipType value119 = new CitizenshipType(_value119,
            true);
    public static final CitizenshipType value120 = new CitizenshipType(_value120,
            true);
    public static final CitizenshipType value121 = new CitizenshipType(_value121,
            true);
    public static final CitizenshipType value122 = new CitizenshipType(_value122,
            true);
    public static final CitizenshipType value123 = new CitizenshipType(_value123,
            true);
    public static final CitizenshipType value124 = new CitizenshipType(_value124,
            true);
    public static final CitizenshipType value125 = new CitizenshipType(_value125,
            true);
    public static final CitizenshipType value126 = new CitizenshipType(_value126,
            true);
    public static final CitizenshipType value127 = new CitizenshipType(_value127,
            true);
    public static final CitizenshipType value128 = new CitizenshipType(_value128,
            true);
    public static final CitizenshipType value129 = new CitizenshipType(_value129,
            true);
    public static final CitizenshipType value130 = new CitizenshipType(_value130,
            true);
    public static final CitizenshipType value131 = new CitizenshipType(_value131,
            true);
    public static final CitizenshipType value132 = new CitizenshipType(_value132,
            true);
    public static final CitizenshipType value133 = new CitizenshipType(_value133,
            true);
    public static final CitizenshipType value134 = new CitizenshipType(_value134,
            true);
    public static final CitizenshipType value135 = new CitizenshipType(_value135,
            true);
    public static final CitizenshipType value136 = new CitizenshipType(_value136,
            true);
    public static final CitizenshipType value137 = new CitizenshipType(_value137,
            true);
    public static final CitizenshipType value138 = new CitizenshipType(_value138,
            true);
    public static final CitizenshipType value139 = new CitizenshipType(_value139,
            true);
    public static final CitizenshipType value140 = new CitizenshipType(_value140,
            true);
    public static final CitizenshipType value141 = new CitizenshipType(_value141,
            true);
    public static final CitizenshipType value142 = new CitizenshipType(_value142,
            true);
    public static final CitizenshipType value143 = new CitizenshipType(_value143,
            true);
    public static final CitizenshipType value144 = new CitizenshipType(_value144,
            true);
    public static final CitizenshipType value145 = new CitizenshipType(_value145,
            true);
    public static final CitizenshipType value146 = new CitizenshipType(_value146,
            true);
    public static final CitizenshipType value147 = new CitizenshipType(_value147,
            true);
    public static final CitizenshipType value148 = new CitizenshipType(_value148,
            true);
    public static final CitizenshipType value149 = new CitizenshipType(_value149,
            true);
    public static final CitizenshipType value150 = new CitizenshipType(_value150,
            true);
    public static final CitizenshipType value151 = new CitizenshipType(_value151,
            true);
    public static final CitizenshipType value152 = new CitizenshipType(_value152,
            true);
    public static final CitizenshipType value153 = new CitizenshipType(_value153,
            true);
    public static final CitizenshipType value154 = new CitizenshipType(_value154,
            true);
    public static final CitizenshipType value155 = new CitizenshipType(_value155,
            true);
    public static final CitizenshipType value156 = new CitizenshipType(_value156,
            true);
    public static final CitizenshipType value157 = new CitizenshipType(_value157,
            true);
    public static final CitizenshipType value158 = new CitizenshipType(_value158,
            true);
    public static final CitizenshipType value159 = new CitizenshipType(_value159,
            true);
    public static final CitizenshipType value160 = new CitizenshipType(_value160,
            true);
    public static final CitizenshipType value161 = new CitizenshipType(_value161,
            true);
    public static final CitizenshipType value162 = new CitizenshipType(_value162,
            true);
    public static final CitizenshipType value163 = new CitizenshipType(_value163,
            true);
    public static final CitizenshipType value164 = new CitizenshipType(_value164,
            true);
    public static final CitizenshipType value165 = new CitizenshipType(_value165,
            true);
    public static final CitizenshipType value166 = new CitizenshipType(_value166,
            true);
    public static final CitizenshipType value167 = new CitizenshipType(_value167,
            true);
    public static final CitizenshipType value168 = new CitizenshipType(_value168,
            true);
    public static final CitizenshipType value169 = new CitizenshipType(_value169,
            true);
    public static final CitizenshipType value170 = new CitizenshipType(_value170,
            true);
    public static final CitizenshipType value171 = new CitizenshipType(_value171,
            true);
    public static final CitizenshipType value172 = new CitizenshipType(_value172,
            true);
    public static final CitizenshipType value173 = new CitizenshipType(_value173,
            true);
    public static final CitizenshipType value174 = new CitizenshipType(_value174,
            true);
    public static final CitizenshipType value175 = new CitizenshipType(_value175,
            true);
    public static final CitizenshipType value176 = new CitizenshipType(_value176,
            true);
    public static final CitizenshipType value177 = new CitizenshipType(_value177,
            true);
    public static final CitizenshipType value178 = new CitizenshipType(_value178,
            true);
    public static final CitizenshipType value179 = new CitizenshipType(_value179,
            true);
    public static final CitizenshipType value180 = new CitizenshipType(_value180,
            true);
    public static final CitizenshipType value181 = new CitizenshipType(_value181,
            true);
    public static final CitizenshipType value182 = new CitizenshipType(_value182,
            true);
    public static final CitizenshipType value183 = new CitizenshipType(_value183,
            true);
    public static final CitizenshipType value184 = new CitizenshipType(_value184,
            true);
    public static final CitizenshipType value185 = new CitizenshipType(_value185,
            true);
    public static final CitizenshipType value186 = new CitizenshipType(_value186,
            true);
    public static final CitizenshipType value187 = new CitizenshipType(_value187,
            true);
    public static final CitizenshipType value188 = new CitizenshipType(_value188,
            true);
    public static final CitizenshipType value189 = new CitizenshipType(_value189,
            true);
    public static final CitizenshipType value190 = new CitizenshipType(_value190,
            true);
    public static final CitizenshipType value191 = new CitizenshipType(_value191,
            true);
    public static final CitizenshipType value192 = new CitizenshipType(_value192,
            true);
    public static final CitizenshipType value193 = new CitizenshipType(_value193,
            true);
    public static final CitizenshipType value194 = new CitizenshipType(_value194,
            true);
    public static final CitizenshipType value195 = new CitizenshipType(_value195,
            true);
    public static final CitizenshipType value196 = new CitizenshipType(_value196,
            true);
    public static final CitizenshipType value197 = new CitizenshipType(_value197,
            true);
    public static final CitizenshipType value198 = new CitizenshipType(_value198,
            true);
    public static final CitizenshipType value199 = new CitizenshipType(_value199,
            true);
    public static final CitizenshipType value200 = new CitizenshipType(_value200,
            true);
    public static final CitizenshipType value201 = new CitizenshipType(_value201,
            true);
    public static final CitizenshipType value202 = new CitizenshipType(_value202,
            true);
    public static final CitizenshipType value203 = new CitizenshipType(_value203,
            true);
    public static final CitizenshipType value204 = new CitizenshipType(_value204,
            true);
    public static final CitizenshipType value205 = new CitizenshipType(_value205,
            true);
    public static final CitizenshipType value206 = new CitizenshipType(_value206,
            true);
    public static final CitizenshipType value207 = new CitizenshipType(_value207,
            true);
    public static final CitizenshipType value208 = new CitizenshipType(_value208,
            true);
    public static final CitizenshipType value209 = new CitizenshipType(_value209,
            true);
    public static final CitizenshipType value210 = new CitizenshipType(_value210,
            true);
    public static final CitizenshipType value211 = new CitizenshipType(_value211,
            true);
    public static final CitizenshipType value212 = new CitizenshipType(_value212,
            true);
    public static final CitizenshipType value213 = new CitizenshipType(_value213,
            true);
    public static final CitizenshipType value214 = new CitizenshipType(_value214,
            true);
    public static final CitizenshipType value215 = new CitizenshipType(_value215,
            true);
    public static final CitizenshipType value216 = new CitizenshipType(_value216,
            true);
    public static final CitizenshipType value217 = new CitizenshipType(_value217,
            true);
    public static final CitizenshipType value218 = new CitizenshipType(_value218,
            true);
    public static final CitizenshipType value219 = new CitizenshipType(_value219,
            true);
    public static final CitizenshipType value220 = new CitizenshipType(_value220,
            true);
    public static final CitizenshipType value221 = new CitizenshipType(_value221,
            true);
    public static final CitizenshipType value222 = new CitizenshipType(_value222,
            true);
    public static final CitizenshipType value223 = new CitizenshipType(_value223,
            true);
    public static final CitizenshipType value224 = new CitizenshipType(_value224,
            true);
    public static final CitizenshipType value225 = new CitizenshipType(_value225,
            true);
    public static final CitizenshipType value226 = new CitizenshipType(_value226,
            true);
    public static final CitizenshipType value227 = new CitizenshipType(_value227,
            true);
    public static final CitizenshipType value228 = new CitizenshipType(_value228,
            true);
    public static final CitizenshipType value229 = new CitizenshipType(_value229,
            true);
    public static final CitizenshipType value230 = new CitizenshipType(_value230,
            true);
    public static final CitizenshipType value231 = new CitizenshipType(_value231,
            true);
    public static final CitizenshipType value232 = new CitizenshipType(_value232,
            true);
    public static final CitizenshipType value233 = new CitizenshipType(_value233,
            true);
    public static final CitizenshipType value234 = new CitizenshipType(_value234,
            true);
    public static final CitizenshipType value235 = new CitizenshipType(_value235,
            true);
    public static final CitizenshipType value236 = new CitizenshipType(_value236,
            true);
    public static final CitizenshipType value237 = new CitizenshipType(_value237,
            true);
    public static final CitizenshipType value238 = new CitizenshipType(_value238,
            true);
    public static final CitizenshipType value239 = new CitizenshipType(_value239,
            true);
    public static final CitizenshipType value240 = new CitizenshipType(_value240,
            true);
    public static final CitizenshipType value241 = new CitizenshipType(_value241,
            true);
    public static final CitizenshipType value242 = new CitizenshipType(_value242,
            true);
    public static final CitizenshipType value243 = new CitizenshipType(_value243,
            true);
    public static final CitizenshipType value244 = new CitizenshipType(_value244,
            true);
    public static final CitizenshipType value245 = new CitizenshipType(_value245,
            true);
    public static final CitizenshipType value246 = new CitizenshipType(_value246,
            true);

    /**
     * field for CitizenshipType
     */
    protected java.lang.String localCitizenshipType;

    // Constructor
    protected CitizenshipType(java.lang.String value, boolean isRegisterValue) {
        localCitizenshipType = value;

        if (isRegisterValue) {
            _table_.put(localCitizenshipType, this);
        }
    }

    public java.lang.String getValue() {
        return localCitizenshipType;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public java.lang.String toString() {
        return localCitizenshipType.toString();
    }

    /**
     *
     * @param parentQName
     * @param factory
     * @return org.apache.axiom.om.OMElement
     */
    public org.apache.axiom.om.OMElement getOMElement(
        final javax.xml.namespace.QName parentQName,
        final org.apache.axiom.om.OMFactory factory)
        throws org.apache.axis2.databinding.ADBException {
        return factory.createOMElement(new org.apache.axis2.databinding.ADBDataSource(
                this, MY_QNAME));
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        serialize(parentQName, xmlWriter, false);
    }

    public void serialize(final javax.xml.namespace.QName parentQName,
        javax.xml.stream.XMLStreamWriter xmlWriter, boolean serializeType)
        throws javax.xml.stream.XMLStreamException,
            org.apache.axis2.databinding.ADBException {
        //We can safely assume an element has only one type associated with it
        java.lang.String namespace = parentQName.getNamespaceURI();
        java.lang.String _localName = parentQName.getLocalPart();

        writeStartElement(null, namespace, _localName, xmlWriter);

        // add the type details if this is used in a simple type
        if (serializeType) {
            java.lang.String namespacePrefix = registerPrefix(xmlWriter,
                    "http://example.org/FPSPartner");

            if ((namespacePrefix != null) &&
                    (namespacePrefix.trim().length() > 0)) {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    namespacePrefix + ":CitizenshipType", xmlWriter);
            } else {
                writeAttribute("xsi",
                    "http://www.w3.org/2001/XMLSchema-instance", "type",
                    "CitizenshipType", xmlWriter);
            }
        }

        if (localCitizenshipType == null) {
            throw new org.apache.axis2.databinding.ADBException(
                "CitizenshipType cannot be null !!");
        } else {
            xmlWriter.writeCharacters(localCitizenshipType);
        }

        xmlWriter.writeEndElement();
    }

    private static java.lang.String generatePrefix(java.lang.String namespace) {
        if (namespace.equals("http://example.org/FPSPartner")) {
            return "ns1";
        }

        return org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
    }

    /**
     * Utility method to write an element start tag.
     */
    private void writeStartElement(java.lang.String prefix,
        java.lang.String namespace, java.lang.String localPart,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeStartElement(writerPrefix, localPart, namespace);
        } else {
            if (namespace.length() == 0) {
                prefix = "";
            } else if (prefix == null) {
                prefix = generatePrefix(namespace);
            }

            xmlWriter.writeStartElement(prefix, localPart, namespace);
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }
    }

    /**
     * Util method to write an attribute with the ns prefix
     */
    private void writeAttribute(java.lang.String prefix,
        java.lang.String namespace, java.lang.String attName,
        java.lang.String attValue, javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String writerPrefix = xmlWriter.getPrefix(namespace);

        if (writerPrefix != null) {
            xmlWriter.writeAttribute(writerPrefix, namespace, attName, attValue);
        } else {
            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
            xmlWriter.writeAttribute(prefix, namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeAttribute(java.lang.String namespace,
        java.lang.String attName, java.lang.String attValue,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attValue);
        } else {
            xmlWriter.writeAttribute(registerPrefix(xmlWriter, namespace),
                namespace, attName, attValue);
        }
    }

    /**
     * Util method to write an attribute without the ns prefix
     */
    private void writeQNameAttribute(java.lang.String namespace,
        java.lang.String attName, javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String attributeNamespace = qname.getNamespaceURI();
        java.lang.String attributePrefix = xmlWriter.getPrefix(attributeNamespace);

        if (attributePrefix == null) {
            attributePrefix = registerPrefix(xmlWriter, attributeNamespace);
        }

        java.lang.String attributeValue;

        if (attributePrefix.trim().length() > 0) {
            attributeValue = attributePrefix + ":" + qname.getLocalPart();
        } else {
            attributeValue = qname.getLocalPart();
        }

        if (namespace.equals("")) {
            xmlWriter.writeAttribute(attName, attributeValue);
        } else {
            registerPrefix(xmlWriter, namespace);
            xmlWriter.writeAttribute(attributePrefix, namespace, attName,
                attributeValue);
        }
    }

    /**
     *  method to handle Qnames
     */
    private void writeQName(javax.xml.namespace.QName qname,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String namespaceURI = qname.getNamespaceURI();

        if (namespaceURI != null) {
            java.lang.String prefix = xmlWriter.getPrefix(namespaceURI);

            if (prefix == null) {
                prefix = generatePrefix(namespaceURI);
                xmlWriter.writeNamespace(prefix, namespaceURI);
                xmlWriter.setPrefix(prefix, namespaceURI);
            }

            if (prefix.trim().length() > 0) {
                xmlWriter.writeCharacters(prefix + ":" +
                    org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            } else {
                // i.e this is the default namespace
                xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        qname));
            }
        } else {
            xmlWriter.writeCharacters(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                    qname));
        }
    }

    private void writeQNames(javax.xml.namespace.QName[] qnames,
        javax.xml.stream.XMLStreamWriter xmlWriter)
        throws javax.xml.stream.XMLStreamException {
        if (qnames != null) {
            // we have to store this data until last moment since it is not possible to write any
            // namespace data after writing the charactor data
            java.lang.StringBuffer stringToWrite = new java.lang.StringBuffer();
            java.lang.String namespaceURI = null;
            java.lang.String prefix = null;

            for (int i = 0; i < qnames.length; i++) {
                if (i > 0) {
                    stringToWrite.append(" ");
                }

                namespaceURI = qnames[i].getNamespaceURI();

                if (namespaceURI != null) {
                    prefix = xmlWriter.getPrefix(namespaceURI);

                    if ((prefix == null) || (prefix.length() == 0)) {
                        prefix = generatePrefix(namespaceURI);
                        xmlWriter.writeNamespace(prefix, namespaceURI);
                        xmlWriter.setPrefix(prefix, namespaceURI);
                    }

                    if (prefix.trim().length() > 0) {
                        stringToWrite.append(prefix).append(":")
                                     .append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    } else {
                        stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                                qnames[i]));
                    }
                } else {
                    stringToWrite.append(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                            qnames[i]));
                }
            }

            xmlWriter.writeCharacters(stringToWrite.toString());
        }
    }

    /**
     * Register a namespace prefix
     */
    private java.lang.String registerPrefix(
        javax.xml.stream.XMLStreamWriter xmlWriter, java.lang.String namespace)
        throws javax.xml.stream.XMLStreamException {
        java.lang.String prefix = xmlWriter.getPrefix(namespace);

        if (prefix == null) {
            prefix = generatePrefix(namespace);

            javax.xml.namespace.NamespaceContext nsContext = xmlWriter.getNamespaceContext();

            while (true) {
                java.lang.String uri = nsContext.getNamespaceURI(prefix);

                if ((uri == null) || (uri.length() == 0)) {
                    break;
                }

                prefix = org.apache.axis2.databinding.utils.BeanUtil.getUniquePrefix();
            }

            xmlWriter.writeNamespace(prefix, namespace);
            xmlWriter.setPrefix(prefix, namespace);
        }

        return prefix;
    }

    /**
     *  Factory class that keeps the parse method
     */
    public static class Factory {
        private static org.apache.commons.logging.Log log = org.apache.commons.logging.LogFactory.getLog(Factory.class);

        public static CitizenshipType fromValue(java.lang.String value)
            throws java.lang.IllegalArgumentException {
            CitizenshipType enumeration = (CitizenshipType) _table_.get(value);

            // handle unexpected enumeration values properly
            if (enumeration == null) {
                throw new java.lang.IllegalArgumentException();
            }

            return enumeration;
        }

        public static CitizenshipType fromString(java.lang.String value,
            java.lang.String namespaceURI)
            throws java.lang.IllegalArgumentException {
            try {
                return fromValue(org.apache.axis2.databinding.utils.ConverterUtil.convertToString(
                        value));
            } catch (java.lang.Exception e) {
                throw new java.lang.IllegalArgumentException();
            }
        }

        public static CitizenshipType fromString(
            javax.xml.stream.XMLStreamReader xmlStreamReader,
            java.lang.String content) {
            if (content.indexOf(":") > -1) {
                java.lang.String prefix = content.substring(0,
                        content.indexOf(":"));
                java.lang.String namespaceUri = xmlStreamReader.getNamespaceContext()
                                                               .getNamespaceURI(prefix);

                return CitizenshipType.Factory.fromString(content, namespaceUri);
            } else {
                return CitizenshipType.Factory.fromString(content, "");
            }
        }

        /**
         * static method to create the object
         * Precondition:  If this object is an element, the current or next start element starts this object and any intervening reader events are ignorable
         *                If this object is not an element, it is a complex type and the reader is at the event just after the outer start element
         * Postcondition: If this object is an element, the reader is positioned at its end element
         *                If this object is a complex type, the reader is positioned at the end element of its outer element
         */
        public static CitizenshipType parse(
            javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception {
            CitizenshipType object = null;

            // initialize a hash map to keep values
            java.util.Map attributeMap = new java.util.HashMap();
            java.util.List extraAttributeList = new java.util.ArrayList<org.apache.axiom.om.OMAttribute>();

            int event;
            javax.xml.namespace.QName currentQName = null;
            java.lang.String nillableValue = null;
            java.lang.String prefix = "";
            java.lang.String namespaceuri = "";

            try {
                while (!reader.isStartElement() && !reader.isEndElement())
                    reader.next();

                currentQName = reader.getName();

                // Note all attributes that were handled. Used to differ normal attributes
                // from anyAttributes.
                java.util.Vector handledAttributes = new java.util.Vector();

                while (!reader.isEndElement()) {
                    if (reader.isStartElement() || reader.hasText()) {
                        nillableValue = reader.getAttributeValue("http://www.w3.org/2001/XMLSchema-instance",
                                "nil");

                        if ("true".equals(nillableValue) ||
                                "1".equals(nillableValue)) {
                            throw new org.apache.axis2.databinding.ADBException(
                                "The element: " + "CitizenshipType" +
                                "  cannot be null");
                        }

                        java.lang.String content = reader.getElementText();

                        if (content.indexOf(":") > 0) {
                            // this seems to be a Qname so find the namespace and send
                            prefix = content.substring(0, content.indexOf(":"));
                            namespaceuri = reader.getNamespaceURI(prefix);
                            object = CitizenshipType.Factory.fromString(content,
                                    namespaceuri);
                        } else {
                            // this seems to be not a qname send and empty namespace incase of it is
                            // check is done in fromString method
                            object = CitizenshipType.Factory.fromString(content,
                                    "");
                        }
                    } else {
                        reader.next();
                    }
                } // end of while loop
            } catch (javax.xml.stream.XMLStreamException e) {
                throw new java.lang.Exception(e);
            }

            return object;
        }
    } //end of factory class
}
