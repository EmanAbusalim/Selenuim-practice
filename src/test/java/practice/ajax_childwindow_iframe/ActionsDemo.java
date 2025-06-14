package practice.ajax_childwindow_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class ActionsDemo {
    public static void main (String []args)throws InterruptedException
    {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.amazon.eg/");
        //just move to element
        WebElement e= driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"));
        Actions a=new Actions(driver);
        a.moveToElement(e).build().perform();;

//writ in caps by clicking shift before the letter
        a.moveToElement(driver.findElement(By.cssSelector("input[name=\"field-keywords\"]")))
                .click()
                .keyDown(Keys.SHIFT)
                .sendKeys("Eman")
                .keyUp(Keys.SHIFT)
                .build()
                .perform();
a.moveToElement(driver.findElement(By.cssSelector("input[name=\"field-keywords\"]"))).doubleClick();




    }
}
