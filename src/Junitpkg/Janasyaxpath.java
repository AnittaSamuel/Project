package Junitpkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Janasyaxpath {
	ChromeDriver driver;
	String baseurl="https://www.janasya.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		  
        		
	}
	@Test
	public void linkcount()
	{
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys("kurit");
		search.submit();
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		for(WebElement ele:linklist)
		{
			String link=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(link+"--------"+linktext);
		}
		
	}

}
