package DriverFactory;


import configFileReader.configFileReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.IOException;


public class Driverfactory {

    public static WebDriver driver;
    public static String googleurl;
    public static String Flipkarturl;

    public static void initialize_browser() throws IOException {

        configFileReader cf = new configFileReader();
        String browser = cf.getbrowser();
        googleurl = cf.geturl1();
        Flipkarturl = cf.geturl2();

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        }

    }
    }



