Feature: User registration

  Register a new user in the system.

  Background: Logger user
    Given I am logged into system
    Then I my access in system is granted

  Scenario Outline: User registration

    Given I click in menu "Listar Usuários"
    And I click in button name Novo
    When I fill all the fields"<inscricao>" "<nome>" "<email>" "<telefone>" "<cep>" "<numero>" "<complemento>" "<login>"
    And I click in Avancar button
    And I click in Adicionar Area button
    And I click in Avancar button again
    And I click in Adicionar Empresa button
    Then I click in Salvar button
    And the message "Operação Concluída com Sucesso." must to be show


    Examples:

      |inscricao| nome |     email     |telefone |  cep   |numero|complemento|login|
      |1234     |Cicero|teste@teste.com|912341233|04244000|1234  |teste      |teste|