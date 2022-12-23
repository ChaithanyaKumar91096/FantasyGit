package alertwindows;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Coordinates;
import org.openqa.selenium.interactions.Locatable;
import org.testng.annotations.BeforeTest;

public class ScrollDownUp {
	WebDriver driver;

  @Test
  public void ScrollDown() throws Exception { 
	  driver.get("http://www.seleniumlearn.com/how-webpage-scroll-down-and-scroll-up-using-selenium-webdriver"); 
	  Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 3000)");
	}
  @Test
  public void ScrollUp() throws Exception { 
	  driver.get("http://www.seleniumlearn.com/how-webpage-scroll-down-and-scroll-up-using-selenium-webdriver"); 
	  Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(4000, 0)");
  }
  @Test
	public void ScrollDownSelectWebElment() throws Exception {
		driver.get("https://www.selenium.dev/support/");
		Thread.sleep(5000);
		{
			WebElement element = (WebElement) driver.findElement(By.xpath("/html/body/div/main/div[4]/div/h2"));
			Coordinates coordinate = ((Locatable) element).getCoordinates();
			coordinate.onPage();
			coordinate.inViewPort();
		}
  }
  @BeforeTest
  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
	  driver =new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
