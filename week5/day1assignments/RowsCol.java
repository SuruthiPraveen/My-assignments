package week5.day1assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RowsCol {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		List<WebElement> rowcount1 = driver.findElements(By.xpath("(//table)[1]//tr"));
		System.out.println("The row count of 1st table is " +rowcount1.size());
		List<WebElement> colcount1 = driver.findElements(By.xpath("(//table)[1]//th"));
		System.out.println("The column count is " +colcount1.size());
		List<WebElement> rowcount2 = driver.findElements(By.xpath("//table[@class='attributes-list']//tr"));
		System.out.println("The row count of second table is " +rowcount2.size());
		List<WebElement> colcount2 = driver.findElements(By.xpath("//table[@class='attributes-list']//th"));
		System.out.println("The column count is " +colcount2.size());
		
	}

}
