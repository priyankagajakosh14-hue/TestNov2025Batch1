package javaPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotFailure2 {
	
	TakeScreenshotonFailure1 t1=new TakeScreenshotonFailure1();
	
	@Test
	public void doLogin() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\priya\\Downloads\\chromedriver-win64.exe");
		t1.driver=new ChromeDriver();
		t1.driver.manage().window().maximize();
		t1.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		t1.driver.get("https://www.facebook.com/");
		t1.driver.findElement(By.id("wrong_id")).click();
	}
	
	@AfterMethod
	public void takeScreenshot(ITestResult result2) throws Exception {
		t1.captureScreenShot(result2);
		
	}
	

}
