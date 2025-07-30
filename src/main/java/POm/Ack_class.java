package POm;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_library.windowbase_class;

public class Ack_class extends windowbase_class{
	
	public Ack_class()
	{
		
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//input[@id='txtLoginName']")
	private WebElement login_text;
	public void setLoginName(String LoginName)
	{
		login_text.sendKeys(LoginName);
	}

	@FindBy(xpath="//input[@id='txtpassword']")
	private WebElement pwd_text;
	public void setpwd(String pwdName)
	{
		pwd_text.sendKeys(pwdName);
	}
	
	@FindBy(xpath="//input[@id='cpatchaTextBox']")
	private WebElement cpatcha_text;
	public void setCaptcha()
	{
		cpatcha_text.click();
	}
	
	@FindBy(xpath="//button[contains(.,'Sign in')]")
	private WebElement signin_click;
	public void setSignin()
	{
		signin_click.click();
	}
	
	@FindBy(xpath="//span[contains(.,'Procurement')]")
	private WebElement Pro_click;
	public void setProc() {
		Pro_click.click();
	}
	@FindBy(xpath="(//span[contains(.,'Estimation')])[1]")
	private WebElement est_click;
	public void setest() {
		est_click.click();
	}
	
	@FindBy(xpath="//table[@id='GrdEstimationView']//td[1]")// here we get multiple values in one row 
	private List<WebElement> pending_texts; //so we are storing multiple values in List<webElement> 
	public List<String> getPending()// now we are converting List<WebElement> to List<string>
	{
		List<String> pending=new ArrayList<>(); // Since list is an interface we cant create obj for that so we are storing the list<string> in ArrayList() and creating obj for arrayList class
		                                        
		for(WebElement pending_text:pending_texts) //in for each loop, we are taking list of WebElements and iterating to each of the webElement. 
		{
			pending.add(pending_text.getText()); // the list of String we got now we are adding one by one to pending ref variable and to get gettext();
		}
		
		return pending;// we are returning the list of strings. 
	}
}
