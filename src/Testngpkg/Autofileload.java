package Testngpkg;



import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autofileload {
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		driver =new ChromeDriver();
		
	}
	@Test
	public void main() throws IOException, Exception
	{
		driver.get("https://www.ilovepdf.com/merge_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\Anitta Samuel\\OneDrive\\Documenten");
		Thread.sleep(3000);
	}

}
