package Apachivepoi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Bottom {
	WebDriver driver;
	String baseurl="https://www.amazon.in";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		JavascriptExecutor is=(JavascriptExecutor)driver;
		is.executeScript("window.scrollBy(0, document.body.scrollHeight)");
		
	
		driver.findElement(By.xpath("//*[@id=\"navFooter\"]/div[1]/div/div[1]/ul/li[1]/a")).click();
		
		
		
	}
	

}
