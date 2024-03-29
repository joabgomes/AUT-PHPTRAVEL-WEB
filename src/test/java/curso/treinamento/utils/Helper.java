package curso.treinamento.utils;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.Scenario;
import curso.treinamento.setup.Hooks;
import io.cucumber.datatable.DataTable;

public class Helper {
	
	
	public static List<Map<String, String>> dataTable;
	
	public static List<Map<String, String>> listDataTable = dataTable;

	public static void aguardar_elemento(int timeout, WebElement elemento) { 
		
		WebDriverWait aguardar = new WebDriverWait(Hooks.getDriver(), timeout);
		aguardar.until(ExpectedConditions.visibilityOf(elemento));		
	}
	
	public static boolean elemento_existe(WebElement elemento, int timeout) { 
		
		try {
			aguardar_elemento(timeout, elemento);
			
			return true;
			
		} catch (Exception e) {
			return false;
		}		
	}
	
	public static void create_datatable(DataTable dataTable_) {
		dataTable = dataTable_.asMaps(String.class, String.class);
	}
	
	public static void screenshot(Scenario scenario) {

		String nomeEvidencia = scenario.getName().replace(" ", "_")+ "_" + scenario.getStatus().toString() + ".jpg";

		File file = ((TakesScreenshot) Hooks.getDriver()).getScreenshotAs(OutputType.FILE);

		try {						
			FileUtils.copyFile(file, new File("target" + File.separator + "screenshots" + File.separator +  nomeEvidencia));
		} catch (IOException e) {
			Assert.fail("Erro na geração da evidência: " + nomeEvidencia );
		}
	}
	
	

}