Feature: Edit Personal Detail
  @personal
Scenario: Editing Personal Details of an Employee
When user is logged in with valid admin credentials
When user navigates to employee list page
When user clicks on any employee Id or First(&middle) Name or Last Name
Then user see employee information is displayed
And user clicks on Edit button
And user edits any personal detail about that employee
Then user clicks on Save button
Then user see employee information is displayed