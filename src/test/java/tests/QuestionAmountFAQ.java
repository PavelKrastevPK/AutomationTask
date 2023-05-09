package tests;

import base.TestUtil;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;
import pagesMIndWend.PricingPage;

public class QuestionAmountFAQ extends TestUtil {
    @Test
    private void QuestionAmountFAQ() {
        HomePage homePage = new HomePage(driver);
        homePage.openPricingPage();
        PricingPage pricingPage = new PricingPage(driver);
        Assert.assertEquals(pricingPage.questionsPresentFAQ(),4,"There are less than the " +
                "expected questions");
    }
}
