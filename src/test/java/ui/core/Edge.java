package ui.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge extends AbstractDriver{
    @Override
    WebDriver initDriver() {
        WebDriverManager.edgedriver().setup();
        return new EdgeDriver();
    }
}
