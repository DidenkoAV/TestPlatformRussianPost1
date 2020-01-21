package ui_mobile;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class test__1FirstSettings_mobile {

    private WebDriver driver = DriverBaseMobile.getDriver();

    @Когда("^открыта страница Электронные заказные письма \\(лендинг\\)$")
    public void открыта_страница_Электронные_заказные_письма_лендинг() throws InterruptedException {
        Thread.sleep(4000);
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
    }

    @Тогда("^в хедере пройти по ссылке \"([^\"]*)\" \\(/api/v(\\d+)/oauth\\?success_url=/setup\\)$")
    public void в_хедере_пройти_по_ссылке_api_v_oauth_success_url_setup(String arg1, int arg2) throws InterruptedException {
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(2000);
    }

    @Тогда("^авторизоваться под пользователем \\(пользователь переходит на страницу /register с выбором типа регистрации - Себя или Организацию\\)$")
    public void авторизоваться_под_пользователем_пользователь_переходит_на_страницу_register_с_выбором_типа_регистрации_Себя_или_Организацию() throws InterruptedException {
        driver.findElement(By.xpath("//*[@class='another-user']")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("mobileOrEmail")).sendKeys("+7 951 651 2600");
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Password1");
        Thread.sleep(2000);
        driver.findElement(By.id("loginByPwdButton")).click();
        Thread.sleep(2000);
    }

    @Тогда("^выбрать себя$")
    public void выбрать_себя() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText("Зарегистрироваться как физическое лицо")).click();
        //driver.findElement(By.linkText("Себя")).click();
        //добавить скрин
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();
    }

    @Тогда("^подгружаются контакты и адреса из ЕСИА \\(подтвержденные с зеленой галочкой\\)\\.$")
    public void подгружаются_контакты_и_адреса_из_ЕСИА_подтвержденные_с_зеленой_галочкой() throws InterruptedException {
        //Добавить скрин
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        //driver.findElement(By.xpath("//*[@title='Лаврентий Шпунькин']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("menu-link")).click();

    }

    @Тогда("^нажать кнопку \"([^\"]*)\"\\. \\(переход на страницу /limits-alert\\)$")
    public void нажать_кнопку_переход_на_страницу_limits_alert(String arg1) throws InterruptedException {
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='button__label color-accent text-underline']")).click();
        //добавить скрин
    }

    @Тогда("^нажать кнопку \"([^\"]*)\"\\. \\(переход на страницу /register\\)$")
    public void нажать_кнопку_переход_на_страницу_register(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.className("button")).click();

    }

    @Тогда("^нажать ссылку \"([^\"]*)\" \\(переход на страницу /register/individual\\)$")
    public void нажать_ссылку_переход_на_страницу_register_individual(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText("Зарегистрироваться как физическое лицо")).click();
        //driver.findElement(By.linkText("Себя")).click();

    }

    @Тогда("^нажать кнопку \"([^\"]*)\" \\(переход на страницу авторизации через ЕСИА\\)$")
    public void нажать_кнопку_переход_на_страницу_авторизации_через_ЕСИА(String arg1) throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.linkText("Войти через Портал госуслуг")).click();
    }

    @Тогда("^авторизоваться пользователем \\(переход на страницу /setup\\)$")
    public void авторизоваться_пользователем_переход_на_страницу_setup() throws InterruptedException {
        Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("Password1");
        Thread.sleep(2000);
        driver.findElement(By.id("loginByPwdButton")).click();
    }

    @Когда("^пользователь находится на странице /setup\\.$")
    public void пользователь_находится_на_странице_setup()  {
        //Добавить скрин

    }

    @Тогда("^необходимо нажать на Имя Фамилию пользователя в правом углу хедера страницы\\.$")
    public void необходимо_нажать_на_Имя_Фамилию_пользователя_в_правом_углу_хедера_страницы() throws InterruptedException {
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        Thread.sleep(2000);
        driver.findElement(By.className("menu-link")).click();
    }

    @Тогда("^нажать \"([^\"]*)\" в меню ЛК\\.$")
    public void нажать_в_меню_ЛК(String arg1) throws InterruptedException {
        //добавить скрин

    }

    @Тогда("^произошел переход на страницу подтверждения успешной отправки заявки\\. В тексте подтверждения фигурирует изначально введенный емеил \\(test@main\\.ru\\)\\.$")
    public void произошел_переход_на_страницу_подтверждения_успешной_отправки_заявки_В_тексте_подтверждения_фигурирует_изначально_введенный_емеил_test_main_ru() {
        //Добавить скрин
    }
}
