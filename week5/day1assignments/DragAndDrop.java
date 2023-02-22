package week5.day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.leafground.com/drag.xhtml");
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
		WebElement target = driver.findElement(By.xpath("//span[text()='Droppable Target']"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		String cssValue = driver.findElement(By.id("form:drop_content")).getCssValue("background-color");
		System.out.println(cssValue);
	}

}
