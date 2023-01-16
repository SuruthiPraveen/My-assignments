package week3.day1assignments;


import java.time.Duration;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// Step 1: Download and set the path 
		// Step 2: Launch the chromebrowser
		ChromeDriver driver= new ChromeDriver();
		// Step 4: Maximise the window
		driver.manage().window().maximize();
		// Step 3: Load the URL https://en-gb.facebook.com/
		driver.get("https://en-gb.facebook.com/");	
		// Step 5: Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// Step 6: Click on Create New Account button
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		// Step 7: Enter the first name
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Suruthi");
		// Step 8: Enter the last name
		driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Praveen");
		// Step 9: Enter the mobile number
		driver.findElement(By.xpath("//div[text()='Mobile number or email address']/following-sibling::input")).sendKeys("9500954210");
		// Step 10: Enter the password
		driver.findElement(By.xpath("//div[text()='New password']/following-sibling::input")).sendKeys("passwor");
		// Step 11: Handle all the three drop downs
		driver.findElement(By.xpath("//option[@value='8']")).click();
		WebElement tool = driver.findElement(By.id("month"));
		Select drop = new Select(tool);
		drop.selectByVisibleText("Jun");
		driver.findElement(By.xpath("//option[@value='1991']")).click();
		// Step 12: Select the radio button "Female" 
		driver.findElement(By.xpath("//input[@name='sex']/preceding-sibling::label")).click();
		           
	}

}
