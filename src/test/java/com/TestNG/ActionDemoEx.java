package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionDemoEx 
{
	@Test
	
	public void ActionEx()
	{
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://demoqa.com/buttons");
	driver.manage().window().maximize();
	
	Actions action = new Actions(driver);
	
	WebElement dbClick= driver.findElement(By.id("doubleClickBtn"));
	action.doubleClick(dbClick).build().perform();
	
	WebElement rghtClick=driver.findElement(By.id("rightClickBtn"));
	action.contextClick(rghtClick).build().perform();
	
	
	
	WebElement cl= driver.findElement(By.xpath("//button[text()='Click Me']"));
	action.click(cl).build().perform();
	
	

}

}


