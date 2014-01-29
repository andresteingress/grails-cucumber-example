Feature: log in to admin application
  Administrative functions need to be guarded with a login page

  Scenario: someone opens a protected link
    Given a user opens the browser
    When she opens the "admin/customer/list" link
    Then she will get a login page