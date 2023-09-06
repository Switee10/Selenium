package selenium.basics;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchEdgeBrowser {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver1=new EdgeDriver();
		driver1.get("https://www.google.com/");
		
		driver1.manage().window().maximize();
		Thread.sleep(3000);
		driver1.quit();

	}

}