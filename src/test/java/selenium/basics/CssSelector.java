package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.get("https://selectorshub.com/xpath-practice-page/");
		/*driver.manage().window().maximize();
		driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("Css Selector");
		driver.findElement(By.cssSelector("textarea[name='q']")).sendKeys("name");
		*/
		//driver.findElement(By.cssSelector("input#userId")).sendKeys("user email");
		//driver.findElement(By.cssSelector("input[title='Email']")).sendKeys("By title");
		
		//driver.findElement(By.cssSelector("input[title='Password']")).sendKeys("Password");
		
		//driver.findElement(By.cssSelector("input[name='company']")).sendKeys("Company ");
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium Ide");
		driver.findElement(By.xpath("//input[@role='button']")).click();
		driver.findElement(By.id("APjFqb")).sendKeys("Selenium Ide");
	
		
	}

}
