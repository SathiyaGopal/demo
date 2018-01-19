package com.ustglobal.demo.ci;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {
	
// check whether sum of 5 and 5 should returns 10 	
	@Test
	public void tc_001() throws IOException{
			
		if (App.sumOfTwoNumbersTest(5, 5)==10) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}		
	}
	
	// check whether sum of -5 and 5 returns 0 	
		@Test
		public void tc_002() throws IOException{
			
			if (App.sumOfTwoNumbersTest(-5, 5)==0) {
				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);

			}			
		}
	
		// check whether sum of -5 and -5  returns -10 	
		@Test
		public void tc_003() throws IOException{

		if (App.sumOfTwoNumbersTest(-5, -5)==-10) {

			Assert.assertTrue(true);

		} else {
			Assert.assertTrue(false);

		}

	}
		
		// check whether sum of 99999 and 99999 returns 199998 	
		@Test
		public void tc_004() throws IOException{
			
			if (App.sumOfTwoNumbersTest(99999, 99999)==199998) {

				Assert.assertTrue(true);

			} else {
				Assert.assertTrue(false);

			}			
		}
// check whether sum of 5 and "a" returns the message Please enter the valid inputs 	
				@Test
				public void tc_005() throws IOException{
					
					if (App.sumOfTwoNumbersTest(5, "a").equalsIgnoreCase("please enter the valid inputs")) {

						Assert.assertTrue(true);

					} 
					else {
						Assert.assertTrue(false, "tc_005  is failed \n \n Please enter the valid Numbers and try again");

					}					
		}
}
