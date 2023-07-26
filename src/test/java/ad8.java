import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ad8 {
    static WebDriver driver = new ChromeDriver();

    @Test
    public void addProduct() {
        driver.manage().window().maximize();
        driver.get("http://serwer169007.lh.pl/autoinstalator/serwer169007.lh.pl/wordpress10772/");
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(By.cssSelector(".woocommerce-Price-amount"))).build().perform();
        System.out.println(driver.findElement(By.xpath("//p[@class='woocommerce-mini-cart__empty-message']")).getText());
        driver.findElement(By.xpath("//a[text()='Dodaj do koszyka']")).click();
        actions.moveToElement(driver.findElement(By.cssSelector(".woocommerce-Price-amount"))).build().perform();
        System.out.println(driver.findElement(By.xpath("//img[@loading='lazy']")).getText());
        driver.quit();

    }
}
