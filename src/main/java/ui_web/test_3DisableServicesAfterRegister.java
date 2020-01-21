package ui_web;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test_3DisableServicesAfterRegister {

    private WebDriver driver = DriverBase.getDriver();

    @Тогда("^на странице /settings нажать \"([^\"]*)\"\\.$")
    public void на_странице_settings_нажать(String arg1) throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        //driver.findElement(By.xpath("//*[@class='another-user']")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.id("mobileOrEmail")).sendKeys("79129287894");
        //Thread.sleep(3000);
        //driver.findElement(By.id("password")).sendKeys("22222222");
        //Thread.sleep(3000);
        //driver.findElement(By.id("loginByPwdButton")).click();
    }

    @Тогда("^пользователь переходит на страницу отключения услуги /personal\\.$")
    public void пользователь_переходит_на_страницу_отключения_услуги_personal() throws InterruptedException {
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
        driver.findElement(By.className("menu-link")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='setting-disable']//button")).click();
        Thread .sleep(3000);
    }

    @Тогда("^Отключить доставку электронных писем\\.$")
    public void отключить_доставку_электронных_писем() throws Throwable {
        driver.findElement(By.xpath("//*[@class='popup__button popup__button--confirm']")).click();
        //добавить скрин
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(3000);

    }

    @Когда("^открыта страница https://erl-individual-web\\.test\\.russianpost\\.ru/inbox/personal и услуга отключена\\.$")
    public void открыта_страница_https_erl_individual_web_test_russianpost_ru_inbox_personal_и_услуга_отключена() throws Throwable {
        //Добавить скрин
    }

    @Тогда("^перейти в архив /archive/personal\\.$")
    public void перейти_в_архив_archive_personal() throws Throwable {
        driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
        //Добавить скрин
        List< WebElement > button_list = driver.findElements(By.xpath("//*[@href='/archive/personal']"));
        for (int i = 0; i < button_list.size(); i++) {
            if(i==1) {
                button_list.get(i).click();
                System.out.println(i);
            }
        }
    }

    @Тогда("^выполнить клик пологотипу, осуществляется переход в раздел Входящие \\(на страницу /inbox/personal\\)$")
    public void выполнить_клик_пологотипу_осуществляется_переход_в_раздел_Входящие_на_страницу_inbox_personal() throws Throwable {
        Thread.sleep(3000);
        //Добавить скрин
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.xpath("//*[@href='/inbox/personal']")).click();
        //Добавить скрин

    }

    @Когда("^сверху страницы отображается текст \"([^\"]*)\"\\.$")
    public void сверху_страницы_отображается_текст(String arg1) throws Throwable {
        //Добавить скрин.

    }

    @Когда("^нажать \"([^\"]*)\", уведомление пропадает, добавляется раздел настройки\\.$")
    public void нажать_уведомление_пропадает_добавляется_раздел_настройки(String arg1) throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='service-disable']//a")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        //Добавить скрин

    }
}
