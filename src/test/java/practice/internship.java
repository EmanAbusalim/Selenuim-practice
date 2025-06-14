package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class internship {

    public static void main (String[] args) {
        WebDriver d = new EdgeDriver();
        d.get("https://odoo.eventumsolutions.com/jobs/apply/software-testing-summer-internship-501");
        for (int i = 0; i < 3000; i++) {
            d.findElement(By.xpath("//input[@name='salary_expected']")).sendKeys(Keys.ARROW_UP);
        }
    }









}
