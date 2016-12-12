
package ru.sample.qiwi.soap.ru.mbtc.afs;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Td17.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="Td17">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="RUB"/>
 *     &lt;enumeration value="EUR"/>
 *     &lt;enumeration value="USD"/>
 *     &lt;enumeration value="ALL"/>
 *     &lt;enumeration value="AED"/>
 *     &lt;enumeration value="AFN"/>
 *     &lt;enumeration value="AMD"/>
 *     &lt;enumeration value="ANG"/>
 *     &lt;enumeration value="AOA"/>
 *     &lt;enumeration value="ARS"/>
 *     &lt;enumeration value="AUD"/>
 *     &lt;enumeration value="AWG"/>
 *     &lt;enumeration value="AZN"/>
 *     &lt;enumeration value="BAM"/>
 *     &lt;enumeration value="BBD"/>
 *     &lt;enumeration value="BDT"/>
 *     &lt;enumeration value="BGN"/>
 *     &lt;enumeration value="BHD"/>
 *     &lt;enumeration value="BIF"/>
 *     &lt;enumeration value="BMD"/>
 *     &lt;enumeration value="BND"/>
 *     &lt;enumeration value="BOB"/>
 *     &lt;enumeration value="BRL"/>
 *     &lt;enumeration value="BSD"/>
 *     &lt;enumeration value="BTN"/>
 *     &lt;enumeration value="BWP"/>
 *     &lt;enumeration value="BYR"/>
 *     &lt;enumeration value="BZD"/>
 *     &lt;enumeration value="CAD"/>
 *     &lt;enumeration value="CDF"/>
 *     &lt;enumeration value="CHF"/>
 *     &lt;enumeration value="CLP"/>
 *     &lt;enumeration value="CNY"/>
 *     &lt;enumeration value="COP"/>
 *     &lt;enumeration value="COU"/>
 *     &lt;enumeration value="CRC"/>
 *     &lt;enumeration value="CUC"/>
 *     &lt;enumeration value="CUP"/>
 *     &lt;enumeration value="CVE"/>
 *     &lt;enumeration value="CZK"/>
 *     &lt;enumeration value="DJF"/>
 *     &lt;enumeration value="DKK"/>
 *     &lt;enumeration value="DOP"/>
 *     &lt;enumeration value="DZD"/>
 *     &lt;enumeration value="EGP"/>
 *     &lt;enumeration value="ERN"/>
 *     &lt;enumeration value="ETB"/>
 *     &lt;enumeration value="FJD"/>
 *     &lt;enumeration value="FKP"/>
 *     &lt;enumeration value="GBP"/>
 *     &lt;enumeration value="GEL"/>
 *     &lt;enumeration value="GHS"/>
 *     &lt;enumeration value="GIP"/>
 *     &lt;enumeration value="GMD"/>
 *     &lt;enumeration value="GNF"/>
 *     &lt;enumeration value="GTQ"/>
 *     &lt;enumeration value="GYD"/>
 *     &lt;enumeration value="HKD"/>
 *     &lt;enumeration value="HNL"/>
 *     &lt;enumeration value="HRK"/>
 *     &lt;enumeration value="HTG"/>
 *     &lt;enumeration value="HUF"/>
 *     &lt;enumeration value="IDR"/>
 *     &lt;enumeration value="ILS"/>
 *     &lt;enumeration value="INR"/>
 *     &lt;enumeration value="IQD"/>
 *     &lt;enumeration value="IRR"/>
 *     &lt;enumeration value="ISK"/>
 *     &lt;enumeration value="JMD"/>
 *     &lt;enumeration value="JOD"/>
 *     &lt;enumeration value="JPY"/>
 *     &lt;enumeration value="KES"/>
 *     &lt;enumeration value="KGS"/>
 *     &lt;enumeration value="KHR"/>
 *     &lt;enumeration value="KMF"/>
 *     &lt;enumeration value="KPW"/>
 *     &lt;enumeration value="KRW"/>
 *     &lt;enumeration value="KWD"/>
 *     &lt;enumeration value="KYD"/>
 *     &lt;enumeration value="KZT"/>
 *     &lt;enumeration value="LAK"/>
 *     &lt;enumeration value="LBP"/>
 *     &lt;enumeration value="LKR"/>
 *     &lt;enumeration value="LRD"/>
 *     &lt;enumeration value="LSL"/>
 *     &lt;enumeration value="LTL"/>
 *     &lt;enumeration value="LVL"/>
 *     &lt;enumeration value="LYD"/>
 *     &lt;enumeration value="MAD"/>
 *     &lt;enumeration value="MDL"/>
 *     &lt;enumeration value="MGA"/>
 *     &lt;enumeration value="MKD"/>
 *     &lt;enumeration value="MMK"/>
 *     &lt;enumeration value="MNT"/>
 *     &lt;enumeration value="MOP"/>
 *     &lt;enumeration value="MRO"/>
 *     &lt;enumeration value="MUR"/>
 *     &lt;enumeration value="MVR"/>
 *     &lt;enumeration value="MWK"/>
 *     &lt;enumeration value="MXN"/>
 *     &lt;enumeration value="MYR"/>
 *     &lt;enumeration value="MZN"/>
 *     &lt;enumeration value="NAD"/>
 *     &lt;enumeration value="NGN"/>
 *     &lt;enumeration value="NIO"/>
 *     &lt;enumeration value="NOK"/>
 *     &lt;enumeration value="NPR"/>
 *     &lt;enumeration value="NZD"/>
 *     &lt;enumeration value="OMR"/>
 *     &lt;enumeration value="PAB"/>
 *     &lt;enumeration value="PEN"/>
 *     &lt;enumeration value="PGK"/>
 *     &lt;enumeration value="PHP"/>
 *     &lt;enumeration value="PKR"/>
 *     &lt;enumeration value="PLN"/>
 *     &lt;enumeration value="PYG"/>
 *     &lt;enumeration value="QAR"/>
 *     &lt;enumeration value="RON"/>
 *     &lt;enumeration value="RSD"/>
 *     &lt;enumeration value="RWF"/>
 *     &lt;enumeration value="SAR"/>
 *     &lt;enumeration value="SBD"/>
 *     &lt;enumeration value="SCR"/>
 *     &lt;enumeration value="SDG"/>
 *     &lt;enumeration value="SEK"/>
 *     &lt;enumeration value="SGD"/>
 *     &lt;enumeration value="SHP"/>
 *     &lt;enumeration value="SLL"/>
 *     &lt;enumeration value="SOS"/>
 *     &lt;enumeration value="SRD"/>
 *     &lt;enumeration value="SSP"/>
 *     &lt;enumeration value="STD"/>
 *     &lt;enumeration value="SVC"/>
 *     &lt;enumeration value="SYP"/>
 *     &lt;enumeration value="SZL"/>
 *     &lt;enumeration value="THB"/>
 *     &lt;enumeration value="TJS"/>
 *     &lt;enumeration value="TMT"/>
 *     &lt;enumeration value="TND"/>
 *     &lt;enumeration value="TOP"/>
 *     &lt;enumeration value="TRY"/>
 *     &lt;enumeration value="TTD"/>
 *     &lt;enumeration value="TWD"/>
 *     &lt;enumeration value="TZS"/>
 *     &lt;enumeration value="UAH"/>
 *     &lt;enumeration value="UGX"/>
 *     &lt;enumeration value="UYI"/>
 *     &lt;enumeration value="UYU"/>
 *     &lt;enumeration value="UZS"/>
 *     &lt;enumeration value="VEF"/>
 *     &lt;enumeration value="VND"/>
 *     &lt;enumeration value="VUV"/>
 *     &lt;enumeration value="WST"/>
 *     &lt;enumeration value="XAF"/>
 *     &lt;enumeration value="XCD"/>
 *     &lt;enumeration value="XDR"/>
 *     &lt;enumeration value="XOF"/>
 *     &lt;enumeration value="XPF"/>
 *     &lt;enumeration value="YER"/>
 *     &lt;enumeration value="ZAR"/>
 *     &lt;enumeration value="ZMK"/>
 *     &lt;enumeration value="ZWL"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "Td17", namespace = "http://mbtc.ru/afs/application")
@XmlEnum
public enum Td17 {


    /**
     * Российский рубль
     * 
     */
    RUB,

    /**
     * Евро
     * 
     */
    EUR,

    /**
     * Доллар США
     * 
     */
    USD,

    /**
     * Албанский лек
     * 
     */
    ALL,

    /**
     * Дирхам (ОАЭ)
     * 
     */
    AED,

    /**
     * Афгани
     * 
     */
    AFN,

    /**
     * Армянский драм
     * 
     */
    AMD,

    /**
     * Нидерландский антильский гульден
     * 
     */
    ANG,

    /**
     * Кванза
     * 
     */
    AOA,

    /**
     * Аргентинское песо
     * 
     */
    ARS,

    /**
     * Австралийский доллар
     * 
     */
    AUD,

    /**
     * Арубанский флорин
     * 
     */
    AWG,

    /**
     * Азербайджанский манат
     * 
     */
    AZN,

    /**
     * Конвертируемая марка
     * 
     */
    BAM,

    /**
     * Барбадосский доллар
     * 
     */
    BBD,

    /**
     * Така
     * 
     */
    BDT,

    /**
     * Болгарский лев
     * 
     */
    BGN,

    /**
     * Бахрейнский динар
     * 
     */
    BHD,

    /**
     * Бурундийский франк
     * 
     */
    BIF,

    /**
     * Бермудский доллар
     * 
     */
    BMD,

    /**
     * Брунейский доллар
     * 
     */
    BND,

    /**
     * Боливиано
     * 
     */
    BOB,

    /**
     * Бразильский реал
     * 
     */
    BRL,

    /**
     * Багамский доллар
     * 
     */
    BSD,

    /**
     * Нгултрум
     * 
     */
    BTN,

    /**
     * Пула
     * 
     */
    BWP,

    /**
     * Белорусский рубль
     * 
     */
    BYR,

    /**
     * Белизский доллар
     * 
     */
    BZD,

    /**
     * Канадский доллар
     * 
     */
    CAD,

    /**
     * Конголезский франк
     * 
     */
    CDF,

    /**
     * Швейцарский франк
     * 
     */
    CHF,

    /**
     * Чилийское песо
     * 
     */
    CLP,

    /**
     * Юань
     * 
     */
    CNY,

    /**
     * Колумбийское песо
     * 
     */
    COP,

    /**
     * Единица реальной стоимости
     * 
     */
    COU,

    /**
     * Костариканский колон
     * 
     */
    CRC,

    /**
     * Конвертируемое песо
     * 
     */
    CUC,

    /**
     * Кубинское песо
     * 
     */
    CUP,

    /**
     * Эскудо Кабо-Верде
     * 
     */
    CVE,

    /**
     * Чешская крона
     * 
     */
    CZK,

    /**
     * Франк Джибути
     * 
     */
    DJF,

    /**
     * Датская крона
     * 
     */
    DKK,

    /**
     * Доминиканское песо
     * 
     */
    DOP,

    /**
     * Алжирский динар
     * 
     */
    DZD,

    /**
     * Египетский фунт
     * 
     */
    EGP,

    /**
     * Накфа
     * 
     */
    ERN,

    /**
     * Эфиопский быр
     * 
     */
    ETB,

    /**
     * Доллар Фиджи
     * 
     */
    FJD,

    /**
     * Фунт Фолклендских островов
     * 
     */
    FKP,

    /**
     * Фунт стерлингов
     * 
     */
    GBP,

    /**
     * Лари
     * 
     */
    GEL,

    /**
     * Седи
     * 
     */
    GHS,

    /**
     * Гибралтарский фунт
     * 
     */
    GIP,

    /**
     * Даласи
     * 
     */
    GMD,

    /**
     * Гвинейский франк
     * 
     */
    GNF,

    /**
     * Кетсаль
     * 
     */
    GTQ,

    /**
     * Гайанский доллар
     * 
     */
    GYD,

    /**
     * Гонконгский доллар
     * 
     */
    HKD,

    /**
     * Лемпира
     * 
     */
    HNL,

    /**
     * Хорватская куна
     * 
     */
    HRK,

    /**
     * Гурд
     * 
     */
    HTG,

    /**
     * Форинт
     * 
     */
    HUF,

    /**
     * Рупия
     * 
     */
    IDR,

    /**
     * Новый израильский шекель
     * 
     */
    ILS,

    /**
     * Индийская рупия
     * 
     */
    INR,

    /**
     * Иракский динар
     * 
     */
    IQD,

    /**
     * Иранский риал
     * 
     */
    IRR,

    /**
     * Исландская крона
     * 
     */
    ISK,

    /**
     * Ямайский доллар
     * 
     */
    JMD,

    /**
     * Иорданский динар
     * 
     */
    JOD,

    /**
     * Иена
     * 
     */
    JPY,

    /**
     * Кенийский шиллинг
     * 
     */
    KES,

    /**
     * Сом
     * 
     */
    KGS,

    /**
     * Риель
     * 
     */
    KHR,

    /**
     * Франк Комор
     * 
     */
    KMF,

    /**
     * Северокорейская вона
     * 
     */
    KPW,

    /**
     * Вона
     * 
     */
    KRW,

    /**
     * Кувейтский динар
     * 
     */
    KWD,

    /**
     * Доллар Островов Кайман
     * 
     */
    KYD,

    /**
     * Тенге
     * 
     */
    KZT,

    /**
     * Кип
     * 
     */
    LAK,

    /**
     * Ливанский фунт
     * 
     */
    LBP,

    /**
     * Шри-Ланкийская рупия
     * 
     */
    LKR,

    /**
     * Либерийский доллар
     * 
     */
    LRD,

    /**
     * Лоти
     * 
     */
    LSL,

    /**
     * Литовский лит
     * 
     */
    LTL,

    /**
     * Латвийский лат
     * 
     */
    LVL,

    /**
     * Ливийский динар
     * 
     */
    LYD,

    /**
     * Марокканский дирхам
     * 
     */
    MAD,

    /**
     * Молдавский лей
     * 
     */
    MDL,

    /**
     * Малагасийский ариари
     * 
     */
    MGA,

    /**
     * Денар
     * 
     */
    MKD,

    /**
     * Кьят
     * 
     */
    MMK,

    /**
     * Тугрик
     * 
     */
    MNT,

    /**
     * Патака
     * 
     */
    MOP,

    /**
     * Угия
     * 
     */
    MRO,

    /**
     * Маврикийская рупия
     * 
     */
    MUR,

    /**
     * Руфия
     * 
     */
    MVR,

    /**
     * Квача
     * 
     */
    MWK,

    /**
     * Мексиканское песо
     * 
     */
    MXN,

    /**
     * Малайзийский ринггит
     * 
     */
    MYR,

    /**
     * Метикал
     * 
     */
    MZN,

    /**
     * Доллар Намибии
     * 
     */
    NAD,

    /**
     * Найра
     * 
     */
    NGN,

    /**
     * Золотая кордоба
     * 
     */
    NIO,

    /**
     * Норвежская крона
     * 
     */
    NOK,

    /**
     * Непальская рупия
     * 
     */
    NPR,

    /**
     * Новозеландский доллар
     * 
     */
    NZD,

    /**
     * Оманский риал
     * 
     */
    OMR,

    /**
     * Бальбоа
     * 
     */
    PAB,

    /**
     * Новый соль
     * 
     */
    PEN,

    /**
     * Кина
     * 
     */
    PGK,

    /**
     * Филиппинское песо
     * 
     */
    PHP,

    /**
     * Пакистанская рупия
     * 
     */
    PKR,

    /**
     * Злотый
     * 
     */
    PLN,

    /**
     * Гуарани
     * 
     */
    PYG,

    /**
     * Катарский риал
     * 
     */
    QAR,

    /**
     * Новый лей
     * 
     */
    RON,

    /**
     * Сербский динар
     * 
     */
    RSD,

    /**
     * Франк Руанды
     * 
     */
    RWF,

    /**
     * Саудовский риял
     * 
     */
    SAR,

    /**
     * Доллар Соломоновых Островов
     * 
     */
    SBD,

    /**
     * Сейшельская рупия
     * 
     */
    SCR,

    /**
     * Суданский фунт
     * 
     */
    SDG,

    /**
     * Шведская крона
     * 
     */
    SEK,

    /**
     * Сингапурский доллар
     * 
     */
    SGD,

    /**
     * Фунт Святой Елены
     * 
     */
    SHP,

    /**
     * Леоне
     * 
     */
    SLL,

    /**
     * Сомалийский шиллинг
     * 
     */
    SOS,

    /**
     * Суринамский доллар
     * 
     */
    SRD,

    /**
     * Южносуданский фунт
     * 
     */
    SSP,

    /**
     * Добра
     * 
     */
    STD,

    /**
     * Сальвадорский колон
     * 
     */
    SVC,

    /**
     * Сирийский фунт
     * 
     */
    SYP,

    /**
     * Лилангени
     * 
     */
    SZL,

    /**
     * Бат
     * 
     */
    THB,

    /**
     * Сомони
     * 
     */
    TJS,

    /**
     * Новый манат
     * 
     */
    TMT,

    /**
     * Тунисский динар
     * 
     */
    TND,

    /**
     * Паанга
     * 
     */
    TOP,

    /**
     * Турецкая лира
     * 
     */
    TRY,

    /**
     * Доллар Тринидада и Тобаго
     * 
     */
    TTD,

    /**
     * Новый тайваньский доллар
     * 
     */
    TWD,

    /**
     * Танзанийский шиллинг
     * 
     */
    TZS,

    /**
     * Гривна
     * 
     */
    UAH,

    /**
     * Угандийский шиллинг
     * 
     */
    UGX,

    /**
     * Уругвайское песо в индексированных единицах
     * 
     */
    UYI,

    /**
     * Уругвайское песо
     * 
     */
    UYU,

    /**
     * Узбекский сум
     * 
     */
    UZS,

    /**
     * Боливар фуэрте
     * 
     */
    VEF,

    /**
     * Донг
     * 
     */
    VND,

    /**
     * Вату
     * 
     */
    VUV,

    /**
     * Тала
     * 
     */
    WST,

    /**
     * Франк КФА ВЕАС
     * 
     */
    XAF,

    /**
     * Восточно-карибский доллар
     * 
     */
    XCD,

    /**
     * СДР (специальные права заимствования)
     * 
     */
    XDR,

    /**
     * Франк КФА ВСЕАО
     * 
     */
    XOF,

    /**
     * Франк КФП
     * 
     */
    XPF,

    /**
     * Йеменский риал
     * 
     */
    YER,

    /**
     * Рэнд
     * 
     */
    ZAR,

    /**
     * Замбийская квача
     * 
     */
    ZMK,

    /**
     * Доллар Зимбабве
     * 
     */
    ZWL;

    public String value() {
        return name();
    }

    public static Td17 fromValue(String v) {
        return valueOf(v);
    }

}
