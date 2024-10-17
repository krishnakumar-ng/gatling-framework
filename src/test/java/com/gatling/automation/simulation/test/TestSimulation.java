package com.gatling.automation.simulation.test;

import com.gatling.automation.Hooks;

import static io.gatling.javaapi.core.CoreDsl.atOnceUsers;

public class TestSimulation extends Hooks {
    public TestSimulation() {
        setUp(
          accessTokenScn.injectOpen(atOnceUsers(1)).protocols(accessTokenProtocolBuilder)
        );
    }}
