package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class VisitButtonOnCards extends TestUtil {
    @Test
    private void VisitButtonOnCards() {
        HomePage homePage = new HomePage(driver);
        homePage.getCardsText();
    }
}
