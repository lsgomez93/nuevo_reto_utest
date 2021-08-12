#autor: lgomezm@choucairtesting.com

    @stories
    Feature: UTest

    As a user,  I want to fill out the registration form on the Utest.com page, to create a new user

    @scenario1
    Scenario: Create a user
      Given than Leidy wants fill out form to Register in the page Utest
      When she enter the data of the New User
      |strFirsName |strLastName |strEmail           |strMonth|strDay |strYear|
      |Leidy       |Gomez       |ladyprueba2@gmail.com |January |5      |1993   |

      Then she gets the new user and show welcome page Welcome to the worlds largest community of freelance software testers

