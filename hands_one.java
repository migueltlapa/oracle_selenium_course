package com.qalabs.seleniumlocators;
import com.qalabs.seleniumlocators.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;




public class hands_one{
    public static void main(String[] args) throws InterruptedException, NullPointerException {

        WebDriver driver= WebDriverFactory.getDriver("firefox");
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com.mx");

        WebElement promociones = driver.findElement(By.xpath(" //*[@id='nav-xshop']/a[2]"));
        System.out.println(promociones.getAttribute("href"));
        promociones.click();

        //*[@class='a-checkbox checkbox a-spacing-micro']

        WebElement firstProduct=driver.findElement(By.xpath(" //*[@class='a-checkbox checkbox a-spacing-micro']"));
        firstProduct.click();
        Thread.sleep(5000)
        ;
        WebElement Ofer_destacadas=driver.findElement(By.xpath("//*[@class='a-label a-checkbox-label' and contains(text(), 'Ofertas destacadas')]"));
        Ofer_destacadas.click();
        //*[@class='a-label a-checkbox-label']
        Thread.sleep(5000);

        WebElement Stars=driver.findElement(By.xpath("//*[@data-value='4']"));
        Stars.click();
        Thread.sleep(5000);

        Double lowest =Double.MAX_VALUE;
//        driver.findElements(By.xpath("//*[contains(@class,'priceBlock')]/span"));
        for(WebElement product:driver.findElements(By.xpath("//*[contains(@class,'priceBlock')]/span")))
                {
                    Double tmpPrice =Double.parseDouble(product.getText().replaceAll("\\$|,",""));
                    if(tmpPrice < lowest)
                    {
                        lowest =tmpPrice;
                        System.out.println("Lowest price updated to: "+lowest);

                    }
                }
        System.out.println("Lowest Price"+lowest);
        driver.quit();
    }
}