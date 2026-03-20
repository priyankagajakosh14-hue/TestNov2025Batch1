package javaPackage;

import org.testng.annotations.Test;

public class TestNG7 {
	
	@Test(groups="Regression")
	public void NH1()
	{
		System.out.println("1Hello regression testing");
		
	}
	
	@Test(groups="Sanity")
	public void NH2() {
		
		System.out.println("2hello Sanity testing");
	}
	@Test(groups="Smoke")
	public void NH5() {
		
		System.out.println("3hello smoke testing");
	}
	@Test(groups={"Regression","Sanity"})
	public void NH3() {
		
		System.out.println("4Hello Regressin and sanity testing");
	}
	
	@Test(groups= {"Sanity","Regression"})
	public void NH4() {
		System.out.println("5Hello sanity and regression method");
	}
	
	@Test(groups={"Sanity","Smoke"})
	public void NH6() {
		
		System.out.println("6hello sanity and smoke testing");
	}

	@Test(groups={"Smoke","Sanity"})
	public void NH8() {
		
		System.out.println("7hello smoke and sanity testing");
	}
	@Test(groups={"Smoke","Regression"})
	public void NH7() {
		
		System.out.println("8hello smoke and regression testing");
	}

	@Test(groups={"Sanity","Smoke","Regression"})
	public void NH9() {
		
		System.out.println("9hello sanity, smoke, and regression testing");
	}
	
	
	


}
