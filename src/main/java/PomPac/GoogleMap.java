package PomPac;

import BasePac.base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

public class GoogleMap extends base {
    public GoogleMap(WebDriver dr){
        this.driver=dr;
        PageFactory.initElements(dr,this);
    }

    @FindBy(xpath="//a[@aria-label='Google apps']")
    public WebElement AppIcon;
    public void ClickGoogleAppsIcon() throws InterruptedException {
        AppIcon.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath="//iframe[@name='app']")
    public WebElement frame2;
    public void AppsFrameSwitch() throws InterruptedException {
        driver.switchTo().frame(frame2);
        Thread.sleep(3000);
        implicitWait();
    }
    @FindBy(xpath="//span[@data-text='Maps']")
    public WebElement MapBtn;
    public void ClickMapBtn() throws InterruptedException {
        MapBtn.click();
        SwitchToDefault();
        Thread.sleep(3000);
    }
    @FindBy(xpath ="//input[@id='ucc-1']" )
    public WebElement searchbar;
    public void ClickSearchRoute() throws InterruptedException, IOException {
        searchbar.click();
        Thread.sleep(2000);
        searchbar.sendKeys("Chennai to Salem" + Keys.ENTER);
        Screenshot(2);
        Thread.sleep(4000);

    }
    @FindBy(xpath ="//div[@aria-label='Driving']" )
    public WebElement CarRoute;
    public void ClickCarRoute() throws InterruptedException, IOException {
        CarRoute .click();
        Thread.sleep(4000);
        Screenshot(3);
   }
   @FindBy(xpath ="//div[@aria-label='Two-wheeler']" )
    public WebElement BikeRoute;
    public void ClickBikeRoute() throws InterruptedException, IOException {

        BikeRoute.click();
        Thread.sleep(4000);
        Screenshot(4);
        Thread.sleep(4000);
    }
    @FindBy(xpath ="//div[@aria-label='Transit']" )
    public WebElement TransitRoute;
    public void ClickTransitRoute() throws InterruptedException, IOException {

        TransitRoute.click();
        Thread.sleep(4000);
        Screenshot(5);
        Thread.sleep(4000);
    }
    @FindBy(xpath ="//div[@aria-label='Walking']" )
    public WebElement WalkingRoute;
    public void ClickWalkingRoute() throws InterruptedException, IOException {
        WalkingRoute.click();
        Thread.sleep(4000);
        Screenshot(6);
        Thread.sleep(4000);
    }


}
