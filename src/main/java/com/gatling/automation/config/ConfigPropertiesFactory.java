package com.gatling.automation.config;

@LoadPolicy(Config.LoadType.MERGE)
@Sources([
        "system:env",
        "system:properties",
        "classpath:${test.env}.properties"
])
public interface ConfigPropertiesFactory extends Reloadable,Accessible, Mutable{
    ConfigPropertiesFactory CONFIG_PROPERTIES = ConfigCache.getOrCreate(ConfigPropertiesFactory.class);
}
