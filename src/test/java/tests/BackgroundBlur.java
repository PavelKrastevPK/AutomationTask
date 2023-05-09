package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class BackgroundBlur extends TestUtil {
    //Todo opacity is not recognized by the test when I tested the test :)
    @Test
    private void backgroundBlur(){
        HomePage homePage = new HomePage(driver);
        homePage.getBackgroundStatus();

    }
}
