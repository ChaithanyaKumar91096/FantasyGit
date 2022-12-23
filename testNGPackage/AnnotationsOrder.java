package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AnnotationsOrder {
	static WebDriver driver;
	@AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(3000);
		 driver.close();
	  }
  @Test
  public void google() throws InterruptedException {
	driver.get("https://www.google.com");
	Thread.sleep(3500);
  }
  @Test
  public void gmail() throws InterruptedException {
	driver.get("https://www.gmail.com");
	Thread.sleep(3500);
}
  @Test
  public void facebook() throws InterruptedException {
	driver.get("https://www.facebook.com");
	Thread.sleep(3500);
  }
  @Test
  public void yahoo() throws InterruptedException {
	driver.get("https://www.yahoo.");
	Thread.sleep(3500);
  }

  @BeforeTest
  public void beforeTest() {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	
  }

}
