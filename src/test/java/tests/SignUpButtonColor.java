package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesMIndWend.ComponentsPage;
import pagesMIndWend.HomePage;


public class SignUpButtonColor extends TestUtil {

    @Test
    private void SignUpButtonColor(){
        HomePage homePage = new HomePage(driver);
        homePage.openComponentsPage();
        ComponentsPage componentsPage = new ComponentsPage(driver);
        Assert.assertEquals(componentsPage.getColorOfElement(),"rgb(255, 82, 79)","This " +
                "button is not the right color");
    }
}
