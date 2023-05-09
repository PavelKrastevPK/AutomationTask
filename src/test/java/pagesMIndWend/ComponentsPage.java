package pagesMIndWend;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ComponentsPage {
    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[6]/div/div/div[1]/div[2]/div[2]/div/form/div[2]/input")
    private WebElement subscribeSignUpButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[6]/div/div/div[1]/div[2]/div[2]/div/form/input")
    private WebElement newsletterEmailBar;

    public ComponentsPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void getColorOfElement() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.jsReturnsValue("return document.readyState == 'complete';"));
        newsletterEmailBar.click();
        newsletterEmailBar.sendKeys("Test");
        //subscribeSignUpButton.getAttribute("outerHTML");
//        String elementColour = subscribeSignUpButton.getCssValue("color");
//        System.out.println(elementColour);

    }
}
