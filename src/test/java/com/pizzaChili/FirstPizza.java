package com.pizzaChili;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.manage().deleteAllCookies();

        driver.findElement(By.xpath("//a[@href='https://www.pizzatempo.by/registration/']")).click();

        WebElement Email = driver.findElement(By.xpath("//input[@name='email']")); //xpath
        Email.sendKeys("sojoye3850@box4mls.com");

        WebElement Password1 = driver.findElement(By.xpath("//input[@name='pass']")); //xpath
        Password1.sendKeys("testpass20");

        WebElement Password2 = driver.findElement(By.xpath("//input[@name='repass']")); //xpath
        Password2.sendKeys("testpass20");

        WebElement Person = driver.findElement(By.xpath("//input[@name='fio']")); //xpath
        Person.sendKeys("John Smith");

        WebElement Phone = driver.findElement(By.xpath("//input[@name='phone']"));
        Phone.click();
        Phone.sendKeys("903 23 507 49 98");

        WebElement Gender = driver.findElement(By.xpath("//input[@name='sex']"));
        Gender.click();

        driver.findElement(By.xpath("//select[@name='age']")).click();
        driver.findElement(By.xpath("//select//option[@value='26-35']")).click();

        driver.findElement(By.xpath("//select[@name='occupation']")).click();
        driver.findElement(By.xpath("//select//option[@value='Служащий']")).click();

        WebElement Subscribe = driver.findElement(By.xpath("//input[@name='subscribe']"));
        Subscribe.click();

        WebElement Street = driver.findElement(By.xpath("//input[@name='street']"));
        Street.sendKeys("Bakerstreet");

        WebElement House = driver.findElement(By.xpath("//input[@name='house']"));
        House.sendKeys("21b");

        WebElement Room = driver.findElement(By.xpath("//input[@name='room']"));
        Room.sendKeys("1");

        WebElement Porch = driver.findElement(By.xpath("//input[@name='porch']"));
        Porch.sendKeys("10");

        WebElement Floor = driver.findElement(By.xpath("//input[@name='floor']"));
        Floor.sendKeys("8");

        driver.findElement(By.xpath("//button[@name='form_submit']")).click();

        WebElement Text = driver.findElement(By.xpath("//div[@class='content']"));
                Text.getText().contains("Вы успешно зарегистрированы.");

    }

    @AfterAll
    static void stopIt() {
        driver.quit();
        System.out.println("Test is Stopped");
    }
}