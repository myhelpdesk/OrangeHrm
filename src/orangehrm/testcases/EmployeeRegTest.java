package orangehrm.testcases;

import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import utils.AppUtils;

public class EmployeeRegTest {

	public static void main(String[] args) throws InterruptedException {

		
AppUtils.launchApp("http://orangehrm.qedgetech.com");
//LoginPage class is a nonstatic class, clalling from nonstatic to static must create object
		LoginPage lp = new LoginPage();
		lp.login("Admin", "Qedge123!@#");
		//Employee class is a nonstatic class, clalling from nonstatic to static must create object
		Employee emp = new Employee();
		boolean res = emp.addEmployee("Vikram","v", "Demo");
		//if(res) value true test case will pass
		if(res)
		{
			System.out.println("New Employee Registration Test Pass");
		}else
		{
			System.out.println("New Employee Registration Test Fail");
		}

		lp.logout();
		AppUtils.closeApp();
	}
	}


