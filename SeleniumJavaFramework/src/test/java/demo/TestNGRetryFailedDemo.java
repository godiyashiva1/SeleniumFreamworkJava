package demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class TestNGRetryFailedDemo {
	

	@Test
	public void test1() {
		System.out.println("This is Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("This is Test2");
		//int i =1/0;
	}
	@Test
	public void test3() {
		System.out.println("This is Test3");
		//int i =5/0;
	}
	
}
