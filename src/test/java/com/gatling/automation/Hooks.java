package com.gatling.automation;

import com.gatling.automation.requests.protocol.ProtocolBuilder;

@Slf4j
public class Hooks {
    public HttpProtocolBuilder accessTokenProtocolBuilder = ProtocolBuilder.authTokenProtocolBuilder(CONFIG_PROPERTIES.testComponent());

    @Override
    public void before(){
        log.info("Simulation is about to start!");
    }

    @Override
    public void after(){
        log.info("Simulation is finished!");
    }
}
