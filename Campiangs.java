package Vtiger1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Campiangs {
	
	public static void main(String[] args) throws InterruptedException 
	{
	       WebDriver driver =new ChromeDriver();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       driver.get("https://demo.vtiger.com/vtigercrm/");
	       driver.findElement(By.xpath("//button[text()='Sign in']")).click();
	       driver.findElement(By.id("appnavigator")).click();   
	       WebElement ele = driver.findElement(By.xpath("//span[text()=' MARKETING']"));
	       Actions  action=new Actions(driver);
	       action.moveToElement(ele).perform();
	       
	       driver.findElement(By.xpath("//span[text()=' Campaigns']")).click();
	       driver.findElement(By.id("Campaigns_listView_basicAction_LBL_ADD_RECORD")).click();
	       driver.findElement(By.id("Campaigns_editView_fieldName_campaignname")).sendKeys("Qspiders");
	       
	       driver.findElement(By.id("select2-chosen-2")).click();
	       WebElement ele1 = driver.findElement(By.id("s2id_autogen2_search"));
	       ele1.sendKeys("Marketing Group");
	       ele1.sendKeys(Keys.ENTER);
	    
	       driver.findElement(By.id("select2-chosen-4")).click();
	       WebElement ele2 = driver.findElement(By.id("s2id_autogen4_search"));
	       ele2.sendKeys("Planning");
	       ele2.sendKeys(Keys.ENTER);
	       
	       driver.findElement(By.id("select2-chosen-6")).click();
	       WebElement ele3 = driver.findElement(By.id("s2id_autogen6_search"));
	       ele3.sendKeys("Conference");
	       ele3.sendKeys(Keys.ENTER);
	       
	       driver.findElement(By.id("product_id_display")).sendKeys("Amul Milk");
	       driver.findElement(By.id("Campaigns_editView_fieldName_targetaudience")).sendKeys("1000");
	    
	       driver.findElement(By.id("Campaigns_editView_fieldName_closingdate")).click();
	       driver.findElement(By.xpath("//td[text()='19']")).click();
	       driver.findElement(By.id("Campaigns_editView_fieldName_sponsor")).sendKeys("Soni Rathod");
	      
	       driver.findElement(By.id("Campaigns_editView_fieldName_targetsize")).sendKeys("1000");
	     
	       driver.findElement(By.id("Campaigns_editView_fieldName_numsent")).sendKeys("50");
	       driver.findElement(By.id("Campaigns_editView_fieldName_budgetcost")).sendKeys("60000");
	       driver.findElement(By.id("Campaigns_editView_fieldName_actualcost")).sendKeys("50000");
	       
	       JavascriptExecutor jse =(JavascriptExecutor)driver;
	       jse.executeScript("window.scrollBy(0,100)");
	       
	       driver.findElement(By.id("select2-chosen-8")).click();
	       WebElement ele4 = driver.findElement(By.id("s2id_autogen8_search"));
	                  ele4.sendKeys("Excellent");
	                  ele4.sendKeys(Keys.ENTER);
	                  
	       driver.findElement(By.id("Campaigns_editView_fieldName_expectedrevenue")).sendKeys("200");
	       driver.findElement(By.id("Campaigns_editView_fieldName_expectedsalescount")).sendKeys("300");
	       driver.findElement(By.id("Campaigns_editView_fieldName_actualsalescount")).sendKeys("200");
	       driver.findElement(By.id("Campaigns_editView_fieldName_expectedresponsecount")).sendKeys("200");
	       driver.findElement(By.id("Campaigns_editView_fieldName_actualresponsecount")).sendKeys("100");
	       driver.findElement(By.id("Campaigns_editView_fieldName_expectedroi")).sendKeys("60000");
	       driver.findElement(By.id("Campaigns_editView_fieldName_actualroi")).sendKeys("50000");
	       driver.findElement(By.id("Campaigns_editView_fieldName_description")).sendKeys("It is about campians like Product launch");
	       
	       driver.findElement(By.xpath("//button[text()='Save']")).click();
	       
	       
	    
	       driver.findElement(By.xpath("//span[@class='fa fa-user']")).click();
	      
	       driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();
	       


	      
	       }
}		



