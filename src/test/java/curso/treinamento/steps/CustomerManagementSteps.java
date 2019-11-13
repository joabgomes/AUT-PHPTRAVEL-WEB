package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.AddCustomerPage;
import curso.treinamento.pages.CustomersManagementPage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;
import io.cucumber.datatable.DataTable;

public class CustomerManagementSteps {

	MenuPage menuPage = new MenuPage(Hooks.getDriver());
	CustomersManagementPage customersManagementPage = new CustomersManagementPage(Hooks.getDriver());
	AddCustomerPage addCustomerPage = new AddCustomerPage(Hooks.getDriver());
	
	
	
	
	@Dado("que eu esteja na tela Customers Management")
	public void que_eu_esteja_na_tela_Customers_Management() {
		menuPage.clicar_submenu("ACCOUNTS", "Customers");
		
		Assert.assertTrue("Página Customers Management Não apresentada.", customersManagementPage.validar_pagina_customer());
	}

	@Quando("incluo um customers")
	public void incluo_um_customers(DataTable dataTable_) {
		customersManagementPage.clicar_btn_add();
		
		Assert.assertTrue("Página Add Admin NÃO apresentada.", addCustomerPage.validar_pagina_customer());
		
		Helper.create_datatable(dataTable_);
		
		addCustomerPage.preencher_first_name(Helper.dataTable.get(0).get("First Name"));
		addCustomerPage.preencher_last_name(Helper.dataTable.get(0).get("Last Name"));
		addCustomerPage.preencher_email(Helper.dataTable.get(0).get("Email"));
		addCustomerPage.preencher_password(Helper.dataTable.get(0).get("Password"));
		addCustomerPage.preencher_mobile_number(Helper.dataTable.get(0).get("Mobile Number"));
		addCustomerPage.selecionar_country(Helper.dataTable.get(0).get("Country"));
		addCustomerPage.preencher_adress1(Helper.dataTable.get(0).get("Address 1"));
		addCustomerPage.preencher_adress2(Helper.dataTable.get(0).get("Address 2"));
		addCustomerPage.selecionar_status(Helper.dataTable.get(0).get("Status"));
		addCustomerPage.clicar_btn_submit();

	}

	@Então("Customers cadastrado com sucesso")
	public void customers_cadastrado_com_sucesso() {
		Assert.assertTrue("Customers não cadastrado com sucesso.", customersManagementPage.validar_email_na_tabela(Helper.dataTable.get(0).get("Email")));

	}

}
