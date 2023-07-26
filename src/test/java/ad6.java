import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ad6 {
    static WebDriver driver = new ChromeDriver();

    @Test
    public void GoFromLoginPageToHomePage() {
        driver.manage().window().maximize();
        driver.get("http://serwer169007.lh.pl/autoinstalator/serwer169007.lh.pl/wordpress10772/moje-konto/");
        driver.findElement(By.xpath("//a[@rel='home']")).click();
        WebElement home = driver.findElement(By.xpath("//a[@rel='home']"));
        Assertions.assertTrue(home.isDisplayed());
        driver.quit();
    }
}