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
	
	Set<String> windowIDs=driver.getWindowHandles();//driver.getWindowHandles();= this will return set of string where each string is unique identifier. set<String>=to store window 
	//handles in a set because each handle will be unique identifier. 
	
	int sizeofwindows=windowIDs.size(); //using size() method we are taking the count of tabs opened and storing it in sizeofwindows variable with int as return type. 

	for(String windowId : windowIDs) // windowIDs is containing all the window handles opened by Selenium webDriver. 
		//windowID is temporary variable that holds each individual window handle during iteration. 
	{
		
		
		String pageName= wh.getPageHead(); //here we are storing getPageHead() pageName variable with String as return type. 
		
		System.out.println("name of the page " +pageName);//printing the name of the page. 
		
		if(pageName.startsWith("Commissioning of DTC")) //if page starts with commisioning statement will break and switches to windowID. 
		{
			
			break;
			
		}
		
		driver.switchTo().window(windowId);
		
	}
	
	String pageName= wh.getPageHead(); //again here we are getting the page head after for loop is closed. 
	
	System.out.println("name of the page " +pageName);
	
	wh.setInternalCode("123"); 
	
	Thread.sleep(2000);
	
    driver.switchTo().newWindow(WindowType.TAB); //opening new website
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
