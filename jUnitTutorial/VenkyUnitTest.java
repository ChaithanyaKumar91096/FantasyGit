package jUnitTutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class VenkyUnitTest {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe" );
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	}
	
	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
	}

	@Test
	void test() throws InterruptedException {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("chaituKumar");
		Thread.sleep(3000);
		driver.findElement(By.id("pass")).sendKeys("Ckumar");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		/*driver.findElement(By.name("email")).clear();
		Thread.sleep(3000);
		driver.findElement(By.name("email")).sendKeys("Kumar");
		Thread.sleep(3000);
		driver.findElement(By.name("email")).click();*/
		
	}

}
