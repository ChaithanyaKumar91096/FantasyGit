package displayedEnabledSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class IsSelectedMethod {
	WebDriver driver;
  @Test
  public void isSelected() {
	  driver.get("https://www.redmine.org/login");
	 driver.findElement(By.xpath("//*[@id=\"login-form\"]/form/table/tbody/tr[3]/td[2]/label")).click();
	  Boolean checkbox=driver.findElement(By.xpath("//*[@id=\"autologin\"]")).isSelected();
	  if(checkbox=true)
	  {
		  System.out.println("Stay Logged in Checkbox is Selected");
	  }
	  else
	  {
		  System.out.println("Stay Logged in Checkbox is not Selected");
	  }
		  
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
  driver =new ChromeDriver();
  driver.manage().window().maximize();
  Thread.sleep(1000);
  }
  

}
