Feature: Busqueda de google

  Background:
  Given Ingresar a google

  @TEST_XRAY-13
  Scenario: Busqueda google
    When introduzco la palabra "Tsoft"
    And selecciono el resultado de la busqueda "Tsoft"
    Then se visualiza la pagina "https://www.tsoftglobal.com/"

  @TEST_XRAY-16
  Scenario Outline: Busqueda google parametrizada
    When introduzco la palabra "<Busqueda>"
    And selecciono el resultado de la busqueda "<Busqueda>"
    Then se visualiza la pagina "<Url>"

    Examples:
      | Busqueda | Url                                        |
      | Tsoft    | https://www.tsoftglobal.com/               |
      | Jira     | https://www.atlassian.com/es/software/jira |
