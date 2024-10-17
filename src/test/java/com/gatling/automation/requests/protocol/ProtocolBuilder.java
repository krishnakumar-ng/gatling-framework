package com.gatling.automation.requests.protocol;

import com.gatling.automation.enums.Component;

import static com.gatling.automation.enums.Component.TEST;

public class ProtocolBuilder {
    public static HttpProtocolBuilder authTokenProtocolBuilder(Component component){
        return switch(component){
            case TEST -> http.baseUrl(CONFIG_PROPERTIES.authUrl());
        };
    }
}
