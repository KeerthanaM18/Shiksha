Feature: Working on the profile
Background: 
    Given User is logged in and click on profile

  @10Marks
  Scenario Outline: To enter the valid details and save
    When user click on user profile
    And user click on profile
    And user click on add 10th mark sheet	
    And user selects from dropdown Board
    And Fill the school details <School>
    And User selects from dropdown Passing Out Year
    And User selects from dropdown grading system
    And Fill the score details <score>
    Then click on save

    Examples: 
      | School| score |
      | Christ King Public School | 89 |
      
   @MBA
   Scenario: To valid that the Like functionality
   When user click on MBA option
   And User clicks on Exam
   And User clicks on CAT
   And scroll down
   And click on Like button
   Then Course shortlisted successfully
   
   @CAT
   Scenario: To valid the share functionality
   When User clicks on Mba
   And user selects exam
   And user selects cat
   And user clicks on share
   And redirects to share option
   
   @Online
   Scenario: To valid shiksha online functionality
   When User clicks on ShikshaOnline
   And User selects Programming
   And User enters a course
   |Python|
   And User clicks on All filters
   And User apply filter for program
   And User apply filter for level
   And clicks on Enquire option
   Then course details sent on mail
   
   @EducationInvalid
   Scenario Outline: To validate invalid details
   When User clicks on UserProfile
   And User clicks on Profile
   And User scroll down
   And User clicks on Education Background
   And User clicks on 10th marks edit
   And user enters <Schoo1>
   And User clicks on save
   And user enters <School1>
   Then click on Done
   
   Examples:
   |Schoo1|School1|
   |123456789|Christ King Public School|
   
  
   