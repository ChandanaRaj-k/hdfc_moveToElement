package Test_window;

import org.testng.annotations.Test;

import Generic_library.windowbase_class;
import POm.HDFCWindow_handling;

public class HDFCWindow_test extends windowbase_class{
	
	@Test
	

	public static void HDFC_window() {
		HDFCWindow_handling hdfc=new HDFCWindow_handling();
		
		hdfc.setMoveToLogin();
		
		
	}
}
