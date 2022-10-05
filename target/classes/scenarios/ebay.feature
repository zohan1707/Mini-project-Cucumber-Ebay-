Feature: Ebay Test
  As a user
  I want to test all main site functionality
  So that I can be sure that site works correctly

  Scenario Outline: Check Email or username field is required to sign-in negative case
    Given User opens '<homePage>' page
    When User clicks the Sign-In button
    And User clicks continue button on login page
    Then User checks if warning message is displayed
    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Check input field
    Given User opens '<homePage>' page
    And User enters data in input field
    When User clicks the Search button
    Then User selects one of the filters
    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Check Shop by category
    Given User opens '<homePage>' page
    And User clicks the Shop by category button
    When User clicks the Shoes button
    And User checks if he is on the page Shoes
    And User clicks filter Men's shoes
    And User clicks filter Men's boots
    Then User checks if he is on the page Men's boots
    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Checking the correct operation of the pages of popular brands
    Given User opens '<homePage>' page
    And User click on the Apple brand icon
    And User check if he is on page Apple
    When User clicks the next page at the bottom of the page
    And User clicks on the previous page at the bottom of the page
    Then User checks whether he has returned to the initial page

    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Checking the correct operation of the language change on the site
    Given User opens '<homePage>' page
    And User hovers over the icon of the current language on the site
    When User click on the language in which the site will be
    Then User checks whether the site has been translated

    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Check Email on the registration page is required to sign-in negative case
    Given User opens '<homePage>' page
    When User clicks the register button
    And User enters incorrect data in email field
    Then User checks if warning message email field is displayed
    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Check adding the product to the cart
    Given User opens '<homePage>' page
    When User clicks on product icon
    And User check is he on a product page
    And User clicks button Add to cart
    Then User checks whether the product has been added to the basket
    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Check country/region selection
    Given User opens '<homePage>' page
    When User clicks Ship to button
    And User click Ship to: list
    And User selects country
    Then User click Done button
    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: Check section help and contact
    Given User opens '<homePage>' page
    When User clicks help & contact button
    And User check is he on a customer service page
    And User enters in the input field what he wants to find information about
    And User clicks on the title of the information he needs
    Then User checks whether he is on the page with the necessary information
    Examples:
      | homePage              |
      | https://www.ebay.com/ |

  Scenario Outline: check refresh button ebay
    Given User opens '<homePage>' page
    And User enters data in input field
    When User clicks the Search button
    And User clicks refresh button ebay
    Then User checks to see if he has returned to the initial page
    Examples:
      | homePage              |
      | https://www.ebay.com/ |