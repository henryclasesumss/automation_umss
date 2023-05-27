package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.core.AbstractPageObject;
import ui.core.SetUpEnv;

public class Welcome extends AbstractPageObject {
    @FindBy(css = "a.Buttonsstyles__Button-sc-1jwidxo-0[href='/login']")
    private WebElement loginButton;

    public Welcome( ) {
        driver.get(SetUpEnv.BASE_URL());
    }
    public void gotoLogin(){
        action.click(loginButton);
    }
}
