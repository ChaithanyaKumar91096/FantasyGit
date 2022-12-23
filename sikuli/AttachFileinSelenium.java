package sikuli;

import org.testng.annotations.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AttachFileinSelenium {
	WebDriver driver;

	@Test
	public void attachfile() throws Exception{
		driver.get("http://baalabharathi.com/upload-story/");
		driver.findElement(By.xpath("//*[@id=\"field-SUtF8PwfCXGXx46\"]")).sendKeys("Hello Selenium");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"field-8lqEle2zeOhMu0a\"]")).sendKeys("D:\\scrennshot\\desktop\\Ck.PNG");
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		


  }

}
