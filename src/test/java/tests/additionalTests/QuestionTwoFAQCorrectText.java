package tests.additionalTests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class QuestionTwoFAQCorrectText extends TestUtil {
    @Test
    private void QuestionTwoFAQCorrectText() {
        HomePage homePage = new HomePage(driver);
        homePage.openPricingPage();
    }
}
