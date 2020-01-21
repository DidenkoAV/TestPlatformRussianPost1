package ui_mobile;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class test_1SettingsAfterRegister_mobile {


    private WebDriver driver = DriverBaseMobile.getDriver();

    @Тогда("^авторизоваться под пользователем\\.$")
    public void авторизоваться_под_пользователем() throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body")).sendKeys(Keys.F12);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='mobileOrEmail']")).sendKeys("79129287894");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("22222222");
        Thread.sleep(3000);
        driver.findElement(By.id("loginByPwdButton")).click();
    }

    @Когда("^пользователь авторизован\\.$")
    public void пользователь_авторизован() throws Throwable {
        System.out.println(driver.getCurrentUrl());

    }

    @Тогда("^yажать ФИО в правом верхнем углу$")
    public void yажать_ФИО_в_правом_верхнем_углу() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        //driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("menu-link")).click();

    }

    @Тогда("^в меню выбрать \"([^\"]*)\", откроется страница настроек settings\\.$")
    public void в_меню_выбрать_откроется_страница_настроек_settings(String arg1) throws Throwable {
        System.out.println(driver.getCurrentUrl());
    }

    @Когда("^пользователь находится на странице настроeк settings$")
    public void пользователь_находится_на_странице_настроeк_settings() throws Throwable {
        //Добавить скрин
        System.out.println(driver.getCurrentUrl());

    }

    @Тогда("^нажать на логотип Почты России в хедере страницы\\.$")
    public void нажать_на_логотип_Почты_России_в_хедере_страницы() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='logo--mobile']")).click();

    }

    @Тогда("^осуществляется переход пользователя в раздел Входящие\\.$")
    public void осуществляется_переход_пользователя_в_раздел_Входящие() throws Throwable {
        System.out.println(driver.getCurrentUrl());
    }

    @Когда("^пользователь находится на странице настроек settings\\.$")
    public void пользователь_находится_на_странице_настроек_settings() throws Throwable {
        Thread.sleep(3000);
        driver.get("https://erl-individual-web.test.russianpost.ru/settings");

    }

    @Тогда("^внизу страницу нажать ссылку \"([^\"]*)\"\\.$")
    public void внизу_страницу_нажать_ссылку(String arg1) throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='js-open-chat-button contact-us__chat-button']")).click();
    }

    @Тогда("^откроется окно WebIM\\.$")
    public void откроется_окно_WebIM() throws Throwable {
        //добавить скрин
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='webchat-close-button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='webchat-close-button']")).click();
        Thread.sleep(2000);

    }

    @Тогда("^нажать ФИО в правом верхнем углу$")
    public void нажать_ФИО_в_правом_верхнем_углу() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        //driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
    }

    @Тогда("^в меню выбрать \"([^\"]*)\"$")
    public void в_меню_выбрать(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@href='/logout']")).click();
    }

}
