package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class BackgroundBlur extends TestUtil {
    @Test
    private void backgroundBlur(){
        HomePage homePage = new HomePage(driver);
        homePage.getBackgroundStatus();

    }
}
