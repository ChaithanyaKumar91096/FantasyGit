package displayedEnabledSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsDisplayed {
	WebDriver driver;
  @Test
  public void isDisplayed() {
	  driver.get("https://www.redmine.org/login");
	  Boolean logo=driver.findElement(By.xpath("//*[@id=\"header\"]/h1")).isDisplayed();
	  if(logo = true)
	  {
		  System.out.println("Logo is displayed in the Header Bar");
	  }
	  else
	  {
		  System.out.println("Logo is not displayed in the Header Bar");
	  }
		  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
  driver =new ChromeDriver();
  driver.manage().window().maximize();
  }
  

}
