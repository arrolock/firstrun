package learnSeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\learn\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.close();

	}

}
