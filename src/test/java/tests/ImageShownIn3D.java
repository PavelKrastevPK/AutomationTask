package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;

public class ImageShownIn3D extends TestUtil {
    @Test
    private void imageShownIn3D(){
        HomePage homePage = new HomePage(driver);
        homePage.confirm3DImageIsShown();
    }
}
