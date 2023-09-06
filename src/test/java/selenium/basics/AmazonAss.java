package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonAss 
{
	static WebDriver driver;

	public static void main(String[] args)  {

		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		WebElement search =driver.findElement(By.xpath("//input[@class='nav-input nav-progressive-attribute']"));
		search.sendKeys("Printers");
		search.sendKeys(Keys.ENTER);
		
		WebElement Checkbox=driver.findElement(By.xpath("//span[text()='HP']"));
		Checkbox.click();
		
		//WebElement sort=driver.findElement(By.xpath("//span[text()='Featured']"));
		Select sel = new Select(driver.findElement(By.xpath("//span[text()='Featured']")));
		sel.selectByVisibleText("Price: Low to High");
	
}
}