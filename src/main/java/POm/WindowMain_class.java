package POm;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generic_library.windowbase_class;

public class WindowMain_class extends windowbase_class{
	

	public WindowMain_class() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='txtUsername']")
	private WebElement login_text;
	
	@FindBy(xpath="//input[@id='txtPassword']")
	private WebElement pwd_text;
	
	@FindBy(xpath="//input[@id='cmdLogin']")
	private WebElement loginBtn_click;
	
	@FindBy(xpath="//span[contains(.,'Failure / Enhance')]")
	private WebElement failure_click;
	
	@FindBy(xpath="//a[contains(.,'Failure Entry')]")
	private WebElement failureEntry_click;
	
	@FindBy(xpath="(//tr//td[6]//center//a[contains(.,'Declare Failure')])[1]")
	private WebElement declareFailure_click;
	
	@FindBy(xpath="//a[contains(.,'View DTC Details')]")
	private WebElement viewDtc_click;
	
	@FindBy(xpath="//h3[@class='page-title']")
	private WebElement commissionHeadPage;
	
	@FindBy(xpath="//input[@id='ContentPlaceHolder1_txtInternalCode']")
	private WebElement internalcode_text;
	
	public void setloginName(String login)
	{
		login_text.sendKeys(login);
	}
	
	public void setPWd(String pwd)
	{
		pwd_text.sendKeys(pwd);
	}
	
	public void click()
	{
		loginBtn_click.click();
	}
	
	public void clickFailure()
	{
		failure_click.click();
	}
	
	public void clickFailureEntry()
	{
		failureEntry_click.click();
	}
	
	public void clickDeclareFailure()
	{
		declareFailure_click.click();
	}
	
	public void clickViewDTRDetails()
	{
		viewDtc_click.click();
	}

	public String getPageHead()
	{
		return commissionHeadPage.getText();
	}
	
	public void setInternalCode(String InternalCode)
	{
		internalcode_text.sendKeys(InternalCode);
	}
	
}
