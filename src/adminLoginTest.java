/**
 * Created by thejan on 4/10/17.
 */
import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class adminLoginTest {

    @Test
    public void test() throws InterruptedException {
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

//        WebElement screenNameText = driver.findElement(By.className("u-textInheritColor"));
//        assertEquals("Test Account", screenNameText.getText().trim());

        driver.quit();
    }

}

