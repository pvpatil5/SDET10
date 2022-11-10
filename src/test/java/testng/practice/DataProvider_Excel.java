package testng.practice;

import org.testng.annotations.Test;

public class DataProvider_Excel {

	@Test(dataProvider = "getdata", dataProviderClass = KeepDtaProvider.class)
	public void dataprovider(String src, String dest) {
		System.out.println(src+"-->"+dest);
	}

	
}
