package PomPac;

import BasePac.base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Flipkart extends base {
    public Flipkart(WebDriver dr){
        this.driver=dr;
        PageFactory.initElements(dr,this);
    }
    @FindBy(xpath=("//span[@role='button']") )
    public WebElement clickx;
    public void ClickEntranceX() throws InterruptedException {
        implicitWait();
        clickx.click();
        Thread.sleep(3000);
    }
    @FindBy(name ="q" )
    public WebElement Flipkartsearchbar;
    public void ClickFlipkartsearchbar(String itemname) throws InterruptedException {
        Flipkartsearchbar.click();
        Flipkartsearchbar.clear();

        Flipkartsearchbar.sendKeys(itemname,Keys.ENTER);
        implicitWait();

    }
    @FindBy(xpath=("//div[@class='lWX0_T']"))
    public WebElement firstproduct;
    public void Clicklapproduct() throws InterruptedException {
        firstproduct.click();
        Thread.sleep(3000);
        Windowhandler();
        Thread.sleep(3000);
    }
    @FindBy(xpath=("//div[contains(text(),'Add to cart')]"))
    public WebElement AddToCartBtn;
    public void ClickAddToCart() throws InterruptedException {
        implicitWait();
        AddToCartBtn.click();
        Thread.sleep(3000);
        Refresh();
    }


}
