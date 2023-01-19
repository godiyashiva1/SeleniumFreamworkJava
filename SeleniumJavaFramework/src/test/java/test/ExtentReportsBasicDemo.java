package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsBasicDemo {

	public static WebDriver driver=null;
	
	
	public static void main(String[] args)  {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		//Create ExtentReports and attached reporter's
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		//creates a toggle for the given test, add all log events under
		ExtentTest test = extent.createTest("Google Search", "This is valid test for google search functionality");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		test.log(Status.INFO, "Starting Test Case");
		driver.get("https://google.com/");
		test.pass("Navigate to Google.com");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("Enter text into textbox");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		test.pass("Press Enter Key");
		
		driver.close();
		test.pass("Close the Browser");
		driver.quit();
		test.log(Status.INFO,"Test Completed.");
		extent.flush();
		
	}

}
