package calendar;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","D://Selenium Training//5pmweekday//jarsanddrivers//geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath("(//button[@class='ui-datepicker-trigger'])[1]")).click();
		//driver.findElement(By.xpath("//button[@class='ui-datepicker-trigger'])[1]")).click();
		//Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_view_date1']")).click();
		Thread.sleep(3000);
		WebElement firstCalendar=driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]"));
		List<WebElement> list= firstCalendar.findElements(By.xpath("//a[@class='ui-state-default']"));
		for (WebElement webElement : list) {
			if(webElement.getText().equals("19"))
			{
				webElement.click();
				break;
			}
			
			//System.out.println(webElement.getText());
		}
		/*
		
		 * WebElement calendarOne=driver.findElement(By.xpath(
		 * "(//table[@class='ui-datepicker-calendar'])[1])")); List<WebElement>
		 * list=calendarOne.findElements(By.xpath("//a[@class='ui-state-default']"));
		 * for (WebElement webElement : list) {
		 * System.out.println(webElement.getText()); }
		 */
	}

}
