//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.validation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NbchValidator extends CommonValidator {
    static final List<String> mandatoryPathes = Arrays.asList(new String[]{"Application", "Application.id", "Application.date", "Application.client", "Application.client.id", "Application.client.surname", "Application.client.birthdate"});
    static final Map<String, List<String>> mandatoryMap = new HashMap();

    public NbchValidator() {
    }

    protected Map<String, List<String>> getMandatorMap() {
        return mandatoryMap;
    }

    static {
        prepareMap(mandatoryPathes, mandatoryMap);
    }
}
