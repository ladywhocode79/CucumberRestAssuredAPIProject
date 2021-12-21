Feature: Application Login
  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "sonal" and password "12345"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    Given User is on NetBanking landing page
    When User login into application with username "sonali" and password "123456"
    Then Home page is populated
    And Cards displayed are "false"