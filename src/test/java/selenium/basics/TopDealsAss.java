package selenium.basics;
import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TopDealsAss {
	static WebDriver driver;
	public static void main(String[] args) 
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[contains(text(),'Top Deals')]")).click();
		//driver.getWindowHandles();
		
		List<WebElement> list1=driver.findElements(By.xpath("//*[@class='table table-bordered']/tbody/tr/td[3]"));
		for(WebElement display:list1)
		{
			System.out.println(display.getText());
		}
		
	}

}
