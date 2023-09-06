package selenium.basics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_Dropdown {

	
		static WebDriver driver;

		public static void main(String[] args) throws InterruptedException {
			// TODO Auto-generated method stub
			driver=new ChromeDriver();
			
			driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();
			
			Select sel = new Select(driver.findElement(By.id("oldSelectMenu")));
			
			//selectByIndex (index starts from 0)
			//selectByValue
			//selectByVisibleText
			
			sel.selectByIndex(3); //Yellow
			Thread.sleep(2000);
			
			sel.selectByValue("9");//Magneta
			Thread.sleep(2000);
			
			sel.selectByVisibleText("Black"); //Black
			Thread.sleep(2000);
			
			//getOptions() will return all the webelements as a list under that Select tag
			List<WebElement> allOptions= sel.getOptions();
			
			//To get all options
			for(WebElement option:allOptions)
			{
				System.out.println(option.getText());
			}
			
			
			//to get only selected options
			for(WebElement selectedOption: sel.getAllSelectedOptions())
			{
				System.out.println(selectedOption.getText());
			}
			
		
			
	}

}
