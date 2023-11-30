package Adactin_Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload 
{
	public static void main(String[] args) throws AWTException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ilovepdf.com/pdf_to_word");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//*[@class='uploader__btn tooltip--left active']")).click();
		
		StringSelection s1=new StringSelection("C:\\Users\\shree\\eclipse-workspace\\AdactinHotelAllTestCasses\\TestData\\15th April_Morning_2nd_&3rd_July_Mock_Results..pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1, null);
		
		Robot r1=new Robot();
		//Key press
		r1.delay(2000);
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		
		//key release
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		
		//press enter
		r1.keyPress(KeyEvent.VK_ENTER);
		//release enter
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
