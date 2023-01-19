package demo;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ImpliciteWait {

	public static void main(String[] args) {
		String ppath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ppath+"/drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    String baseUrl = "https://www.google.com/";
	    driver.get(baseUrl);
	    driver.findElement(By.name("q")).sendKeys("Automation Step by Step");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    
	    
	 //   WebDriverWait wt = new WebDriverWait(driver, 20);
	    
	    driver.findElement(By.name("abiikf")).sendKeys("abjd");
	    
	}

}
