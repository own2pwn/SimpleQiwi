//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package ru.sample.qiwi.encryptnormmodule.validation;

import ru.sample.qiwi.encryptnormmodule.IErrorsListener;

import java.util.*;

public class CommonUpdateValidator implements IValidator {
    static final List<String> mandatoryPathes = Arrays.asList(new String[]{"Application", "Application.id", "Application.date"});
    static final Map<String, Condition> mandatoryConditions = new HashMap();
    static final Map<String, List<String>> mandatoryMap;

    public CommonUpdateValidator() {
    }

    protected static void prepareMap(List<String> mandatoryPathes1, Map<String, List<String>> mandatoryMap1) {
        String mPath;
        Object pathes;
        for(Iterator i$ = mandatoryPathes1.iterator(); i$.hasNext(); ((List)pathes).add(mPath)) {
            mPath = (String)i$.next();
            int ps = mPath.lastIndexOf(".");
            String pathStart = ps >= 0?mPath.substring(0, ps):"";
            pathes = (List)mandatoryMap1.get(pathStart);
            if(pathes == null) {
                pathes = new ArrayList();
                mandatoryMap1.put(pathStart, (List)pathes);
            }
        }

    }

    public boolean valid(List<String[]> applicationPathes, IErrorsListener errorsListener) {
        boolean wasErrors = false;
        int applicationPathesSize = applicationPathes.size();

        label86:
        for(int i1 = 0; i1 < applicationPathesSize; ++i1) {
            String[] pathValue = (String[])applicationPathes.get(i1);
            String path = pathValue[0];
            List mandatoryList = (List)this.getMandatorMap().get(path);
            if(mandatoryList != null) {
                Iterator i$ = mandatoryList.iterator();

                while(true) {
                    String m_path;
                    label81:
                    while(true) {
                        int i;
                        String[] _pathValue;
                        label63:
                        while(true) {
                            if(!i$.hasNext()) {
                                continue label86;
                            }

                            m_path = (String)i$.next();
                            CommonUpdateValidator.Condition _condition = (CommonUpdateValidator.Condition)mandatoryConditions.get(m_path);
                            if(_condition == null) {
                                break;
                            }

                            i = i1 + 1;

                            while(true) {
                                if(i >= applicationPathes.size()) {
                                    break label63;
                                }

                                _pathValue = (String[])applicationPathes.get(i);
                                if(!_pathValue[0].startsWith(path)) {
                                    break label63;
                                }

                                if(_pathValue[0].equals(_condition.path) && _condition.op.equals("!=")) {
                                    if(_pathValue[1] != null && _pathValue[1].equals(_condition.value)) {
                                        break;
                                    }
                                    break label63;
                                }

                                ++i;
                            }
                        }

                        i = i1 + 1;

                        while(true) {
                            if(i >= applicationPathesSize) {
                                break label81;
                            }

                            _pathValue = (String[])applicationPathes.get(i);
                            String _path = _pathValue[0];
                            if(_path.equals(m_path) && (mandatoryMap.containsKey(_path) || _pathValue[1] != null && _pathValue[1].length() > 0)) {
                                break;
                            }

                            if(path.length() > 0 && (!_path.startsWith(path) || _path.equals(path))) {
                                break label81;
                            }

                            ++i;
                        }
                    }

                    wasErrors = true;
                    errorsListener.registerError("empty mandatory tag", m_path, (Exception)null);
                }
            }
        }

        return !wasErrors;
    }

    protected Map<String, List<String>> getMandatorMap() {
        return mandatoryMap;
    }

    static {
        mandatoryConditions.put("Application.client.doc", new CommonUpdateValidator.Condition("Application.client.applicantType", "!=", "5"));
        mandatoryMap = new HashMap();
        prepareMap(mandatoryPathes, mandatoryMap);
    }

    static class Condition {
        final String path;
        final String value;
        final String op;

        Condition(String path, String op, String value) {
            this.path = path;
            this.op = op;
            this.value = value;
        }
    }
}
