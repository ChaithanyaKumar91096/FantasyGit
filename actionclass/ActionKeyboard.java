package actionclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class ActionKeyboard {
	WebDriver driver;
  @Test
  public void keyboardaction() throws Exception {
	  driver.get("https://www.redmine.org/login");
	  Thread.sleep(3000);
	  Actions action = new Actions(driver); 
	  action.sendKeys(Keys.TAB).build().perform();
	  Thread.sleep(3000);
	  action.keyUp(Keys.SHIFT).perform();
	  Thread.sleep(3000);
  }




  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
		driver.manage().window().maximize();

	  }

}
