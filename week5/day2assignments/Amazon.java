package week5.day2assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		/*1.Load the uRL https://www.amazon.in/
2.search as oneplus 9 pro 
3.Get the price of the first product
4. Print the number of customer ratings for the first displayed product
5. Mouse Hover on the stars
6. Get the percentage of ratings for the 5 star.
7. Click the first text link of the first image
8. Take a screen shot of the product displayed
9. Click 'Add to Cart' button
10. Get the cart subtotal and verify if it is correct.*/
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://www.amazon.in/");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
	String price = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println("Price: " +price);
	System.out.println("Rating: " +driver.findElement(By.xpath("//span[@class='a-size-base']")).getText());
	Thread.sleep(3000);
    WebElement stars = driver.findElement(By.xpath("//i[@class='a-icon a-icon-star-small a-star-small-3 aok-align-bottom']"));	 
    Actions builder=new Actions(driver);
    builder.moveToElement(stars).perform();
    stars.click();
    System.out.println("Percentage: "+driver.findElement(By.xpath("(//a[@title='5 stars represent 50% of rating'])[3]")).getText());
	driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']")).click();
	Set<String> wh = driver.getWindowHandles();
	List<String> wh1=new ArrayList<String>(wh);
	driver.switchTo().window(wh1.get(1));
	File source  = driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("./snap/amazon.png");
	FileUtils.copyFile(source, dest);
	driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	String subtotal = driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	System.out.println("subtotal: "+subtotal);
	if(price.equalsIgnoreCase(subtotal)) {
		System.out.println("subtotal is correct");
	}
	else {
		System.err.println("Subtotal is not correct");
	}
	}

}
