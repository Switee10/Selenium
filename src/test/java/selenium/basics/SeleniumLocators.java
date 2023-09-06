package selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.*;

public class SeleniumLocators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium ide");
		

		WebElement sb=driver.findElement(By.id("APjFqb"));
		sb.sendKeys("Selenium Ide");
		sb.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		//open the first and third link
		//driver.findElement(By.xpath("//h3[contains(text(),'Open source record and playback test automation for the web')]")).click();
				Thread.sleep(1000);
		//driver.findElement(By.xpath("//h3[contains(text(),'What is Selenium IDE: Learn The Basics')]")).click();
		driver.findElement(By.xpath("//h3[contains(text(),'SeleniumHQ/selenium-ide: Open Source record and ...')]")).click();	
	}

}
