package selenium.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAssign {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/frames");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement fra= driver.findElement(By.id("frame1"));
		
		driver.switchTo().frame("fra");
		//WebElement head1=driver.findElement(By.tagName("body"));
		
		
		fra.sendKeys("Now in");
		driver.findElement(By.id("sampleHeading")).clear();
		//driver.findElement(By.id("sampleHeading")).sendKeys("I am in frame");
		
		//System.out.println(driver.findElement(By.tagName("h1")).getText());

	}

}
