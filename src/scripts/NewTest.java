package scripts;


import generic.Excel;
import generic.Generic_Test_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest  {
	
	public  WebDriver driver;
	
	@DataProvider(name="authenticate")
	public static Object[][] grtData()
	{
		
		return ExcelR();
	}
	
	static Object[][] ExcelR()
	{
		Object data[][] = null;
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<2; j++)
			{
				data[i][j]= Excel.readFrmExcel("Macro1", i, j);
				if(data[i][j].equals(null))
				{
					data[i][j] = " ";
				}
			}
		}
		return data;
		
	}
	
	
	
	@BeforeMethod
	public void openapp()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		driver= new FirefoxDriver();
		driver.get("http://localhost/login.do;jsessionid=6jh7kd1ouki4u");
		driver.manage().window().maximize();
	}
	
  @Test(dataProvider="authenticate")
  public void f(String u, String p) {
	  
	  driver.findElement(By.id("username")).sendKeys(u);
	  driver.findElement(By.name("pwd")).sendKeys(p);
	  driver.findElement(By.xpath("//div[.='Login ']")).click();
	  
	  String title=driver.getTitle();
	 Assert.assertEquals(title, "actiTIME - Enter Time-Track");
	
	  Reporter.log("valid username n password", true);
	  
  }
  
  @AfterMethod
  public void close()
  {
	  driver.quit();
  }
}
