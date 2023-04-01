package pages;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.Utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

@Slf4j
public class Workflow{

    public static WebDriver webDriver;
    Utils utils = new Utils(webDriver);

    public Workflow(WebDriver webDriver) {
        Workflow.webDriver =  webDriver;
    }

    public boolean acessarURL(String URL){

        webDriver.get(URL);
        utils.waitInSeconds(10);

        return true;
    }

    public boolean selecionarOpcaoMenu(String opcao) {

        String xpath = "//div[@class='main-navigation']//a[text()='"+opcao+"']";
        webDriver.findElement(By.xpath(xpath)).click();
        utils.waitInSeconds(5);

        log.info("A opção "+ opcao + " foi selecionada");

        return true;
    }

    public boolean preencherCampoAutomobile(String nomeDoCampo, String valorDoCampo){

        String xpath = "";
        String option = "";

        switch (nomeDoCampo){

            case "Make":
                xpath = "//select[@id='make']";
                option = "//select[@id='make']//option[text()='"+valorDoCampo+"']";
                webDriver.findElement(By.xpath(xpath)).click();
                utils.waitInSeconds(3);
                webDriver.findElement(By.xpath(option)).click();
                utils.waitInSeconds(2);
                break;

            case "Engine Performance":
                xpath = "//input[@id='engineperformance']";
                webDriver.findElement(By.xpath(xpath)).click();
                webDriver.findElement(By.xpath(xpath)).sendKeys(valorDoCampo);
                utils.waitInSeconds(2);
                break;

            case "Date of Manufacture":
                xpath = "//input[@id='dateofmanufacture']";
                webDriver.findElement(By.xpath(xpath)).click();
                webDriver.findElement(By.xpath(xpath)).sendKeys(valorDoCampo);
                utils.waitInSeconds(2);
                break;

            case "Number of Seats":
                xpath = "//select[@id='numberofseats']";
                option = "//select[@id='numberofseats']//option[text()='"+valorDoCampo+"']";
                webDriver.findElement(By.xpath(xpath)).click();
                utils.waitInSeconds(2);
                webDriver.findElement(By.xpath(option)).click();
                utils.waitInSeconds(2);
                break;

            case "Fuel Type":
                xpath = "//select[@id='fuel']";
                option = "//select[@id='fuel']//option[text()='"+valorDoCampo+"']";
                webDriver.findElement(By.xpath(xpath)).click();
                utils.waitInSeconds(2);
                webDriver.findElement(By.xpath(option)).click();
                utils.waitInSeconds(2);
                break;

            case "List Price":
                xpath = "//input[@id='listprice']";
                webDriver.findElement(By.xpath(xpath)).click();
                webDriver.findElement(By.xpath(xpath)).sendKeys(valorDoCampo);
                utils.waitInSeconds(2);
                break;

            case "License Plate Number":
                xpath = "//input[@id='licenseplatenumber']";
                webDriver.findElement(By.xpath(xpath)).click();
                webDriver.findElement(By.xpath(xpath)).sendKeys(valorDoCampo);
                utils.waitInSeconds(2);
                break;

            case "Annual Mileage":
                xpath = "//input[@id='annualmileage']";
                webDriver.findElement(By.xpath(xpath)).click();
                webDriver.findElement(By.xpath(xpath)).sendKeys(valorDoCampo);
                break;
        }

        utils.waitInSeconds(10);
        return true;
    }

}
