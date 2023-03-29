package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.Utils;

@Slf4j
public class Workflow {

    public static WebDriver webDriver;
    PageObjects pageObjects;
    Utils utils = new Utils(webDriver);

    public Workflow(WebDriver webDriver) {
        Workflow.webDriver =  webDriver;
        pageObjects = PageFactory.initElements(webDriver, PageObjects.class);
    }
/*
    public boolean preencherEmail(String email){

        pageObjects.getEmail().click();
        utils.waitInSeconds(2);
        pageObjects.getEmail().sendKeys(utils.getEmail());
    }
*/
}
