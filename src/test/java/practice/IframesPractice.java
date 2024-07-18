package practice;

import com.github.javafaker.Faker;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframesPractice {
    @Test
    public void internetWithElementsInDifferentIFrames() throws InterruptedException {
WebDriver driver = new ChromeDriver();
driver.get("https://practice.expandtesting.com/iframe");
driver.manage().window().maximize();
driver.switchTo().frame("iframe-youtube");
Thread.sleep(2000);
WebElement playButton = driver.findElement(By.cssSelector("button[title='Play']"));

playButton.click();

        Thread.sleep(5000);
        driver.switchTo().parentFrame();
        Thread.sleep(2000);
        driver.switchTo().frame("mce_0_ifr");
        Thread.sleep(2000);
        WebElement field = driver.findElement(By.id("tinymce"));

        Thread.sleep(3000);
        field.sendKeys("Asif is a good man, not a bad man!");
        Thread.sleep(5000);
        driver.switchTo().defaultContent();
        WebElement title =driver.findElement(By.xpath("//h2[text() = 'Internal IFrame: Email Subscription']"));

        Thread.sleep(2000);
        driver.switchTo().frame("email-subscribe");
        WebElement field2 = driver.findElement(By.cssSelector("input#email"));
        Faker faker = new Faker();

        field2.sendKeys(faker.internet().emailAddress());
        field2.sendKeys(Keys.PAGE_DOWN);
        Thread.sleep(5000);
        WebElement subscribeButton = driver.findElement(By.cssSelector("button#btn-subscribe"));
        subscribeButton.click();
        Thread.sleep(3000);
        driver.quit();


    }
}
