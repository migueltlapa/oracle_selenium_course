import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class Locator_Class2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {

        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.google.com.mx");

       driver.findElement(By.id("Invalidadd.d.d.d."));
        driver.quit();
    }
}