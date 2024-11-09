@proposal
Feature: Verify proposal functionality on app

  Background: Create an instance of android driver before each scenario
    Given Product has "android" app

  Scenario: El usuario debería poder registrar un producto en la aplicación.
    Given El usuario puede seleccionar productos "válidos"
    When El usuario selecciona un producto
    And Accionar el botón "Guardar"
    Then debe seleccionar el destino de prestamo 
    And El usuario debe ser capaz de calcular tasa
    
  Scenario: El usuario debe seleccionar seguro porcentual o porcentual devolucion y seguro multiriesgo.
    Given El usuario puede seleccionar un seguro obligatorio y un optativo multiriesgo
    When El usuario selecciona un seguro basico y un optativo
    And debe mostrar el botón "Agregar bienes", no debe mostrar botón "beneficiario"
    Then debe agregar un bien para seguro multiriesgo
    And El usuario debe ser capaz de guardar y enviar la solicitud