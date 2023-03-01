package week5.day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
	/*	1) Go to https://www.nykaa.com/
			2) Mouseover on Brands and Search L'Oreal Paris
			3) Click L'Oreal Paris
			4) Check the title contains L'Oreal Paris(Hint-GetTitle)
			5) Click sort By and select customer top rated
			6) Click Category and click Hair->Click haircare->Shampoo
			7) Click->Concern->Color Protection
			8)check whether the Filter is applied with Shampoo
			9) Click on L'Oreal Paris Colour Protect Shampoo
			10) GO to the new window and select size as 175ml
			11) Print the MRP of the product
			12) Click on ADD to BAG
			13) Go to Shopping Bag 
			14) Print the Grand Total amount
			15) Click Proceed
			16) Click on Continue as Guest
			17) Check if this grand total is the same in step 14
			18) Close all windows/*/
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.nykaa.com/");
	Actions builder = new Actions(driver);
	builder.moveToElement(driver.findElement(By.xpath("//a[text()='brands']"))).perform();
	driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//span[@class='sort-name']")).click();
	driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
	driver.findElement(By.xpath("//span[text()='Category']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Hair']")).click();
	driver.findElement(By.xpath("(//span[text()='Hair Care'])[2]")).click();
	driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
	driver.findElement(By.xpath("//span[text()='Concern']")).click();
	driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
	String text = driver.findElement(By.xpath("//span[text()='Shampoo']")).getText();
	if(text.contentEquals("Shampoo")) {
		System.out.println("Filter is applied");
	}
	else {
		System.err.println("Filter is not applied");
	}
	driver.findElement(By.xpath("//div[@class='css-xrzmfa']")).click();
	Set<String> wh = driver.getWindowHandles();
	List<String> wh1 = new ArrayList<String>(wh);
	driver.switchTo().window(wh1.get(1));
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//span[text()='180ml']")).click();
	System.out.println(driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText());
	driver.findElement(By.xpath("//span[text()='Add to Bag']")).click();
	driver.findElement(By.xpath("//button[@class='css-g4vs13']")).click();
	driver.switchTo().frame(0);
	String grandtotal = driver.findElement(By.xpath("//span[@class='css-1um1mkq e171rb9k3']")).getText();
	 System.out.println(grandtotal);   
	 Thread.sleep(2000);   
	driver.findElement(By.xpath("//span[text()='Proceed']")).click();
	driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
	driver.findElement(By.xpath("//span[@class='css-175whwo ehes2bo0']")).click();
	String text3 = driver.findElement(By.xpath("//p[@class='css-1e59vjt eka6zu20']")).getText();
	if(grandtotal.equalsIgnoreCase(text3)) {
		System.out.println("Grand total verification successfull");
	}
	}

}
