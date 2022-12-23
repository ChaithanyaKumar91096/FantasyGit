package jUnitTutorial;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class JunitDemoTest {
static WebDriver driver;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver  = new ChromeDriver();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		driver.quit();
	}

	@Test
	void test1() throws InterruptedException {
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("hello");
		Thread.sleep(4000);
		
	}
	
	@Test
	void test2() throws InterruptedException {
		driver.get("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("kumar");
		Thread.sleep(4000);
	}


@Test
void test3() throws InterruptedException {
	driver.get("https://www.amazon.com");
	Thread.sleep(4000);
}
}