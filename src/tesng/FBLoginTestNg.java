package tesng;



import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
@Test
public class FBLoginTestNg {
	WebDriver driver;

	@BeforeClass
	public void beforeClass() {
		
		System.setProperty("webdriver.chroem.driver","G:\\GreensTechSeleniumBalaji\\Testng_Java\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		

	}
	@AfterClass
	public void afterClass() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
		
		

	}
	@BeforeMethod
	public void beforeMethod() {
		
     Date start=new Date();
     System.out.println("Start time" +start);
	}
	@AfterMethod
	public void afterMethod() {
	     Date end=new Date();
	     System.out.println("Start time" +end);
	}
	@Parameters({"Name","Password"})
	
	public void testLogics( String userName,String password) {
		//WebElement txtUserName=driver.findElement(By.id("email"));
		//txtUserName.sendKeys(userName);
		//WebElement txtUsePwd=driver.findElement(By.id("pass"));
		//txtUserName.sendKeys(password);	
		System.out.println(userName);

	}
public void testLogics2() {
		
driver.findElement(By.xpath("//input[@value='Log In']")).click();
		
	}
}

