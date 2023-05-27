package ui.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import ui.pages.Login;
import ui.pages.Profile;
import ui.pages.Welcome;

public class LoginSteps {
    private Welcome welcome;
    private Login login;
    private Profile profile;

    public LoginSteps(Welcome welcome, Login login, Profile profile) {
        this.welcome = welcome;
        this.login = login;
        this.profile = profile;
    }

    @Given("I am on login page")
    public void i_am_on_login_page() {
        welcome.gotoLogin();
    }

    @When("I login with {string} and password {string}")
    public void iLoginWithAndPassword(String user, String password) {
        login.login(user,password);
    }

    @Then("I should see {string} in the profile")
    public void iShouldSeeInTheProfile(String result) {
        Assert.assertEquals(result, profile.getUsernameTitle("title"));

    }

    @Then("I should see {string}")
    public void iShouldSee(String msg) {
    System.out.println(msg);
       String Expected= login.getMessage();
       Assert.assertTrue(login.getMessage().contains(msg));
    }
}
