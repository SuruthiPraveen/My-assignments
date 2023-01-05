package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String title1=driver.getTitle();
		System.out.println(title1);
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suruthi");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Praveen");
	WebElement tool = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop =new Select(tool);
	drop.selectByVisibleText("Employee");
	WebElement tool1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	Select drop1=new Select(tool1);
	drop1.selectByValue("9001");
	WebElement tool2 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select drop2 = new Select(tool2);
	drop2.selectByIndex(5);
	WebElement tool3 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
	Select drop3=new Select(tool3);
	drop3.selectByVisibleText("India");
	driver.findElement(By.name("submitButton")).click();
	}

}
