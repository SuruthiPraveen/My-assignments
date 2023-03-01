package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
	ChromeDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://leafground.com/waits.xhtml");
	WebElement visible = driver.findElement(By.xpath("//span[text()='Click']"));
	visible.click();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	wait.until(ExpectedConditions.visibilityOf(visible));
	String text = driver.findElement(By.xpath("//span[text()='I am here']")).getText();
	System.out.println(text);
	WebElement invisible = driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
	invisible.click();
	WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.visibilityOf(invisible));
	
	
	}

}
