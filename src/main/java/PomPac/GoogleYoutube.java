package PomPac;

import BasePac.base;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleYoutube extends base {
    public GoogleYoutube(WebDriver dr){
        this.driver=dr;
        PageFactory.initElements(dr,this);
    }

    @FindBy(xpath="//a[@aria-label='Google apps']")
    public WebElement AppIcon;
    public void ClickGoogleApps() throws InterruptedException {
        AppIcon.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath="//iframe[@name='app']")
    public WebElement frame1;
    public void AppsFrameSwitch() throws InterruptedException {
        driver.switchTo().frame(frame1);
        Thread.sleep(3000);
        implicitWait();
    }
    @FindBy(xpath="//span[@data-text='YouTube']")
    public WebElement youtube;
    public void ClickYouTubebtn() throws InterruptedException {
        youtube.click();
        SwitchToDefault();
        Thread.sleep(3000);
    }
    @FindBy(xpath="//input[@placeholder='Search']")
    public WebElement searchbtn ;
    public void ClickYouTubeSearchbtn() throws InterruptedException {
        searchbtn.click();
        Thread.sleep(3000);
        searchbtn.sendKeys("tamil songs", Keys.ENTER);
        Scroll();
        Thread.sleep(3000);

    }
    @FindBy(xpath="(//div[@id='title-wrapper'])[1]")
    public WebElement songClick ;
    public void ClicksongClick() throws InterruptedException {

        songClick.click();
    }

}
