import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Workflow;

public class AutomationActivity {

    public static WebDriver driver;
    public static WebDriverWait wait;
    public static WebElement webElement;
    public static Workflow workflow;


    @Before
    public void before(){

        System.setProperty("webdriver.chrome.driver", "src/main/driver/chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
    }

    @Test()
    public void automationTest() throws InterruptedException {

        workflow = new Workflow(driver);

        Assert.assertTrue(workflow.acessarURL("http://sampleapp.tricentis.com/101/"));
        Assert.assertTrue(workflow.selecionarOpcaoMenu("Automobile"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("Make", "Porsche"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("Engine Performance", "200"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("Date of Manufacture", "03/31/2023"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("Number of Seats", "5"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("Fuel Type", "Diesel"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("List Price", "50000"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("License Plate Number", "1234567890"));
        Assert.assertTrue(workflow.preencherCampoAutomobile("Annual Mileage", "10000"));

        driver.quit();
    }

}
