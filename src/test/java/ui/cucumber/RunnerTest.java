package ui.cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import ui.core.DriverManage;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"me.jvt.cucumber.report.PrettyReports:target/cucumber","pretty","html:reports/html/index.html"},
        features = "src/test/resources/features",
        glue="ui.stepDefinition",
        tags="@login"
)
public class RunnerTest {
    @AfterClass
    public static void close(){
        DriverManage.getInstance().getDriver().quit();
   }
  @After
    public static void after(){
        System.out.print("After");
  }
}
