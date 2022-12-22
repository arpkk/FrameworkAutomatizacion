package runners;

import steps.Hooks;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;




@RunWith(Cucumber.class)
@CucumberOptions(glue = {"steps"},
                 features = "src/test/resources/features", 
                 plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
                		 ,"json:results/cucumber.json"
                		 ,"junit:results/cucumber.xml"},
		         tags = "@test3",
                 monochrome = true)

public class WebBaseRunner extends Hooks{

}
