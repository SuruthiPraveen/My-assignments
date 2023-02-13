package week4.day2assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[3]")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		System.out.println(driver.getTitle());
		Set<String> wh = driver.getWindowHandles();
		List<String> l = new ArrayList<String>(wh);
		driver.switchTo().window(l.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[1]")).click();
		driver.switchTo().window(l.get(0));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> wh1 = driver.getWindowHandles();
		List<String> l1 = new ArrayList<String>(wh1);		
		driver.switchTo().window(l1.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//a[@class='linktext'])[5]")).click();
		driver.switchTo().window(l1.get(0));	
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		System.out.println(driver.getTitle());
		
	}

}
