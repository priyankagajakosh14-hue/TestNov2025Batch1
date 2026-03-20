package javaPackage;

import org.testng.annotations.Test;

public class TestNG3 {
	
	@Test(priority=0)
	public void a()
	{
		System.out.println("Hello a method");
	}
	
	@Test(priority=3)
	public void b() {
		System.out.println("priority testing checked");
		System.out.println("hello b method");
	}
	
	@Test(priority=-1)
	public void c() {
		System.out.println("Hello c method");
	}
	
	@Test(priority=2)
	public void d() {
		System.out.println("Hello d method");
	}

}
