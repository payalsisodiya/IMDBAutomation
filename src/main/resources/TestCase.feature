Feature: Signup to imdb.com

#Author: Payal Sisodiya
#QA
#Date
#Status:

    Background: I open browser

    Scenario: Signup as a new user

    Given I am on 'https://www.imdb.com' homepage
    When I click on 'Sign In' button on homepage
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
    Then I see captcha box is appear
    Given I provide input for captcha
    When I click on Submit button
    Then  I see the account is created successfully

    Scenario: Login with the newly created credentials and fetch the release date of last movie in “Top Rated Movies”

    Given I am on <https://www.imdb.com> homepage
    When I click on <Sign In> button on homepage
    Then I reach to Sign up page
    And I see 'Sign In' and 'Sign in with IMDb' Button
    When I click on 'Sign in with IMDb' button
    Then I reach to 'Sign In' page
    Given I provide input in 'email' field
    And I provide input in 'password' field
    When I click on 'Sign-in' button
    Then I land up to home screen
    And I see my user name on right corner
    And I see the Menu
    When I click on Menu
    Then I see the list of option
    And I see the 'Top Rated Movies'
    When I click on 'Top Rated Movies'
    Then I see the list of top Rated movies
    And I see the filter option
    When I sort the movies by release date
    Then I see list is sorted
    When I scroll the page till end
    Then I see the last movie
    When I click on last movie
    Then I see the all information of movie
    And I see release date of movie





