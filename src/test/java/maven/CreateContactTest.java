package maven;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import generic.BaseClass;

@Listeners(generic.ListnersImp.class)
public class CreateContactTest extends BaseClass
{
	@Test()
	public void createcontact() 
	{
		System.out.println("contact created");
		Assert.assertEquals(false, true);
		
	}

	@Test()
	public void createcontactwithemail() 
	{
		System.out.println("contact created with email");
		Assert.assertEquals(true, true);
		
	}

}
