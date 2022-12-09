package testng.practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WriteExcel_Data {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();
		List<WebElement> data=driver.findElements(By.xpath("//table/tbody/tr[*]/td[2]/span[@class='u-hide-phablet']"));



		FileInputStream fileInputStream =new FileInputStream("./SDET10.xlsx");

		Workbook workbook = WorkbookFactory.create(fileInputStream);
		Sheet sheet=workbook.createSheet("Sheet5");


		for (int j = 0; j <data.size(); j++) 
		{
			System.out.println(data.get(j).getText());

			sheet.createRow(j).createCell(0).setCellValue(data.get(j).getText());
			FileOutputStream fileOutputStream = new FileOutputStream("./SDET10.xlsx");
			workbook.write(fileOutputStream);
		}





		workbook.close();

		driver.close();
	}

}
