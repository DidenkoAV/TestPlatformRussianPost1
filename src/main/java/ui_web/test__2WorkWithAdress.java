package ui_web;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test__2WorkWithAdress {

    private WebDriver driver = DriverBase.getDriver();

    @Тогда("^выбрать \"([^\"]*)\", на форму добавились пустые поля для ввода адреса, номера квартиры/офиса и значок для удаления полей\\.$")
    public void выбрать_на_форму_добавились_пустые_поля_для_ввода_адреса_номера_квартиры_офиса_и_значок_для_удаления_полей(String arg1) throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        //driver.findElement(By.xpath("//*[@class='another-user']")).click();
        //Thread.sleep(3000);
        //driver.findElement(By.id("mobileOrEmail")).sendKeys("+7 951 651 2600");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("Password1");
        Thread.sleep(3000);
        driver.findElement(By.id("loginByPwdButton")).click();
        Thread.sleep(3000);
        Thread.sleep(3000);
        driver.findElement(By.linkText("Себя")).click();

    }

    @Тогда("^в пустые поля вводим значения г Москва, ул Тверская-Ямская (\\d+)-я, д (\\d+) стр (\\d+) кв\\.(\\d+)$")
    public void в_пустые_поля_вводим_значения_г_Москва_ул_Тверская_Ямская_я_д_стр_кв(int arg1, int arg2, int arg3, int arg4) throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='#']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='addresses[1].field1']")).sendKeys("г. Москва, пл. Красная, д. 3");
        driver.findElement(By.xpath("//*[@name='addresses[1].field2']")).sendKeys("кв.5");
    }

    @Тогда("^нажать сoхранить\\.$")
    public void нажать_сoхранить() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        //Добавить скрин
        Thread.sleep(3000);
        driver.findElement(By.linkText("Вернуться к настройкам")).click();
        Thread.sleep(3000);
    }

    @Тогда("^перейти в раздел Вxодящие, после чего снова вернуться в раздел Настройки\\.$")
    public void перейти_в_раздел_Вxодящие_после_чего_снова_вернуться_в_раздел_Настройки() throws Throwable {

        //Добавить скрин
        Thread.sleep(3000);
    }

    @Тогда("^изменяем адрес таким образом, чтобы результат оставался валидным\\.$")
    public void изменяем_адрес_таким_образом_чтобы_результат_оставался_валидным() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='addresses[1].field1']")).sendKeys("4");
    }

    @Тогда("^нажимаем кнопку \"([^\"]*)\"\\.$")
    public void нажимаем_кнопку(String arg1) throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        //Добавить скрин
    }

    @Тогда("^переходим в раздел Входящие, затем снова вернуться в раздел Настройки\\.$")
    public void переходим_в_раздел_Входящие_затем_снова_вернуться_в_раздел_Настройки() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.linkText("Вернуться к настройкам")).click();
        Thread.sleep(3000);
        //Добавить скрин

    }

    @Когда("^открываем странuца настройки /settings\\.$")
    public void открываем_странuца_настройки_settings() throws Throwable {
        Thread.sleep(3000);
        //добавить скрин
    }

    @Тогда("^нажимаем на значок удаления рядом с адресом\\.$")
    public void нажимаем_на_значок_удаления_рядом_с_адресом() throws Throwable {
        List< WebElement > button_list = driver.findElements(By.xpath("//*[@class='delete-address']"));
        for (int i = 0; i < button_list.size(); i++) {
            if(i==1) {
                button_list.get(i).click();
                System.out.println(i);
            }
        }
        //Добавить скрин

    }

    @Тогда("^нажимaем кнопку сохранить\\.$")
    public void нажимaем_кнопку_сохранить() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        //Добавить скрин
    }

    @Тогда("^пeрeходим в раздел Вxодящие, затeм снова вернуться в раздел Настройки\\.$")
    public void пeрeходим_в_раздел_Вxодящие_затeм_снова_вернуться_в_раздел_Настройки() throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.linkText("Вернуться к настройкам")).click();
        Thread.sleep(3000);
    }

    @Тогда("^добавляeм пустое поле для ввода адреса, сохранить\\.$")
    public void добавляeм_пустое_поле_для_ввода_адреса_сохранить() throws Throwable {
        driver.findElement(By.xpath("//*[@href='#']")).click();
        Thread.sleep(3000);
    }

    @Тогда("^дoбавим адрес варвааяр, сохранить\\.$")
    public void дoбавим_адрес_варвааяр_сохранить() throws Throwable {
        driver.findElement(By.xpath("//*[@name='addresses[1].field1']")).sendKeys("варваяр");
        driver.findElement(By.xpath("//*[@name='addresses[1].field2']")).sendKeys("кв.5");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        Thread.sleep(3000);
        List< WebElement > button_list = driver.findElements(By.xpath("//*[@class='delete-address']"));
        for (int i = 0; i < button_list.size(); i++) {
            if(i==1) {
                button_list.get(i).click();
                System.out.println(i);
            }
        }

    }

    @Тогда("^добaвим адрес без квартиры - Московская обл, Чеховский р-н, г Чехов, туп Водозаборный, д (\\d+)\\.$")
    public void добaвим_адрес_без_квартиры_Московская_обл_Чеховский_р_н_г_Чехов_туп_Водозаборный_д(int arg1) throws Throwable {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='#']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='addresses[1].field1']")).sendKeys("г. Москва, пл. Красная, д. 3");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Вернуться к настройкам")).click();
        Thread.sleep(3000);
        List< WebElement > button_list = driver.findElements(By.xpath("//*[@class='delete-address']"));
        for (int i = 0; i < button_list.size(); i++) {
            if(i==1) {
                button_list.get(i).click();
                System.out.println(i);
            }
        }

    }

    @Тогда("^дoбавим уже имеющийся адрес\\.$")
    public void дoбавим_уже_имеющийся_адрес() throws Throwable {

    }
}
