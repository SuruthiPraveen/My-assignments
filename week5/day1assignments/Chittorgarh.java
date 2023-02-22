package week5.day1assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chittorgarh {

	public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
	driver.get("https://www.chittorgarh.com/");
	driver.findElement(By.xpath("//a[@id='navbtn_stockmarket']")).click();
	driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
	List<WebElement> table = driver.findElements(By.xpath("//table[@class='table table-bordered table-striped table-hover w-auto']//tr/td[1]"));
	Set<String> nondup=new LinkedHashSet<String>();
	for (int i = 0; i < table.size(); i++) {
		String text = table.get(i).getText();
		System.out.println(text);
		nondup.add(text);
		}
System.out.println("The total count is " +table.size());
System.out.println("The non duplicate count is " +nondup.size());
List<String> nd=new ArrayList<String>(nondup);
for (int j = 0; j < nd.size(); j++) {
	System.out.println(nd.get(j));
}
	if(table.size()==nondup.size()) {
		System.out.println("There is no duplicate");
	}
	else {
		System.out.println("Duplicate is present");
	}
	}
}
