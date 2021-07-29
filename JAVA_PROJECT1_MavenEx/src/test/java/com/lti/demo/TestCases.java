package com.lti.demo;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TestCases {
	
	@Test
	public void testAddProduct()
	{
		Product p=new Product(101,"Mobile",5000);
		ProductService ps=new ProductService();
		
		Assertions.assertEquals("Product Added",ps.addProduct(p));
		
	}

	@BeforeAll
	static void setup()
	{
		System.out.println("@BeforeAll Executed");
		
	}
	
	@BeforeEach
	void setupMethod()
	{
		System.out.println("@BeforeEach Executed");
		
	}
	
	
	
//	@Test
//	void testDeposit()
//	{
//		fail("not yet implemented");
//	}
	
	@Test
	void test() {
		Assertions.assertEquals("LTI", "LTI");
	}
	@Test
	void testCalculatorSumMethod()
	{
		Calculator c=new Calculator();
		int r=c.sum(100, 200);
		Assertions.assertEquals(300, r);
		
	}
	
	@Test
	void testCalculatorSumMethod1()
	{
		Calculator c=new Calculator();
		int r=c.sum(100, -200);
		Assertions.assertEquals(-100, r);
		
	}
	
	@Test
	@Disabled
	public void testAry()
	{
		ArrayList<String> myList =new ArrayList<>();
	//
		myList.add("hello");
		
//		Assertions.assertFalse(myList.isEmpty());
		Assertions.assertTrue(myList.isEmpty());
	}
	
	@AfterEach
	void tearMethods()
	{
		System.out.println("@AfterEach Executed");
		
	}
	
	@AfterAll
	static void tearAll()
	{
		System.out.println("\n @AfterAll Executed");
		
	}
}