package curso.treinamento.setup;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import curso.treinamento.utils.Helper;

public class Hooks {
	
	public static WebDriver driver;
	public static ResourceBundle bundle = ResourceBundle.getBundle("project");
	
	@Before
	public void startTest(Scenario scenario) {
		
		System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(bundle.getString("env.url"));
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		Helper.screenshot(scenario);
		driver.close();
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}
