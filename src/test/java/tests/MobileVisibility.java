package tests;

import base.TestUtilMobile;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class MobileVisibility extends TestUtilMobile {
    //Todo driver is null and methods are not functioning
    @Test
    private void getAppAndWatchVideoOneAboveTheOther() {
        HomePage homePage = new HomePage(driver);
        homePage.compareLocations();
    }
}
