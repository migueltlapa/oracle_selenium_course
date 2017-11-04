import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class XPATH_Exercise2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {

        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);


        driver.get("https://www.amazon.com.mx");




        for(WebElement element:driver.findElements(By.xpath("//head")))
        {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}