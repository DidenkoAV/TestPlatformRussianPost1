import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json"},
        //features = {"src/test/features/ui_web"}, - для web версии.
        //features = {"src/test/features/ui_mobile"}, - для mobile версии.
        features = {"src/test/features/ui_mobile"},
        //glue = {"ui_web"}, - для web версии.
        //glue = {"ui_mobile"}, - для mobile версии.
        glue = {"ui_web"},
        tags= {"@SmokeTest","@RegressionTest", "@uiMobile"},
        dryRun = false,
        snippets = SnippetType.UNDERSCORE
)

public class RunnerTest {
}
