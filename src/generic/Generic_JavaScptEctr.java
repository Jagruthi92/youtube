package generic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Generic_JavaScptEctr 
{
	
		JavascriptExecutor js;
		
		public Generic_JavaScptEctr(WebDriver driver)
		{
			js=(JavascriptExecutor)driver;
		}
		
		
		public void dsbldElmt( String id, String val)
		{
			js.executeScript("document.getElementByTd("+id+").value="+val);
		}
		
		
		public void clrData( String id)
		{
			js.executeScript("document.getElementByTd("+id+").value=' '");
		}
		
		
		public void scrollTo(int x, int y)
		{
			js.executeScript("window.scrollBy("+x+","+y+")");
		}
		
}
