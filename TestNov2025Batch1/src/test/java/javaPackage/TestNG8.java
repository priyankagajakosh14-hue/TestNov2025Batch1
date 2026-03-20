package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG8 {
	
	WebDriver driver;
	
	@BeforeClass
	public void setEnv() {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
	}
	@DataProvider
	public Object[][] dataSet(){
		Object arr[][]=new Object[3][2];
		
		arr[0][0]="TestData1";
		arr[0][1]="TestData1";
		
		arr[1][0]="TestData2";
		arr[1][1]="TestData2";
		
		arr[2][0]="TestData3";
		arr[2][1]="TestData3";
		
		return arr;
		
	}
	
	@Test(dataProvider="dataSet")
	public void enterData(String UserName,String Password) throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).clear();
		
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys(UserName);
		
		Thread.sleep(1000);
		driver.findElement(By.id("pass")).sendKeys(Password);
		
		
	}

}
