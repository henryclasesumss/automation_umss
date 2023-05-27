package ui.core;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class SetUpEnv {

    public static String BROWSER(){
        Properties properties= new Properties();
        try {
            properties.load(new FileReader("src/test/resources/SetupEnveroment.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("web_browser");
    }
    public static String BASE_URL(){
        Properties properties= new Properties();
        try {
            properties.load(new FileReader("src/test/resources/SetupEnveroment.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties.getProperty("url_base");
    }
}
