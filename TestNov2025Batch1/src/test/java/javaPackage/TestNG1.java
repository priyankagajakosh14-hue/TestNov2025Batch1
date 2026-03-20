package javaPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG1 {
	
	@Test
	public void a2() {
		System.out.println("hello Test1 method");
	}
	@Test
	public void a1() {
		System.out.println("hello Test2 method");
	}
	@Test
	public void a() {
		System.out.println("hello Test3 method");
	}
	@BeforeTest
	public void b() {
		System.out.println("hello @BeforeTest method");
	}
	
	@BeforeSuite
	public void a3() {
		System.out.println("hello @BeforeSuite method");
	}
	@BeforeClass
	public void a4() {
		System.out.println("hello @BeforeClass  method");
	}
	@AfterClass
	public void a5() {
		System.out.println("hello @AfterClass method");
	}
	@AfterSuite
	public void a6() {
		System.out.println("hello @AfterSuite method");
	}
	@AfterTest
	public void a7() {
		System.out.println("hello @AfterTest method");
	}
	@BeforeMethod
	public void a8() {
		System.out.println("hello @BeforeMethod method");
	}
	@AfterMethod
	public void a9() {
		System.out.println("hello @AfterMethod method");
	}
}
