package testng;

import org.testng.annotations.Test;

public class FirstTestng {
  
	@Test
	public void testing_login() {
		System.out.println("inside testing_login");
	}
	
	@Test
	public void test_bill_payment() {
		System.out.println("inside test_bill_payment");
	}
	
	@Test
	public void money_transfer() {
		System.out.println("inside money_transfer");
	}
}
