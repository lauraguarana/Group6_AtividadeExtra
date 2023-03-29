import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AutomationActivity {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebElement webElement;

    @Before
    public void before(){

        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @Test()
    public void automationTest() throws InterruptedException {

        driver.get("http://sampleapp.tricentis.com/101/");
    }

    @After
    public void after(){
        driver.quit();
    }
}
