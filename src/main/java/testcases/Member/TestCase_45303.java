package testcases.Member;

import org.testng.annotations.Test;

import pages.DashboardPage;
import pages.LoginPage;
import utils.DataInputProvider;
//TFS ID_45303:Verify Global search results to include Location type when searching with Account EIN numbers

public class TestCase_45303 {


	@Test
	public void verifyLOBClassification(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException 
	{

		//1. Login to CRM using member supervisor / member credentials 
		new LoginPage()
		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
		.typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName)) 
		.clickSignIn()

		//2.Go to Workplace > Accounts and search for EIN 673415 
		.clickWorkplace()
		.selectAccounts()
		.searchOnAccountsPage(DataInputProvider.getCellData_ColName(iRowNumber, "CrmNumber", sDataSheetName))
		.verifySearchAccountLocationType()
		
		;
	}

}