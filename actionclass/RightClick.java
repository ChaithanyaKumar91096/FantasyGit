package actionclass;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightClick {
	WebDriver driver;
  @Test
  public void rightclick()throws Exception {
	  driver.get("http://seleniumlearn.com/");
	  Thread.sleep(5000);
	  Actions ac=new Actions(driver);
	  ac.contextClick(driver.findElement(By.xpath("//*[@id=\"menu-389-1\"]/a"))).build().perform();
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	  driver = new ChromeDriver();
		driver.manage().window().maximize();

	  }

}
