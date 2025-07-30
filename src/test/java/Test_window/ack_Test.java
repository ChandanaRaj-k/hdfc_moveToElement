package Test_window;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Generic_library.windowbase_class;
import POm.Ack_class;

public class ack_Test extends windowbase_class {
	
	@Test
	public static void acknowledge() throws InterruptedException
{
		Ack_class ack=new Ack_class();
		
		ack.setLoginName("MGR2619");
		
		ack.setpwd("A");

		ack.setCaptcha();
		
		Thread.sleep(2000);
		
		ack.setSignin();
		
		ack.setProc();
		
		ack.setest();
		
		Thread.sleep(2000);
		
		List<String> Records=ack.getPending();
		
		boolean isPresent=Records.contains("0261925052737852");
		
		System.out.println("record found : " +isPresent);
		
		SoftAssert asr=new SoftAssert();
		
		asr.assertTrue(isPresent);
		
		asr.assertAll();
		
		driver.close();
		
		}
}
