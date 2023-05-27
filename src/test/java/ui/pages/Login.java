package ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import ui.core.AbstractPageObject;

public class Login extends AbstractPageObject {
    @FindBy(css ="input#user" )
    private WebElement userNameText;
    @FindBy(css = "input#login")
    private WebElement loginNameButton;
    @FindBy(css = "input#password")
    private WebElement passwordText;
    @FindBy(css = "Button#login-submit")
    private WebElement passwordLoginButton;
    @FindBy(css = "div.css-z389ns span  span")
    private WebElement messageError;



   public void login (String user, String password ){
       action.sendText(userNameText,user);
       //Click en el boton continue
       action.click(loginNameButton);
       //Escribimos el password
       action.sendText(passwordText,password);
       //Click en el boton Login
       action.click(passwordLoginButton);
   }
   public String getMessage(){
      return  action.getText(messageError);
   }

}


