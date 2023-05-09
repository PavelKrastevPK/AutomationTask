package pagesMIndWend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class UpdatesPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[contains(text(),'Stay up-to-date with new courses, tutorials and livestreams.')]")
    private WebElement updatesPageConfirmation;

    public UpdatesPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void updatesPageIsOpen() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(updatesPageConfirmation));
        assert element.isDisplayed();
    }
}
