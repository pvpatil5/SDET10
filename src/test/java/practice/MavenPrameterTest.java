package practice;

import org.testng.annotations.Test;

public class MavenPrameterTest 
{
	@Test
	public void datatest() {
		System.out.println("Hi");
		System.out.println(	System.getProperty("data"));
	}
}
