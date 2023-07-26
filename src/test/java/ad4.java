import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

public class ad4 {
    static WebDriver driver = new ChromeDriver();

    @Test
    public void checkIsLogoAndSearchVisible(){
        driver.manage().window().maximize();
        driver.get("http://serwer169007.lh.pl/autoinstalator/serwer169007.lh.pl/wordpress10772/");

        String logoText = driver.findElement(By.xpath("//a[@rel='home']")).getText();
        WebElement search = driver.findElement(By.xpath("//input[@class='search-field']"));

        Assertions.assertTrue(driver.findElement(By.xpath("//a[@rel='home']")).isDisplayed()&&
                search.isDisplayed());

        driver.findElement(By.xpath("//a[text()='Moje konto']")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Assertions.assertEquals("Softie Metal Shop", logoText);
        Assertions.assertTrue(search.isDisplayed());
        driver.quit();

    }
}
