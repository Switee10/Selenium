package selenium.basics;

import org.openqa.selenium.By;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddToCartAss {
	static WebDriver driver;
	static int sum=0;
	public static void main(String[] args) throws InterruptedException {
		driver=new ChromeDriver();
		driver.navigate().to("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().window().maximize();

		WebElement add=driver.findElement(By.xpath("//input[@class='search-keyword']"));
		add.sendKeys("ber");
		add.click();
		Thread.sleep(1000);

		List<WebElement> list = driver.findElements(By.className("product"));

		/*
		List<WebElement> veggies= driver.findElements(By.xpath("//button[text()='ADD TO CART']"));

		for(WebElement veggie:veggies)
		{
			veggie.click();
		}
		 */

		//add to cart the products
		for(int i=1;i<list.size();i++)
		{

			list.get(i).findElement(By.xpath("//button[text() ='ADD TO CART']")).click();
			//Thread.sleep(1000);
		}
		//click the icon 

		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();


		//promocode -explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		WebElement promoCodeElement = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoCode")));

		List<WebElement> totalAmount= driver.findElements(By.xpath("//tbody/tr/td[5]"));

		for(WebElement amount:totalAmount)
		{
			System.out.println(amount.getText());
			int price= Integer.parseInt(amount.getText());
			sum=sum+price;
		}
		System.out.println("Sum after adding:"+sum);


		WebElement totalPriceFromPortal=driver.findElement(By.xpath("//span[@class='totAmt']"));
		int totalPrice=Integer.parseInt(totalPriceFromPortal.getText());
		System.out.println("Total sum from webpage:"+totalPrice);

		if(sum==totalPrice)
		{
			System.out.println("Both the sums are same");
		}
		else
		{
			System.out.println("Both the sums are not same");
		}
	}

}
