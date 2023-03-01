package week5.day2assignments;

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
	driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
	WebElement invisible = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
	WebDriverWait wait1= new WebDriverWait(driver, Duration.ofSeconds(10));
	wait1.until(ExpectedConditions.invisibilityOf(invisible));
//	driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
//	WebElement clickable = driver.findElement(By.xpath("//span[text()='Click Second']"));
//	clickable.click();
//	WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(10));
//	wait2.until(ExpectedConditions.visibilityOf(clickable));
//	System.out.println(clickable.getText());
	driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
	WebElement notice = driver.findElement(By.xpath("//span[text()='Did you notice?']"));
	WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(30));
	wait3.until(ExpectedConditions.visibilityOf(notice));
	System.out.println(notice.getText());
	
	}

}
