//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.validation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmptyValidator extends CommonValidator {
    static final Map<String, List<String>> mandatoryMap = new HashMap();

    public EmptyValidator() {
    }

    protected Map<String, List<String>> getMandatorMap() {
        return mandatoryMap;
    }
}
