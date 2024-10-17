package com.gatling.automation.scenario;

import com.gatling.automation.enums.Component;
import com.gatling.automation.util.Util;
import com.gatling.automation.requests.payload.Payload;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.netty.handler.codec.http.HttpHeaderNames;
import io.netty.handler.codec.http.HttpHeaderValues;
import lombok.extern.slf4j.Slf4j;

import static io.gatling.javaapi.core.CoreDsl.jsonPath;
import static io.gatling.javaapi.core.CoreDsl.scenario;
import static io.gatling.javaapi.http.HttpDsl.http;
import static io.gatling.javaapi.http.HttpDsl.status;
import static java.net.HttpURLConnection.HTTP_OK;
import static com.gatling.automation.constants.Constants.ACCESS_TOKEN_FILE_PATH;

@Slf4j
public class AuthScenario {
    public static ScenarioBuilder getAccessToken(Component component) {
        return switch (component) {
            case TEST -> scenario("Generate access token")
                    .exec(http("Access Token Request")
                            .post("")
                            .header(HttpHeaderNames.CONTENT_TYPE, String.valueOf(HttpHeaderValues.APPLICATION_X_WWW_FORM_URLENCODED))
                            .formParamMap(Payload.getPayload())
                            .check(status().is(HTTP_OK))
                            .check(jsonPath("$.access_token").saveAs("accessToken"))
                    ).exec(session -> {
                        String token = "Bearer " + session.getString("accessToken");
                        Util.File.storeDataInFile(ACCESS_TOKEN_FILE_PATH, token);
                        log.debug("Access Token is generated successfully for {}", Component.TEST);
                        return session;
                    });
        };
    }
}
