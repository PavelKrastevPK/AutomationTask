package pagesMIndWend;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class PricingPage {
    private WebDriver driver;

    @FindBy(xpath = "//*[contains(text(),'$')] ")
    private WebElement dolarSignElement;


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
    public void questionsPresentFAQ(){
        By elementLocator = By.tagName("www.w3.org");

        List<WebElement> elements = driver.findElements(elementLocator);

        int count = elements.size();
        System.out.println("Total count of elements: " + count);
    }
}
