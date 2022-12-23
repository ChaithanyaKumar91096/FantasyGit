package verifyTitleText;

import org.testng.annotations.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerifyTitle {
	WebDriver driver;
  @Test
  public void verifygoogletitle() {
	  driver.get("https://www.google.com");
	  String exp = "Google";
	  String act = driver.getTitle();
	  Assert.assertEquals(act, exp);
  }
  @Test
  public void verifygoogleUrl() {
	  driver.get("https://www.google.com");
	  String expurl="https://www.google.com/";
	  String acturl=driver.getCurrentUrl();
	  Assert.assertEquals(acturl, expurl);
  }
  @Test
  public void VerifyForumsPage() {
		
		driver.get("https://www.redmine.org/projects/redmine/boards");
		
		String expf = "Forums";
		
		String actf = driver.findElement(By.xpath("//*[@id=\"content\"]/h2")).getText();
		
		
		String expproject = "Projects";
		
		String actproject = driver.findElement(By.xpath("//*[@id=\"top-menu\"]/ul/li[2]/a")).getText();
		Assert.assertEquals(actf, expf);		
		Assert.assertEquals(actproject, expproject);
	
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
  }

}
 