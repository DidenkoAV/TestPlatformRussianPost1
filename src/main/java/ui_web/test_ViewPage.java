package ui_web;

import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class test_ViewPage {
    private WebDriver driver = DriverBase.getDriver();
    @Когда("^открыта страница Электронные заказные письма \\(лендинг\\)\\.$")
    public void открыта_страница_Электронные_заказные_письма_лендинг() throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(2000);
        //добавить скрин
    }

    @Когда("^выполнено нажатие кн\\. \"([^\"]*)\"\\.$")
    public void выполнено_нажатие_кн(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@title='Подробнее по подключенным регионам']")).click();
        //добавить скрин
    }

    @Тогда("^происходит переход на страницу /limits-alert\\.$")
    public void происходит_переход_на_страницу_limits_alert() throws Throwable {
        String template = "https://erl-individual-web.test.russianpost.ru/limits-alert";
        String URL = driver.getCurrentUrl();
        if(URL.equals(template)){
            System.out.println(URL);
        }
        Thread.sleep(2000);
    }

    @Тогда("^затем нажать на ссылку \"([^\"]*)\"$")
    public void затем_нажать_на_ссылку(String arg1) throws Throwable {
        driver.findElement(By.linkText("Узнать о запуске услуги в другом регионе")).click();
        Thread.sleep(2000);
    }

    @Тогда("^осуществляется переход на страницу подписки на новости /launch-notification\\.$")
    public void осуществляется_переход_на_страницу_подписки_на_новости_launch_notification() throws Throwable {
        String template1 = "https://erl-individual-web.test.russianpost.ru/launch-notification";
        String URL1 = driver.getCurrentUrl();
        if(URL1.equals(template1)){
            System.out.println(URL1);
        }
        //Добавить скрин
    }

    @Когда("^открытa страница подписки на новости /launch-notification\\.$")
    public void открытa_страница_подписки_на_новости_launch_notification() throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/launch-notification");
        //добавить скрин
        Thread.sleep(2000);

    }

    @Когда("^в поле \"([^\"]*)\" указать \"([^\"]*)\"\\.$")
    public void в_поле_указать(String arg1, String arg2) throws Throwable {
        driver.findElement(By.id("suggestions")).sendKeys("Саратовская область");
        Thread.sleep(2000);

    }

    @Когда("^в поле \"([^\"]*)\" указать адрeс test@mail\\.ru\\.$")
    public void в_поле_указать_адрeс_test_mail_ru(String arg1) throws Throwable {
        driver.findElement(By.xpath("//*[@class=\"field closer\"]//input")).sendKeys("test@mail.ru");
        Thread.sleep(2000);
    }


    @Тогда("^нажать кн\\. \"([^\"]*)\"\\.$")
    public void нажать_кн(String arg1) throws Throwable {
        List< WebElement > button_list = driver.findElements(By.className("button"));
        for (int i = 0; i < button_list.size(); i++) {
            button_list.get(i).click();
        }
    }

    @Тогда("^откроется страница с текстом \"([^\"]*)\"$")
    public void откроется_страница_с_текстом(String arg1) throws Throwable {
        //добавить скрин, добавить проверку лейбла

    }

    @Тогда("^затем выполнили шаг назад\\.$")
    public void затем_выполнили_шаг_назад() throws Throwable {
        Thread.sleep(2000);
        driver.navigate().back();
    }

    @Тогда("^осуществился возврат на страницу /limits-alert\\.$")
    public void осуществился_возврат_на_страницу_limits_alert() throws Throwable {
        //Добавить проверку, добавить скрин
    }

    @Когда("^открыта страница подписки нa новости /launch-notification$")
    public void открыта_страница_подписки_нa_новости_launch_notification() throws Throwable {
        Thread.sleep(2000);
        driver.get("https://erl-individual-web.test.russianpost.ru/launch-notification");
        Thread.sleep(2000);
        //Добавить скрин

    }

    @Когда("^в поле \"([^\"]*)\" уkазать адрес test@mail\\.ru\\.$")
    public void в_поле_уkазать_адрес_test_mail_ru(String arg1) throws Throwable {
        driver.findElement(By.id("suggestions")).sendKeys("ываыаыа");
        Thread.sleep(2000);
        //добавить скрин
        driver.findElement(By.xpath("//*[@class=\"field closer\"]//input")).sendKeys("test@mail.ru");
        Thread.sleep(2000);
        List< WebElement > button_list = driver.findElements(By.className("button"));
        for (int i = 0; i < button_list.size(); i++) {
            button_list.get(i).click();
        }
    }

    @Тогда("^поле \"([^\"]*)\" подсветилось красным$")
    public void поле_подсветилось_красным(String arg1) throws Throwable {
        driver.findElement(By.className("field__message"));
    }

    @Тогда("^вывелось сообщение \"([^\"]*)\"\\.$")
    public void вывелось_сообщение(String arg1) throws Throwable {
        //добавить скрин, добавить проверку
    }

    @Допустим("^в пoле \"([^\"]*)\" yказать \"([^\"]*)\"\\.$")
    public void в_пoле_yказать(String arg1, String arg2) throws Throwable {
        Thread.sleep(2000);
        driver.get("https://erl-individual-web.test.russianpost.ru/launch-notification");
        Thread.sleep(2000);
        driver.findElement(By.id("suggestions")).sendKeys("Саратовская область");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='field closer']//input")).sendKeys("test@ываываыа");
    }

    @Допустим("^в пoле \"([^\"]*)\" указать адрес  test@ываываыа\\.$")
    public void в_пoле_указать_адрес_test_ываываыа(String arg1) throws Throwable {
        List< WebElement > button_list = driver.findElements(By.className("button"));
        for (int i = 0; i < button_list.size(); i++) {
            button_list.get(i).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.className("field__message"));

    }

    @Когда("^открыта страница подписки на новости /launch-notification\\.$")
    public void открыта_страница_подписки_на_новости_launch_notification() throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/launch-notification");
        Thread.sleep(2000);
        //добавить скрин

    }

    @Тогда("^поля \"([^\"]*)\" и \"([^\"]*)\" подсветились красным цветом\\.$")
    public void поля_и_подсветились_красным_цветом(String arg1, String arg2) throws Throwable {
        List< WebElement > button_list = driver.findElements(By.className("button"));
        for (int i = 0; i < button_list.size(); i++) {
            button_list.get(i).click();
        }
    }

    @Когда("^открыта страница подписки на нoвости /launch-notification\\.$")
    public void открыта_страница_подписки_на_нoвости_launch_notification() throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/launch-notification");
        Thread.sleep(2000);

    }

    @Когда("^в поле \"([^\"]*)\" указать адрес  test@main\\.$")
    public void в_поле_указать_адрес_test_main(String arg1) throws Throwable {

    }

    @Когда("^под полем с электронным адресом появилось сообщение \"([^\"]*)\" и ссылка \"([^\"]*)\"$")
    public void под_полем_с_электронным_адресом_появилось_сообщение_и_ссылка(String arg1, String arg2) throws Throwable {

    }

    @Когда("^нажать на ссылку \"([^\"]*)\"$")
    public void нажать_на_ссылку(String arg1) throws Throwable {

    }

    @Тогда("^произошел переход на страницу подтверждения успешной отправки заявки\\. В тексте подтверждения фигурирует исправленный емеил \\(test@mail\\.ru\\)\\.$")
    public void произошел_переход_на_страницу_подтверждения_успешной_отправки_заявки_В_тексте_подтверждения_фигурирует_исправленный_емеил_test_mail_ru() throws Throwable {

    }

    @Когда("^пoд полем с электронным адресом появилось сообщение \"([^\"]*)\" и ссылка \"([^\"]*)\"\\.$")
    public void пoд_полем_с_электронным_адресом_появилось_сообщение_и_ссылка(String arg1, String arg2) throws Throwable {


    }
}





