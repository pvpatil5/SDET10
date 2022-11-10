package testng.practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_1 
{


	@Test(dataProvider = "getdata")
	public void dataprovider(String src, String dest)
	{
		System.out.println(src);
		System.out.println(dest);
	}


	@DataProvider
	public Object[][] getdata() 
	{
		Object arr [][] = new  Object [3] [2];

		arr[0][0] ="HYD";
		arr[0][1]= "DEL";

		arr[1][0] ="BOM";
		arr[1][1]= "CNN";

		arr[2][0] ="GOI";
		arr[2][1]= "KOL";

		return arr;
	}
}
