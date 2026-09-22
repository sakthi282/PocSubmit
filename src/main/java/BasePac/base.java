package BasePac;


import DriverFactory.Driverfactory;
import com.google.common.io.Files;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;


public class base extends Driverfactory {


    public static void Google() {
        driver.get(googleurl);

    }
    public static void Flipkart() {
        driver.get(Flipkarturl);

    }


    public static void maximize() {
        driver.manage().window().maximize();

    }

    public static void implicitWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    public static void SwitchToDefault() throws InterruptedException {
        driver.switchTo().defaultContent();
        Thread.sleep(3000);
    }
    public static void Windowhandler() {
        Set<String> windowhandle = driver.getWindowHandles();
        List<String> list = new ArrayList(windowhandle);
        driver.switchTo().window((String) list.get(1));
    }
    public static void Scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

    }
    public static void Refresh() throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(3000);

    }

    public static void Screenshot(int n) throws IOException {
        TakesScreenshot ss = (TakesScreenshot) driver;
        File screenShot = ss.getScreenshotAs(OutputType.FILE);
        File path = new File("src/main/ScreenShots/" + n + ".png");
        FileHandler.copy(screenShot, path);
    }


    public static void quit() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}


