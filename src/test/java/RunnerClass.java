import cucumber.api.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class RunnerClass {
}
