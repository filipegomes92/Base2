package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTests {
    public static WebDriver driver;
    public void TelaDeLogin (){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mantis-prova.base2.com.br/login_page.php");
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("username")));
    }
}