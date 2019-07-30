package scripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.testng.annotations.Test;

import pom.YouTubePage;
import generic.Generic_JavaScptEctr;
import generic.Generic_Test_Class;

public class script extends Generic_Test_Class
{
	@Test
	public void script() throws AWTException, InterruptedException
	{
		YouTubePage y= new YouTubePage(driver);
		
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		
		y.home();
		Thread.sleep(2000);
		System.out.println("************");

		
		Generic_JavaScptEctr g= new Generic_JavaScptEctr(driver);
		g.scrollTo(10,1000);
		
		y.help();
		
//		y.search("diy");
//		
//		Thread.sleep(2000);
//
//		Robot r= new Robot();
//		r.keyPress(KeyEvent.VK_DOWN);
//		r.keyPress(KeyEvent.VK_ENTER);
//		r.keyRelease(KeyEvent.VK_DOWN);
//		r.keyRelease(KeyEvent.VK_ENTER);
//		
//		System.out.println(driver.getTitle());
//		
//		y.frstPost();
//		
//		System.out.println(driver.getTitle());
//		
//		
		
		
	}
	
	
}
