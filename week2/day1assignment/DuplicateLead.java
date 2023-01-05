package week2.day1assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Suruthi");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Praveen");
	driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Sruthi");
	driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Non IT to IT");
	driver.findElement(By.name("description")).sendKeys("Automation Selenium");
	driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sruthi.darsh06@gmail.com");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Duplicate Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).clear();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TL-Test Leaf");
	driver.findElement(By.id("createLeadForm_firstName")).clear();
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Praveen");
	driver.findElement(By.className("smallSubmit")).click();
	
	
	}

}
