package com.pizzaChili;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class FirstPizza {

    static ChromeDriver driver;

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
        el = driver.findElement(By.linkText("Забыли пароль?"));
        el.click();
        System.out.println("click");
     }

    @AfterAll
    static void stopIt() {
        driver.quit();
        System.out.println("Test is Stopped");
    }
}
