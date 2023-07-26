import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ad5 {

    static WebDriver driver = new ChromeDriver();

    @Test
    public void goFromHomePageToContactPage() {
        driver.manage().window().maximize();
        driver.get("http://serwer169007.lh.pl/autoinstalator/serwer169007.lh.pl/wordpress10772/");
        driver.findElement(By.xpath("//a[text()='Kontakt']")).click();
        Assertions.assertTrue(driver.findElement(By.xpath("//h1[@class='entry-title']")).isDisplayed());
        driver.quit();
    }
}
