package commonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementControl {

	WebDriver driver;
	public ElementControl(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	public void clickElement(WebElement element)
	{
		element.click();
	}
	
	public void clear(WebElement element)
	{
		element.clear();
	}

	public void sendText(WebElement element,String text)
	{
		element.sendKeys(text);
	}
	
	public boolean isEnabled(WebElement element)
	{
		return element.isEnabled();
	}
	
	public void acceptAlert()
	{
		driver.switchTo().alert().accept();
	}
	
	public String getTextFromAlert()
	{
		return driver.switchTo().alert().getText();
	}
	

}
