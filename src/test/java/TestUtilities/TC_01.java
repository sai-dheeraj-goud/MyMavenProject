package TestUtilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import WebUtilities.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_01 {
	//dheeraj david

	static WebDriver driver;
	@Test
	public static void TC01() 
	{
		WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\Drivers\\chromedriver.exe");
		System.out.println("driver="+driver);

		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--incognito");
		
		driver=new ChromeDriver(options);

//		options.setHeadless(true);
		

		//	driver=new ChromeDriver();

		//Assert.assertEquals("ram", "sita");
		driver.get("https://demo.openmrs.org/openmrs/login.htm");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		LoginPage lpage=new LoginPage(driver);


		lpage.enterUserName("admin");
		lpage.enterPassword("Admin123");
		lpage.clickRegistrationDesk();
		lpage.clickLoginBtn();
		System.out.println("ends");

	}
}
