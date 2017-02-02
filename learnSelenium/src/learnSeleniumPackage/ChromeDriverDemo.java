package learnSeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "D:\\learn\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get(baseURL);
		driver.close();
		//this is a test to see difference in git
	}

}
