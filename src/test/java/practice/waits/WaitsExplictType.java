package practice.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class WaitsExplictType
{ static WebDriver d;
    @BeforeTest
    public static void beforeTYest(){
        WebElement s =new ChromeDriver().findElement(By.xpath("//img[@alt='Beetroot - 1 Kg']/parent::div/following-sibling::div/button"));
        d.get("https://rahulshettyacademy.com/seleniumPractise/#/");

    }
    public static void main(String []args){
        d.findElement(By.xpath("//img[@alt='Beetroot - 1 Kg']/parent::div/following-sibling::div/button")).click();

        WebDriverWait wait= new WebDriverWait(d, Duration.ofSeconds(3));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath((""))));



    }
}
