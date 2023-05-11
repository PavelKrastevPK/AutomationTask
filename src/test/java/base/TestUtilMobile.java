package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class TestUtilMobile {
    public WebDriver driver;
    private int implicitWait;

    @BeforeMethod
    public void Setup() {
        setupBrowserDriver();
    }

    @AfterMethod
    public void tearDown() {
       // driver.quit();
    }

    private void setupBrowserDriver() {
        try (FileInputStream configFile = new FileInputStream("src/test/resources/MindWend/")) {
            Properties config = new Properties();
            config.load(configFile);
            implicitWait = Integer.parseInt(config.getProperty("implicitWait"));
        } catch (IOException e) {
            System.out.println("Cannot read configs");
        }
        createGetChromeDriver(implicitWait);

    }

    private void createGetChromeDriver(int implicitWait) {
        System.setProperty("web-driver.chrome.driver", "C:\\Users\\Pavel\\.cache\\selenium\\chromedriver\\win32\\112.0.5615.49\\chromedriver.exe");
        Map<String, String> mobileEmulation = new HashMap<>();
        mobileEmulation.put("deviceName", "Galaxy S5");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("mobileEmulation", mobileEmulation);
        ChromeDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(implicitWait));
        driver.get("https://mind-wend-913065.framer.app/");
    }
}
