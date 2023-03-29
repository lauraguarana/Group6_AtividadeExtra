package pages;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class PageObjects {

    public WebDriver webDriver;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement email;

    @FindBy(xpath = "//button//span[text()='Avançar']")
    public WebElement botaoAvancar;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement passwordTextBox;

    /**
     * Constructor
     */
    public PageObjects(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
}
