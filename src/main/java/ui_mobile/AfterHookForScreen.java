package ui_mobile;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class AfterHookForScreen {

    @After
    public void tearDown(Scenario scenario) {
        WebDriver driver = DriverBaseMobile.getDriver();
        try {
            if (scenario.isFailed()) {
                final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        } finally {
        //    driver.quit();
        }
    }
}
