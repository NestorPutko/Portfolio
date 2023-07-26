import com.github.javafaker.Faker;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ad3 {
    static WebDriver driver = new ChromeDriver();
    Faker faker = new Faker();


    @Test
    public void successRegister(){
        String username = faker.pokemon().name();
        String email = username + faker.name().username() + "@wp.pl";
        String password = "haslo1234#";
        driver.manage().window().maximize();
        driver.get("http://serwer169007.lh.pl/autoinstalator/serwer169007.lh.pl/wordpress10772/");
        driver.findElement(By.xpath("//a[text() = 'register']")).click();
        driver.findElement(By.xpath("//input[@name='user_login']")).sendKeys(username);
        driver.findElement(By.xpath("//input[@name='user_email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@name='user_pass']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@name='user_confirm_password']")).sendKeys(password);
        driver.findElement(By.cssSelector(".ur-submit-button")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        Assertions.assertEquals("User successfully registered.", driver.findElement(By.cssSelector("#ur-submit-message-node ul")).getText());
        driver.quit();


    }
}


