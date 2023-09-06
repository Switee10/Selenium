package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectOption {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Select sel = new Select(driver.findElement(By.id("cars")));
		sel.selectByIndex(0);
		sel.selectByIndex(1);
		sel.selectByValue("audi");
		Thread.sleep(4000);
		
		List<WebElement> allOptions=sel.getOptions();
		for(WebElement option:allOptions)
		{
			System.out.println(option.getText());
		}
		System.out.println("===============");
		
		for(WebElement selOption:sel.getAllSelectedOptions())
		{
			System.out.println("Selected options===");
			System.out.println(selOption.getText());
		}
		
		sel.deselectAll();
		System.out.println("desselected All options");
		
}
}