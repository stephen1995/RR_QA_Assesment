Feature: Automation Challenge
  @Test
  Scenario: Open Randall Reilly page and verify title
    Given The user has navigated to Randall Reilly page
    Then Verify that the title is 'Randall Reilly'

  @Test
  Scenario Outline: Validate URLs for options in Talent Intelligence dropdown
    Given The user has navigated to Randall Reilly page
    And User mouse hover on Talent Intelligence link
    And User selects the "<option>" option
    And User verify that the URL contains "<url>"
    Examples:
      | option | url|
      | Overview | talent-intelligence|
      |Technologies| talent-intelligence/stratas|
      |Talent Partners|talent-intelligence/recruiting-services|
      |Strategic Results|talent-intelligence/recruiting-campaigns|
      |Quality Applicants|talent-intelligence/driver-media       |















