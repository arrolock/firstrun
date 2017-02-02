package learnSeleniumPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEDriverDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.ie.driver", "D:\\learn\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		driver.get(baseURL);
		driver.close();

	}

}
