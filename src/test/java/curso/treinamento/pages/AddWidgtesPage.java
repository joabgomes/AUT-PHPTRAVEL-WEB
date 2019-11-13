package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddWidgtesPage {
	
	public AddWidgtesPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//label[text()='Widget Name']")
	private WebElement tituloPagina;
	
	@FindBy(name = "widgetname")
	private WebElement cmpWidgetName;
	
	@FindBy(name = "widgetstatus")
	private WebElement comboBoxStatus;
	
	@FindBy(name = "widgetcontent")
	private WebElement cmpWidgetContent;
	
	@FindBy(xpath = "//button[contains(text(), 'Add')]")
	private WebElement btnAdd;
	
	
	public void preencher_widget_name(String widgetname) { 
		cmpWidgetName.sendKeys(widgetname);
	}
	
	public void selecionar_status(String widgetstatus) { 
		new Select(comboBoxStatus).selectByVisibleText(widgetstatus);
	}
	
	public void preencher_widget_content(String widgetcontent) { 
		cmpWidgetContent.sendKeys(widgetcontent);
	}
	
	public void clicar_btn_add() { 
		btnAdd.click();
	}
	
}