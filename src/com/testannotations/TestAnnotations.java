package com.testannotations;

import org.testng.annotations.*;

public class TestAnnotations {
	
	@Test
	public void Test1() {
		System.out.println("Test1 Executed");
	}
	@Test
	public void Test2() {
		System.out.println("Test2 Executed");
	}
	
	@BeforeTest
	public void BeforeTest() {
		System.out.println("BeforeTest Executed");
	}
	@AfterTest
	public void AfterTest() {
		System.out.println("AfterTest Executed");
	}
	
	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("BeforeMethod Executed");
	}
	@AfterMethod
	public void AfterMethod() {
		System.out.println("AfterMethod Executed");
	}
	
	@BeforeClass
	public void BeforeClass() {
		System.out.println("BeforeClass Executed");
	}
	@AfterClass
	public void AfterClass() {
		System.out.println("AfterClass Executed");
	}
	
}

