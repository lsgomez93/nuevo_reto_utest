#autor: lgomezm@choucairtesting.com
@stories
Feature: UTest
  As a user,  I want to fill out the registration form on the Utest.com page, to create a new user

  @scenario1
  Scenario: Create a user
    Given than Leidy wants fill out form to Register in the page Utest
    When she enter the data of the New User
      |strFirsName|strLastName| strEmail             |strMonth|strDay|strYear|strCity |strCodePostal| strCountry|strOperatingSystem  |strVersionOperatingSystem|strLanguage|strBrandMobil|strVersionMobil|strOperatingSystemMobil |strPassword |strConfirmPassword|
      |Leidy      |Gomez      | ladyprueba3@gmail.com|January |5     |1993   |Popayan |10091        |Colombia   |Windows             |7                        |Spanish    |Alcatel       |Crystal        |Android 7.0            |19pS15QcxGMe|19pS15QcxGMe      |

    Then she gets the new user and show welcome page Welcome to the worlds largest community of freelance software testers



