package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;

public class Login_Action {
	// cria um novo metodo chamado logar utilizando o metodo btncadastro
	public static void logar(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 20);

		Home_Page.btnUser(driver).click();

		// chama os métodos que criei no login_page
		Login_Page.nome(driver).sendKeys("adeborahsouza");
		Login_Page.password(driver).sendKeys("68335740Bf*");
		Login_Page.btnlogin(driver).click();

	}

}
