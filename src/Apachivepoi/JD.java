package Apachivepoi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JD {
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notification");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.get("https://www.justdial.com");
	}

}
