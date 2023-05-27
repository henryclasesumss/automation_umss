package ui.core;

import org.openqa.selenium.WebDriver;

public class DriverManage {
    private static DriverManage driverManage;
    private WebDriver driver;

    private DriverManage() {
        String b = SetUpEnv.BROWSER();
        this.driver = DriverFactory.createDriver(SetUpEnv.BROWSER());
    }

    public static DriverManage getInstance() {
        if (driverManage == null) {
            driverManage = new DriverManage();
        }
        return driverManage;
    }

    public WebDriver getDriver(){return this.driver;}
}
