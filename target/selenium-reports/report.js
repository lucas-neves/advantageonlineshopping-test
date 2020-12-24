$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cadastro.feature");
formatter.feature({
  "line": 1,
  "name": "Cadastro de usuários",
  "description": "Validação dos fluxos de cadastro de usuário",
  "id": "cadastro-de-usuários",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4659669500,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Cadastro de usuário com sucesso",
  "description": "",
  "id": "cadastro-de-usuários;cadastro-de-usuário-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "estou na página inicial",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "acesso a tela de novo cadastro",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "preencho todos os campos corretamente",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "valido o sucesso no cadastro",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastroStepDefs.acessarPaginaInicial()"
});
formatter.result({
  "duration": 8020824500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStepDefs.acessarTelaNovoCadastro()"
});
formatter.result({
  "duration": 1716345500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStepDefs.preencherCadastro()"
});
formatter.result({
  "duration": 9903683000,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStepDefs.validarCadastro()"
});
formatter.result({
  "duration": 4561686400,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1719769300,
  "status": "passed"
});
formatter.before({
  "duration": 3371979900,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Validar mensagens de obrigatoriedade",
  "description": "",
  "id": "cadastro-de-usuários;validar-mensagens-de-obrigatoriedade",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "estou na página inicial",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "acesso a tela de novo cadastro",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "não preencho os campos obrigatórios",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "valido as mensagens de obrigatoriedade no cadastro",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastroStepDefs.acessarPaginaInicial()"
});
formatter.result({
  "duration": 7893135100,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStepDefs.acessarTelaNovoCadastro()"
});
formatter.result({
  "duration": 1671493200,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStepDefs.preencherCamposVazios()"
});
formatter.result({
  "duration": 3000464500,
  "status": "passed"
});
formatter.match({
  "location": "CadastroStepDefs.validarErrosNosCampos()"
});
formatter.result({
  "duration": 2939086400,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1121843400,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Login de usuários",
  "description": "Validação dos fluxos de login no sistema",
  "id": "login-de-usuários",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3243340400,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Login com sucesso",
  "description": "",
  "id": "login-de-usuários;login-com-sucesso",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "estou na página inicial",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "preencho os dados de login corretamente",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "valido o sucesso no login",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastroStepDefs.acessarPaginaInicial()"
});
formatter.result({
  "duration": 7251882400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.preencherLogin()"
});
formatter.result({
  "duration": 3110645600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.validarLogin()"
});
formatter.result({
  "duration": 4629689100,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1545997600,
  "status": "passed"
});
formatter.before({
  "duration": 3431732200,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "Validar mensagens de obrigatoriedade",
  "description": "",
  "id": "login-de-usuários;validar-mensagens-de-obrigatoriedade",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "estou na página inicial",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "não preencho os dados de login",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "valido as mensagens de obrigatoriedade no login",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastroStepDefs.acessarPaginaInicial()"
});
formatter.result({
  "duration": 7324523100,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.preencherLoginVazio()"
});
formatter.result({
  "duration": 2969875600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.validarErrosNosCampos()"
});
formatter.result({
  "duration": 668232400,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 1431868100,
  "status": "passed"
});
formatter.before({
  "duration": 3216604100,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validar erro com login incorreto",
  "description": "",
  "id": "login-de-usuários;validar-erro-com-login-incorreto",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "estou na página inicial",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "preencho os dados de login incorretamente",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "valido a mensagem de erro",
  "keyword": "Then "
});
formatter.match({
  "location": "CadastroStepDefs.acessarPaginaInicial()"
});
formatter.result({
  "duration": 6991551500,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.preencherLoginIncorreto()"
});
formatter.result({
  "duration": 3382309900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefs.validarErroNoLogin()"
});
formatter.result({
  "duration": 533054400,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 1401207400,
  "status": "passed"
});
});