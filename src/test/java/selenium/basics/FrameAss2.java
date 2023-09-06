package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameAss2 {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.navigate().to("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement fr= driver.findElement(By.id("frame1"));
		driver.switchTo().frame(fr);
		WebElement head1=driver.findElement(By.tagName("body"));
		
		String text=head1.getText();
		System.out.println(text);
		
		//switch to child frame
		driver.switchTo().frame(0);
		WebElement head2=driver.findElement(By.tagName("body"));
		System.out.println(head2.getText());
		
		
		
	
	
	
	
	}

}
