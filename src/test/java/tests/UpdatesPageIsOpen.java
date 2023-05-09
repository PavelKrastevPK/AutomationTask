package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;
import pagesMIndWend.UpdatesPage;

public class UpdatesPageIsOpen extends TestUtil {
    @Test
    private void UpdatesPageIsOpen() {
        HomePage homePage = new HomePage(driver);
        homePage.openUpdatesPage();
        UpdatesPage updatesPage = new UpdatesPage(driver);
        updatesPage.updatesPageIsOpen();
    }
}
