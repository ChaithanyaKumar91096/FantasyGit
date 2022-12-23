package jUnitTutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class SecondJunitProgramTest {
	static WebDriver driver;
	

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.close();

	}

	@Test
	void google() throws InterruptedException {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Best selenium training institute in Tirupati");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

	}



@Test
void twitter() throws InterruptedException {
	driver.get("https://www.twitter.com/");
	Thread.sleep(4000);
}
	
@Disabled

@Test
void yahoo() throws InterruptedException {
	driver.get("https://www.yahoo.com/");
	Thread.sleep(2000);
}
@Test
void facebook() throws InterruptedException {
	driver.get("https://www.facebook.com/");
	Thread.sleep(4000);
	
}
}