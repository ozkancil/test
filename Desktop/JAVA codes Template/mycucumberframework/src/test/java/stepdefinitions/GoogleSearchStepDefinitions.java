package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class GoogleSearchStepDefinitions {



    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");

    }

    @Given("user searches for iphone")
    public void user_searches_for_iphone() {
        WebElement searchBox= Driver.getDriver().findElement(By.name("q"));
searchBox.sendKeys("iphone");
searchBox.submit();

    }

    @Then("verify the result has iphone")
    public void verify_the_result_has_iphone() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("iphone"));

    }


    //TEAPOT

    @Given("user clears the searchbox")
    public void user_clears_the_searchbox() {
        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));
         searchBox.clear();



    }

    @Given("user searches for tea pot")
    public void user_searches_for_tea_pot() {
        WebElement searchBox=Driver.getDriver().findElement(By.name("q"));
        searchBox.sendKeys("tea pot");

        searchBox.submit();

    }

    @Then("verify the result has tea pot")
    public void verify_the_result_has_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("tea pot"));

    }



}
