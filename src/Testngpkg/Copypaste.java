package Testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Copypaste {
	ChromeDriver driver;
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		  
        		
	}
	@Test
	public void copypaste()
	{
		WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement account=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement bank=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		WebElement debite=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		
		WebElement salles=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement accounts=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		WebElement amounts=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement a=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions act=new Actions(driver);
		act.dragAndDrop(account, bank);
		act.dragAndDrop(amount, debite);
		act.dragAndDrop(amounts, a);
		act.dragAndDrop(salles, accounts);
		act.perform();

		
	}

}
