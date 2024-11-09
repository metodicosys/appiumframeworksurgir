@login
Feature: Verify login functionality on app

  Background: Create an instance of android driver before each scenario
    Given User has "android" app

  Scenario: El usuario debería poder iniciar sesión en la aplicación con las credenciales correctas y debería mostrarse la configuración inicial.
    Given El usuario tiene usuario y contraseña "válidos"
    When El usuario ingresa las credenciales
    And Accionar el botón "iniciar sesión"
    Then El botón "Continuar" debería estar visible
    And El usuario debe ser capaz de pasar a ventana de rol