Feature: Test Search Rozetka

  Background: Initialize - I am on main page Rozetka
    Given Initialize - I am on main page Rozetka

  Scenario: Search Laptop
    And I enter "laptop" search query in header searchbar
    Then Verify that locating on catalog page with laptops

  Scenario: Search item and open item page
    And I enter "laptop hp" search string in header searchbar
    And I select 1 item on catalog
    Then Verify i am on product page

  Scenario Outline: Searching
    And I enter <item> search query in header searchbar
    Then Verify that locating on catalog page with laptops

    Examples:
    |item|
    |laptop|
    |ноутбук|