package com.doggy.java.section061_enum;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class EnumAsConfigExample {

    public interface ConfigProvider{

        String getConfigValue();
    }

    public enum ConfigProviderImpl implements ConfigProvider{

        SYSTEM_ENVIRONMENT(){
            @Override
            public String getConfigValue() {
                return System.getenv("CONFIG_PARAM");
            }
        },

        SYSTEM_PROPERTY(){
            @Override
            public String getConfigValue() {
                return System.getProperty("CONFIG_PARAM");
            }
        },

        CONFIG_FIE_AT_HOME_DIRECTORY {
            @Override
            public String getConfigValue() {
                try {
                    return Files.readString(Paths.get(System.getProperty("user.home")+"/config_params.txt"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        };
    }

    public static void main(String[] args) {
        final ConfigProvider configProvider = args.length>0 ?
                ConfigProviderImpl.valueOf(args[0]) :
                ConfigProviderImpl.SYSTEM_ENVIRONMENT;
        System.out.println(configProvider.getConfigValue());
    }
}
