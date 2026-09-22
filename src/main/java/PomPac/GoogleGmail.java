package PomPac;

import BasePac.base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class GoogleGmail extends base {

    public GoogleGmail(WebDriver dr){
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
    public WebElement frame3;
    public void AppsFrameSwitch() throws InterruptedException {
        driver.switchTo().frame(frame3);
        Thread.sleep(3000);
        implicitWait();
    }
    @FindBy(xpath="//span[@data-text='Gmail']")
    public WebElement gmail;
    public void ClickGmailbtn() throws InterruptedException {
        gmail.click();
        SwitchToDefault();
        Thread.sleep(3000);
    }

    @FindBy(xpath="//span[text()='Sign in']")
    public WebElement signInbtn ;
    public void ClicksignInbtn() throws InterruptedException {
        signInbtn.click();
        Thread.sleep(3000);
        Windowhandler();
    }

    @FindBy(xpath="//input[@class='whsOnd zHQkBf']")
    public WebElement emailid;
    public void ClickEmail() throws InterruptedException, IOException {

        Thread.sleep(2000);
        emailid.click();

        Thread.sleep(2000);
        emailid.sendKeys("sakthi3070@gmail.com" + Keys.ENTER);

    }
}
