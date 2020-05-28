package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.DataTablesPage;
import utilities.Driver;

public class ScenarioOutline_StepDefinition {
    DataTablesPage dtPage = new DataTablesPage();


    @Given("User is on the datatables homepage")
    public void user_is_on_the_datatables_homepage() {
        Driver.getDriver().get("https://editor.datatables.net/");

    }

    @When("User clicks on new button")
    public void user_clicks_on_new_button() {
        dtPage.newButton.click();
    }

    @When("User enters first name")
    public void user_enters_first_name() {
        dtPage.firstName.sendKeys("Test name");
    }

    @When("User enters last name")
    public void user_enters_last_name() {
        dtPage.lastName.sendKeys("Test last name");
    }

    @When("User enters position")
    public void user_enters_position() {
        dtPage.position.sendKeys("QA");
    }

    @When("User enters office")
    public void user_enters_office() {
        dtPage.office.sendKeys("New York");
    }

    @When("user enters extension")
    public void user_enters_extension() {
        dtPage.extension.sendKeys("225");
    }

    @When("user enters start date")
    public void user_enters_start_date() {
        dtPage.startDate.sendKeys("2020-05-06");
    }

    @When("user enters salary")
    public void user_enters_salary() {
        dtPage.salary.sendKeys("900000");
    }

    @And("clicks create button")
    public void clicks_create_button() throws InterruptedException {
        Thread.sleep(3000);
        dtPage.clickButton.click();
    }

    @When("user enters firstname to the searchbox")
    public void user_enters_firstname_to_the_searchbox() {
dtPage.searchBox.sendKeys("Test name");
    }

    @Then("verify that the user sees first name in the searchBox")
    public void verify_that_the_user_sees_first_name_in_the_searchBox() {
String firstName=dtPage.nameField.getText();
        Assert.assertTrue(firstName.contains("Test name"));

    }












    @When("User enters firstname {string}")
    public void user_enters_firstname(String firstname) {

        dtPage.firstName.sendKeys(firstname);
    }

    @When("User enters lastname {string}")
    public void user_enters_lastname(String string) {

        dtPage.lastName.sendKeys(string);
    }

    @When("User enters position {string}")
    public void user_enters_position(String string) {

        dtPage.position.sendKeys(string);
    }

    @When("User enters office {string}")
    public void user_enters_office(String string) {

        dtPage.office.sendKeys(string);
    }

    @When("user enters extension {string}")
    public void user_enters_extension(String string) {

        dtPage.extension.sendKeys(string);
    }

    @When("user enters start date {string}")
    public void user_enters_start_date(String string) {

    }

    @When("user enters salary {string}")
    public void user_enters_salary(String string) {

        dtPage.salary.sendKeys(string);
    }



    @When("user enters first name {string} to the searchbox")
    public void user_enters_first_name_to_the_searchbox(String string) {

        dtPage.firstName.sendKeys(string);
    }

    @Then("verify that the user sees first name {string} in the searchBox")
    public void verify_that_the_user_sees_first_name_in_the_searchBox(String string) {

        String firstName=dtPage.firstName.getText().toLowerCase();
        Assert.assertTrue(firstName.contains("first name"));
    }

}