package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DesireCapabilityDemoTest {
	
	public static WebDriver driver;

	public static void main(String[] args) {
		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("igonreProtectedModeSettings", true);
		String ppath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ppath + "\\drivers\\chromedriver.exe");
	   // driver = new ChromeDriver(caps);
	    driver.manage().window().maximize();
	    driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
	}

}
