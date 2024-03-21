package Apachivepoi;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickp2 {
	WebDriver driver;
	String baseurl="hptts://www.trivago.in";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlopen()
	{
		driver.get(baseurl);
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().refresh();
		 driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[1]/button[1]/span/span[2]/span[1]")).click();
		 
		 while(true)
			{
				WebElement month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/h3"));
				String monthtext=month.getText();
				System.out.println(monthtext);
				if(monthtext.equals("June 2024"))
				{
					break;
				}
				else
				{
				driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
				}
			}
			List<WebElement>li=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[1]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div/button/time"));
			for(WebElement ele:li)
			{
				String date= ele.getText();
				if(date.equals("16"))
				{
					ele.click();
				}
			}
			//driver.findElement(By.xpath("")).click();
		}

	
		

}
