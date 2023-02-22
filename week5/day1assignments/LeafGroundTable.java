package week5.day1assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundTable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> colcount = driver.findElements(By.xpath("//table[@role='grid']//th"));
		System.out.println("The colum count is "+colcount.size());
		List<WebElement> rowcount = driver.findElements(By.xpath("//table[@role='grid']//tr"));
		System.out.println("The row count is "+rowcount.size());
		for (int i = 0; i < rowcount.size(); i++) {
		System.out.println(rowcount.get(i).getText());	
		}
		String text = driver.findElement(By.xpath("//table[@role='grid']//tr[4]/td[1]")).getText();
		System.out.println("Name:"+text );
		String text1 = driver.findElement(By.xpath("//table[@role='grid']//tr[4]/td[4]")).getText();
		System.out.println("Joining Date:"+text1);
	}

}
