package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Generic_Test_Class implements Automation_Constants
{
	public WebDriver driver;
	
	static
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		
	}
	
	
	@BeforeMethod
	public void launchApp()
	{
		driver= new FirefoxDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void closeApp()
	{
		//driver.quit();
	}
	
	
}
