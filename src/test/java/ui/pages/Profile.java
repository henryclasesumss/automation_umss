package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.core.AbstractPageObject;

public class Profile extends AbstractPageObject {
    @FindBy(css = "div.OUdAuicP657Tka span")
    private WebElement usernameTitle;

    @FindBy(css = "ul li  button[data-testid=\"account-menu-logout\"]")
    private WebElement logoutButton;

    @FindBy(css = " #logout-submit span.css-178ag6o")
    private WebElement logoutConfirm;



    public String getUsernameTitle(String attribute){
        return action.getTextAttribute(usernameTitle,attribute);
    }

    public void clickProfile(){
        action.click(usernameTitle);
    }

    public void logoutPage(){
        action.click(logoutButton);
        action.click(logoutConfirm);
    }

}

