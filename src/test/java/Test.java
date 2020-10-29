import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/new.feature",
        tags = "@2"
)
public class Test extends AbstractTestNGCucumberTests {

}

