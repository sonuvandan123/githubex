package webelements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Covid19India {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.covid19india.org");
		List<WebElement> list=driver.findElements(By.cssSelector("div[class='table fadeInUp'] [class='cell statistic']"));
		int i=0;
		for (WebElement webElement : list) {
			System.out.print(" "+webElement.getText());
			i++;
			if(i==5)
			{
				System.out.println();
				i=0;
			}
		}
		
	}

}
