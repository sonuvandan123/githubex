package webelements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.id("searchLanguage")).sendKeys("Latviosu");
		WebElement webelement=driver.findElement(By.id("searchLanguage"));
		//webelement.click();
		Select select =new Select(webelement);
		//select.selectByVisibleText("Deutsch");
		
		// print all dropdown values
		List<WebElement> list= select.getOptions();
		for (WebElement webElement2 : list) {
			System.out.println(webElement2.getText());
		}
		
	}

}
