package com.gatling.automation;

import com.gatling.automation.requests.protocol.ProtocolBuilder;
import com.gatling.automation.scenario.AuthScenario;
import io.gatling.javaapi.core.ScenarioBuilder;
import io.gatling.javaapi.core.Simulation;
import io.gatling.javaapi.http.HttpProtocolBuilder;
import lombok.extern.slf4j.Slf4j;

import static com.gatling.automation.config.ConfigPropertiesFactory.CONFIG_PROPERTIES;

@Slf4j
public class Hooks extends Simulation {
    public HttpProtocolBuilder accessTokenProtocolBuilder = ProtocolBuilder.authTokenProtocolBuilder(CONFIG_PROPERTIES.testComponent());

    public ScenarioBuilder accessTokenScn = AuthScenario.getAccessToken(CONFIG_PROPERTIES.testComponent());

    @Override
    public void before(){
        log.info("Simulation is about to start!");
    }

    @Override
    public void after(){
        log.info("Simulation is finished!");
    }
}
