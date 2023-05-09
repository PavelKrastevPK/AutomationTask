package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class WatchVideo extends TestUtil {
    @Test
    private void WatchVideoTest() {
        HomePage homePage = new HomePage(driver);
        homePage.WatchVideo();

    }
}
