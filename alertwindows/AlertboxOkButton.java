package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AlertboxOkButton {
	WebDriver driver;

  @Test
  public void alertokbutton() throws Exception {
driver.get("http://www.seleniumlearn.com/how-handle-alert-box-using-selenium");
Thread.sleep(8000);
driver.findElement(By.xpath("//*[@id=\"node-100\"]/div/div[1]/div/div/button")).click();
Thread.sleep(5000);
driver.switchTo().alert().accept();
}


  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
