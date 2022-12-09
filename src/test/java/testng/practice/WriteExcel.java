package testng.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteExcel {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		List<WebElement> data=driver.findElements(By.xpath("//table/tbody/tr[*]/td[*]"));

		FileInputStream fileInputStream =new FileInputStream("./SDET10.xlsx");

		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet=workbook.createSheet("Sheet10");
		for (int i = 1; i <= 10; i++)
		{
			Row row = sheet.createRow(i-1);
			for (int j = 1; j <=5; j++) 
			{
				String value=driver.findElement(By.xpath("//table/tbody/tr["+i +"]/td["+j +"]")).getText();
				//	System.out.println(data.get(j).getText());
				System.out.print(value+" ");
				System.out.println();
				row.createCell(j-1).setCellValue(value);
				FileOutputStream fileOutputStream = new FileOutputStream("./SDET10.xlsx");
				workbook.write(fileOutputStream);
			}
		}
		workbook.close();

		driver.close();
	}

}
