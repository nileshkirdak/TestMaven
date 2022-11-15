package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Action_class {
 
	WebDriver driver;
	String path= "";
	String actual_path="";
@BeforeMethod	
public void setup() {
		
		path= System.getProperty("user.dir");
		actual_path=path+"\\chrome_driver\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", actual_path);
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
   }
@Test
public void test_action() throws InterruptedException {
	
	driver.get("https://demoqa.com/buttons");
	WebElement single_click =driver.findElement(By.xpath("//button[starts-with(text(),'Click Me')]"));
	
	Actions a =new Actions(driver);
	Thread.sleep(3000);
	Action act =a.moveToElement(single_click).click().build();
	act.perform();
	WebElement right_click = driver.findElement(By.id("rightClickBtn"));
	
	Thread.sleep(3000);
	a.moveToElement(right_click).contextClick().build().perform();
	
	WebElement double_click =driver.findElement(By.id("doubleClickBtn"));
	
	Thread.sleep(3000);
	a.moveToElement(double_click).doubleClick().build().perform();
	
}
@Test
public void test_drag_drop() throws InterruptedException {
	
	driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
	Actions a1 =new Actions(driver); 
	
	
	WebElement drag_bank= driver.findElement(By.id("credit2"));
	WebElement drop_bank= driver.findElement(By.id("bank"));
	Thread.sleep(3000);
	a1.dragAndDrop(drag_bank, drop_bank).build().perform();
	
	
	
	WebElement drag_amount=driver.findElement(By.id("fourth"));
	WebElement drop_amount=driver.findElement(By.id("amt7"));
	Thread.sleep(3000);	
	a1.dragAndDrop(drag_amount, drop_amount).build().perform();
	
	
	
	WebElement drag_sales =driver.findElement(By.id("credit1"));
	WebElement drop_sales= driver.findElement(By.id("loan"));
	Thread.sleep(3000);
	a1.dragAndDrop(drag_sales, drop_sales).build().perform();
	
	
	
	
	WebElement drog_credit_amount =driver.findElement(By.id("fourth"));
	WebElement drop_credit_amount =driver.findElement(By.id("amt8"));
	Thread.sleep(3000);
	a1.dragAndDrop(drog_credit_amount, drop_credit_amount).build().perform();
	

}

}
