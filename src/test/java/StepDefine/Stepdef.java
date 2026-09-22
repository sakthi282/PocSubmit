package StepDefine;


import BasePac.base;
import PomPac.*;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.io.IOException;

public class Stepdef extends  base {

        GooglePlay google =new GooglePlay(driver);
        GoogleMap map=new GoogleMap(driver);
        GoogleGmail mail=new GoogleGmail(driver);
        GoogleYoutube tube =new GoogleYoutube(driver);
        Flipkart kart=new Flipkart(driver);
        @Given("open the google page")
        public void openTheGooglePage() {
             google.Google();


        }

        @Then("click the Google app icon")
        public void clickTheGoogleAppIcon() throws InterruptedException {
                google.googleapps();
              google.AppsFrameSwitch();
        }

        @And("clicking the Play icon btn")
        public void clickingThePlayIconBtn() throws InterruptedException {

                google.ClickPlaystorebtn();

        }
        @Then("Click the Search button")
        public void clickTheSearchButton() throws InterruptedException {

            google.ClickSearchbtn();
        }

        @And("searching for the game")
        public void searchingForTheGame() throws InterruptedException {

                google.SearchByGamename();
        }

        @Then("taking the Screenshot of game details")
        public void takingTheScreenshotOfGameDetails() throws IOException, InterruptedException {

                google.GamedetailsScreenshot();
        }

        @And("close the browser")
        public void closeTheBrowser() throws InterruptedException {

            quit();

        }

        @Given("open  google page")
        public void openGooglePage() {
                map.Google();
        }

        @Then("click  Google app icon")
        public void clickGoogleAppIcon() throws InterruptedException {
                 map.ClickGoogleAppsIcon();
        }
        @And("clicking the Map icon btn")
        public void clickingTheMapIconBtn() throws InterruptedException {
                map.AppsFrameSwitch();
                map.ClickMapBtn();
        }

        @And("searching for the route from chennai to salem")
        public void searchingForTheRouteFromChennaiToSalem() throws IOException, InterruptedException {
                map.ClickSearchRoute();
        }

        @Then("taking the Screenshot of distance from car")
        public void takingTheScreenshotOfDistanceFromCar() throws IOException, InterruptedException {
                map.ClickCarRoute();
        }

        @Then("taking the Screenshot of distance from bike")
        public void takingTheScreenshotOfDistanceFromBike() throws IOException, InterruptedException {
                map.ClickBikeRoute();
        }

        @Then("taking the Screenshot of distance from transit")
        public void takingTheScreenshotOfDistanceFromTransit() throws IOException, InterruptedException {
                map.ClickTransitRoute();
        }

        @Then("taking the Screenshot of distance from walking")
        public void takingTheScreenshotOfDistanceFromWalking() throws IOException, InterruptedException {
                map.ClickWalkingRoute();
        }

        @And("close  browser")
        public void closeBrowser() throws InterruptedException {
                quit();
        }

        @Given("open the google url")
        public void openTheGoogleUrl() throws InterruptedException {
                mail.Google();

        }

        @Then("click the  app icon")
        public void clickTheAppIcon() throws InterruptedException {
                mail.googleapps();
                mail.AppsFrameSwitch();
        }

        @And("clicking the gmail icon btn")
        public void clickingTheGmailIconBtn() throws InterruptedException {
        mail.ClickGmailbtn();
        }

        @Then("click the sign In btn")
        public void clickTheSignInBtn() throws InterruptedException {
        mail.ClicksignInbtn();
        }

        @Then("Enter the email id")
        public void enterTheEmailId() throws IOException, InterruptedException {
        mail.ClickEmail();
        }

        @Then("taking the Screenshot of closing")
        public void takingTheScreenshotOfClosing() throws IOException {
                Screenshot(7);
        }

        @And("close all the browser")
        public void closeAllTheBrowser() throws InterruptedException {
        quit();
        }

        @Given("open google site")
        public void openGoogleSite() throws InterruptedException {
            tube.Google();

        }

        @Then("click the youtube app icon")
        public void clickTheYoutubeAppIcon() throws InterruptedException {
                tube.ClickGoogleApps();
                tube.AppsFrameSwitch() ;

        }


        @And("click the searchbar")
        public void clickTheSearchbar() throws InterruptedException {
               tube.ClickYouTubebtn();
        }

        @Then("enter the tamilsongs to search")
        public void enterTheTamilsongsToSearch() throws InterruptedException {
                tube.ClickYouTubeSearchbtn();
        }

        @And("click the song to play")
        public void clickTheSongToPlay() throws InterruptedException {
                tube.ClicksongClick();
        }

        @Then("taking the Screenshot of it")
        public void takingTheScreenshotOfIt() throws IOException {
                Screenshot(8);
        }

        @And("browser to be closed")
        public void browserToBeClosed() throws InterruptedException {
                quit();
        }

        @Given("open the Flipkart page")
        public void openTheFlipkartPage() throws InterruptedException {

                kart.Flipkart();


        }

        @Then("click searchbar")
        public void clickSearchbar() throws InterruptedException {
                kart.ClickEntranceX();
        }

        @And("Search for {string} in flipkart")
        public void searchForInFlipkart(String product) throws InterruptedException {
                kart.ClickFlipkartsearchbar(product);
        }
        @Then("selecting product")
        public void selectingproduct() throws InterruptedException {
                kart.Clicklapproduct();
        }

        @And("click the AddToCart")
        public void clickAddToCart() throws InterruptedException {
                kart.ClickAddToCart();

        }

        @Then("Take the Screenshot")
        public void takeTheScreenshot() throws IOException {
                Screenshot(9);
        }


        @And("close")
        public void close() throws InterruptedException {
        quit();
        }



}




