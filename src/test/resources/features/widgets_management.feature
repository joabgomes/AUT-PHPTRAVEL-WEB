#language: pt
Funcionalidade: Widgets Management

  Contexto: 
    Dado que eu esteja na tela de login
    Quando faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Dado que eu esteja na tela Home
    Quando acesso o menu Accounts

  @IncluirWidgets
  Cenário: Incluir Widgets
    Dado que eu esteja na tela Widgets Management
    Quando incluo um Widgets
      | Widget Name| Widget Status| Widget Content     |         
      | Joab Re    | Enable       | testando automacao |
    Então Widgets cadastrado com sucesso
