package javaPackage;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestNG4 {
	
	@Test
	public void a11() {
		System.out.println(" Hello a11 method");
	}

	@Test(enabled=true)
	public void b22() {
		System.out.println(" Hello b22 method");
	}
	
	@Test(enabled=false)
	public void c33() {
		System.out.println(" Hello c33 method");
	}
	
	@Test(invocationCount=0)
	public void d44() {
		System.out.println(" Hello d44 method");
	}
	
	@Test(invocationCount=2)
	public void e55() {
		System.out.println(" Hello e55  method");
	}
	
	@Test
	public void f66() {
		System.out.println(" Hello f66 method");
		throw new SkipException("skipping f test method ");
	}
}