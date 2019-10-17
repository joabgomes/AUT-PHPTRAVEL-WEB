#language: pt
Funcionalidade: Admins Management

  Contexto: 
    Dado que eu esteja na tela de login
    Quando faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Dado que eu esteja na tela Home
    Quando acesso o menu Accounts

  @IncluirAdministrador
  Cenário: Incluir Administrador
    Dado que eu esteja na tela Admins Management
    Quando incluo um administrador
      | First Name | Last Name | Email                 | Password | Mobile Number | Country | Address 1   | Address 2 | Status  | Add   | Edit | Remove    |
      | Matheus    | Ferreira  | testeaw@testea.com.br |   123456 |   11988888888 | Brazil  | Rua Jandira | Casa 2    | Enabled | Tours | Cars | Locations |
    Então administrador cadastrado com sucesso


	@IncluirAdministradores
  Esquema do Cenario: Inclusão de administradores
    Dado que eu esteja na tela Admins Management
    Quando incluo um administrador com os valores: "<First Name>", "<Last Name>", "<Email>", "<Password>","<Mobile Number>","<Country>","<Address 1>","<Address 2>","<Status>","<Add>","<Edit>","<Remove>"
    Então administrador "<Email>" cadastrado com sucesso

    Exemplos: 
      | First Name | Last Name | Email                 | Password | Mobile Number | Country  | Address 1   | Address 2 | Status  | Add   | Edit | Remove    |
      | Matheus    | Ferreira  | teste01@testea.com.br |   123456 |   11988888888 | Brazil   | Rua Jandira | Casa 2    | Enabled | Tours | Cars | Locations |
      | Matheus    | Ferreira  | teste02@testea.com.br |   123456 |   11988888888 | Bolivia  | Rua Jandira | Casa 2    | Enabled | Tours | Cars | Locations |
      | Matheus    | Ferreira  | teste03@testea.com.br |   123456 |   11988888888 | Bulgaria | Rua Jandira | Casa 2    | Enabled | Tours | Cars | Locations |
      
      
      #teste 
