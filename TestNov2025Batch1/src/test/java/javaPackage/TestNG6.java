package javaPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG6 {

	@Test
	public void a66()
	{
		Assert.assertTrue(3<12);
		System.out.println("Hello a66 method");
		
	}
	
	@Test
	public void b66() {
		Assert.assertFalse(3>12);
		System.out.println("hello b66 method");
	}
	
	@Test
	public void c66() {
		Assert.assertTrue(3<12);
		System.out.println("Hello c66 method");
	}
	
	@Test(dependsOnMethods= {"a66","b66","c66"})
	public void d66() {
		System.out.println("Hello d66 method");
	}
	
	@Test
	public void e66() {
		int actInteger=2;
		int expInteger=2;
		Assert.assertEquals(actInteger, expInteger);
		System.out.println("Hello equal assertion");
	}
	

}
