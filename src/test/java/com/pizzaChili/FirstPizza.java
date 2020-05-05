package com.pizzaChili;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class FirstPizza {

    static ChromeDriver driver;
    private Object inputElement;

    @BeforeAll
    static void startIt() {
        System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test is Started");
    }

    @Test
    void firstPizza() {
        driver.get("https://www.pizzatempo.by/");
        String title = driver.getTitle();
        Assertions.assertEquals("Заказ и доставка пиццы на дом в Минске - «Пицца Темпо»", title);
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by/");
        WebElement el = driver.findElement(By.linkText("Регистрация"));
        el.click();
        System.out.println("registration");

        WebElement Email = driver.findElement(By.name("email"));
        Email.sendKeys("testuser@gmail.com");

        WebElement Пароль = driver.findElement(By.name("pass"));
        Пароль.sendKeys("testpass20");

        WebElement Повторите_пароль = driver.findElement(By.name("repass"));
        Повторите_пароль.sendKeys("testpass20");

        WebElement Контактное_лицо = driver.findElement(By.name("fio"));
        Контактное_лицо.sendKeys("John Smith");

        WebElement Контактный_телефон = driver.findElement(By.name("phone"));
        Контактный_телефон.sendKeys("+903 23 507 49 98");

        WebElement Пол = driver.findElement(By.name("sex"));
        Пол.click();

        Select Возраст = new Select(driver.findElement(By.name("age")));
        Возраст.selectByIndex(2);

        Select Род_Занятий = new Select(driver.findElement(By.name("occupation")));
        Род_Занятий.selectByIndex(7);

        WebElement Подписка = driver.findElement(By.name("subscribe"));
        Подписка.click();
        System.out.println("unchecked");

        WebElement Street = driver.findElement(By.name("street"));
        Street.sendKeys("Bakerstreet");

        WebElement House = driver.findElement(By.name("house"));
        House.sendKeys("21b");

        WebElement Room = driver.findElement(By.name("room"));
        Room.sendKeys("1");

        WebElement Porch = driver.findElement(By.name("porch"));
        Porch.sendKeys("10");

        WebElement Floor = driver.findElement(By.name("floor"));
        Floor.sendKeys("8");

        el = driver.findElement(By.name("form_submit"));
        el.click();
        System.out.println("Reg is done");

    }

    @AfterAll
    static void stopIt() {
        driver.quit();
        System.out.println("Test is Stopped");
    }
}