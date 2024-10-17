package com.gatling.automation.requests.payload;

import java.util.Map;

public class Payload {
    public static Map<String,Object> getPayload(){
        return Map.of("key","value");
    }
}
