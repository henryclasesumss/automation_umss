package ui.core;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverAction {
    public WebDriver driver;
    public WebDriverWait wait;

    public WebDriverAction(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public void click(WebElement element){
       wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void sendText(WebElement element,String text){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.sendKeys(text);
    }
    public String getText(WebElement element){
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getText();
    }
    public boolean isElementVisible(WebElement element){
    try{
        wait.until(ExpectedConditions.visibilityOf(element));
        return true;
    }catch (NoSuchElementException e){
        return false;
    }
    }
    public String getTextAttribute(WebElement element,String attribute){
        wait.until(ExpectedConditions.visibilityOf(element));
        return element.getAttribute(attribute);
    }
}
