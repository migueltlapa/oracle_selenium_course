
import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class Locator_Class4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {

        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        driver.get("https://es.wikipedia.org/wiki/Wikipedia:Portada");

        WebElement portada = driver.findElement(By.linkText("Portada"));
        System.out.println(portada.getAttribute("href"));

        List<WebElement> pagina = driver.findElements(By.partialLinkText("Página"));

        for(WebElement t:pagina)
        {
            System.out.println(t.getAttribute("href"));
        }


        driver.quit();
    }
}