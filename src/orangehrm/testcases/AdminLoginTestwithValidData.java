package orangehrm.testcases;

import orangehrm.library.LoginPage;
import utils.AppUtils;

public class AdminLoginTestwithValidData {
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		//from AppUtils class calling launchApp method
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		//LoginPage class is a nonstatic class, clalling from nonstatic to static must create object
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		//admin displayed or not check here
		boolean res = lp.isAdminModuleDisplayed();
		if(res)
		{
			System.out.println("Admin Login Test Pass");
		}else
		{
			System.out.println("Admin Login Test Fail");
		}
		
		lp.logout();
		AppUtils.closeApp();
		

	}

	

}
