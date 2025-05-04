

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class tesssst {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver d = new ChromeDriver();
        d.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Thread.sleep(5000);

        // جيب كل الشيك بوكسات داخل الـ div اللي فيه الكلاس ده
        List<WebElement> checkboxes = d.findElements(By.xpath("//div[contains(@class,'fleft')]/input"));

        for (WebElement checkbox : checkboxes) {
            // حاول توصل لليبل اللي بعده مباشرة باستخدام following-sibling
            try {
                WebElement label = checkbox.findElement(By.xpath("following-sibling::label"));
                String labelText = label.getText().trim();

                if (labelText.equalsIgnoreCase("Senior Citizen")) {
                    checkbox.click();  // كليكة على الشيك بوكس
                    System.out.println("Clicked on: " + labelText);
                    break;
                }
            } catch (Exception ex) {
                System.out.println("Label not found for this checkbox.");
            }
        }

        // Close the browser after testing
        Thread.sleep(3000);
        d.quit();
    }
}

