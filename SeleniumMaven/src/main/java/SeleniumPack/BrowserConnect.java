package SeleniumPack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserConnect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Desktop\\Selenium driver\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium driver\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Desktop\\Selenium driver\\msedgedriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);

		System.out.println("Firefox worked");
		driver.close();
		driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(5000);

		System.out.println("Chrome worked");
		driver.close();
		driver = new EdgeDriver();
		driver.get("http://www.google.com");
		Thread.sleep(5000);
		System.out.println("Edge worked");
		driver.close();

	}

}
