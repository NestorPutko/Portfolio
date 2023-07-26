import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ad1 {
        static WebDriver driver = new ChromeDriver();

        @Test
        public void emptyUsernameLogin(){
            driver.manage().window().maximize();
            driver.get("http://serwer169007.lh.pl/autoinstalator/serwer169007.lh.pl/wordpress10772/");
            driver.findElement(By.xpath("//a[text()='Moje konto']")).click();
            driver.findElement(By.xpath("//input[@name='password']")).sendKeys("haslo123#");
            driver.findElement(By.xpath("//button[@value='Zaloguj się']")).click();
            Assertions.assertEquals("Błąd: Nazwa użytkownika jest wymagana.", driver.findElement(By.xpath("//ul[@class='woocommerce-error']")).getText());
            driver.quit();
        }
    }
