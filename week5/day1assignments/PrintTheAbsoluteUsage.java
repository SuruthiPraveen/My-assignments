package week5.day1assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintTheAbsoluteUsage {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://html.com/tags/table/");
		List<WebElement> rowcount = driver.findElements(By.xpath("(//table)[1]//tr"));
		List<WebElement> colcount = driver.findElements(By.xpath("(//table)[1]//th"));
		for (int i = 1; i <= rowcount.size(); i++) {
			String txt = driver.findElement(By.xpath("(//table)[1]//tr["+i+"]/td[1]")).getText();
			if(txt.contains("Absolute Usage")) {
				for (int j = 1; j <=colcount.size(); j++) {
					String text = driver.findElement(By.xpath("(//table)[1]//tr["+i+"]/td["+j+"]")).getText();	
					System.out.println(text);
				}
			}
		}

	}

}
