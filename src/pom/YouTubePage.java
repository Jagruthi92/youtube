package pom;

import generic.Generic_ActionsClass;
import generic.Generic_BasePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YouTubePage extends Generic_BasePage
{
	@FindBy(xpath="//div[@id='search-input']")
	private WebElement search;
	
	@FindBy(xpath="//ytd-section-list-renderer[@class='style-scope ytd-two-column-search-results-renderer']/div[2]/ytd-item-section-renderer/div[2]/ytd-search-pyv-renderer/div//ytd-thumbnail")
	private WebElement frstPost;
	
	@FindBy(xpath="(//a[@title='Home'])[2]")
	private WebElement home;
	
	@FindBy(xpath="//span[.='Help']")
	private WebElement help;
	
	
	public YouTubePage(WebDriver driver)
	{
		super(driver);
	}
	
	
	public void search(String s)
	{
		search.sendKeys(s);
	}
	
	public void frstPost()
	{
		frstPost.click();
	}
	
	public void home()
	{
		home.click();
	}
	
	public void help()
	{
		help.click();
	}

}
