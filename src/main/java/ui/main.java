package ui;

import io.github.bonigarcia.wdm.OperaDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class main {
    public static void main (String[]args) {
  //  System.setProperty("webdriver.chrome.driver","C:\\Users\\HENRY\\Downloads\\chromedriver_umss\\chromedriver.exe");
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new EdgeDriver();
    //driver.manage().window().maximize();
    driver.navigate().to("https://bo.ebay.com/");
        //driver.get("https://bo.ebay.com/");
    driver.quit();
   }

}
