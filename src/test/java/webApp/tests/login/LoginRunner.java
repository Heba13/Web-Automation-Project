package webApp.tests.login;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebElement;

@CucumberOptions(
        features = "src/test/java/webApp/tests",
        glue = { "webApp.tests"}
)
public class LoginRunner extends AbstractTestNGCucumberTests {
}