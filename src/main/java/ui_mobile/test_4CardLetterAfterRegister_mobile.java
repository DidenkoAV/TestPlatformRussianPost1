package ui_mobile;

import cucumber.api.java.ru.Когда;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class test_4CardLetterAfterRegister_mobile {

    private WebDriver driver = DriverBaseMobile.getDriver();

    @Когда("^пользователь авторизован и находится в /inbox/personal\\.$")
    public void пользователь_авторизован_и_находится_в_inbox_personal() throws Throwable {
        driver.get("https://erl-individual-web.test.russianpost.ru/");
        Thread.sleep(3000);
        driver.findElement(By.linkText("Войти")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//*[@class='another-user']")).click();
        //Thread.sleep(5000);
        //driver.findElement(By.id("mobileOrEmail")).sendKeys("79129287894");
        //Thread.sleep(5000);
        //driver.findElement(By.id("password")).sendKeys("22222222");
        //Thread.sleep(5000);
        //driver.findElement(By.id("loginByPwdButton")).click();
    }



    @Тогда("^в карточке письма нажать \"([^\"]*)\"\\.$")
    public void в_карточке_письма_нажать(String arg1) throws Throwable {
        List< WebElement > letter_list = driver.findElements(By.xpath("//*[@class='itemWrapper']"));
        for (int i = 0; i < letter_list.size(); i++) {
            if (i == 0) {
                letter_list.get(i).click();
            }
        }
        Thread.sleep(3000);
        //Добавить скрин
        List<WebElement> link_list = driver.findElements(By.xpath("//*[@class='operations']//a"));
        for (int i = 0; i < link_list.size(); i++){
            if(i==3){
                link_list.get(i).click();
            }
        }
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Добавить скрин
    }

    @Тогда("^перейти в Архив\\.$")
    public void перейти_в_Архив() throws Throwable {
        Thread.sleep(3000);
        List< WebElement > button_list = driver.findElements(By.xpath("//*[@href='/archive/personal']"));
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        Thread.sleep(1000);
        for (int i = 0; i < button_list.size(); i++) {
            if(i==0) {
                button_list.get(i).click();
                System.out.println(i);
            }
        }
        //Добавить скрин

    }

    @Когда("^пoльзователь авторизован и находится в /inbox/personal\\.$")
    public void пoльзователь_авторизован_и_находится_в_inbox_personal() throws Throwable {
        //Добавить скрин

    }

    @Тогда("^открыть Архив  /archive/personal\\.$")
    public void открыть_Архив_archive_personal() throws Throwable {
        Thread.sleep(3000);
        List< WebElement > letter_list = driver.findElements(By.xpath("//*[@class='itemWrapper']"));
        for (int i = 0; i < letter_list.size(); i++) {
            if (i == 0) {
                letter_list.get(i).click();
            }
        }
    }

    @Тогда("^в карточке письма нажать на ссылку \"([^\"]*)\"\\.$")
    public void в_карточке_письма_нажать_на_ссылку(String arg1) throws Throwable {
        Thread.sleep(4000);
        //Добавить скрин
        List<WebElement> link_list1 = driver.findElements(By.xpath("//*[@class='operations']//a"));
        for (int i = 0; i < link_list1.size(); i++){
            if(i==3){
                link_list1.get(i).click();
            }
        }
        Thread.sleep(3000);
        driver.navigate().refresh();
        //Добавить скрин
    }

    @Тогда("^перейти во Входящие\\.$")
    public void перейти_во_Входящие() throws Throwable {
        Thread.sleep(5000);
        //Добавить скрин
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@class='hamburger']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@href='/logout']")).click();
        Thread.sleep(5000);

    }
}
