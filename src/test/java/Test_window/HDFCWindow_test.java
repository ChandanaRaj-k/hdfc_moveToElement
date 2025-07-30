package Test_window;

import java.util.Set;

import org.testng.annotations.Test;

import Generic_library.windowbase_class;
import POm.HDFCWindow_handling;

public class HDFCWindow_test extends windowbase_class{
	
	@Test

	

	public static void HDFC_window() throws InterruptedException {
		HDFCWindow_handling hdfc=new HDFCWindow_handling();
		
		Thread.sleep(3000);
		
		hdfc.setMoveToLogin();
		
		Thread.sleep(2000);
		
		Set<String> windowIDs=driver.getWindowHandles();
		
		int sizeOfWindows=windowIDs.size();
		
		for(String windowId : windowIDs)
		{
		String pageName=hdfc.setNetBankingClick();
		
		Thread.sleep(3000);
		
		System.out.println("name of the page " +pageName);
		
		if(pageName.startsWith("Welcome")) //if page starts with commisioning statement will break and switches to windowID. 
		{
			
			break;
			
		}
		
		Thread.sleep(3000);
		
		driver.switchTo().window(windowId);
		}
		
		String pageName= hdfc.setNetBankingClick(); //again here we are getting the page head after for loop is closed. 
		
		System.out.println("name of the page " +pageName);
		
		Thread.sleep(3000);
		
		 windowIDs=driver.getWindowHandles(); 
		    
		 sizeOfWindows=windowIDs.size();//NOT taken int datatype we are re-initializing the variable after adding the tab. for override the windowIds. 
		    
		    System.out.println("Number of tabs opened in the chromeDriver " + sizeOfWindows);
		
		
		
	}
}
