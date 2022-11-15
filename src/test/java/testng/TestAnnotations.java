package testng;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestAnnotations {

	WebDriver driver;
	@BeforeMethod
    public void setup() {
		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver =new FirefoxDriver();
		
		  WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");

		
	  }
	
	@Test
  public void login_functionality()  {
		
	driver.findElement(By.id("email")).sendKeys("nilesh@gmail.com");;
	
	

	driver.findElement(By.id("pass")).sendKeys("123456");
	
	
  }
  
  @AfterMethod
  public void close_driver() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  driver.close();
	  
  }

  
}
