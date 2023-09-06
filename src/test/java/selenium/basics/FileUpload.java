package selenium.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("file-upload")).sendKeys("file:///C:/Users/Administrator/Downloads/java-selenium-at-syllabus.pdf");
		
		Thread.sleep(2000);
		driver.findElement(By.id("file-submit")).click();
		Thread.sleep(2000);
		
		if(driver.getPageSource().contains("File Uploaded!"))
		{
			System.out.println("File Upload Successful");
		}
		else
		{
			System.out.println("File Upload not successful");
		}
	}

}
