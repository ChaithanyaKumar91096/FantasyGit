package demoselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChrome {
static WebDriver driver;
	public static void main(String[] args) throws Exception {
System.setProperty("webdriver.chrome.driver","C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
driver = new ChromeDriver();
Thread.sleep(3500);
driver.manage().window().maximize();
Thread.sleep(4000);
driver.get("https://www.amazon.com");
Thread.sleep(2000);
driver.navigate().to("https://www.facebook.com");
Thread.sleep(2000);
driver.navigate().back();
Thread.sleep(2000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().refresh();
driver.manage().window().minimize();
driver.quit();
	}

}
