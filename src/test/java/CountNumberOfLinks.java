import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class CountNumberOfLinks {
    //clculate link counts in qaclickacademy
    //https://rahulshettyacademy.com/AutomationPractice/
    WebDriver driver;

    @BeforeMethod
public void setup(){
    WebDriver driver= new ChromeDriver();
    driver.get("https://rahulshettyacademy.com/AutomationPractice/");
}
//get All links
    @Test
    public void getLinks(){

    List<WebElement> links=driver.findElements(By.tagName("a"));
    for(WebElement link: links){
        System.out.println(link.getText());
    }}
//get Links in footer
        @Test
        public void getFooterLinks(){
    List<WebElement> links=  driver.findElements(By.xpath("//table[@class='gf-t']"));
        for (WebElement link:links ){
            System.out.println( link.getText());
        }
}


}
