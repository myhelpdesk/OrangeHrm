package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithInvalidData {

	public static void main(String[] args) {
		//from AppUtils class calling launchApp method
AppUtils.launchApp("http://orangehrm.qedgetech.com");
//LoginPage class is a nonstatic class, clalling from nonstatic to static must create object
		LoginPage lp = new LoginPage();
		lp.login("abc", "xyz");
		
		boolean res = lp.isErrMsgDisplayed();
		//if error message displayed true
		if(res)
		{
			System.out.println("System displayed expected Error Message for invalid inputs, Test Pass");
			
		}else
		{
			System.out.println("System not displayed expected Error Message for invalid inputs, Test Fail");
		}
		
		AppUtils.closeApp();
	}

}
