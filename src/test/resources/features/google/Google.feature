Feature: Google

Background:
	#@PRECOND_P1-6
	Given Ingresar a google

@TEST_P1-5
Scenario: Google
	When introduzco la palabra "Tsoft"
	And selecciono el resultado de la busqueda "Tsoft"
	Then se visualiza la pagina "https://www.tsoftglobal.com/"

@TEST_XRAY-65
Scenario Outline: TestGina2
	When introduzco la palabra "<Busqueda>"
	And selecciono el resultado de la busqueda "<Busqueda>"
	Then se visualiza la pagina "<Url>"

	Examples:
	| Busqueda | Url                                        |
	| Tsoft    | https://www.tsoftglobal.com/               |
	| Jira     | https://www.atlassian.com/es/software/jira |
