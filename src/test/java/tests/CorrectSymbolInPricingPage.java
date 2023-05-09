package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;
import pagesMIndWend.PricingPage;

public class CorrectSymbolInPricingPage extends TestUtil {

    @Test
    private void WatchVideoTest() {
        HomePage homePage = new HomePage(driver);
        homePage.openPricingPage();
        PricingPage pricingPage = new PricingPage(driver);
        Assert.assertEquals(pricingPage.currencySignCount(),3,"There are less than " +
                "the expected currency signs");
    }
}
