package com.timeTracking.actitime.Automation.genericutility;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Baseclass {
@BeforeSuite
public void bsConfig() {//20/10
	System.out.println("Database Connection has been extablished");
}
	@BeforeClass
	public void bcConfig(){
		System.out.println("browser launched");
		System.out.println("navigate to url");
	}
	@BeforeMethod
	public void bmConfig(){
		System.out.println("login");
		}
	@AfterMethod
	public void amConfig(){
		System.out.println("logout");
		}
	@AfterClass
	public void acConfig(){
		System.out.println("close browser");
		}
	@AfterSuite
	public void asConfig(){
		System.out.println("close DB");
		}
}
