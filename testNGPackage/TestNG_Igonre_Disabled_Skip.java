package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Igonre_Disabled_Skip {
	static WebDriver driver;
	@AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(3000);
		 driver.close();
	  }
  @Test(priority=1,enabled=false)
  public void google() throws InterruptedException {
	driver.get("https://www.google.com");
	Thread.sleep(3500);
  }
  @Test(priority=2)
  public void gmail() throws InterruptedException {
	driver.get("https://www.gmail.com");
	Thread.sleep(3500);
}
  @Test(enabled=false,priority=3)
  public void facebook() throws InterruptedException {
	driver.get("https://www.facebook.com");
	Thread.sleep(3000);
  }
  @Test(enabled=true,priority=0)
  public void yahoo() throws InterruptedException {
	driver.get("https://www.yahoo");
	Thread.sleep(3500);
  }
  @Test(priority=1) 
  public void twitter() throws InterruptedException {
	driver.get("https://www.twitter.com");
	Thread.sleep(3500);
  }
  @Test(priority=4)
	public void seleniumdev() throws InterruptedException {
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);
  }

  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	
  }

}
