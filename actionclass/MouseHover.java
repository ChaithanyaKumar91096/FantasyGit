package actionclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class MouseHover {
	WebDriver driver;
  @Test
  public void rightclick()throws Exception {
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(5000);
	  Actions at=new Actions(driver);
	  at.moveToElement(driver.findElement(By.id("menu-336-1"))).build().perform();
      Thread.sleep(5000);
      at.moveToElement(driver.findElement(By.linkText("Selenium Quiz"))).click().perform();

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
		driver.manage().window().maximize();

	  }

}
