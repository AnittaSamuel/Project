package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng {
	
		ChromeDriver driver;
		String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
		
		
	@BeforeTest
	public void Setup()
	{
		driver=new ChromeDriver();
	}
	
	
	@BeforeMethod
	public void urlloading()
			 {
	driver.get(baseurl);
	}
	@Test
	public void titlevarification()
	{
		String actualtitle	=driver.getTitle();
		String expectedtitle="rediffmail";
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		}
	@Test
	public void logoverification()
	{
		boolean logo=driver.findElement(By.xpath("//*[@id=\"wrapper\"]/table[1]/tbody/tr[1]/td[1]/img")).isDisplayed();
		if(logo)
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
	}
	@Test
	public void content()
	{
		String content=driver.getPageSource();
		String expt="fullname";
		if(content.equals(expt))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	@Test
	public void createmyaccount()
	{
		String buttontext=driver.findElement(By.xpath("//*[@id=\"register\"]")).getAttribute("vaule");
		if(buttontext.equals("Create my acount >>"))
		{
			System.out.println("pass");
		}
		{
			System.out.println("fail");
		}
		
	}
	@Test
	public void rediobutton()
	{
		boolean rediobutton=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(rediobutton)
		{
			System.out.println("rediobutton is displayed");
		}
		else
		{
			System.out.println("rediobutton is not displayed");
		}
	}
	@Test (groups= {"smoke"})
	public void createmyaccount()
	{
		System.out.println("createmyaccount");
	}
	

	

}
