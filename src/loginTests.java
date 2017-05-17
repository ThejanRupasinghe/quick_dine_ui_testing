/**
 * Created by thejan on 4/10/17.
 */
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class loginTests {

    @Test
    public void adminLoginTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();

        WebElement usernameText = driver.findElement(By.id("username"));
        usernameText.sendKeys("admin");

        WebElement passwordText = driver.findElement(By.id("password"));
        passwordText.sendKeys("admin");

        WebElement loginButton = driver.findElement(By.id("signin"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement dashboardText = driver.findElement(By.id("dashboardHeader"));
        assertEquals("Dashboard", dashboardText.getText().trim());

        driver.quit();
    }

    @Test
    public void waiterLoginTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();

        WebElement usernameText = driver.findElement(By.id("username"));
        usernameText.sendKeys("waiter");

        WebElement passwordText = driver.findElement(By.id("password"));
        passwordText.sendKeys("waiter");

        WebElement loginButton = driver.findElement(By.id("signin"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement buttonText = driver.findElement(By.id("newOrderButtonText"));
        assertEquals("NEW ORDER", buttonText.getText().trim());

        driver.quit();
    }

    @Test
    public void kitchenLoginTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();

        WebElement usernameText = driver.findElement(By.id("username"));
        usernameText.sendKeys("kitchen");

        WebElement passwordText = driver.findElement(By.id("password"));
        passwordText.sendKeys("kitchen");

        WebElement loginButton = driver.findElement(By.id("signin"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement buttonText = driver.findElement(By.id("cookingButtonText"));
        assertEquals("COOKING", buttonText.getText().trim());

        driver.quit();
    }

    @Test
    public void cashierLoginTest() throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://localhost:3000");
        driver.manage().window().maximize();

        WebElement usernameText = driver.findElement(By.id("username"));
        usernameText.sendKeys("cashier");

        WebElement passwordText = driver.findElement(By.id("password"));
        passwordText.sendKeys("cashier");

        WebElement loginButton = driver.findElement(By.id("signin"));
        loginButton.click();

        Thread.sleep(5000);

        WebElement buttonText = driver.findElement(By.id("billedButtonText"));
        assertEquals("BILLED", buttonText.getText().trim());

        driver.quit();
    }

}

