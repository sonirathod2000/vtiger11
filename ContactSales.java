package vtiger1;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ContactSales {

	

	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demo.vtiger.com/vtigercrm/");

		

		driver.findElement(By.xpath("//button[.='Sign in']")).click();

		driver.findElement(By.xpath("//DIV[@id='appnavigator']/DIV[@class='row app-navigator']")).click();

		

		WebElement ele= driver.findElement(By.id("SALES_modules_dropdownMenu"));

		Actions action = new Actions(driver);

		action.moveToElement(ele).perform();

		

		driver.findElement(By.xpath("//span[text()=' Contacts']")).click();

		

		driver.findElement(By.id("Contacts_listView_basicAction_LBL_ADD_RECORD")).click();

		

		driver.findElement(By.id("s2id_autogen1")).click();

		WebElement ele1=driver.findElement(By.id("s2id_autogen2_search"));

		ele1.sendKeys("Ms");

		ele1.sendKeys(Keys.ENTER);

		

		driver.findElement(By.id("Contacts_editView_fieldName_firstname")).sendKeys("Asha");

		driver.findElement(By.id("Contacts_editView_fieldName_lastname")).sendKeys("Kodape");

		

		driver.findElement(By.id("Contacts_editView_fieldName_phone")).sendKeys("456745");

		driver.findElement(By.id("account_id_display")).sendKeys("jspider");

		

		driver.findElement(By.id("Contacts_editView_fieldName_mobile")).sendKeys("9860572802");

		

		driver.findElement(By.id("s2id_autogen3")).click();

		WebElement ele2=driver.findElement(By.id("s2id_autogen4_search"));

		ele2.sendKeys("Self Generated");

		ele2.sendKeys(Keys.ENTER);

		

		driver.findElement(By.id("Contacts_editView_fieldName_homephone")).sendKeys("9970738898");

		driver.findElement(By.id("Contacts_editView_fieldName_title")).sendKeys("xyz");

		

		driver.findElement(By.id("Contacts_editView_fieldName_otherphone")).sendKeys("9689003870");

		driver.findElement(By.id("Contacts_editView_fieldName_department")).sendKeys("shipping");

		

		driver.findElement(By.id("Contacts_editView_fieldName_fax")).sendKeys("45654");

		driver.findElement(By.id("Contacts_editView_fieldName_email")).sendKeys("ashakodape96@gmail.com");

		

		driver.findElement(By.id("Contacts_editView_fieldName_birthday")).sendKeys("25-02-1996");

		driver.findElement(By.id("Contacts_editView_fieldName_assistant")).sendKeys("Ms.Rathod");

		

		driver.findElement(By.id("contact_id_display")).sendKeys("Mr.Samundre");

		driver.findElement(By.id("Contacts_editView_fieldName_assistantphone")).sendKeys("9234567823");

		

		driver.findElement(By.id("Contacts_editView_fieldName_secondaryemail")).sendKeys("sonirathod2000@gmail.com");

		

		driver.findElement(By.id("Contacts_editView_fieldName_emailoptout")).click();

		

		JavascriptExecutor js=(JavascriptExecutor)driver;

		js.executeScript("window.scrollBy(0,250","");

		driver.findElement(By.id("Contacts_editView_fieldName_donotcall")).click();

		driver.findElement(By.id("Contacts_editView_fieldName_reference")).click();

		driver.findElement(By.id("Contacts_editView_fieldName_notify_owner")).click();

		driver.findElement(By.id("Contacts_editView_fieldName_portal")).click();

		

		driver.findElement(By.xpath("//textarea[@name='mailingstreet']")).sendKeys("Ambika Nagar");

		driver.findElement(By.xpath("//textarea[@name='otherstreet']")).sendKeys("Wardha road");

		

		driver.findElement(By.id("Contacts_editView_fieldName_mailingpobox")).sendKeys("32456");

		driver.findElement(By.id("Contacts_editView_fieldName_otherpobox")).sendKeys("34556");

		

		driver.findElement(By.id("Contacts_editView_fieldName_mailingcity")).sendKeys("Nagpur");

		driver.findElement(By.id("Contacts_editView_fieldName_othercity")).sendKeys("Pune");

		

		driver.findElement(By.id("Contacts_editView_fieldName_mailingstate")).sendKeys("Maharashtra");

		driver.findElement(By.id("Contacts_editView_fieldName_otherstate")).sendKeys("Maharashtra");

		driver.findElement(By.id("Contacts_editView_fieldName_mailingzip")).sendKeys("23546");

		driver.findElement(By.id("Contacts_editView_fieldName_otherzip")).sendKeys("576899");

		driver.findElement(By.id("Contacts_editView_fieldName_mailingcountry")).sendKeys("India");

		driver.findElement(By.id("Contacts_editView_fieldName_othercountry")).sendKeys("India");

		

		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("IaSDZFxg DSZfgx");

		

		driver.findElement(By.xpath("//button[text()='Save']")).submit();
		

		

	}



}




