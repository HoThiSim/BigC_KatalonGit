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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
 Scenario Outline: Title of your scenario outline
	 Given Usser navigate Big C hompage
   When Click Login button in Homepage
   And Input username <username> and password <password> to Login
   And Click Submit button to Login
   And Click Find Market button
   And Click Mien Trung tag
   Then I verify the <title> and <description> in step

   Examples:
     | username  | password | title  |description
     | sim.ho21@student.passerellesnumeriques.org |simho@1402| Big C BẮC GIANG | Xã Tân Tiến, Thành Phố Bắc Giang, Tỉnh Bắc Giang|