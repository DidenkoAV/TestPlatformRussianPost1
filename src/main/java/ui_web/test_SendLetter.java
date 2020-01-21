package ui_web;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test_SendLetter {
    private WebDriver driver = DriverBase.getDriver();

    @Когда("^пользователь авторизован\\\\.$")
    public void пользователь_авторизован() throws InterruptedException {
        driver.get("http://10.2.53.214:8081/FrontPage.EpamTests.TestKapranov.FSSP?test");
        Thread.sleep(5000);

    }

    @Когда("^отправлено письмо от ФССП$")
    public void отправлено_письмо_от_ФССП() {
        //Добавить проверку получения письма

    }

    @Тогда("^необходимо сверить, что письмо доставлено и корректно отображается\\.$")
    public void необходимо_сверить_что_письмо_доставлено_и_корректно_отображается() throws InterruptedException {
        Thread.sleep(4000);
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='mobileOrEmail']")).sendKeys("79129287894");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("22222222");
        Thread.sleep(3000);
        driver.findElement(By.id("loginByPwdButton")).click();
        Thread.sleep(3000);
        List<WebElement> letter_list = driver.findElements(By.xpath("//*[@class='itemWrapper']"));
        for (int i = 0; i < letter_list.size(); i++) {
            if (i == 0) {
                letter_list.get(i).click();
            }
        }
        Thread.sleep(3000);

    }

    @Когда("^пользователь авторизoван\\.$")
    public void пользователь_авторизoван() {
        //добавить скрин

    }

    @Когда("^отправлено письмo от ГИБДД\\.$")
    public void отправлено_письмo_от_ГИБДД() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("http://10.2.53.214:8081/FrontPage.EpamTests.TestKapranov.CoddUniteller?test");
        Thread.sleep(5000);

    }

    @Тогда("^необходимо свeрить, что письмо доставлено и корректно отображается\\.$")
    public void необходимо_свeрить_что_письмо_доставлено_и_корректно_отображается() throws InterruptedException {
        Thread.sleep(4000);
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        List<WebElement> letter_list = driver.findElements(By.xpath("//*[@class='itemWrapper']"));
        for (int i = 0; i < letter_list.size(); i++) {
            if (i == 0) {
                letter_list.get(i).click();
            }
        }
        Thread.sleep(3000);
    }


    @Когда("^пользователь aвторизован\\.$")
    public void пользователь_aвторизован() {
        //добавить скрин
    }

    @Когда("^отправлено письмо от Мировых судей\\.$")
    public void отправлено_письмо_от_Мировых_судей() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("http://10.2.53.214:8081/FrontPage.EpamTests.TestKapranov.MirsudWithoutPay?test");
        Thread.sleep(5000);
    }

    @Тогда("^необходим сверить, что письмо доставлено и коррeктно отображается$")
    public void необходим_сверить_что_письмо_доставлено_и_коррeктно_отображается() throws InterruptedException {
        Thread.sleep(4000);
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        List<WebElement> letter_list = driver.findElements(By.xpath("//*[@class='itemWrapper']"));
        for (int i = 0; i < letter_list.size(); i++) {
            if (i == 0) {
                letter_list.get(i).click();
            }
        }
        Thread.sleep(3000);
    }

    @Когда("^отправлено письмо с универсальной формой\\.$")
    public void отправлено_письмо_с_универсальной_формой() throws InterruptedException {
        driver.get("http://10.2.53.214:8081/FrontPage.EpamTests.TestKapranov.MirsudWithoutPay?test");
        Thread.sleep(5000);

    }

    @Тогда("^необхоdимо сверить, что письмо доставлено и корректно отображается\\.$")
    public void необхоdимо_сверить_что_письмо_доставлено_и_корректно_отображается() throws InterruptedException {
        Thread.sleep(4000);
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        List<WebElement> letter_list = driver.findElements(By.xpath("//*[@class='itemWrapper']"));
        for (int i = 0; i < letter_list.size(); i++) {
            if (i == 0) {
                letter_list.get(i).click();
            }
        }
        Thread.sleep(3000);
    }
}