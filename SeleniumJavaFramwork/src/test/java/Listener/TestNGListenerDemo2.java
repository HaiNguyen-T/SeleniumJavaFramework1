package Listener;

import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import junit.framework.Assert;

//@Listeners(Listener.TestNGListeners.class)
public class TestNGListenerDemo2 {
	@Test
	public void test3() {
		System.out.println("I am inside test 3");
	}
	
	@Test
	public void test4() {
		System.out.println("I am inside test 4");
		//Assert.assertTrue(false);
	}
	
	@Test
	public void test5() {
		System.out.println("I am inside test 5");
		throw new SkipException("This test is skipped");
	}
}
