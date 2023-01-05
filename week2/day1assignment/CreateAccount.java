package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Create Account")).click();
	driver.findElement(By.id("accountName")).sendKeys("suruthi Praveen");
	driver.findElement(By.id("groupNameLocal")).sendKeys("Sruthi");
	driver.findElement(By.id("officeSiteName")).sendKeys("test leaf");
	driver.findElement(By.id("annualRevenue")).sendKeys("12000000");
	WebElement tool = driver.findElement(By.name("industryEnumId"));
	Select drop=new Select(tool);
	drop.selectByIndex(3);
	WebElement tool1 = driver.findElement(By.name("ownershipEnumId"));
	Select drop1=new Select(tool1);
	drop1.selectByVisibleText("S-Corporation");
	WebElement tool2 = driver.findElement(By.id("marketingCampaignId"));
	Select drop2= new Select(tool2);
	drop2.selectByIndex(6);
	WebElement tool3 = driver.findElement(By.name("generalStateProvinceGeoId"));
	Select drop3=new Select(tool3);
	drop3.selectByValue("TX");
	driver.findElement(By.className("smallSubmit")).click();
	
	}

}
