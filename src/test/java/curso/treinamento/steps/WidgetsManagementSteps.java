package curso.treinamento.steps;

import org.junit.Assert;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import curso.treinamento.pages.AddWidgtesPage;
import curso.treinamento.pages.MenuPage;
import curso.treinamento.pages.WidgetsManagementPage;
import curso.treinamento.setup.Hooks;

public class WidgetsManagementSteps {

	MenuPage menuPage = new MenuPage(Hooks.getDriver());
	WidgetsManagementPage widgetsManagementPage = new WidgetsManagementPage(Hooks.getDriver());
	AddWidgtesPage addWidgetPage = new AddWidgtesPage(Hooks.getDriver());
	
	
	
	
	@Dado("que eu esteja na tela Widgets Management")
	public void que_eu_esteja_na_tela_Widgets_Management() {
		menuPage.clicar_submenu("GENERAL", "WIDGET");
		
		Assert.assertTrue()
	}

	@Quando("incluo um Widgets")
	public void incluo_um_Widgets(io.cucumber.datatable.DataTable dataTable) {
	}

	@Então("Widgets cadastrado com sucesso")
	public void widgets_cadastrado_com_sucesso() {
	}

}
