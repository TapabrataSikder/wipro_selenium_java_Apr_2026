package testcases;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.AccountOverviewPage;
import pages.LoginPage;
import utilities.ExcelUtils;

public class AccountOverviewTest extends BaseTest {

    @DataProvider(name="loginData")
    public Object[][] getLoginData() throws Exception {
        return ExcelUtils.getLoginData("src/test/resources/TestData.xlsx", "Sheet2");
    }

    @Test(dataProvider = "loginData", dependsOnGroups = "LoginGroup", groups="AccountOverviewGroup")
    public void testAccountOverviewDetails(String username, String password) {
        // Login using the data provider
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginUser(username, password);

        //Initialize Page
        AccountOverviewPage accPage = new AccountOverviewPage(driver);

        // Account details
        BaseTest.capturedAccountId = accPage.getAccountId(1);
        BaseTest.newAccountId = accPage.getAccountId(2);
        
        String primaryBalanace = accPage.getBalance(1);
        String secondaryBalance = accPage.getBalance(2);
//        String avail = accPage.getAvailableAmount();
        String total = accPage.getTotalBalance();

        // Output the details
        System.out.println("--- Account Overview for: " + username + " ---");
        System.out.println("Primary Account: " + BaseTest.capturedAccountId);
        System.out.println("Primary Account Balance: " + primaryBalanace);
        System.out.println("Secondary Account: " + BaseTest.newAccountId);
        System.out.println("Secondary Account Balance: " + secondaryBalance);
        
        System.out.println("Total: " + total);

        // Validation
        Assert.assertNotNull(BaseTest.capturedAccountId);
        Assert.assertNotNull(BaseTest.newAccountId);
    }
}