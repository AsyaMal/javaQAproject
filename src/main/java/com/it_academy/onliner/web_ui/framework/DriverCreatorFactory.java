package com.it_academy.onliner.web_ui.framework;

public class DriverCreatorFactory {

    private DriverCreatorFactory() {

    }

    public static WebDriverCreator getDriverCreator(String driverType) {
        switch (driverType) {
            case "chrome":
                return new ChromeDriverCreator();
            case "MicrosoftEdge":
                return new EdgeDriverCreator();
            case "remote":
                return new RemoteDriverCreator();
            default:
                return new ChromeDriverCreator();
        }
    }
}
