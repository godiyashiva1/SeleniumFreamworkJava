package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FluentWaitDemo {

	public static void main(String[] args)  {
		
		String ppath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", ppath+"/drivers/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	   // driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    String baseUrl = "https://www.google.com/";
	    driver.get(baseUrl);
	    driver.findElement(By.name("q")).sendKeys("Abcd");
	    driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	    
	    driver.findElement(By.linkText("ABCD Study")).click();
	    
	    
	    driver.close();
	    driver.quit();
	}
	
}
