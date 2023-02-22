package week5.day1assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement source = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//p[text()='Drop here']"));
		Actions builder=new Actions(driver);
		builder.dragAndDrop(source, target).perform();
		String text = driver.findElement(By.xpath("//p[text()='Dropped!']")).getText();
		System.out.println(text);
	}
}
