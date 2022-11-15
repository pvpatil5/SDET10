package maven;

import org.testng.annotations.Test;

public class CreateOrgTest 
{
	@Test
	public void createorg() {
		String value=System.getProperty("data");
		System.out.println(value);
		System.out.println("Org created successfully");
	}

}
