package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "/Users/pruebaslab/Desktop/serenityFramework/src/test/resources/features/login/inicio_sesion.feature",
        glue = "/Users/pruebaslab/Desktop/serenityFramework/src/test/java/stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@test"
)
public class LoginRunner {
}
