package commonLibs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonDriver {

	private WebDriver driver;
	private int elementDetectionTime;
	private String currentWorkingDirectory;
	
	public CommonDriver(String browserType) throws Exception {
		// TODO Auto-generated constructor stub
		elementDetectionTime=30;
		currentWorkingDirectory=System.getProperty("user.dir");
		
		if(browserType.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browserType.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		else
		{
			throw new Exception("Invalid Browser Type"+browserType);
		}
		
		driver.manage().window().maximize();
	}

	public void navigateToUrl(String url)
	{
		driver.get(url);
	}

	
	/*
	 * public WebDriver getDriver() { return driver; }
	 */
	
	/*
	 * public void setElementDetectionTime(int elementDetectionTime) {
	 * this.elementDetectionTime = elementDetectionTime; }
	 */
	
	public WebDriver getDriver() {
		return driver;
	}

	public void setElementDetectionTime(int elementDetectionTime) {
		this.elementDetectionTime = elementDetectionTime;
	}

	public void closeBrowser()
	{
		driver.close();
	}
	
	public void closeAllBrowser()
	{
		driver.quit();
	}
	
	public String getTitleofWebPage()
	{
		return driver.getTitle();
	}

}
