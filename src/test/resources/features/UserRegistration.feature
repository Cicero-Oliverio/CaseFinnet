Feature: User registration

  Register a new user in the system.

  Background: Logger user
    Given I am logged into system
    Then I my access in system is granted

  Scenario: User registration

    Given I click in menu "Listar Usuários"
    When I fill all the fields of the form
    Then the system must create the registration of a new user
    And the message "Operação Concluída com Sucesso" must be showed