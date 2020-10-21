package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ImplicitWaitEx {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://accounts.google.com");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("vandan123@gmail.com");
		driver.findElement(By.xpath("//div[@class='VfPpkd-RLmnJb']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("123");;
		

	}

}
