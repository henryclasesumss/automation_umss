package ui.core;

import org.openqa.selenium.WebDriver;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {
    private static Map<String , AbstractDriver> DRIVER=new HashMap<>();
    static{
        DRIVER.put("chrome",new Chrome());
        DRIVER.put("firefox",new FireFox());
        DRIVER.put("edge",new Edge());
        DRIVER.put("headless",new Headless());
    }
    public static WebDriver createDriver(String browser ){
     return DRIVER.get(browser).initDriver();
    }


}
