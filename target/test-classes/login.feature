Feature: Login de usuários
  Validação dos fluxos de login no sistema
  
  Scenario: Login com sucesso
    Given estou na página inicial
    When preencho os dados de login corretamente
	Then valido o sucesso no login

  Scenario: Validar mensagens de obrigatoriedade
    Given estou na página inicial
    When não preencho os dados de login
    Then valido as mensagens de obrigatoriedade no login

  Scenario: Validar erro com login incorreto
    Given estou na página inicial
    When preencho os dados de login incorretamente
    Then valido a mensagem de erro