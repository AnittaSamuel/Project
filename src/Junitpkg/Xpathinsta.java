package Junitpkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathinsta {
	ChromeDriver driver;
	String baseurl="https://www.instagram.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void instalogin()throws InterruptedException
	{
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//form[@id='loginForm']/div/div[1]/div/label/input")).sendKeys("abc@gmail.com");
		WebElement search=driver.findElement(By.xpath("//input[@type='password']"));
		search.sendKeys("ertyuiio");
		WebElement search1=driver.findElement(By.xpath("//*[@id='loginFrom']/div"));
		search1.click();
		

	}

}
