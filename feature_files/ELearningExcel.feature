@Excel
Feature: ELearning Excel Test Case

  Scenario: To verify whether application allows teacher to add project details
    Given User should have launched the application
    And User should get logged in as Teacher
    And teacher has created course
    When click on Project icon
    And click on create a new project icon
    And enter valid credential in title text box
    And enter valid credential in sub title text box
    And click on save blog button
    And click on project link
    And click on new task icon
    And enter valid title in title text box
    And click on save button
    And click on Role management icon
    And click on add a new role icon
    And enter valid role in title text box
    And click on save button for Role
    And click on Assign role icon
    And select student / teacher name in user list box
    And click on validate button
    And click on user management icon
    And click on checkbox beside the user
    And click on register button
    Then The user has been registered message should get displayed
 


