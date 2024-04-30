Feature: Login
  Scenario Outline: User can add new user account
    When  user can login using "<userName>" and "<password>" in login page
    And   click on Login Button in login page
    Then  user should be redirected to dashboard page with title "<Dashboard>"
    When  click on admin icon in dashboard page
    And  click on add button in admin page
    And select Role Option "<Role>" in admin page
    And select status "<status>" in admin page
    And enter Employee "<employeeName>" in admin page
    And enter new Password for credential "<newPassword>" in admin page
    And enter new Password confirmation for credential "<newPassword>" in admin page
    And enter new UserName for credential "<newUsername>" in admin page
    And click on save button in admin page
    Then success message should be displayed in admin page
    And  account with "<newUsername>" successfully created in admin page
    When click on employee profile icon
    And click on logout option
    And  user can login using "<newUsername>" and "<newPassword>" in login page
    And   click on Login Button in login page
    Then  user should be redirected to dashboard page with title "<Dashboard>"

    Examples:
      | userName | password | Dashboard |    Role      |    status   |     employeeName    |newPassword   | newUsername        |
      | Admin    |admin123  |Dashboard  |    Ess       |    Enabled  |    Orange Test      |Password123   | AhmedAssem            |


  Scenario Outline: User can accept time sheet
    When  user can login using "<userName>" and "<password>" in login page
    And   click on Login Button in login page
    And click on Time Icon in dashboard page
    And click on edit button in time page
    And enter project name in time page "<project>"
    And enter working hours for days "<hours>" for <days> in time page
    And select activity from dropDown list time page "<activity>"
    And click on save button in time page
    Then total of working hours in time page should be "<total>"
    When click on submit button in time page
    And click on employee profile icon
    And click on logout option
    And  user can login using "<adminUsername>" and "<adminPassword>" in login page
    And  click on Login Button in login page
    And click on Time Icon in dashboard page
    And enter Employee name in time page "<employeeName>"
    And click on view Button in time page
    And click on approve button in time page
    And click on employee profile icon
    And click on logout option
    And  user can login using "<userName>" and "<password>" in login page
    And click on Login Button in login page
    And click on Time Icon in dashboard page
    Then time sheet should be approved in time page
    Examples:
      | userName          | password   |project |activity |hours  |days  | total  |adminUsername|adminPassword|employeeName     |
      | AhmedAssem        |Password123 |Apache  |Bug Fixes| 08:00 |  3   | 24:00  |     Admin   | admin123    |Orange           |



  Scenario Outline: Admin can disable user account
    And  user can login using "<adminUsername>" and "<adminPassword>" in login page
    And   click on Login Button in login page
    And  click on admin icon in dashboard page
    And click on Edit for user "<userName>" in admin page
    And select status "<status>" in admin page
    And click on save button in admin page
    And click on employee profile icon
    And click on logout option
    And user can login using "<userName>" and "<password>" in login page
    And click on Login Button in login page
    Then invalid credential error message should be displayed in Login Page

    Examples:
      | userName       | password  |adminUsername|adminPassword|status   |
      | AhmedAssem     |Password123|    Admin    | admin123    | Disabled |
    


