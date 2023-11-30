package Adactin_Library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class UtilityClass 
{
	@Test
	public static String getdatafrompropfile(String key) throws IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\AdactinHotelAllTestCasses\\Config.properties");
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		String value=prop.getProperty(key);
		return value;
	}
	
	@Test
	public static String getdatafromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		FileInputStream file=new FileInputStream("C:\\Users\\shree\\eclipse-workspace\\AdactinHotelAllTestCasses\\TestData\\Adactin_Data.xlsx");
		
		String value=WorkbookFactory.create(file).getSheet("Sheet14").getRow(row).getCell(cell).getStringCellValue();
		
		return value;
		
		
	}
	
	@Test
	public static void getScreenShot(String TestCaseId,WebDriver driver) throws IOException
	{
		File source=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\shree\\eclipse-workspace\\AdactinHotelAllTestCasses\\SccreenShot\\"+TestCaseId+".jpg");
		
		FileHandler.copy(source, dest);
	}

}
