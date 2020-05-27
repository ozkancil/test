package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FHCLoginPage;
import utilities.Driver;

public class FHCLogin_StepsDefinition {
   FHCLoginPage fhcLoginPage=new FHCLoginPage();

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");
    }

    @Given("user enters valid manger username")
    public void user_enters_valid_manger_username() {
        fhcLoginPage.userName.sendKeys("manager2");
    }

    
    @Given("user enters valid manager password")
    public void user_enters_valid_manager_password() {
        fhcLoginPage.password.sendKeys("Man1ager2!");
    }

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {

        fhcLoginPage.signInButton.click();
    }
    @Then("verify the manager login is successful")
    public void verify_the_manager_login_is_successful() {
        String title=Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Admin"));
    }
    @Given("user enters valid manger username {string}")
    public void user_enters_valid_manger_username(String string) {
        fhcLoginPage.userName.sendKeys(string);
    }
    @Given("user enters valid manager password {string}")
    public void user_enters_valid_manager_password(String string) {
        fhcLoginPage.password.sendKeys(string);
    }


}
