package generic;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class Generic_robot 
{
	//Robot r= new Robot();
	
	public void enterR() throws AWTException
	{
		Robot r= new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	

}
