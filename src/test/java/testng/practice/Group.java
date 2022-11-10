package testng.practice;

import org.testng.annotations.Test;

public class Group 
{

	@Test(groups = "smoke")
	public void singup() {
		System.out.println("Signup Done");
	}

	@Test(groups = {"regression","smoke","integration"})
	public void login() {
		System.out.println("Login Done");
	}

	@Test(groups = "regional regression")
	public void addProducttocart() {
		System.out.println("Product added");
	}

	@Test(groups = {"regression","smoke","integration"})
	public void logout() {
		System.out.println("logiut done");
	}
	@Test(groups = "integration")
	public void changeDelveryaddress() {
		System.out.println("Address changed");
	}

}
