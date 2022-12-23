package jUnitTutorial;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

class DropDownMethodsTest {
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@Test
	void EnterButton() throws Exception {
		driver.get("https://www.google.com");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Best training institute in Tirupati for selenium");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Test
	void Field() throws Exception {
		/*driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("chaithanya");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-pass")).sendKeys("HellocK");
		Thread.sleep(3000);
		driver.findElement(By.id("edit-pass")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);
		driver.findElement(By.id("edit-name")).sendKeys("Kumar");*/
		Thread.sleep(3000);
	}
	@Test
	void dropdown() throws InterruptedException {
		driver.get("http://baalabharathi.com/upload-story/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517501");
		Thread.sleep(3000);
	//new	Select(driver.findElement(By.name("field-5gVECDat8HE4BHW"))).selectByVisibleText("Pakistan");
	Thread.sleep(3000);
	//new	Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByValue("CX");
	Thread.sleep(3000);
	new Select(driver.findElement(By.id("field-5gVECDat8HE4BHW"))).selectByIndex(9);
	
	}


	@AfterAll
	static void tearDownAfterClass() throws Exception {
		Thread.sleep(3000);
		driver.manage().window().minimize();
		Thread.sleep(3000);
		driver.quit();
	}
}
