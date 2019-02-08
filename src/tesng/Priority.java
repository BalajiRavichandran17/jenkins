package tesng;

import org.testng.annotations.Test;

public class Priority {
	
	@Test(priority=-2)
	public void priorityTest1() {
		System.out.println("Case Exceuted  -2");

	}
	@Test(priority=-1)
	public void priorityTest2() {
		System.out.println("Case Exceuted  -1");

	}
	@Test(priority=1)
  public void priorityTest3() {
		System.out.println("Case Exceuted  1");

	}
	@Test(priority=2)
	public void priorityTest4() {
		System.out.println("Case Exceuted  2");

	}
}
