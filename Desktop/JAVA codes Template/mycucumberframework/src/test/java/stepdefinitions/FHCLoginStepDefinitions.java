package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class FHCLoginStepDefinitions {

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");
    }

    @Given("enter correct username and password")
    public void enter_correct_username_and_password() {

        WebElement ID=Driver.getDriver().findElement(By.xpath("input[@type='text']"));
        ID.sendKeys("manager2");

        WebElement passWord=Driver.getDriver().findElement(By.xpath("input[@id='Password']"));
        passWord.sendKeys("Man1ager2!");

        WebElement loginButton=Driver.getDriver().findElement(By.xpath("input[@id='btnSubmit']"));
        loginButton.click();
    }

    @Then("verify the login is successful")
    public void verify_the_login_is_successful() {


    }


}
