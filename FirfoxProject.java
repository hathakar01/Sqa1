/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firfoxproject;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 *
 * @author 8student23
 */
public class FirfoxProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        FirefoxDriver wd = new FirefoxDriver();
        
       wd.get("https://www.google.com/");      
       wd.manage().window().maximize();
//      // Thread.sleep(3000);
       wd.findElement(By.id("APjFqb")).sendKeys("Handling list using java");
//     //  wd.findElement(By.name("btnK")).sendKeys(Keys.ENTER);
//      wd.sendKeys(Keys.ENTER);
       wd.findElement(By.name("btnK")).submit();
    //  wd.get("https://www.google.com/search?q=Handling+list+using+java&source=hp&ei=aog3ZK_xHvKl2roP9qeViAg&iflsig=AOEireoAAAAAZDeWevXFWb86jC_r8Q2KkDr-uORct5Az&ved=0ahUKEwivzqzqhab-AhXyklYBHfZTBYEQ4dUDCAg&uact=5&oq=Handling+list+using+java&gs_lcp=Cgdnd3Mtd2l6EAMyBQghEKABMgUIIRCgATIICCEQFhAeEB06BwghEKABEApQAFi2AmD4C2gAcAB4AIAB3wGIAdYFkgEFMC4zLjGYAQCgAQE&sclient=gws-wiz");
//       int numberOfLinks = wd.findElements(By.tagName("a")).size();
       int numberOfLinks = wd.findElements(By.partialLinkText("java collection")).size();
       System.out.println("Number of links on Web Page :" +numberOfLinks );
       Thread.sleep(3000);
       wd.close();
//       if(wd.getTitle().contains("Google : Search Engine"))
//        {
//           System.out.println("Pass"); 
//        }
//        else
//        {
//            System.out.println("Fail");
//        }
    }
    
}
