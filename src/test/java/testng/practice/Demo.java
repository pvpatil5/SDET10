package testng.practice;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo 
{  
	@BeforeMethod
	public void bm() {
		System.out.println("Before method");
	}
	@AfterMethod
	public void am() {
		System.out.println("After method");
	}
	@Test
	public void test()
	{
		String expecting = "Missing Cart Items";
		String actual ="Missig Cart Items";

		SoftAssert assert1 = new SoftAssert();
		assert1.assertEquals(expecting, actual, "Data is NOt matching");
		assert1.assertAll();

	}
}
