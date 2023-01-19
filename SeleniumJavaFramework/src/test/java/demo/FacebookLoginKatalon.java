package demo;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import java.time.Duration;
import org.apache.commons.io.FileUtils;

public class FacebookLoginKatalon {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;
 

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
	 String ppath = System.getProperty("user.dir");
	 System.setProperty("webdriver.chrome.driver", ppath+"/drivers/chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testUntitledTestCase() throws Exception {
    driver.get("https://www.google.com/search?q=facebook+login&oq=facebook+login&aqs=chrome..69i57j0i131i433i512j0i512j0i10i131i433i512j0i433i512j0i10i512j0i131i433i512j0i512j0i131i433i512j0i512.7492j0j15&sourceid=chrome&ie=UTF-8");
    driver.findElement(By.xpath("//div[@id='rso']/div[2]/div/div/div/div/a/h3")).click();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.id("email")).click();
    driver.findElement(By.id("email")).clear();
    driver.findElement(By.id("email")).sendKeys("abcd");
    driver.findElement(By.id("pass")).click();
    driver.findElement(By.id("pass")).clear();
    driver.findElement(By.id("pass")).sendKeys("1234");
    driver.findElement(By.id("u_0_5_Xz")).click();
    driver.findElement(By.xpath("//div[@id='u_0_6_6d']/div/i")).click();
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
