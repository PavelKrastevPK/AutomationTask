package tests;

import base.TestUtil;
import pagesMIndWend.HomePage;
import pagesMIndWend.SignUpPage;
import org.testng.annotations.Test;

public class LoginTest extends TestUtil {
    @Test(dataProvider = "csvUserList")
    private void LoginTests(String username,String password){
        HomePage homepage = new HomePage(driver);
        homepage.openSignUpPage();
        SignUpPage signUpPage = new SignUpPage(driver);
        signUpPage.SignUpProcedure(username,password);
    }
}
