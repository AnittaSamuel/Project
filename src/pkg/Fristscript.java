package pkg;
import org.openqa.selenium.chrome.ChromeDriver;
public class Fristscript {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https:/www.google.com");
		String exp="Google";
		String actualtitle=driver.getTitle();
		if(exp.equals(actualtitle))
		{
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		driver.quit();

	}

}
