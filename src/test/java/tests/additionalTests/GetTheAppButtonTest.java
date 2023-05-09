package tests.additionalTests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.ComponentsPage;
import pagesMIndWend.HomePage;

public class GetTheAppButtonTest extends TestUtil {
    @Test
    private void GetTheAppButton() {
        HomePage homePage = new HomePage(driver);
        homePage.openComponentsPage();
        ComponentsPage componentsPage = new ComponentsPage(driver);
        componentsPage.getTheAppTest();
    }
}
