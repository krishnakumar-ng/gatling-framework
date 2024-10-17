package com.gatling.automation.requests.protocol;

import com.gatling.automation.enums.Component;
import io.gatling.javaapi.http.HttpProtocolBuilder;

import static com.gatling.automation.config.ConfigPropertiesFactory.CONFIG_PROPERTIES;
import static io.gatling.javaapi.http.HttpDsl.http;

public class ProtocolBuilder {
    public static HttpProtocolBuilder authTokenProtocolBuilder(Component component){
        return switch(component){
            case TEST -> http.baseUrl(CONFIG_PROPERTIES.authUrl());
        };
    }
}
