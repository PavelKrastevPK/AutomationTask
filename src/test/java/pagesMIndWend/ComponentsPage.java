package pagesMIndWend;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComponentsPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[@type='submit']")
    private WebElement subscribeSignUpButton;
    @FindBy(name = "email")
    private WebElement newsletterEmailBar;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[4]/div[1]/div/div/div[2]/p/span")
    private WebElement getTheAppButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[3]/p")
    private WebElement componentsPageIsOpen;
    @FindBy(className = "spline-watermark")
    private WebElement designBall;

    public ComponentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String getColorOfElement() {
        driver.manage().window().maximize();
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", newsletterEmailBar);
        String elementColourRGBA = subscribeSignUpButton.getCssValue("background");
        //String convertColorToRGB = Color.fromString(elementColourRGBA).asRgb();
        String convertBackgroundToRGB = elementColourRGBA.replaceAll("[\\s\\S]{0,55}$","");
        return convertBackgroundToRGB;
    }

    public void getTheAppTest() {
        getTheAppButton.click();
        if (getTheAppButton.isDisplayed()) {
            throw new IllegalArgumentException();
        }
    }
}


