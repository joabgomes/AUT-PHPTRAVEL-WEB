package curso.treinamento.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import curso.treinamento.utils.Helper;

public class AddCustomerPage {
	
	public AddCustomerPage(WebDriver driver) { 
		PageFactory.initElements(driver, this);		
	}
	
	@FindBy(xpath = "//div[text()='Add Customer']")
	private WebElement tituloPagina;
	
	@FindBy(name = "fname")
	private WebElement cmpFirstName;
	
	@FindBy(name = "lname")
	private WebElement cmpLastName;
		
	@FindBy(name = "email")
	private WebElement cmpEmail;
	
	@FindBy(name = "password")
	private WebElement cmpPassword;
		
	@FindBy(name = "mobile")
	private WebElement cmpMobileNumber;
	
	@FindBy(name = "country")
	private WebElement comboBoxCountry;
	
	@FindBy(name = "address1")
	private WebElement cmpAddress1;
	
	@FindBy(name = "address2")
	private WebElement cmpAddress2;
	
	@FindBy(name = "status")
	private WebElement comboBoxStatus;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement btnSubmit;
			
	public Boolean validar_pagina_customer() {
		return Helper.elemento_existe(tituloPagina, 10);
	}
	
	public void preencher_first_name(String firstName) { 
		cmpFirstName.sendKeys(firstName);
	}
	
	public void preencher_last_name(String lastName) { 
		cmpLastName.sendKeys(lastName);
	}
	
	public void preencher_email(String email) { 
		cmpEmail.sendKeys(email);
	}
	
	public void preencher_password(String password) { 
		cmpPassword.sendKeys(password);
	}
	
	public void preencher_mobile_number(String mobileNumber) { 
		cmpMobileNumber.sendKeys(mobileNumber);
	}
	
	public void selecionar_country(String country) { 
		//	Select combo = new Select(comboBoxCountry);
		//	combo.selectByVisibleText(country);
		
		new Select(comboBoxCountry).selectByVisibleText(country); 				
	}
	
	public void preencher_adress1(String adress1) { 		
		cmpAddress1.sendKeys(adress1);		
	}
	
	public void preencher_adress2(String adress2) { 
		cmpAddress2.sendKeys(adress2);
	}
	
	public void selecionar_status(String status) { 
		new Select(comboBoxStatus).selectByVisibleText(status);
	}
	
	public void clicar_btn_submit() { 
		btnSubmit.click();
	}

}