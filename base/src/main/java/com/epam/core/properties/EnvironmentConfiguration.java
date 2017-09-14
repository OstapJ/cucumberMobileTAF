package com.epam.core.properties;

import org.aeonbits.owner.Config;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "classpath:com/epam/EnvironmentConfiguration.properties",
        "classpath:com/epam/BrowserConfiguration.properties"})
public interface EnvironmentConfiguration extends Config {

    @DefaultValue("dev")
    String env();

    @Key("servers.${env}.name")
    String name();

    @Key("servers.${env}.hostname")
    String hostname();

    @Key("servers.${env}.port")
    Integer port();

    @Key("servers.${env}.user")
    String user();

    @Key("servers.${env}.password")
    String password();

    @DefaultValue("chrome")
    String browser();

    @Key("webdriver.${browser}.driver.path")
    String browserPath();
}
