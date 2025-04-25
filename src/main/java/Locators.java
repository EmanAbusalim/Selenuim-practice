import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Locators {

    public static void main(String []args){
        WebDriver d= new ChromeDriver();

        d.get("https://www.saucedemo.com/");
        d.manage().window().maximize();
        d.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//class name locator
       // d.findElement(By.className("input_error")).sendKeys("Eman");
        /* find the element using xpath+index for non unique attributes
        d.findElement(By.xpath("//input[@autocorrect='off'][1]")).sendKeys("MONMON");

         */
 // css selector locator
        d.findElement((By.cssSelector("input[type='password']"))).sendKeys("123fk");
 //id locator
        //d.findElement(By.id("password")).sendKeys("E123");
 //name locator
       // d.findElement(By.name("login-button")).click();
 //implicit wait
       // d.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       // System.out.println(
      //  d.findElement(By.cssSelector("h3[data-test='error']")).getText());
       /* d.findElement(By.className("input_error")).sendKeys("Eman");
        d.findElement(By.name("user-name")).sendKeys("Eman");
        d.findElement(By.id("user-name")).sendKeys("Eman");

       /* d.findElement(By.id("password")).sendKeys("123");
        d.findElement(By.cssSelector("input[value='Login']")).click();
        System.out.println(d.findElement(By.cssSelector("h3[data-test='error']")).getText());
*/
        // xpath locator format //tag name[@attribute='value']
        d.findElement(new By.ByXPath("//input[type='submit']"));

    }
}
