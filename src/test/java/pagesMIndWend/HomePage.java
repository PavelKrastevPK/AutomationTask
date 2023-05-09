package pagesMIndWend;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

public class HomePage {
    private WebDriver driver;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[1]/div/div/div/div[3]/div/div/div/p/span")
    private WebElement signUpButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[1]/div/div/div/p/span")
    private WebElement componentsPageButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[2]/div/div")
    private WebElement pricingPageButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[1]/div/div/div/div[2]/div/div/div[3]/div/div/div/p")
    private WebElement updatesPageButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[4]/div[2]/div/div/div[2]")
    private WebElement watchVideoButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[4]/div[1]/div/div/div[2]/p/span")
    private WebElement getTheAppButton;
    @FindBy(xpath = "//*[@id=\"overlay\"]/div[2]")
    private WebElement backgroundWhenGetTheApp;
    @FindBy(xpath = "//*[contains(text(),'Click to view in 3D')]")
    private WebElement image3DButton;
    @FindBy(xpath = "//*[@name= 'Card']")
    private WebElement cardsElements;
    @FindBy(xpath = "//*[@id='canvas3d']")
    private WebElement image3D;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[4]/div[1]/div/div")
    private WebElement mobileGetTheAppButton;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[2]/div[2]/div[4]/div[2]/div/div/div[2]/p/span")
    private WebElement mobileWatchVideoButton;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public SignUpPage openSignUpPage() {
        signUpButton.click();
        return new SignUpPage(driver);
    }

    public UpdatesPage openUpdatesPage() {
        updatesPageButton.click();
        return new UpdatesPage(driver);
    }

    public ComponentsPage openComponentsPage() {
        signUpButton.click();
        return new ComponentsPage(driver);
    }

    public PricingPage openPricingPage() {
        pricingPageButton.click();
        return new PricingPage(driver);
    }

    public void WatchVideo() {
        watchVideoButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(
                "//*[contains(text(),'Trusted by 8,000 companies worldwide')]")));
        if (element.isDisplayed()) {
            throw new IllegalArgumentException("There is a problem opening Video Page");
        }
    }

    public void getCardsText() {
        List<WebElement> cards = driver.findElements(By.xpath("//*[@name='Card']"));
        List<WebElement> smallCards = driver.findElements(By.xpath("//*[@name='Card Small']"));
        List<WebElement> allCardsList = new ArrayList<>();
        allCardsList.addAll(cards);
        allCardsList.addAll(smallCards);
        int cardsSize = allCardsList.size();
        int cardsContainsVisit = 0;
        for (WebElement element : allCardsList) {
            if (element.getAttribute("outerHTML").contains("visit")) {
                cardsContainsVisit++;
            }
        }
        if (cardsSize == cardsContainsVisit) {
            System.out.println("All " + cardsSize + " cards have 'visit' sign.");
        } else {
            throw new IllegalArgumentException("Only " + cardsContainsVisit + " have 'visit' sign out of " + cardsSize);
        }
    }

    public void getBackgroundStatus() {
        getTheAppButton.click();
        String style = backgroundWhenGetTheApp.getAttribute("style");
        boolean isBlurred = style.contains("opacity = 0.0236393");
        if (isBlurred = true) {
        } else {
            System.out.println("There is a problem blurring the background");
        }
    }

    public void compareLocations() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOf(mobileGetTheAppButton));
        int appLocation = element1.getLocation().y;
        int videoLocation = mobileWatchVideoButton.getLocation().y;
        System.out.println(appLocation);
        System.out.println(videoLocation);
    }
    public void confirm3DImageIsShown(){
        driver.manage().window().maximize();
        image3DButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element1 = wait.until(ExpectedConditions.visibilityOf(image3D));
    assert element1.isDisplayed();
    }
}

