package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Listconcept {
    public static void main(String [] args) throws InterruptedException {
        ChromeDriver d= new ChromeDriver();
        d.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(500);
        /***
         * * you can not use array list here because find elements return a list and if you ask how i can return interface?
         * ok in the signature of the fidelements method its return type is list even in the code its actuaally arraylist but
         * you must receive the output ass written in the signature of themethod you called
         * IF you want to store it in array list notice that you must do down casting
         */

       List<WebElement> elment= d.findElements(By.xpath("//div[contains(@class,'fleft')]/input"));
       for(WebElement e:elment){
           /**
            * * if(e.findElement(By.xpath("following-sibling::label")).getText()=="Senior Citizen"){
            * strings in jave being compared by isequal or equalsignorecase() method
            */
           WebElement label=e.findElement(By.xpath("following-sibling::label"));
           if(label.getText().equalsIgnoreCase("Senior Citizen")){
          // WebElement label = d.findElement(By.cssSelector("label[for='" + id + "']"));

               System.out.println("Senior Citizen");
               e.click();
               break;
           }

       }
       //the code in tesssst is enhansments for this code
        //so if selenium doesnot found the label then you catch the exception on try catch




    }
}
