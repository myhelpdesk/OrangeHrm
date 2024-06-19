package orangehrm.testcases;

import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;

public class UserRegistrationTest {


	public static void main(String[] args) throws InterruptedException 
	{
		
		AppUtils.launchApp("http://orangehrm.qedgetech.com");
		//LoginPage class is a nonstatic class, clalling from nonstatic to static must create object
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		//User class is a nonstatic class, clalling from nonstatic to static must create object
		User us = new User();
		boolean res = us.addUser("ESS","Narayan S", "qedge 3", "Kishore123!@#");
		if(res)
		{
			System.out.println("New User Registration Test Pass");
		}else
		{
			System.out.println("New User Registration Test Fail");
		}
		lp.logout();
		AppUtils.closeApp();
	}
}
