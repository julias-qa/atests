package com.pizzaChili;
import org.junit.jupiter.api.*;
import org.openqa.selenium.chrome.ChromeDriver;

class FirstPizza {

    static ChromeDriver driver;
    @BeforeAll
    static void startIt() {
        System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("show start");
    }

    @Test
    @Order(3)
    void firstPizza() {
//        driver.manage().window().setSize(new Dimension(500,500));
        driver.get("https://www.pizzatempo.by/");
        String title = driver.getTitle();
        Assertions.assertEquals("Заказ и доставка пиццы на дом в Минске - «Пицца Темпо»", title);
    }

    @Test
    @Order(1)
    void firstPizza2() {
        driver.manage().window().maximize();
        driver.get("https://www.pizzatempo.by/");
    }

    @AfterEach
    void stopIt() {
        driver.quit();
        System.out.println("show stop");
    }


}
