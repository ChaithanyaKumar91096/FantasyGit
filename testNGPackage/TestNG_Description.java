package testNGPackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_Description {
	static WebDriver driver;
	@AfterTest
	  public void afterTest() throws InterruptedException {
		  driver.close();
		 
	  }
  
  @Test(priority=1,description="Top Menus")
  public void test_01() throws InterruptedException {
	  driver.findElement(By.linkText("Hom")).click();
	  Thread.sleep(2000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Help")).click();
	Thread.sleep(3500);
  }
  @Test (enabled=true,description="Register",priority=2)
  public void test_02() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[2]/a")).click();
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("chaithanya Kumar");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("cK@456");
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//input[@name='commit']")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
  }
  @Test(description = "SignIn", priority = 0, enabled = true)
  public void test_03() throws InterruptedException {
	  driver.findElement(By.xpath("//*[@id=\"account\"]/ul/li[1]/a")).click();
	Thread.sleep(3500);
  }
  @Test(priority=0,enabled=false)
	public void test_04() throws InterruptedException {
		driver.get("https://www.selenium.dev");
		Thread.sleep(3000);
  }

  @BeforeTest
  public void beforeTest() throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	driver.get("https://www.redmine.org/login");
	Thread.sleep(3000);
  }

}
