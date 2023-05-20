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

    public Profile(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver,this);
    }
    public String getUsernameTitle(String attribute){
        return action.getTextAttribute(usernameTitle,attribute);
    }


}

