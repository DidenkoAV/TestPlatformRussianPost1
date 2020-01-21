package ui_mobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverBaseMobile {

    private static WebDriver driver;

    static
    {
        Map<String, Object> deviceMetrics = new HashMap<>();
        deviceMetrics.put("width", 375);
        deviceMetrics.put("height", 667);
        deviceMetrics.put("pixelRatio", 3.0);
        Map<String, Object> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceMetrics", deviceMetrics);
        mobileEmulation.put("userAgent", "Mozilla/5.0 (Linux; Android 8.0.0;" + "Pixel 2 XL Build/OPD1.170816.004) AppleWebKit/537.36 (KHTML, like Gecko) " + "Chrome/67.0.3396.99 Mobile Safari/537.36");
        ChromeOptions ChromeOptions = new ChromeOptions();
        ChromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);

        System.setProperty("webdriver.chrome.driver", "/home/didenkoav/Документы/ChromeDriver/chromedriver");
        driver = new ChromeDriver(ChromeOptions);
        driver.get("https://erl-individual-web.test.russianpost.ru/");

    }

    static WebDriver getDriver(){

        return driver;
    }

}
