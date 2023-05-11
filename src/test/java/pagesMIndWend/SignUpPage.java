package pagesMIndWend;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class SignUpPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[3]/div/form/div[1]/input[1]")
    private WebElement userNameInput;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[3]/div/form/div[1]/input[2]")
    private WebElement passwordInput;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[3]/div/form/div[2]/input")
    private WebElement signUpButton;

    @FindBy(xpath = "//*[contains(text(),'By clicking on Sign up, you agree to our Terms of service and Privacy policy.')]")
    private WebElement signUpPageStillOpen;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void SignUpProcedure(String userName, String password) {
        userNameInput.click();
        userNameInput.sendKeys(userName);
        passwordInput.click();
        passwordInput.sendKeys(password);
        signUpButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(signUpPageStillOpen));
        if (element.isDisplayed()){ throw new IllegalArgumentException("There is a problem with the Sign Up page");

        }
    }
}
