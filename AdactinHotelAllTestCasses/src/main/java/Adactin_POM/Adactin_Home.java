package Adactin_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Adactin_Library.UtilityClass;

public class Adactin_Home 
{
	
		@FindBy(xpath="//input[@name='username_show']") private WebElement UserShow; 
		@FindBy(xpath="//a[text()='Logout']") private WebElement LogoutBtn;
		
		
		@FindBy(xpath="//a[text()='Click here to login again']") private WebElement Loginagain;

		
		@FindBy(xpath="//select[@id='location']") private WebElement Location;
		@FindBy(xpath="//select[@id='hotels']") private WebElement Hotels;
		@FindBy(xpath="//select[@id='room_type']") private WebElement RoomType;
		@FindBy(xpath="//select[@id='room_nos']") private WebElement NumberofRooms;
		@FindBy(xpath="//input[@id='datepick_in']") private WebElement CheckInDate;
		@FindBy(xpath="//input[@id='datepick_out']") private WebElement CheckOutDate;
		@FindBy(xpath="//select[@id='adult_room']") private WebElement AdultsperRoom;
		@FindBy(xpath="//select[@id='child_room']") private WebElement ChildrenperRoom;
		@FindBy(xpath="//input[@id='Submit']") private WebElement Searchbtn;
		@FindBy(xpath="//input[@id='radiobutton_0']") private WebElement Radiobtn;
		@FindBy(xpath="//input[@id='continue']") private WebElement ContinueBtn;
		@FindBy(xpath="//*[@id='first_name']") private WebElement FN;
		@FindBy(xpath="//*[@id='last_name']") private WebElement LN;
		@FindBy(xpath="//*[@id='address']") private WebElement BillingAddress;
		@FindBy(xpath="//*[@id='cc_num']") private WebElement CCN;
		@FindBy(xpath="//*[@id='cc_type']") private WebElement CCT;
		@FindBy(xpath="//*[@id='cc_exp_month']") private WebElement EDMonth;
		@FindBy(xpath="//*[@id='cc_exp_year']") private WebElement EDYear;
		@FindBy(xpath="//*[@id='cc_cvv']") private WebElement CVV;
		@FindBy(xpath="//*[@id='book_now']") private WebElement BookNowBtn;
		
		
		
		@FindBy(xpath="//input[@id='radiobutton_0']") private WebElement Radiobtn1;
		
		@FindBy(xpath="//input[@id='continue']") private WebElement ContinueBtn1;
		
		
		
		
		@FindBy(xpath="//*[@id='first_name']") private WebElement FN1;
		@FindBy(xpath="//*[@id='last_name']") private WebElement LN1;
		@FindBy(xpath="//*[@id='address']") private WebElement BillingAddress1;
		@FindBy(xpath="//*[@id='cc_num']") private WebElement CCN1;
		@FindBy(xpath="//*[@id='cc_type']") private WebElement CCT1;
		@FindBy(xpath="//*[@id='cc_exp_month']") private WebElement EDMonth1;
		@FindBy(xpath="//*[@id='cc_exp_year']") private WebElement EDYear1;
		@FindBy(xpath="//*[@id='cc_cvv']") private WebElement CVV1;
		@FindBy(xpath="//*[@id='book_now']") private WebElement BookNowBtn1;


	
		public Adactin_Home(WebDriver driver)   //Information
		{
			PageFactory.initElements(driver,this);
		}
		
	
		 public String getUsername()   
		 {
			String S1=UserShow.getAttribute("value");  //Hello Velocity!
			
			String[]  A1=S1.split(" ");  //Hello[0]           Velocity![1]
			
			     String Z1=A1[0];  //Hello[0]  
			
			String  ActualUN= A1[1]; //Velocity![1]
			
				return ActualUN;  //Velocity!
			
		 }
		
		 public void clicklogoutbutton() 
		 {
			LogoutBtn.click();
		 }
		 
		 public void clickLoginAgainBtn()
		 {
			 Loginagain.click();
		 }
		 
		 public void selectLocation(String location)
		 {
			 Select s1=new Select(Location);
			 s1.selectByValue(location);
		 }
		 public void selectHotels(String Hot)
		 {
			 Select s1=new Select(Hotels);
			 s1.selectByValue(Hot);
		 }
		 public void selectRoomType(String roomtype)
		 {
			 Select s1=new Select(RoomType);
			 s1.selectByValue(roomtype);
			 
		 }
		 public void selectNumberofRoom(String noofroom)
		 {
			 Select s1=new Select(NumberofRooms);
			 s1.selectByVisibleText(noofroom);
		 }
		 
		 public void enterCheckinDate(String chkdate)
		 {
			 CheckInDate.clear();
			 CheckInDate.sendKeys(chkdate);
			 
		 }
		 public void entercheckoutdate(String chkoutdate)
		 {
			 CheckOutDate.clear();
			 
			 CheckOutDate.sendKeys(chkoutdate);
			
		 }
		 
		 public void selectAdultperroom(String adultperromm)
		 {
			 Select s1=new Select(AdultsperRoom);
			 
			 s1.selectByVisibleText(adultperromm);
		 }
		 public void selectCheldrenperroom(String chilperromm)
		 {
			Select s1=new Select(ChildrenperRoom);
			s1.selectByVisibleText(chilperromm);
			
			 
		 }
		 
		 public void clickSearchHotel() 
		 {
			 Searchbtn.click();
		 }
		 
		 
		 
		 
		 public void selectRadioButton()
		 {
			 Radiobtn.click();
		 }
		 
		 public void clickContinueBtn()
		 {
			 ContinueBtn.click();
		 }
		 
		 
		 
		 
		 public void enterFirstName(String firstname) throws EncryptedDocumentException, IOException
		 {
			 FN.sendKeys(firstname);
		 }
		 public void enterLastName(String lastname) throws EncryptedDocumentException, IOException
		 {
			 LN.sendKeys(lastname);
			 
		 }
		 public void enterBillingAddress(String address) throws EncryptedDocumentException, IOException
		 {
			 BillingAddress.sendKeys(address);
		 }
		 public void enterCreditcardNo(String ccno) throws EncryptedDocumentException, IOException
		 {
			 CCN1.sendKeys(ccno);
			 
		 }
		 public void selectCreditcardType(String cctype) throws EncryptedDocumentException, IOException
		 {
			 Select s1=new Select(CCT1);
			 s1.selectByVisibleText(cctype);			 
		 }
		 public void selectExpiremonth(String exmonth)
		 {
			 Select s1=new Select(EDMonth1);
			 s1.selectByVisibleText(exmonth);
			 
		 }
		 public void selectExpiryYear(String exyear)
		 {
			 Select s1=new Select(EDYear1);
			 s1.selectByVisibleText(exyear);
		 }
		 public void enterCVVno(String cvvno)
		 {
			CVV1.sendKeys(cvvno);
		 }
		 public void clickBooknowBtn()
		 {
			BookNowBtn.click(); 
		 }
		 
}

		
		
		
	


	



