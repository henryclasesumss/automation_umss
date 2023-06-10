Feature: Login
  @login @wip
  Scenario: Login with valid credentials
    Given I am on login page
    When I login with "henryvargastames@gmail.com" and password "Password1!"
    Then I should see "Henry Vargas (henryvargastames)" in the profile

  @login
  Scenario: Logout the user
    Given I click on the profile
    When I click on the logout

  @login
  Scenario: Login with invalidated password
    Given I am on login page
    When I login with "henryvargastames@gmail.com" and password "HenryDaniel"
    Then I should see "La dirección de correo electrónico o la contraseña son incorrectas."
