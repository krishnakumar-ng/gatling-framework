package com.gatling.automation.config;


import com.gatling.automation.converters.ComponentConverter;
import com.gatling.automation.enums.Component;
import org.aeonbits.owner.*;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:env",
        "system:properties",
        "classpath:${test.env}.properties"
})
public interface ConfigPropertiesFactory extends Reloadable, Accessible, Mutable {
    ConfigPropertiesFactory CONFIG_PROPERTIES = ConfigCache.getOrCreate(ConfigPropertiesFactory.class);

    @Key("simulation.component")
    @ConverterClass(ComponentConverter.class)
    Component testComponent();

    @Key("auth.url")
    String authUrl();

    @Key("users.count")
    Integer usersCount();

    @Key("simulation.duration")
    Integer simulationDuration();

    @Key("max.response.time")
    Integer maxResponseTime();

    @Key("success.percent")
    Double successPercentage();
}
