package Adactin_Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.junit.AfterClass;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Adactin_Library.BaseClass;
import Adactin_Library.UtilityClass;
import Adactin_POM.Adactin_Home;
import Adactin_POM.Adactin_Login;

public class AdactinTest extends BaseClass
{
	Adactin_Login login;
	Adactin_Home home;
	String TestCaseId="101";
	
	@BeforeClass
	public void openBrowser()
	{
		initializeBrowser();
		login=new Adactin_Login(driver);
		home=new Adactin_Home(driver);
		
		driver.manage().window().maximize();
	}
	
	@BeforeMethod
	public void loginToApp() throws EncryptedDocumentException, IOException
	{
		
		login.enterUsername(UtilityClass.getdatafrompropfile("Username"));
		login.enterPassword(UtilityClass.getdatafrompropfile("Password"));
		
		login.clickloginbutton();
	}
	
	@Test(priority=1,enabled=false)
	public void verifyuser() throws EncryptedDocumentException, IOException
	{
		String ActualUname=home.getUsername();
		String expectedUname=UtilityClass.getdatafromExcel(0, 0);
				
		Assert.assertEquals(ActualUname, expectedUname);
		
	}
	@Test(priority=2,enabled=false)
	public void verifyTitle() throws EncryptedDocumentException, IOException 
	{
		String ActualTiltle=driver.getTitle();
		String ExpTitle=UtilityClass.getdatafromExcel(1, 0);
		Assert.assertEquals(ActualTiltle, ExpTitle);
		
	}
	
	
	@Test(priority=3)
	public void BookHotel() throws EncryptedDocumentException, IOException, InterruptedException
	{
		
		home.selectLocation(UtilityClass.getdatafromExcel(2, 0));
		home.selectHotels(UtilityClass.getdatafromExcel(3, 0));
		home.selectRoomType(UtilityClass.getdatafromExcel(4, 0));
		home.selectNumberofRoom(UtilityClass.getdatafromExcel(5, 0));
		
		home.enterCheckinDate(UtilityClass.getdatafromExcel(6, 0));
		
		home.entercheckoutdate(UtilityClass.getdatafromExcel(7, 0));
		home.selectAdultperroom(UtilityClass.getdatafromExcel(8, 0));
		home.selectCheldrenperroom(UtilityClass.getdatafromExcel(9, 0));
		Thread.sleep(2000);
		home.clickSearchHotel();
		
		
		Thread.sleep(1000);
		home.selectRadioButton();
		Thread.sleep(1000);
		home.clickContinueBtn();
		
		
		
		home.enterFirstName(UtilityClass.getdatafromExcel(0, 1));
		home.enterLastName(UtilityClass.getdatafromExcel(1, 1));
		home.enterBillingAddress(UtilityClass.getdatafromExcel(2, 1));
		home.enterCreditcardNo(UtilityClass.getdatafromExcel(3, 1));
		home.selectCreditcardType(UtilityClass.getdatafromExcel(4, 1));
		
		home.selectExpiremonth(UtilityClass.getdatafromExcel(5, 1));
		home.selectExpiryYear(UtilityClass.getdatafromExcel(6, 1));
		home.enterCVVno(UtilityClass.getdatafromExcel(7, 1));
		
		home.clickBooknowBtn();
		
		
	}
	
	@AfterMethod(enabled=false)
	public void logoutFromApp(ITestResult Result) throws IOException
	{
		if(Result.getStatus()==ITestResult.FAILURE)
		{
			UtilityClass.getScreenShot(TestCaseId, driver);
			
		}
		home.clicklogoutbutton();
		
		home.clickLoginAgainBtn();
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		driver.quit();
	}


}
