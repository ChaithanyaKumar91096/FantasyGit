package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_DependsOnMethod {
	static WebDriver driver;
	@AfterTest
	  public void afterTest() throws InterruptedException {
		Thread.sleep(3500);
		  driver.close();
		 
	  }
  
	@Test(dependsOnMethods="method2")
	public void method1() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("Tirupati weather today");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Test
	public void method2() {
driver.get("https://www.google.com");
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	Thread.sleep(2000);
  }

}
