package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazon {
	ChromeDriver driver;
	String baseurl="https://www.amazon.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test()
	{
		WebElement search=driver.findElement(By.xpath("//input[@name='email']"));
		search.sendKeys("abc@gmail.com");
		search.submit();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@'']/div")).sendKeys("Mobile");
		search.sendKeys("Mobile",Keys.ENTER);
		search.submit();
	}
		

}
