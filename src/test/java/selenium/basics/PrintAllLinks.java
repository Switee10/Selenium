package selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.*;

public class PrintAllLinks {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
	
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement sb=driver.findElement(By.id("APjFqb"));
		sb.sendKeys("Selenium Ide");
		sb.sendKeys(Keys.ENTER);
		Thread.sleep(1000);
		
		List<WebElement> links= driver.findElements(By.tagName("a"));
		
		//for(Datatype variablename:collection)
		for (WebElement eachLink:links)
		{
			System.out.println(eachLink.getAttribute("href"));
		}
		//to navigate on all the links
		for(WebElement eachLink:links)
		{
		driver.navigate().to("links");
		}
		
		driver.quit();

	}

}
