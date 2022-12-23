package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class PromptDialogBox {
	WebDriver driver;

  @Test
  public void alertokbutton() throws Exception {
	  driver.get("http://www.seleniumlearn.com/prompt-dialog-box"); 
	  Thread.sleep(5000);
driver.findElement(By.xpath("//*[@id=\"node-103\"]/div/div[1]/div/div/button")).click();
Thread.sleep(3000);
driver.switchTo().alert().sendKeys("Ck");
Thread.sleep(3000); 
 driver.switchTo().alert().accept(); 
/*Alert a = driver.switchTo().alert();
a.sendKeys("cK");
a.accept(); */
}
  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
