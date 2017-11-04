import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class Locator_Class3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {

        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://www.nasa.gov");

        WebElement missions = driver.findElement(By.linkText("Missions"));
        System.out.println(missions.getAttribute("href"));

        WebElement nasaTV = driver.findElement(By.linkText("NASA TV"));
        System.out.println(nasaTV.getAttribute("href"));



        List<WebElement> tag1= driver.findElements(By.tagName("input"));
        for (WebElement t:tag1
             ) {
            System.out.println(t.getAttribute("class"));
        }



        driver.quit();
    }
}