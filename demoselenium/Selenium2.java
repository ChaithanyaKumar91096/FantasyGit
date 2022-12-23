package demoselenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium2 {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 Thread.sleep(2000);
		 driver.manage().window().maximize();
		 driver.get("http://hyderabadreport.com/user");
		 /*Thread.sleep(3000);
		 driver.findElement(By.id("edit-name")).sendKeys("chaithanya kumar");
		 Thread.sleep(2500);
		 driver.findElement(By.name("pass")).sendKeys("welcome CK@456");
		 Thread.sleep(2500);
		 driver.findElement(By.className("form-submit")).click();
		 Thread.sleep(4000);
		 driver.findElement(By.linkText("Ghmc")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.partialLinkText("DemoLink")).click();*/
		 driver.manage().window().maximize();
		 
		 List<WebElement> totallinks = driver.findElements(By.tagName("a"));
		 System.out.println("Total number of Links : "+totallinks.size());
	}

}
