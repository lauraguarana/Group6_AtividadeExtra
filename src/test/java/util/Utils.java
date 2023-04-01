package util;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

@Slf4j
public class Utils {

    public static WebDriver webDriver;

    public Utils(WebDriver webDriver){

        Utils.webDriver = webDriver;
    }

    public void waitInSeconds(int seconds){
        long start = new Date().getTime();
        while (new Date().getTime() - start < seconds * 1000L){

        }
    }

}
