Feature:
  Scenario: Long press on Dog Names should cause a new menu to appear
    Given I have APIDemos application launched
    When I navigate to "Views/Expandable List/Custom Adapter" page
    And I long press on Dog Names button for "1" seconds
    Then  new menu "Sample menu" option should pop up.