package MayMavenProject.TestMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;

public class Setup {


	WebDriver driver;
	String path="";
	String actual_path="";
	String file_path="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Setup p4=new Setup();
		p4.all_webdriver_setup();
	}

	public void all_webdriver_setup()
	{
		//setProperty with manual webdriver path
		//path=System.getProperty("user.dir");		
		//actual_path=path+"\\chrome_driver\\chromedriver.exe";
		//System.setProperty("webdriver.chrome.driver",actual_path);
		//driver=new ChromeDriver();
		
		//WebDriverManager.chromedriver().setup();
		//driver=new ChromeDriver();
		
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver=new EdgeDriver();
		
		WebDriverManager.firefoxdriver().setup();
		driver=new FirefoxDriver();
		
		
		
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/");
	
	}
}
