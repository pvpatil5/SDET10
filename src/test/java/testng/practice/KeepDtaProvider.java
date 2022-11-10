package testng.practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

public class KeepDtaProvider 
{
	@DataProvider
	public Object[][] getdata() throws EncryptedDocumentException, FileNotFoundException, IOException 
	{
		Object arr[][] = new Object[3][2];
		Workbook workbook = WorkbookFactory.create(new FileInputStream("./SDET10.xlsx"));
		int lastrownum=	workbook.getSheet("Sheet1").getLastRowNum();

		for (int i = 0; i <lastrownum+1; i++) {
			arr[i][0]=workbook.getSheet("Sheet1").getRow(i).getCell(0).getStringCellValue();
			arr[i][1]=workbook.getSheet("Sheet1").getRow(i).getCell(1).getStringCellValue();
		}
		return arr;
	}
}
