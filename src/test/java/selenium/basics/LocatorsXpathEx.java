package selenium.basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsXpathEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Learning XPath");
	driver.findElement(By.id("userId")).sendKeys("Sweety");
	driver.findElement(By.xpath("//a[contains(text(),'Imag')]")).click();
	
	/*
	 * Different xpath for User Id:
	 * //input[@id='userId']
	 * //input[@name='email']
	 * //input[@title='Email']
	 * //input[@type='email']
	 * 
	 * 
	 * Different Xpath for password:
	 * //input[@title='Password']
	 * //input[@name='Password']
	 * //input[@type='password']
	 * 
	 * Different XPath for company:
	 * (//input[@name='company'])[1]
	 * (//input[@placeholder='Enter your company'])[1]
	 * 
	 * Different Xpath fOR mOBILENUMBER
	 * (//input[contains(@placeholder,'mobile number')])[1]
	 * (//input[contains(@name,'mobile number')])[1]
	 * 
	 * Different Xpath for Submit:
	 * //input[@value='Submit']
	 * //input[@type='submit']
	 */
	/*	driver.findElement(By.xpath("//input[@id='userId']")).sendKeys("sadhanasuba24@gmail.com");

	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("sadhu123");

	driver.findElement(By.xpath("//input[@name='company']")).sendKeys("guvi");

	driver.findElement(By.xpath("//input[@name='mobile number']")).sendKeys("9874562130");

	driver.findElement(By.xpath("//input[@value='Submit']")).click();

	 */

	//driver.findElement(By.xpath("//input[contains(@title,'Email')]")).sendKeys("sadhanasuba24@gmail.com");
	//driver.findElement(By.xpath("//input[contains(@title,'Password')]")).sendKeys("sadhu123");
	//driver.findElement(By.xpath("//input[contains(@name,'company')]")).sendKeys("guvi");
	//driver.findElement(By.xpath("//input[contains(@name,'mobile number')]")).sendKeys("9874562130");
	//driver.findElement(By.xpath("//input[contains(@name,'Submit')]")).click();


}

}


	
	
