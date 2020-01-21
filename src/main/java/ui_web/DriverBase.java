package ui_web;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class DriverBase {

    private static WebDriver driver;
    static
    {
        System.setProperty("webdriver.opera.driver", "/home/didenkoav/Документы/ChromeDriver/operadriver");
        driver = new OperaDriver();
    }

    static WebDriver getDriver(){

        return driver;
    }

}
