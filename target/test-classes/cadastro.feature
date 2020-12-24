Feature: Cadastro de usuários
  Validação dos fluxos de cadastro de usuário
  
  Scenario: Cadastro de usuário com sucesso
    Given estou na página inicial
    When acesso a tela de novo cadastro
    And preencho todos os campos corretamente
	Then valido o sucesso no cadastro

  Scenario: Validar mensagens de obrigatoriedade
    Given estou na página inicial
    When acesso a tela de novo cadastro
    And não preencho os campos obrigatórios
    Then valido as mensagens de obrigatoriedade no cadastro