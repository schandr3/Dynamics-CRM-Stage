package testcases.Member;

import org.testng.annotations.Test;


import pages.LoginPage;

import utils.DataInputProvider;
//TFS ID_33113: Verify by Creating two Child accounts one with "Exclude from Roster" Yes other with No, Under the parent has "Exclude from Roster" as No.
public class TestCase_33113 {


	@Test
	public void verifyTwoAccountsWithExcludeFromRosterUnderSameDP(int iRowNumber, String sDataSheetName) throws Exception, InterruptedException 
	{
		//new WebDriverServiceImpl();
		//1. Login to CRM using member supervisor / member credentials 
		new LoginPage()
		.typeUsername(DataInputProvider.getCellData_ColName(iRowNumber, "username", sDataSheetName))
		.typePassword(DataInputProvider.getCellData_ColName(iRowNumber, "password", sDataSheetName)) 
		.clickSignIn()

		//2.Go to Workplace > Accounts and search for EIN 673415 
		.clickWorkplace()
		.selectAccounts()
		.searchOnAccountsPage(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParent", sDataSheetName))

		//3.Double click on the account and go to Sub accounts entity by clicking > on the top 
		.selectAccountFromSearchResults()
		.selectSubaccount()

		//4. Click on Add new account 
		.clickNewAccountInSubAccount()
		.switchToSubAccount()

		//Select member form
		.chooseMemberFormInSubAccount()

		//6. Account Name = Any
		.typeAccountName(DataInputProvider.getCellData_ColName(iRowNumber, "AccountName", sDataSheetName))


		//Click on save 
		.clickSave()


		//Go to Frame 0
		.choosecontentFrame0()

		//5. Verify Direct parent and Top parent are populated 
		.verifyDirectParent(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyDirectParent", sDataSheetName))
		.verifyTopParent(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyTopParent", sDataSheetName))

		//Verify 'Exclude From Roster' is No
		.verifyExcludeFromRoster(DataInputProvider.getCellData_ColName(iRowNumber, "ExcludeFromRoster", sDataSheetName))


		//6.	//Top Parent Relation =  OLM
		.selectTopParentRelation0(DataInputProvider.getCellData_ColName(iRowNumber, "TopParentRelation", sDataSheetName))

		//Top Parent Relation Date = Today's Date
		.selectTopParentRelationDate( DataInputProvider.getCellData_ColName(iRowNumber, "TopParentRelationDate", sDataSheetName))

		//type TP reason
		.typeTPReason(DataInputProvider.getCellData_ColName(iRowNumber, "TPReason", sDataSheetName))

		//select Account Type = Member
		.selectAccountType(DataInputProvider.getCellData_ColName(iRowNumber, "AccountType", sDataSheetName))

		//select Participation Type = Standard
		.selectParticipationType(DataInputProvider.getCellData_ColName(iRowNumber, "ParticipationType", sDataSheetName))

		//select DPR
		.selectDirectParentRelationMEF(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParentRelation", sDataSheetName))

		//select DPRD
		.selectDirectParentRelationDate(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParentRelationDate", sDataSheetName))

		.selectExcludeFromRoster("Yes")

		//Click on save 
		.clickSave()

		//Go to Frame 0
		.choosecontentFrame0()

		//Verify 'Exclude From Roster' is Yes
		.verifyExcludeFromRoster(DataInputProvider.getCellData_ColName(iRowNumber, "ExcludeFromRoster1", sDataSheetName))

		//Error Message verification
		.verifyExcludeFromRosterErrorIsNotDisplayed()


		

		//Switch to Main Account
		.switchToMainPage()

		//Create a New Sub Account under same DP
		//4. Click on Add new account 
		.clickNewAccountInSubAccount()
		.switchToSubAccountInWindow2()

		
		//6. Account Name = Any
		.typeAccountName(DataInputProvider.getCellData_ColName(iRowNumber, "ErrorMessage", sDataSheetName))


		//Click on save 
		.clickSave()


		//Go to Frame 0
		.choosecontentFrame0()

		//5. Verify Direct parent and Top parent are populated 
		.verifyDirectParent(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyDirectParent", sDataSheetName))
		.verifyTopParent(DataInputProvider.getCellData_ColName(iRowNumber, "VerifyTopParent", sDataSheetName))

		//Verify 'Exclude From Roster' is No
		.verifyExcludeFromRoster(DataInputProvider.getCellData_ColName(iRowNumber, "ExcludeFromRoster", sDataSheetName))


		//6.	//Top Parent Relation =  OLM
		.selectTopParentRelation0(DataInputProvider.getCellData_ColName(iRowNumber, "TopParentRelation", sDataSheetName))

		//Top Parent Relation Date = Today's Date
		.selectTopParentRelationDate( DataInputProvider.getCellData_ColName(iRowNumber, "TopParentRelationDate", sDataSheetName))

		//type TP reason
		.typeTPReason(DataInputProvider.getCellData_ColName(iRowNumber, "TPReason", sDataSheetName))

		//select Account Type = Member
		.selectAccountType(DataInputProvider.getCellData_ColName(iRowNumber, "AccountType", sDataSheetName))

		//select Participation Type = Standard
		.selectParticipationType(DataInputProvider.getCellData_ColName(iRowNumber, "ParticipationType", sDataSheetName))

		//select DPR
		.selectDirectParentRelationMEF(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParentRelation", sDataSheetName))

		//select DPRD
		.selectDirectParentRelationDate(DataInputProvider.getCellData_ColName(iRowNumber, "DirectParentRelationDate", sDataSheetName))


		//Click on save 
		.clickSave()

		//Error Message verification
		.verifyExcludeFromRosterErrorIsNotDisplayed()


		;
	}

}