package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/cucumber",
        //path of the features folder
 features="src/test/resources/features",
        //step definitions folder
        glue="src/test/java/stepdefinitions",
        tags="@datatables4",
       dryRun=true




)
public class Runner {




}
