#language: pt
Funcionalidade: Visualização de Menu

  Contexto: 
    Dado que eu esteja na tela de login
    Quando faço login com o usuario "admin@phptravels.com" e senha "demoadmin"

  @Menu
  Cenário: Itens apresentados no menu Cars
    Dado que eu esteja na tela Home
    Quando acesso o menu Cars
    Então são apresentados os itens "Cars", "Extras" e "Cars Settings"

  @Accounts
  Cenário: Itens apresentados no menu Accounts
    Dado que eu esteja na tela Home
    Quando acesso o menu Accounts
    Então são apresentados os itens "Admins", "Suppliers", "Customers" e "GuestCustomers"

  @Travels
  Cenário: Itens apresentados no menu Travelhope Hotels
    Dado que eu esteja na tela Home
    Quando acesso o menu Travelhope Hotels
    Então são apresentados os itens "Bookings" e "Settings"

  @Tours
  Cenário: Itens apresentados no menu Tours
    Dado que eu esteja na tela Home
    Quando acesso o menu Tours
    Então são apresentados os itens "Tours", "Add New", "Extras", "Reviews" e "Settings"
