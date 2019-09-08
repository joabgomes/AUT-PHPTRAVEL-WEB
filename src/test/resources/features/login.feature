#language: pt

Funcionalidade: Login

  Cenário: Realizar login com sucesso
    Dado que eu deseje logar no sistema
    Quando faço login com o usuario "admin@phptravels.com" e senha "demoadmin"
    Então sou autenticado com sucesso
    
	Cenário: Tentativa de Login com email invalido
  	Dado que eu esteja na tela de login
  	Quando tento fazer login com o usuario "teste" e senha "demoadmin"
  	Então é apresentada a mensagem "The Email field must contain a valid email address."