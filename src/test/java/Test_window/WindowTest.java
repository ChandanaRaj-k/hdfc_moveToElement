package Test_window;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import Generic_library.windowbase_class;
import POm.WindowMain_class;

public class WindowTest extends windowbase_class{
	
@Test
public static void WindowHandling() throws InterruptedException {
		
	WindowMain_class wh=new WindowMain_class();
	
	wh.setloginName("NSUNILKUMAR");
	
	wh.setPWd("Idea@123");
	
	wh.click();
	
	wh.clickFailure();
	
	wh.clickFailureEntry();
	
	Thread.sleep(3000);
	
	wh.clickDeclareFailure();
	
	Thread.sleep(3000);
	
	wh.clickViewDTRDetails();
	
	Thread.sleep(3000);
	
	Set<String> windowIDs=driver.getWindowHandles();
	
	int sizeofwindows=windowIDs.size();

	for(String windowId : windowIDs) {
		
		
		String pageName= wh.getPageHead();
		
		System.out.println("name of the page " +pageName);
		
		if(pageName.startsWith("Commissioning of DTC")) {
			
			break;
			
		}
		
		driver.switchTo().window(windowId);
		
	}
	
	String pageName= wh.getPageHead();
	
	System.out.println("name of the page " +pageName);
	
	wh.setInternalCode("123");
	
	Thread.sleep(2000);
	
    driver.switchTo().newWindow(WindowType.TAB);
    driver.get("http://192.168.6.64:501/");
    
    Thread.sleep(2000);
    
    windowIDs=driver.getWindowHandles();
    
    sizeofwindows=windowIDs.size();//NOT taken int datatype we are re-initializing the variable after adding the tab. for override the windowIds. 
    
    System.out.println("Number of tabs opened in the chromeDriver " + sizeofwindows);
    
    driver.findElement(By.xpath("//input[@id='txtLoginName']")).sendKeys("MGR2619");
    
	
	/*ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());

    // Switch to child tab (usually the second one)
    driver.switchTo().window(tabs.get(1));

    // Perform actions in child tab
    System.out.println("Child Tab Title: " + driver.getTitle());*/
	
	

//    // Switch back to parent tab
//    driver.switchTo().window(tabs.get(0));
//    System.out.println("Parent Tab Title: " + driver.getTitle());

	
	}
	
}
