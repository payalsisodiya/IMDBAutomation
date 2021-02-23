Feature: Signup to imdb.com

#Author: Payal Sisodiya
#QA
#Date
#Status:

    Background: I open browser

    Scenario: Signup as a new user
    Given I am on <https://www.imdb.com> homepage
    When I click on <Sign In> button on homepage
    Then I reach to Sign up page
    And I see 'Sign In' and 'Create a New Account' Button
    When I click on 'Create a New Account' button
    Then I reach to 'Create Account' page
    And I see the registration form with multiple input field
    Given I provide input in 'Your Name' field
    And I provide input in 'Email' field
    And I provide input in 'Password' field
    And I provide input in 'Re-enter password' field
    When I click on 'Create a new IMDb account' button
    Then I see captcha box is appeard
    Given I provide input for captcha
    When I click on Sumbit button
    Then  I see the account is created successful