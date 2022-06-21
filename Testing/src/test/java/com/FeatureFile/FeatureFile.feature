@AcaciumPortal
Feature: Acacium Portal

@Signin
Scenario: Sign in
Given Pass the Url
When scroll down to sign in
And  wait for some seconds
And click sign in button
And User inputs the email id 
And user enters the password
And user enters the password
And user clicks not robot
And user clicks enter
And user press 'control' key
And user press 't' key
And user gives a delay
And user navigates to new tab
And user open mailinator page
And gives a delay for dialog box
And user closes the dialog box
And user enters the mailid
And user searches the user
And user waits to see the code
And user opens the link
And user switches into frame 1
And user double clicks the code
And user comes out of the frame
And user should press 'control' key
And user should press 'c' key
And user comes back to the previous tab
And user should again press 'control' key
And user should press 'v' key
And user delays to verify
Then click verify

































































#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
 # I want to use this template for my feature file

 # @tag1
  #Scenario: Title of your scenario
  #  Given I want to write a step with precondition
   # And some other precondition
   # When I complete action
   # And some other action
   # And yet another action
   # Then I validate the outcomes
    #And check more outcomes

  #@tag2
  #Scenario Outline: Title of your scenario outline
  #  Given I want to write a step with <name>
  #  When I check for the <value> in step
   # Then I verify the <status> in step

   # Examples: 
   #   | name  | value | status  |
   #   | name1 |     5 | success |
   #   | name2 |     7 | Fail    |
