package pagesMIndWend;

import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class PricingPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'$')] ")
    private WebElement dollarSign;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[1]/div/div/div/div[1]/h3")
    private WebElement questionOne;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[2]/div/div/div/div[1]/h3")
    private WebElement questionTwo;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[3]/div/div/div/div[1]/h3")
    private WebElement questionThree;
    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[4]/div/div/div/div[1]/h3")
    private WebElement questionFour;
    @FindBy(xpath = "//*[contains(text(),'Yes, we accept PayPal for the one-year plan only. Purchasing through PayPal will not renew your subscription at the end of your one-year period.')]")
    private WebElement textQuestionFour;

    @FindBy(xpath = "//*[@id=\"main\"]/div/div[1]/div[4]/div[2]/div[1]/div/div/div/div[2]/div/svg")
    private WebElement questionsFAQSection;

    public PricingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public int currencySignCount() {
        try {
            List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(),'$')] "));
            int count = elements.size();
            return count;
        } catch (NoSuchElementException e) {
            System.out.println("No such currency element exist.");
            return 0;
        }
    }

    public int questionsPresentFAQ() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questionOne);
            List<WebElement> elements = new ArrayList<>();
            elements.add(questionOne);
            elements.add(questionTwo);
            elements.add(questionThree);
            elements.add(questionFour);
            int count = 0;
            for (WebElement element : elements) {
                if (element.isDisplayed()) {
                    count++;
                }
            }
            return count;
        } catch (NoSuchElementException e) {
            System.out.println("No such currency element exist.");
            return 0;
        }
    }
    public void confirmTextQuestionTwo(){
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", questionOne);
        questionTwo.click();
        Assert.assertTrue(textQuestionFour.isDisplayed());
    }
}
