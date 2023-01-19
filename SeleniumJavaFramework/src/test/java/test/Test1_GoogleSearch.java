package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_GoogleSearch {

	public static void main(String[] args) {
		
		googlesearch();
		
	}
	public static void googlesearch() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).click();
	}
}
