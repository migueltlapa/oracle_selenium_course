

import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

public class Locator_Class5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {

        WebDriver driver= WebDriverFactory.getDriver("firefox");

        driver.get("https://www.amazon.com.mx");

        WebElement dropdown =driver.findElement(By.id("searchDropdownBox"));
        Select select= new Select(dropdown);


        System.out.println("Available options"+select.getOptions());
        System.out.println("Multiple"+select.isMultiple());
        System.out.println("Selected option:"+select.getFirstSelectedOption().getText());

        select.selectByIndex(1);
        System.out.println("Selected option:"+select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        select.selectByValue("search-alias=automotive");
        System.out.println("Selected option:"+select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        driver.quit();
    }
}