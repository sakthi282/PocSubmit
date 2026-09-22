package PomPac;


import BasePac.base;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class GooglePlay extends base {

    public GooglePlay(WebDriver dr){
        this.driver=dr;
        PageFactory.initElements(dr,this);
    }

    @FindBy(xpath="//a[@aria-label='Google apps']")
    public WebElement AppIcon;
    public void googleapps() throws InterruptedException {
        AppIcon.click();
        Thread.sleep(3000);
    }

    @FindBy(xpath="//iframe[@name='app']")
    public WebElement frame1;
    public void AppsFrameSwitch() throws InterruptedException {
        driver.switchTo().frame(frame1);
        Thread.sleep(3000);

    }
    @FindBy(xpath="//span[@data-text='Play']")
    public WebElement playstore;
    public void ClickPlaystorebtn() throws InterruptedException {
        playstore.click();
        SwitchToDefault();
        Thread.sleep(3000);
    }
    @FindBy(xpath="//button[@aria-label='Search']")
    public WebElement searchbtn ;
    public void ClickSearchbtn() throws InterruptedException {
        searchbtn.click();
         Thread.sleep(3000);
    }
    @FindBy(xpath="//input[@aria-label='Search Google Play']")
    public WebElement searchbar ;
    public void SearchByGamename() throws InterruptedException {
        searchbar.click();
        searchbar.sendKeys("bgmi" + Keys.ENTER);
        Thread.sleep(3000);
    }
    @FindBy(xpath="//a[@aria-label='BGMI: FPS Battle Royale']")
    public WebElement bgmiclick ;
    public void GamedetailsScreenshot() throws InterruptedException, IOException {
        bgmiclick.click();
        Thread.sleep(4000);
        Screenshot(1);
    }
}
