package com.gatling.automation.simulation.test;

public class TestSimulation extends Hooks {
    public TestSimulation() {
        setUp(
          accessTokenScn.injectOpen(atOnceUsers(1)).protocols(accessTokenProtocolBuilder)
        );
    }}
