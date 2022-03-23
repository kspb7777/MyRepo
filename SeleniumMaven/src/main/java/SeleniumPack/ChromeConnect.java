package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeConnect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		//Thread.sleep(5000);
		// System.out.println(driver.getCurrentUrl());
		String s=driver.getTitle();
		//System.out.println(driver.getTitle());
		String var1=driver.getPageSource();
		System.out.println(var1);
		System.out.println(s);
		if(s.equals("Google"))
		{
			System.out.println("Title Verified");
		}
		else
		{
			System.out.println("Not Verified");
		}
		
		String url=driver.getCurrentUrl();
		System.out.println("url is "+url);
		if(url.equalsIgnoreCase("https://www.google.com/?gws_rd=ssl"))
		{
			System.out.println("URL verified");
		}
		else
		{
			System.out.println("URL not verified");
		}
		
		
		//driver.close();
		driver.quit();
		

	}

}
