#Author: jpinedav@choucairtesting.com
# Language: es

@Repositorio
Feature: Como usuario quiero ingresar al traductor de google para traducir 
diferentes palabras, pero solo de Español a Ingles y de Ingles a Español.

  @CasodeExito
  Scenario: Traducir de Ingles a Español
    Given Que Jhon quiere usar el traductor de Google
    When Jhon traduce la palabra Table de Ingles a Español
    Then Jhon deberia ver la palabra en español Mesa en la plantalla

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
