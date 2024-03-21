package Junitpkg;

import java.util.List;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcount {
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		  
        		
	}
	@Test
	public void linkcount()
	{
		List<WebElement>linklist=driver.findElements(By.tagName("a"));
		System.out.println(linklist.size());
		for(WebElement ele:linklist)
		{
			String link=ele.getAttribute("href");
			String linktext=ele.getText();
			System.out.println(link+"--------"+linktext);
		}
		
		
	}

}
