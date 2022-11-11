@Tag
Feature: facebook login
Background: precondition
 Given user of facebook
  @Tag1
  Scenario: To validate login scenario
   When I enter valid user name
   And i enter valid password
   And i click on login button
   Then i should be able to login successfully
   @Tag2
   Scenario: validate invalid login scenario
   When I enter Invalid user name
   And i enter Invalid password
   And i click on login button
   Then i should not be able to login successfully
 
 