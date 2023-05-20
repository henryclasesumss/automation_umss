import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.core.Driver;
import ui.core.WebDriverAction;
import ui.pages.Login;
import ui.pages.Profile;
import ui.pages.Welcome;

public class TrelloTestPOM {
    public WebDriver driver;
    public WebDriverWait wait;
    public WebDriverAction action;

    @Before
    public void Setup() {
        driver = new Driver().initDriver();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        Welcome welcome= new Welcome(driver);
        Login login= new Login(driver);
        Profile profile = new Profile(driver);
        //driver.manage().window().maximize();
        //go to login page
        welcome.gotoLogin();
        // login user with password
        login.login("henryvargastames@gmail.com","Password1!");
        //aserciones
        Assert.assertEquals("The username is wrong", "Henry Vargas (henryvargastames)", profile.getUsernameTitle("title"));
    }
}
