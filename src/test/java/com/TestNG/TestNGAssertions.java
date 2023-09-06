package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertions
{
	WebDriver driver=null;

	@BeforeMethod
	public void LaunchBrowser()
	{
		driver=new ChromeDriver();
	}
	//@Test
	public void TestCase1()
	{
		driver.get("https://www.google.com");
		String expectedres="Google";
		Assert.assertEquals(driver.getTitle(), expectedres);
		driver.findElement(By.name("q")).sendKeys("Assertions in TestNG");
	}
	//@Test
	public void TestCase2()
	{
		driver.get("https://www.google.com");
		String expectedres="Google1";
		Assert.assertNotEquals(driver.getTitle(), expectedres);
		driver.findElement(By.name("q")).sendKeys("Assertions in TestNG");
	}

	//@Test
	public void TestCase3()
	{
		driver.get("https://www.google.com");
		String expectedres="Google";
		Assert.assertTrue(driver.getTitle().equals(expectedres));
		driver.findElement(By.name("q")).sendKeys("Assertions in TestNG");
	}
	
	@Test
	public void TestCase4()
	{
		driver.get("https://www.google.com");
		String expectedres="Google";
		Assert.assertFalse(driver.getTitle().equals(expectedres));
		driver.findElement(By.name("q")).sendKeys("Assertions in TestNG");
	}
	
	
	@AfterMethod
	public void closeBrowser()
	{
		driver.quit();
	}
}
