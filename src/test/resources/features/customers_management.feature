#language: pt
Funcionalidade: Customers Management

  Contexto: 
    Dado que eu esteja na tela de login
    Quando faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Dado que eu esteja na tela Home
    Quando acesso o menu Accounts

  @IncluirCustomers
  Cenário: Incluir Customers
    Dado que eu esteja na tela Customers Management
    Quando incluo um customers
      | First Name | Last Name | Email                  | Password | Mobile Number | Country | Address 1   | Address 2 | Status  |
      | Joab       | Ferreira  | inmetrics@gmail.com.br |   123456 |   11988888888 | Brazil  | Rua Jandira | Casa 2    | Enabled |
    Então Customers cadastrado com sucesso
