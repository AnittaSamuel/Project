package Apachivepoi;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v121.indexeddb.model.Key;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amazon {
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
		WebElement search=driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("moblie phones",Keys.ENTER);
		String exp="https://www.amazon.in";
		String actitle=driver.getTitle();
	
		if(actitle.equalsIgnoreCase(exp));
		{
			System.out.println("The Title");
		}
		String parentWindow=driver.getWindowHandle();
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/span/div/div/div/div[2]/div/div/div[2]/div[1]")).click();
		Set<String> allWindowHandles=driver.getWindowHandles();
		for(String handle : allWindowHandles) {
			if(!handle.equalsIgnoreCase(parentWindow)) {
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
				driver.close();
				driver.switchTo().window(parentWindow);
			}
			
			
		
		}
	
	}
}