package Demo;

import org.testng.annotations.Test;

public class TestNGDependencyDemo {
	
	@Test(dependsOnGroups = {"sanity1"})
	public void test1() {
		
		System.out.println("I am inside test1");
	}

	@Test (groups = {"sanity1"})
	public void test2() {
		
		System.out.println("I am inside test2");
	}
	
	@Test (priority = 2)
	public void test3() {
		
		System.out.println("I am inside test3");
	}
}
