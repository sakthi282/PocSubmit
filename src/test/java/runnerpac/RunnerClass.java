package runnerpac;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/FeatureFolder/Google.feature",

        tags = "@tag1 or @tag2 or @tag3 or @tag4 or @tag5",
        glue = {"StepDefine","hooks"},
        dryRun = false,publish = true,
        plugin = {
                "pretty",
                "html:src/test/resources/TestData/cucumber-report.html",
                "json:src/test/resources/TestData/cucumber-report.json"
        }

)


public class RunnerClass {


}
