package com.TestNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParameterizationUsingDataProvider 
{
	WebDriver driver=null;
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
		//@Test(dataProvider="testdata")
		@Test(dataProvider="dataSet")
		public void fetchData(String url, String searchTerm) throws InterruptedException
		{
			driver.get(url);
			driver.findElement(By.name("q")).sendKeys(searchTerm);
			Thread.sleep(2000);
		}
		
		//@DataProvider(name="testdata")
		@DataProvider
		public Object[][] dataSet()
		{
			/*One way of declaring the Object[][] with size
			Object[][] data = new Object[3][2];
			
			return data;
			
			*/
			
			Object[][] data =new Object[][] {
				{"https://www.google.com","Guvi"},
				{"https://www.google.com","Data Provider"},
				{"https://www.google.com","Parameter annotation"}
				
			};
			

			/*
			return new Object[][] {
				{"https://www.google.com","Guvi"},
				{"https://www.google.com","Data Provider"},
				{"https://www.google.com","Parameter annotation"}
				
			};
			*/
			return data;
		}@AfterMethod
		public void closeBrowsers()
		{
			driver.quit();
		}

	}

