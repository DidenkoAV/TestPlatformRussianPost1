package ui_mobile;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test_2WorkWithAdressAfterRegister_mobile {

    private WebDriver driver = DriverBaseMobile.getDriver();

    @Тогда("^нажимаем \"([^\"]*)\", на форму добавились пустые поля для ввода адреса, номера квартиры/офиса и значок для удаления полей\\.$")
    public void нажимаем_на_форму_добавились_пустые_поля_для_ввода_адреса_номера_квартиры_офиса_и_значок_для_удаления_полей(String arg1) throws InterruptedException {
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='another-user']")).click();
        Thread.sleep(3000);
        driver.findElement(By.id("mobileOrEmail")).sendKeys("79129287894");
        Thread.sleep(3000);
        driver.findElement(By.id("password")).sendKeys("22222222");
        Thread.sleep(3000);
        driver.findElement(By.id("loginByPwdButton")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='/settings']")).click();

    }

    @Тогда("^в пустые поля ввести значения г Москва, ул Тверская-Ямская (\\d+)-я, д (\\d+) стр (\\d+) кв\\.(\\d+)$")
    public void в_пустые_поля_ввести_значения_г_Москва_ул_Тверская_Ямская_я_д_стр_кв(int arg1, int arg2, int arg3, int arg4) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='#']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='addresses[1].field1']")).sendKeys("г Москва, ул Тверская-Ямская 1-я, д 2 стр 4");
        driver.findElement(By.xpath("//*[@name='addresses[1].field2']")).sendKeys("кв.5");
    }

    @Тогда("^нажать кнопку сoхранить\\.$")
    public void нажать_кнопку_сoхранить() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        //Добавить скрин
        System.out.println(driver.getCurrentUrl());

    }

    @Тогда("^перейти в раздел Вxодящие, затeм снова вернуться в раздел Настройки\\.$")
    public void перейти_в_раздел_Вxодящие_затeм_снова_вернуться_в_раздел_Настройки() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        Thread.sleep(3000);
        List<WebElement> input_list = driver.findElements(By.xpath("//*[@href='/inbox/personal']"));
        for (int i = 0; i < input_list.size(); i++) {
            if(i==1) {
                input_list.get(i).click();
                System.out.println(i);
            }
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        //driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='/settings']")).click();
        //Добавить скрин
        Thread.sleep(3000);
    }

    @Тогда("^изменить адрес таким образом, чтобы результат оставался валидным\\.$")
    public void изменить_адрес_таким_образом_чтобы_результат_оставался_валидным() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='addresses[0].field1']")).sendKeys("4");
    }

    @Тогда("^нажать кнопку \"([^\"]*)\"\\.$")
    public void нажать_кнопку(String arg1) throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        //Добавить скрин

    }

    @Тогда("^перейти в раздел Входящие, затем снова вернуться в раздел Настройки\\.$")
    public void перейти_в_раздел_Входящие_затем_снова_вернуться_в_раздел_Настройки() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        //driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
        List<WebElement> input_list = driver.findElements(By.xpath("//*[@href='/inbox/personal']"));
        for (int i = 0; i < input_list.size(); i++) {
            if(i==1) {
                input_list.get(i).click();
                System.out.println(i);
            }
        }

        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        //driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='/settings']")).click();
        //Добавить скрин
        Thread.sleep(3000);

    }

    @Когда("^открыта странuца настройки /settings\\.$")
    public void открыта_странuца_настройки_settings() throws InterruptedException {
        Thread.sleep(3000);
        //добавить скрин

    }

    @Тогда("^нажать на значок удаления рядом с адресом\\.$")
    public void нажать_на_значок_удаления_рядом_с_адресом()  {
        driver.findElement(By.xpath("//*[@class='delete-address']")).click();
;
    }

    @Тогда("^нажать кнопку сохранить\\.$")
    public void нажать_кнопку_сохранить() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        //Добавить скрин

    }

    @Тогда("^пeрeйтu в раздел Вxодящие, затeм снова вернуться в раздел Настройки\\.$")
    public void пeрeйтu_в_раздел_Вxодящие_затeм_снова_вернуться_в_раздел_Настройки() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        //driver.findElement(By.xpath("//*[@title='Роман Капранов']")).click();
        Thread.sleep(3000);
        List<WebElement> input_list = driver.findElements(By.xpath("//*[@href='/inbox/personal']"));
        for (int i = 0; i < input_list.size(); i++) {
            if(i==1) {
                input_list.get(i).click();
                System.out.println(i);
            }
        }
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='/settings']")).click();
        //Добавить скрин
        Thread.sleep(3000);
    }

    @Тогда("^добавить пустое поле для ввода адреса, сохранить\\.$")
    public void добавить_пустое_поле_для_ввода_адреса_сохранить() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@href='#']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        //Добавить скрин
    }

    @Тогда("^добавить адрес варвааяр, сохранить\\.$")
    public void добавить_адрес_варвааяр_сохранить() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@name='addresses[1].field1']")).sendKeys("варваяр");
        driver.findElement(By.xpath("//*[@name='addresses[1].field2']")).sendKeys("кв.5");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='button']")).click();
        Thread.sleep(3000);
        //Добавить скрин

    }

    @Тогда("^добавить адрес без квартиры - Московская обл, Чеховский р-н, г Чехов, туп Водозаборный, д (\\d+)\\.$")
    public void добавить_адрес_без_квартиры_Московская_обл_Чеховский_р_н_г_Чехов_туп_Водозаборный_д(int arg1) {

    }

    @Тогда("^добавить уже имеющийся адрес\\.$")
    public void добавить_уже_имеющийся_адрес()  {

    }
}
