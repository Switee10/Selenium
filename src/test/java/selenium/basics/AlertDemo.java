package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		driver=new ChromeDriver();

		driver.navigate().to("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("promtButton")).click();
		/*
		 * switchto.alert()
		 * getText()
		 * sendkeys()
		 * accept()
		 * dismiss()
		 */
		//switching the control from the browser to the alert
	
		//for 4th button
		Alert promptAlert=driver.switchTo().alert();
		
		System.out.println(promptAlert.getText());
		promptAlert.sendKeys("Guvi Selenium");
		Thread.sleep(5000);
		
		promptAlert.accept();
		
		//promptAlert.dismiss();
		
		//for 3rd button
		driver.findElement(By.id("confirmButton")).click();
		Alert promptAlert1=driver.switchTo().alert();
		System.out.println(promptAlert1.getText());
		promptAlert1.accept();
		//promptAlert1.dismiss();
	}

}
