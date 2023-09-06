package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter
{
	WebDriver driver=null;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	@Test
	@Parameters({"url","searchTerm"})
	public void dataParameterizationusingParameter(String urlName,String searchvalue) throws InterruptedException
	{
		driver.get(urlName);
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(searchvalue);
	}

}
