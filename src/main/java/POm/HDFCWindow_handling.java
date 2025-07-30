package POm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_library.windowbase_class;

public class HDFCWindow_handling extends windowbase_class{

	public HDFCWindow_handling() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="(//button[contains(.,'Login')])[1]")
	private WebElement login_move;
	public WebElement setMoveToLogin()
	{
		Actions act=new Actions(driver);
		act.moveToElement(login_move).perform();
		return login_move;
		
	}
	
	@FindBy(xpath="//div[@class='login_dropdown']//div//div//div//a[text()='NetBanking']")
	private WebElement netBanking_click;
	public String setNetBankingClick()
	{
		return netBanking_click.getText();
		
	}

	 
}
