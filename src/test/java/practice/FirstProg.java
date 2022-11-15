package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstProg {

	public static void main(String[] args) throws InterruptedException 
	{

		WebDriver driver = new ChromeDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//String str=driver.findElement(By.xpath("")).getAttribute("title");
		WebElement element = driver.findElement(By.id("searchDropdownBox"));
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.flipkart.com/");

		//		Select select = new Select(driver.findElement(By.id("searchDropdownBox")));
		//		select.selectByValue("search-alias=stripbooks");
		//		Thread.sleep(2000);
		//		String s = select.getFirstSelectedOption().getText();

		//	System.out.println(s);
	}

}
