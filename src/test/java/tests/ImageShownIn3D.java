package tests;

import base.TestUtil;
import org.testng.annotations.Test;
import pagesMIndWend.HomePage;
//Todo element can be found in DevTools but selenium cannot find it
public class ImageShownIn3D extends TestUtil {
    @Test
    private void imageShownIn3D(){
        HomePage homePage = new HomePage(driver);
        homePage.confirm3DImageIsShown();
    }
}
