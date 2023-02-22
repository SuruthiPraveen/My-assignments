package week5.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Erail {

	public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get("https://erail.in/");
	driver.findElement(By.xpath("//input[@id='txtStationFrom']")).clear();
	driver.findElement(By.xpath("//input[@id='txtStationFrom']")).sendKeys("ms",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='txtStationTo']")).clear();
	driver.findElement(By.xpath("//input[@id='txtStationTo']")).sendKeys("mdu",Keys.ENTER);
	driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
	List<WebElement> rowcount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
	System.out.println("Total trains count is " +rowcount.size());
	for (int i = 0; i < rowcount.size(); i++) {
		String train = rowcount.get(i).getText();
		System.out.println(train);
	//	if(train.contains("EXPRESS")) {
	//		System.out.println(train);
	}
	
	Set<WebElement> nonduplicate=new HashSet<WebElement>(rowcount);
	System.out.println("The Non Duplicate train list count is " +nonduplicate.size());
	if(nonduplicate.size()==rowcount.size()) {
		System.out.println("There is no duplicate");
	}
	else {
		System.out.println("There is duplicate");
	}

	}

}
