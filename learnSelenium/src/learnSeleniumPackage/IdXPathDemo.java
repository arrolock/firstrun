package learnSeleniumPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IdXPathDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// lst-ib
		String baseURL = "http://www.google.com";
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "D:\\learn\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get(baseURL);
		
		driver.findElement(By.id("lst-ib")).sendKeys("letskodeit");
		driver.findElement(By.xpath("//*[@id='tsf']/div[2]/div[3]/center/input[1]")).click();
		driver.close();

	}

}
