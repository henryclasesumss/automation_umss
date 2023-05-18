import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TrelloTest {
    public WebDriver driver;

    @Before
    public void Setup() {
        WebDriverManager.chromedriver().setup();
//        driver = new ChromeDriver();
        ChromeOptions chromeOptions= new ChromeOptions();
        chromeOptions.addArguments("--headless=new");
        driver=new ChromeDriver(chromeOptions);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://trello.com/");
        //driver.manage().window().maximize();
        //Click en boton login
        WebElement loginomeButton = driver.findElement(By.cssSelector("a.Buttonsstyles__Button-sc-1jwidxo-0[href='/login']"));
        Thread.sleep(3000);
        loginomeButton.click();

        //Escribimos el correo
        Thread.sleep(3000);
        WebElement emailField = driver.findElement(By.cssSelector("input#user"));
        emailField.sendKeys("henryvargastames@gmail.com");

        //Click en el boton continue
        WebElement continueButton = driver.findElement(By.cssSelector("input#login"));
        continueButton.click();

        //Escribimos el password
        Thread.sleep(3000);
        WebElement passwordField = driver.findElement(By.cssSelector("input#password"));
        passwordField.sendKeys("Password1!");

        //Click en el boton Login
        WebElement loginButton = driver.findElement(By.cssSelector("Button#login-submit"));
        loginButton.click();

        //aserciones
        Thread.sleep(10000);
        WebElement acountName= driver.findElement(By.cssSelector("div.OUdAuicP657Tka span"));
        String actual= acountName.getAttribute("title");
        String title= driver.getTitle();
        String url= driver.getCurrentUrl();
        Assert.assertEquals("The username is wrong","Henry Vargas (henryvargastames)",actual);
    }


}
