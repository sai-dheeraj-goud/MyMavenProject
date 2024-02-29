package WebUtilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public static WebDriver driver;
	
	@FindBy(name="username")
	public WebElement userNameTxtbox;
	
	@FindBy(name="password")
	public WebElement pwdTxtbox;
	
	@FindBy(id="Registration Desk")
	public WebElement Registration_Desk_Option;
	
	@FindBy(id="loginButton")
	public WebElement login_Btn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	
	public void enterUserName(String user)
	{                             // admin
		System.out.println("Enter user="+user);
		userNameTxtbox.sendKeys(user);
	}
	
	public void enterPassword(String pwd)
	{
		System.out.println("Enter pwd="+pwd);
		pwdTxtbox.sendKeys(pwd);
	}
	
	public void clickRegistrationDesk()
	{
		
		Registration_Desk_Option.click();
	}
	public void clickLoginBtn()
	{
		System.out.println("Click Login button");
		login_Btn.click();
	}
	
}
