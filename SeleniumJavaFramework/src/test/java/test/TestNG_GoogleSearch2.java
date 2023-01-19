package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_GoogleSearch2 {

	public static WebDriver driver;
	
	@BeforeTest
	public static void tearup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test
	public static void googlesearch2() {
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	@Test
	public static void googlesearch3() {
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
	}
	
	
	@AfterTest
	public void teardown() {
		driver.close();
		driver.quit();
	}
}
