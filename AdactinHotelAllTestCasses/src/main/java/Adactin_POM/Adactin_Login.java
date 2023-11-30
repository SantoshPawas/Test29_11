package Adactin_POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adactin_Login 
{
	
	 @FindBy(xpath="//input[@id='username']")	private WebElement UN;	
	

	 @FindBy(id="password")	private WebElement PSW;	
	 

	 @FindBy(xpath="//input[@name='login']") private WebElement Loginbtn;  
	

		 public Adactin_Login(WebDriver driver)  //13 methods
	     {
			PageFactory.initElements(driver,this);
	     }

	 //3. Utilize within a method with access level public
		
		 public void enterUsername(String User)  //Velocity
		 {
			UN.sendKeys(User); //Velocity
		 }
		
		 public void enterPassword(String Pass)  //U1YP1G  
		 {
			PSW.sendKeys(Pass); //C4472J
		 }
		
		 public void clickloginbutton() 
		 {
			Loginbtn.click();
		 }

}
