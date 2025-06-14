package practice.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitpractice {
    public static void main (String []args){

        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver .findElement(By.xpath("//img[@alt='Beetroot - 1 Kg']/parent::div/following-sibling::div/button")).click();




    }






}
