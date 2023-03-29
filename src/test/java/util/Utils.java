package util;

import org.openqa.selenium.WebDriver;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

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
/*
    public String getEmail(){

        try(OutputStream outputStream = new FileOutputStream("src/main/resources/test.properties")){

            Properties prop = new Properties();
            prop.setProperty("login", "login");

            System.out.println(prop);

        } catch (IOException ex){
            ex.printStackTrace();
        }
        return true;
    }
 */
}
