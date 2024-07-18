package practice;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.Driver;

import java.time.Duration;


public class WaitPractice {
    @Test
    public void refactorWithImplicitWait() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement usernameInputBox = driver.findElement(By.id("user-name"));
        WebElement passwordInputBox = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));
        usernameInputBox.sendKeys("performance_glitch_user");
        passwordInputBox.sendKeys("secret_sauce");
        loginButton.click();


        WebElement backpackTitle = driver.findElement(By.xpath("//*[text()='Sauce Labs Backpack']"));
        backpackTitle.click();

        WebElement backToProducts = driver.findElement(By.id("back-to-products"));
        backToProducts.click();

        WebElement bikeLightTitle = driver.findElement(By.xpath("//*[text()= 'Sauce Labs Bike Light']"));
        bikeLightTitle.click();



        driver.quit();
    }
}
