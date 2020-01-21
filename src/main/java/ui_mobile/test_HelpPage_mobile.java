package ui_mobile;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test_HelpPage_mobile {
    private WebDriver driver = DriverBaseMobile.getDriver();
    @Когда("^открыта страница /help\\.$")
    public void открыта_страница_help() throws InterruptedException {
        Thread.sleep(4000);
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='another-user']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='mobileOrEmail']")).sendKeys("79129287894");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("22222222");
        Thread.sleep(3000);
        driver.findElement(By.id("loginByPwdButton")).click();
        Thread.sleep(3000);

    }

    @Тогда("^выполнить переход по всем ссылкам ЧЗВ\\.$")
    public void выполнить_переход_по_всем_ссылкам_ЧЗВ() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://erl-individual-web.test.russianpost.ru/help");
        List<WebElement> link_list = driver.findElements(By.xpath("//*[@class='questions']//a"));
        for(int i =0; i<link_list.size();i++){
            Thread.sleep(1000);
            link_list.get(i).click();
        }
    }

    @Когда("^открыта стрaница /help$")
    public void открыта_стрaница_help() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://erl-individual-web.test.russianpost.ru/help");
        Thread.sleep(1000);
    }

    @Тогда("^выполнить клик по логотипу\\.$")
    public void выполнить_клик_по_логотипу() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='logo--mobile']")).click();
        Thread.sleep(1000);

    }

    @Тогда("^произошел переход в раздел входящие\\.$")
    public void произошел_переход_в_раздел_входящие() throws InterruptedException {
        driver.getCurrentUrl();
        Thread.sleep(1000);

    }

    @Когда("^открыта cтраница /help\\.$")
    public void открыта_cтраница_help() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://erl-individual-web.test.russianpost.ru/help");

    }

    @Тогда("^на странице Помощь /help сверху страницу нажать ссылку \"([^\"]*)\"\\.$")
    public void на_странице_Помощь_help_сверху_страницу_нажать_ссылку(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='button js-open-chat-button']")).click();
    }

    @Тогда("^онлайн чат открылся\\.$")
    public void онлайн_чат_открылся() {
        //Добавить скрин, доюавить проверку.

    }
}
