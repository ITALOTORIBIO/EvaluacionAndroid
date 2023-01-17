Feature: Login

  @test
  Scenario: Iniciar sesión y seleccionar item

    Given inicio sesión con las credenciales usuario: "standard_user" y contraseña: "secret_sauce" en la app de Saucedemo
    Then valido que debería aparecer el título de "PRODUCTS"
    And también valido que "Sauce Labs Backpack" existe

#    Given que me enuentro en el login de Airbnb
#    When busco "Cancun Mexico"
#    Then muestra el texto "Over 1,000 homes"
