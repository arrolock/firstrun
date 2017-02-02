package learnSeleniumPackage;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basicActionTest {

	WebDriver driver;
	String baseURL;
		
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "D:\\learn\\geckodriver.exe");
		baseURL = "http://letskodeit.teachable.com";
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
	}

	@Test
	public void test() {
		driver.get(baseURL);
		driver.findElement(By.xpath("//*[@id='navbar']//a[@href='/sign_in']")).click();
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

}
