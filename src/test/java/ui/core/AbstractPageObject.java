package ui.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class AbstractPageObject {
    protected WebDriver driver;
    protected WebDriverWait wait;
    protected WebDriverAction action;
    public AbstractPageObject() {
        this.driver = DriverManage.getInstance().getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.action=new WebDriverAction(driver,wait);
        PageFactory.initElements(driver,this);
    }









}
