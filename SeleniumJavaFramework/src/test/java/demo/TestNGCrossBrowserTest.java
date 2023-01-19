package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGCrossBrowserTest {
	
	public static WebDriver driver= null;
	public static String ppath = System.getProperty("user.dir");
	
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName) {
		
		System.out.println("Browser Name " + browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
	       System.setProperty("webdriver.chrome.driver", ppath+"/drivers/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.navigate().to("https://www.google.com/");
		   driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
		}
		else if(browserName.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver",  ppath + "/drivers/geckodriver.exe");
					driver = new FirefoxDriver();
					driver.manage().window().maximize();
					driver.navigate().to("https://www.google.com/");
					driver.findElement(By.name("q")).sendKeys("Selenium Step by Step");
			}
		else if(browserName.equalsIgnoreCase("ie")){
					System.setProperty("webdriver.ie.driver",  ppath + "/drivers/IEDriverServer.exe");
					driver = new InternetExplorerDriver();
					driver.manage().window().maximize();
					driver.navigate().to("https://www.google.com/");
					driver.findElement(By.name("q")).sendKeys("SQL Step by Step");
			}
		
	}
	
	@Test
	public void test1()
	{
		System.out.println("Test 1 Completed");
	}
	@AfterTest
	public void teardown() {
	
		driver.close();
		driver.quit();
		}

}
