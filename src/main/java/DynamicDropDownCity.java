import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DynamicDropDownCity {




    public static void main(String []args){
        /**
        //مشكله الدروب داون الديناميك
        // ان الدروب داون مبتظهرش غير بعد جدث معين فممكن اللوكيتور قبل الحدث يكوم
        // يونيك لكن بعدها ميبقاش يونيك وسيلينيوم يفضل يأكسيز ليبمنت تانل
        */
        WebDriver d= new EdgeDriver();
        d.get("https://rahulshettyacademy.com/dropdownsPractise/");
        d.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();

        d.findElement(By.xpath("//li/a[contains(@text,'Belagavi ')]")).click();
       try{ Thread.sleep(2000);}
       catch(Exception E){System.out.println ("h");
        }
        d.findElement(By.xpath("(//a[contains(@text,'Ahmed')])[2]")).click();



    }
}
