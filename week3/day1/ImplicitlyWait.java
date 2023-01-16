package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class ImplicitlyWait {

	public static void main(String[] args) {
		//browser notification
        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-notifications");
        //will open chrome browser
        ChromeDriver driver=new ChromeDriver(option);
        //maximize the window
        driver.manage().window().maximize();
        //load the url
        driver.get("https://login.salesforce.com/");
        //wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        //Enter username
        driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
        //Enter the password
        driver.findElement(By.id("password")).sendKeys("Testleaf$321");
        //click login
        driver.findElement(By.id("Login")).click();
        //click app launcher
        driver.findElement(By.className("slds-icon-waffle")).click();
         //close the browser
        //driver.close();

	}

}
