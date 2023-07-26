import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ad7 {
    static WebDriver driver = new ChromeDriver();
    Faker faker = new Faker();

    @Test
    public void TrySendMessage() {
        String name=faker.name().lastName();
        String email=name + "@wp.pl";
        driver.manage().window().maximize();
        driver.get("http://serwer169007.lh.pl/autoinstalator/serwer169007.lh.pl/wordpress10772/");
        driver.findElement(By.xpath("//a[text()='Kontakt']")).click();
        driver.findElement(By.xpath("//input[@name='your-name']")).sendKeys(name);
        driver.findElement(By.xpath("//input[@name='your-email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='your-subject']")).sendKeys("xyz");
        driver.findElement(By.xpath("//textarea[@name='your-message']")).sendKeys("lorem ipsum");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        String expectedErrorMessage = "Wystąpił problem z wysłaniem twojej wiadomości. Spróbuj ponownie później.";
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='wpcf7-response-output']"));
        String actualErrorMessage = errorMessage.getText();
        Assertions.assertEquals(expectedErrorMessage, actualErrorMessage);
        driver.quit();
    }
}