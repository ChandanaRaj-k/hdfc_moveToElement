package Generic_library;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class windowbase_class {
	
	public static WebDriver driver;
	
   @BeforeTest 
	public void LaunchBrowser() throws InterruptedException {
	   
	  // ChromeOptions ch=new ChromeOptions();
	   
	   //ch.add
		
		driver = new ChromeDriver();
	
		driver.manage().window().maximize();
		
		//driver.get("http://192.168.4.17:1301/");
		
		//driver.get("https://www.hdfcbank.com/");
		
		driver.get("http://192.168.6.64:501/");
		
		Thread.sleep(3000);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

	}
   
   @AfterTest
   public static void close() {
	  driver.quit();
   }
   
}
