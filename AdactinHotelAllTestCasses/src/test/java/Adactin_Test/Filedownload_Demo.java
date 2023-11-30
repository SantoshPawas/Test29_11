package Adactin_Test;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Filedownload_Demo 
{
	public static void main(String[] args) 
	{
		ChromeOptions co=new ChromeOptions();
		String s1="C:\\Users\\shree\\eclipse-workspace\\AdactinHotelAllTestCasses\\All_Downloads";
		HashMap mp=new HashMap();
		mp.put("download.default_directory", s1);
		
		co.setExperimentalOption("prefs", mp);
		
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://chromedriver.storage.googleapis.com/index.html?path=114.0.5735.90/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//*[@href='/114.0.5735.90/chromedriver_win32.zip']")).click();
		
		
		
	}

}
