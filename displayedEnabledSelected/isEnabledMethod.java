package displayedEnabledSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class isEnabledMethod {
	WebDriver driver;
  @Test
  public void isEnabled() {
	  driver.get("https://www.redmine.org/login");
	  
	//  verify that the "Login" Box is displayed 
	  
	  WebElement login=driver.findElement(By.xpath("//*[@id=\"username\"]"));
	  
	  if(login.isDisplayed())
	  {
		  System.out.println("Login Field is visible.Return:"+login.isDisplayed());
	  }
	  else
	  {
		  System.out.println("Login Field is not visible.Return:"+login.isDisplayed());
	  }
	 // verify that the “Login” Box is enabled

	  if (login.isEnabled()) {
		  
          System.out.println("Login Field is enabled. Return: " + login.isEnabled());
          
          login.sendKeys("ChaituKumar");
      } else
    	  
      {
          System.out.println("Login Field is not enabled. Return: " + login.isEnabled());
      }
	// verify that the “Password” Box is enabled

	  WebElement Password=driver.findElement(By.xpath("//*[@id=\"password\"]"));
	  
	  if (Password.isEnabled()) {//*[@id="password"]
		  
          System.out.println("Password Field is enabled. Return: " + Password.isEnabled());
          
          Password.sendKeys("Ckumar");
      } else 
    	  
      {
          System.out.println("Password Field is not enabled. Return: " + Password.isEnabled());
      }
	 
 /* Boolean login=driver.findElement(By.xpath("//*[@id=\"username\"]")).isEnabled();
	  if(login==true)
	  {
		  System.out.println("Login field is enabled to enter the username");
	  }
	  else
	  {
		  System.out.println("Login field is not enabled to enter the username");
	  }
		 */ 
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
  driver =new ChromeDriver();
  driver.manage().window().maximize();
  Thread.sleep(1000);
  }
  

}
