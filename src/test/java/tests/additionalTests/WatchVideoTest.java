package tests.additionalTests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class WatchVideoTest extends TestUtil {
    @Test
    private void WatchVideoTest() {
        HomePage homePage = new HomePage(driver);
        homePage.WatchVideo();

    }
}