#Author: ysikvillamizar@gmail.com

	
	Feature: Make a hotel reservation
  As a web user
  I want to do reserve a hotel
  TO do test using the programming language Cucumber, and Gherkin.
 
  @TestCase1
  Scenario: Successful search for a hotel reservation from the main Trivago website
    Given that Jessica wants to look for a hotel reservation
    When She insert the data of the hotel
    And she select type of accommodation and some hotel services
    And she select the cheaper price
    Then she should see the state of the hotel: Excelente, muy bueno, or bueno
