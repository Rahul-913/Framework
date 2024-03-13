package pom_Script;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM 
{
	@FindBy(name="email")
	private WebElement usn;
	
	@FindBy(name="pass")
	private WebElement psw;
	
	@FindBy(name="login")
	private WebElement btn;
	
	public POM(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void entrusn(String us)
	{
		usn.sendKeys(us);
	}
	
	public void entrpsw(String ps)
	{
		psw.sendKeys(ps);
	}
	
	public void clkbtn()
	{
		btn.click();
	}
	
	 
}
