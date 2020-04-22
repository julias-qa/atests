package com.pizzaChili;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstPizza {

    @Test
    public void FirstPizza() {
        System.setProperty("webdriver.chrome.driver", "C:/Java/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.pizzatempo.by/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Заказ и доставка пиццы на дом в Минске - «Пицца Темпо»"));
        driver.quit(); //to close
    }
}
