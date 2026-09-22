Feature: Google

  @tag1
  Scenario: google play app
    Given open the google page
    Then  click the Google app icon
    And clicking the Play icon btn
    Then Click the Search button
    And searching for the game
    Then taking the Screenshot of game details
    And close the browser

  @tag2
  Scenario: google Map app
    Given open  google page
    Then  click  Google app icon
    And clicking the Map icon btn
    And searching for the route from chennai to salem
    Then taking the Screenshot of distance from car
    Then taking the Screenshot of distance from bike
    Then taking the Screenshot of distance from transit
    Then taking the Screenshot of distance from walking
    And close  browser

  @tag3
  Scenario: google Gmail app
    Given open the google url
    Then  click the  app icon
    And clicking the gmail icon btn
    Then click the sign In btn
    Then Enter the email id
    Then taking the Screenshot of closing
    And close all the browser

  @tag4
  Scenario: google youtube app
    Given open google site
    Then  click the youtube app icon
    And click the searchbar
    Then enter the tamilsongs to search
    And click the song to play
    Then taking the Screenshot of it
    And  browser to be closed

  @tag5
  Scenario Outline: Flipkart
    Given open the Flipkart page
    Then  click searchbar
    And Search for "<product>" in flipkart
    Then selecting product
    And click the AddToCart
    Then Take the Screenshot
    And close
    Examples:
      | product |
      | Laptop  |
      | Mobile  |