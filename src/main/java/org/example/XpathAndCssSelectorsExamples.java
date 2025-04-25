package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import java.lang.String;
public class XpathAndCssSelectorsExamples {
    public static void main(String []args){
        WebDriver d= new EdgeDriver();
        d.get("https://www.saucedemo.com/");
        //extrcat the real user name and
        /*
        String usernameCreditials=d.findElement(By.cssSelector("#login_credentials")).getText();
        char []username ;
        for(int i=0;i<usernameCreditials.length();i++){
            if(usernameCreditials[i]!="\n"){
                char[i]+=usernameCreditials[i];
            }
            else break;
        }
        System.out.println();
*/
        /**
         * *trying different syntax for xpath for user name input
         */
        /*first by help of atrripute
         notice xpath //div/input[1] do not mean the first one in the page
           it will access the first input element  at every div in the page
           */
        //formula //parentTagname/childTagname[@attribute='value']
        d.findElement(By.xpath("//div/input[@id='user-name']")).sendKeys("Emzoo");
       //direct formula //tagname[attribute='value']
        d.findElement(By.xpath("//input[@placeholder='Username']")).clear();
        //  formula //parent/child[index]/child :solution for parent with two childs contain same grandson
         d.findElement(By.xpath("//form/div[1]/input")).sendKeys("monmon");
        // with regular expression formula //tagname[contains(@attripute,'sub value')]
        d.findElement(By.xpath("//input[contains(@name,'user')]")).clear();

        d.findElement(By.id("user-name")).sendKeys("standard_user");
        /**
         * * trying different css selectors on password input
         */
           //formuls of tagname[attripute='value']
        d.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("11");
        //formula of parentname childname[attripute='value']
        d.findElement(By.cssSelector("form div:nth-child(2) input[class='input_error form_input']:nth-child(1)")).clear();
       d.findElement(By.id("password")).sendKeys("secret_sauce");
        d.findElement(By.className("submit-button")).click();

        //AcCesS static dropdownlist by clicking
        d.findElement(By.xpath("//div//select[contains(@class,'product')]")).click();
        d.findElement(By.cssSelector("select option[value='za']")).click();
        // ACCESS STATIC DROP DOWN LIST BY SELECT CLASS
          Select static_drop_down   =new Select(d.findElement(By.xpath("//div//select[contains(@class,'product')]")));
           static_drop_down.selectByIndex(2);
    }
}
