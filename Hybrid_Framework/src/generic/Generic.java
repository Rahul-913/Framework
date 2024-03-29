package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic 
{
	public WebDriver driver;
	@BeforeMethod
	public void openAppn()
	{
		System.out.println("Execution starts from here");
		System.setProperty("webdriver.chrome.driver","./sw/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
	
	}
	@AfterMethod
	public void closeAppn()
	{
		System.out.println("The testcase execution is completed");
		
		driver.close();
	}
}
