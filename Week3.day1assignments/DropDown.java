package week3.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//select[@class='ui-selectonemenu']")).click();
		driver.findElement(By.xpath("//option[text()='Selenium']")).click();
		driver.findElement(By.xpath("//label[contains(@class,'ui-selectonemenu-label')]")).click();
		driver.findElement(By.xpath("//li[text()='India']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown ui-button ui-widget')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
		driver.findElement(By.xpath("//label[text()='Select City']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Select City']")).click();
		driver.findElement(By.xpath("//label[text()='Select Language']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Tamil']")).click();
		driver.findElement(By.xpath("//label[text()='Select Values']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li[text()='Select Values']")).click();
		
	}

}
