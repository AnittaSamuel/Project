package Apachivepoi;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriventest {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void datadriven() throws IOException
	{
		driver.get("https://www.facebook.com");
		
		FileInputStream fi=new FileInputStream("C:\\Users\\Anitta Samuel\\Downloads\\\\Untitled Spreadsheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("sheet1");
		int rowcount=sh.getLastRowNum();
		System.out.println(rowcount);
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).createCell(0).getStringCellValue();
			System.out.println("username="+username);
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("pswd="+pswd);
			driver.findElement(By.name("email")).clear();
			driver.findElement(By.name("email")).sendKeys(username);
			driver.findElement(By.name("pass")).sendKeys(pswd);
			driver.findElement(By.name("login")).click();
			
			driver.navigate().refresh();
		}
				
	}
	

}
