package TestUtilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import WebUtilities.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {
	//sai
	static WebDriver driver;
	public static void main(String[] args) 
	{
		//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
//	System.out.println("driver="+driver);
	
//	ChromeOptions options=new ChromeOptions();
//	options.setHeadless(true);
//	driver=new ChromeDriver(options);
	
	driver=new ChromeDriver();
	
	
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	LoginPage lpage=new LoginPage(driver);
	
	
	lpage.enterUserName("admin");
	lpage.enterPassword("Admin123");
	lpage.clickRegistrationDesk();
	lpage.clickLoginBtn();
	System.out.println("ends");
	
	}
}
