package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AssignmentForCheckBoxes {
    public static void main( String []args)throws InterruptedException{
        WebDriver driver= new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(3000);
        List<WebElement> checkboxes=driver.findElements(By.xpath("//label/input"));
        System.out.println(checkboxes.get(1).isDisplayed());  // لازم تكون true
        System.out.println(checkboxes.get(1).isEnabled());    // لازم تكون true


        checkboxes.get(3).click();
        if(checkboxes.get(3).isSelected()){

            checkboxes.get(3).click();

        };
        List<WebElement>checkboxesCount=driver.findElements(By.xpath("//input[contains(@type,'checkbox')]"));

        System.out.println("number of checkboxes is"+checkboxesCount.size());Thread.sleep(2000);

        driver.quit();


    }
}
