package Testngpkg;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Exentedreports {
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports extent;
	
	@BeforeTest
	public void beftest()
	{
		reporter=new ExtentHtmlReporter("./Reports/myreports1.html");
		reporter.config().setDocumentTitle("Automationreport");
		reporter.config().setReportName("functional test");
		reporter.config().setTheme(Theme.DARK);
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("hostname","localhost");
		extent.setSystemInfo("os", "Windows10");
		extent.setSystemInfo("testername", "Anitta");
		extent.setSystemInfo("Browser Name","Chrome");
		driver=new ChromeDriver();
	
	}
	@BeforeMethod
	public void setUp() {
		driver.get(baseurl);
	}
	@Test
	public void fbtitleverification()
	{
		test=extent.createTest("fbtitleverification");
		String exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(exp, actual);
	
	}
//	@Test
//	public void butonverification()
//	{
//		
//	}
	@AfterTest
	public void teardown()
	{
		extent.flush();
	}
	@AfterMethod
	public void browserclose(ITestResult result) throws IOException
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			String screenshotpath=screenshotMethod(driver,result.getName());			
			test.addScreenCaptureFromPath(screenshotpath);
		}else if (result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if (result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.SKIP, "test case passed is"+result.getName());
		}
	}
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String destination="./Screenshot/"+screenshotname+".png";
		FileHandler.copy(src, new File(destination));
		return destination;
	}

}
