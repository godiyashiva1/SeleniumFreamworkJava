package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportsDemoWithTestNG {
	
	public ExtentHtmlReporter htmlreport;
	public ExtentReports extent;
	public ExtentTest test;
	public static WebDriver driver=null;
	
	@BeforeSuite
	public void setup() {
        htmlreport = new ExtentHtmlReporter("extent.html");
		extent  = new ExtentReports();
		extent.attachReporter(htmlreport);
	}
	
	@BeforeTest
	public void browserSetup() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
	}
	
	@Test
	public void googleSearchTest1() throws Exception {
		
		test = extent.createTest("My First Test","Google Search Functinality");
		test.log(Status.INFO, "Step for Log");
		test.info("Launch the browser and search into google");
		driver.get("https://google.com/");
		test.pass("Navigated to google search page");
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		test.pass("Entered to google search box");
		driver.findElement(By.name("btnK")).click();
		test.pass("Enter button Pressed");
	}
	
	@Test
	public void googleSearchTest2() throws Exception {
		
		test = extent.createTest("My Second Test","Google Search Functinality");
		test.log(Status.INFO, "Step for Search");
		test.info("Launch the browser and search into google");
		driver.get("https://google.com/");
		test.pass("Navigated to google search page");
		driver.findElement(By.name("q")).sendKeys("Hello World Selenium");
		test.pass("Entered to google search box");
		driver.findElement(By.name("btnK")).click();
		test.pass("Enter button Pressed");	
	}
	
	@AfterTest
	public void browserclose() {
		
		test.info("Close the browser");
		driver.close();
		driver.quit();
	}
	
	@AfterSuite
	public void teardown() {
		
		test.info("Flush the Report");
		extent.flush();
	}
}
