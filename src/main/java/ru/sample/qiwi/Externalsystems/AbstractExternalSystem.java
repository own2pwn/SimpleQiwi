package ru.sample.qiwi.Externalsystems;



import ru.sample.qiwi.Helpers.StringHelper;

import java.util.Map;

/**
 * Created by tikhonin on 23.12.2015.
 */
public abstract class AbstractExternalSystem {
    private String connectionString;
    private Map<String, String> connectionStringParams;

    public AbstractExternalSystem(String connectionString) {
        this.connectionString = connectionString;
    }

    /**
     * Получение строки настроек подключения ко внешней системе
     * @return строка настроек подключения ко внешней системе
     */
    public String getConnectionString() {
        return connectionString;
    }

    /**
     * Получение параметров подключения ко внешней системе
     * @return Параметры подключения ко внешней системе
     * @throws AxiLinkException
     */
    public Map<String, String> getConnectionParams() throws Exception {
        if(connectionStringParams == null ) {
            connectionStringParams = StringHelper.splitParamsStringToMap(connectionString);
        }

        return connectionStringParams;
    }
}
