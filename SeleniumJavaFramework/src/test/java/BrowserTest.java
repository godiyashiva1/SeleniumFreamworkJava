import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) throws Exception {
		
		String ppath = System.getProperty("user.dir");
		System.out.println(ppath);
	//	System.setProperty("webdriver.chrome.driver", ppath + "\\drivers\\chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();

		//System.setProperty("webdriver.ie.driver", ppath + "\\drivers\\IEDriverServer.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		//Thread.sleep(3000);
		//driver.close();
	}
}
