package Apachivepoi;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Signup {
	WebDriver driver;
	String baseurl="https://automationexercise.com/login";
	@BeforeTest
	public void setUp() {
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() {
		WebElement signup=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]"));
				signup.sendKeys("antil",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("anit@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		driver.findElement(By.xpath("//*[@id=\"id_gender2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("12345678");
		WebElement day=driver.findElement(By.xpath("//*[@id=\"days\"]"));
		Select daydetails=new Select(day);
		daydetails.selectByValue("20");
		WebElement month=driver.findElement(By.xpath("//*[@id=\"months\"]"));
		Select monthdetails=new Select(month);
		monthdetails.selectByValue("June");
		WebElement year=driver.findElement(By.xpath("//*[@id=\"years\"]"));
		Select yeardetails=new Select(year);
		yeardetails.selectByValue("2003");
//		driver.findElement(By.xpath(""));
		
		
	}

}
