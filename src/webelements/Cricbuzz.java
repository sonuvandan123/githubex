package webelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
}
