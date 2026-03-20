package javaPackage;

import org.testng.annotations.Test;

public class TestNG5 {
	@Test
	public void aNG()
	{
		System.out.println("Hello aNG method");
	}
	// this test is not executed because priority is given to "enabled= false"
	@Test(invocationCount=2, enabled=true & false, priority=-1)
	public void bNG() {
		System.out.println("hello bNG method");
	}
	
	@Test
	public void cNG() {
		System.out.println("Hello cNG method");
	}
	
	@Test
	public void dNG() {
		System.out.println("Hello dNG method");
	}
}
