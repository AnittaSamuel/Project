package Junitpkg;


import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

public class Linkvalidation {
	String link="https://www.google.com";
	
	@Test
	public void test()
	{
		URL u;
		try {
			u = new URL(link);
			HttpURLConnection con=(HttpURLConnection)u.openConnection();
			int code=con.getResponseCode();
			System.out.println(code);
			if(code==200)
			{
				System.out.println("response code is 200-successful");
			}
			else
			{
				System.out.println("not");
			}

		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
