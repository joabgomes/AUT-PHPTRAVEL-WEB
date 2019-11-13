package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.HomePage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;

public class VisualizacaoMenuSteps {
	
	HomePage homePage = new HomePage(Hooks.getDriver());
	MenuPage menuPage = new MenuPage(Hooks.getDriver());
			
	@Dado("que eu esteja na tela Home")
	public void que_eu_esteja_na_tela_Home() {
		Assert.assertTrue("Página Home NÃO foi apresentada.", homePage.validar_pagina());
	}

	@Quando("acesso o menu Cars")
	public void acesso_o_menu_Cars() {	
	}

	@Então("são apresentados os itens {string}, {string} e {string}")
	public void são_apresentados_os_itens_e(String subMenuCars, String subMenuExtras, String subMenuSettings) {
	 
		Assert.assertTrue("Submenu "+ subMenuCars + "NÂO apresentado.", menuPage.validar_submenu_cars(subMenuCars));
		Assert.assertTrue("Submenu "+ subMenuExtras + "NÂO apresentado.", menuPage.validar_submenu_cars(subMenuExtras));
		Assert.assertTrue("Submenu "+ subMenuSettings + "NÂO apresentado.", menuPage.validar_submenu_cars(subMenuSettings));
	}
// -----------------------------------------------------------------------------------------------------------------------------------//	
	@Quando("acesso o menu Accounts")
	public void acesso_o_menu_Accounts() {
		menuPage.clicar_menu_accounts();
	}

	@Então("são apresentados os itens {string}, {string}, {string} e {string}")
	public void são_apresentados_os_itens_e(String subMenuAdmins, String subMenuSuppliers, String subMenuCustomers, String subMenuGuestCustomers) {
		
		Assert.assertTrue("Submenu" + subMenuAdmins 	    + "NÃO apresentado.", menuPage.validar_submenu_accounts(subMenuAdmins));
		Assert.assertTrue("Submenu" + subMenuSuppliers      + "NÃO apresentado.", menuPage.validar_submenu_accounts(subMenuSuppliers));
		Assert.assertTrue("Submenu" + subMenuCustomers      + "NÃO apresentado.", menuPage.validar_submenu_accounts(subMenuCustomers));
		Assert.assertTrue("Submenu" + subMenuGuestCustomers + "NÃO apresentado.", menuPage.validar_submenu_accounts(subMenuGuestCustomers));
	}
// -----------------------------------------------------------------------------------------------------------------------------------//	

	@Quando("acesso o menu Travelhope Hotels")
	public void acesso_o_menu_Travelhope_Hotels() {
		menuPage.clicar_menu_travels_hotels();
	}

	@Então("são apresentados os itens {string} e {string}")
	public void são_apresentados_os_itens_e(String subMenuBookings, String subMenuSettings) {
		Assert.assertTrue("Submenu" + subMenuBookings + "NÃO apresentado.", menuPage.validar_submenu_travels(subMenuBookings));
		Assert.assertTrue("Submenu" + subMenuSettings + "NÃO apresentado.", menuPage.validar_submenu_travels(subMenuSettings));
	}
// -----------------------------------------------------------------------------------------------------------------------------------//		
	@Quando("acesso o menu Tours")
	public void acesso_o_menu_Tours() {
		menuPage.clicar_menu_tours();
	}

	@Então("são apresentados os itens {string}, {string}, {string}, {string} e {string}")
	public void são_apresentados_os_itens_e(String subMenuTours, String subMenuAddNew, String subMenuExtras, String subMenuReviews, String subMenuSettings) {
		Assert.assertTrue("SubMenu" + subMenuTours    + "NÃO apresentado.", menuPage.validar_submenu_tours(subMenuTours));
		Assert.assertTrue("SubMenu" + subMenuAddNew   + "NÃO apresentado.", menuPage.validar_submenu_tours(subMenuAddNew));
		Assert.assertTrue("SubMenu" + subMenuExtras   + "NÃO apresentado.", menuPage.validar_submenu_tours(subMenuExtras));
		Assert.assertTrue("SubMenu" + subMenuReviews  + "NÃO apresentado.", menuPage.validar_submenu_tours(subMenuReviews));
		Assert.assertTrue("SubMenu" + subMenuSettings + "NÃO apresentado.", menuPage.validar_submenu_tours(subMenuSettings));
	}
// -----------------------------------------------------------------------------------------------------------------------------------//	

}
