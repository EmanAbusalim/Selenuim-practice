package practice.ajax_childwindow_iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;


public class ChildWindowHandle {
    public static void main(String args[]){
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
        driver.findElement(By.cssSelector(".blinkingText")).click();
       Set<String> allWindows= driver.getWindowHandles();
    Iterator<String> myWindows=allWindows.iterator();

     String mainWindow=myWindows.next();
     String childWindow=myWindows.next();
           driver.switchTo().window(childWindow);
           //this the easy way for accessing the email because it was set as email
          driver.findElement(By.cssSelector("strong a")).click();
// what it if its a part of a string you want to handle by split and trim
        //use java debuging tool
      String script=  driver.findElement(By.cssSelector(".im-para.red")).getText();
        String arrayu= script.split("at")[1].trim().split(" ")[0];
        System.out.println(arrayu);



    }
}
