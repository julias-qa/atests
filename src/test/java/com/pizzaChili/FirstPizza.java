package com.pizzaChili;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPizza {

    public ChromeDriver driver;

    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("show start");
    }

    @Test
    public void FirstPizza() {

        driver.get("https://www.pizzatempo.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Заказ и доставка пиццы на дом в Минске - «Пицца Темпо»"));
    }

    @After
    public void stopIt() {
        driver.quit();
        System.out.println("show stop");
    }

}
