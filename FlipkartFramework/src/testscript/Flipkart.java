package testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Flipkart 
{
   @Test
   public void Flipkart_Login_Valid() throws Exception
   {
	   FirefoxDriver driver=new FirefoxDriver();
	   driver.get("https://www.flipkart.com");
	   Thread.sleep(5000);
	   driver.findElement(By.xpath("//a[.='Log In']")).click();
	   driver.findElement(By.xpath("//input[@class='_2zrpKA']")).sendKeys("8981439549");
	   driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv']")).sendKeys("spincerworld");
       driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
       driver.close();
   }
}
