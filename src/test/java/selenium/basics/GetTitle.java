package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement wb=driver.findElement(By.id("APjFqb"));
		wb.sendKeys("Selenium webdriver");
		wb.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//h3[contains(text(),'WebDriver')]")).click();
		System.out.println(driver.getTitle());
		
		Thread.sleep(1000);
		//driver.quit();
	}

}
