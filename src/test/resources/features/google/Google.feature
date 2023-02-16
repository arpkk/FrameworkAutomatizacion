Feature: TestGina

Background:
	#@PRECOND_XRAY-27
	Given Ingresar a google

@TEST_XRAY-25
	Scenario: TestGina
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
