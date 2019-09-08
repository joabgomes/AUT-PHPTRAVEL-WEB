package curso.treinamento.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;

public class LoginInvalidoSteps {
	
	public WebDriver driver;
	
	@Dado("que eu esteja na tela de login")
	public void que_eu_esteja_na_tela_de_login() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/windows/chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.phptravels.net/admin");
	}
	
	@Quando("tento fazer login com o usuario {string} e senha {string}")
	public void faço_login_com_o_usuario_e_senha(String user, String pass) {		
		driver.findElement(By.name("email")).sendKeys(user);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(pass);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
	}

	@Então("é apresentada a mensagem {string}")
	public void é_apresentada_a_mensagem(String msg) throws InterruptedException {
		Thread.sleep(5000);
		String loginInvalido = driver.findElement(By.xpath("//p[contains(text(), 'The Email field must contain a valid email address.')]")).getText();
		Assert.assertEquals(loginInvalido, msg);
	}
}
