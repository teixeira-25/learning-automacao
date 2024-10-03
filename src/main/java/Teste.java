
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Teste
{
    public static void main(String[] args)
    {
        WebDriverManager.chromedriver().setup();
        WebDriver navegar = new ChromeDriver();
        navegar.get("https://www.google.com/");
        navegar.findElement(By.id("APjFqb")).click();
        navegar.findElement(By.id("APjFqb")).sendKeys("mecado livre");
        navegar.findElement(By.className("gNO89b")).click();
        navegar.findElement(By.className("VuuXrf")).click();
        navegar.findElement(By.id("cb1-edit")).click();
        navegar.findElement(By.id("cb1-edit")).sendKeys("Motorola Edge 40 NEO");
        navegar.findElement(By.className("nav-icon-search")).click();
        //navegar.findElement(By.className("cookie-consent-banner-opt-out__action cookie-consent-banner-opt-out__action--primary cookie-consent-banner-opt-out__action--key-accept")).click();
        JavascriptExecutor js = (JavascriptExecutor) navegar;
        WebElement element = navegar.findElement(By.xpath("//li[3]/div/div/div[2]/div/h2/a"));
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        navegar.findElement(By.xpath("//li[3]/div/div/div[2]/div/h2/a")).click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        navegar.close();
    }
}