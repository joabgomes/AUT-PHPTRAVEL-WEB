package curso.treinamento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import curso.treinamento.setup.Hooks;
import curso.treinamento.utils.Helper;


public class MenuPage {
	
	public MenuPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@href='#Cars']")
	private WebElement menuCars;
	
	@FindBy(xpath = "//a[@href='#ACCOUNTS']")
	private WebElement menuAccounts;
	
	
	@FindBy(xpath = "//a[@href='#TravelhopeHotels']")
	private WebElement menuTravelsHopeHotels;
	
	@FindBy(xpath = "//a[@href='#Tours']")
	private WebElement menuTours;
	
	public void clicar_submenu(String menu, String subMenu) {
		WebElement subMenu_ = Hooks.getDriver().findElement(By.xpath("//a[@href='#" + menu + "']/following::a[text()='"+ subMenu + "']"));
		
		subMenu_.click();
	}
	
	public void clicar_menu_accounts() {
		menuAccounts.click();
	}
	
	public void clicar_menu_cars() {
		menuCars.click();
	}
	
	public void clicar_menu_travels_hotels() {
		menuTravelsHopeHotels.click();
	}
	
	public void clicar_menu_tours() {
		menuTours.click();
	}
	
	public boolean validar_submenu_cars(String subMenu) {
		return Helper.elemento_existe(Hooks.getDriver().findElement(By.xpath("//a[@href='#Cars']/following::a[text()='"+ subMenu + "']")),10);
	}
	
	public boolean validar_submenu_accounts(String subMenuAccounts) {
		return Helper.elemento_existe(Hooks.getDriver().findElement(By.xpath("//a[@href='#ACCOUNTS']/following::a[text()='"+ subMenuAccounts + "']")),10);
	}
	
	public boolean validar_submenu_travels(String subMenuTravels) {
		return Helper.elemento_existe(Hooks.getDriver().findElement(By.xpath("//a[@href='#TravelhopeHotels']/following::a[text()='"+ subMenuTravels + "']")),10);
	}
	
	public boolean validar_submenu_tours(String subMenuTours) {
		return Helper.elemento_existe(Hooks.getDriver().findElement(By.xpath("//a[@href='#Tours']/following::a[text()='"+ subMenuTours + "']")),10);
	}
}
