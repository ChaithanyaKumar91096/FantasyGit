package locators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
	static WebDriver driver;
	public static void main(String[] args) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chait\\OneDrive\\Documents\\Lib\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.hyderabadreport.com/user");
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("cK");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("Hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/nav/div/ul/li[7]/a")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"menu-228-3\"]/a")).click();
	}

	}