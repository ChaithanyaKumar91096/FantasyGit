package demoselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumAllLocators {
	
	static WebDriver driver;

	public static void main(String[] args) throws Exception {		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32chromedriver.exe");
		driver = new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();		
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(2000);
	/*	driver.findElement(By.id("edit-name")).sendKeys("chaithanya");  // id
		Thread.sleep(2000);
		driver.findElement(By.name("pass")).sendKeys("Hello@123");  // name
		Thread.sleep(2000);
	//	driver.findElement(By.className("form-submit")).click();    // className
	//	driver.findElement(By.cssSelector("input.form-submit")).click(); // cssSelector
		driver.findElement(By.cssSelector(".form-submit")).click();  
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("News")).click(); */
		
		List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Links : "+totallinks.size());
		
	}

}