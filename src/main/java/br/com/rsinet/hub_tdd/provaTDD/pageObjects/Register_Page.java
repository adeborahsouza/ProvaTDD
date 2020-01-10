package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	private static WebElement element = null;

	public static WebElement btnUser(WebDriver driver) {
		// escrevendo username
		driver.findElement(By.name("usernameRegisterPage"));
		return element;
	}

	public static WebElement email(WebDriver driver) {
		// escrevendo email
		driver.findElement(By.name("emailRegisterPage"));
		return element;
	}

	public static WebElement senha(WebDriver driver) {
		// escrevendo senha
		driver.findElement(By.name("passwordRegisterPage"));
		return element;
	}

	public static WebElement confsenha(WebDriver driver) {
		// confirmando senha
		driver.findElement(By.name("confirm_passwordRegisterPage"));
		return element;
	}

	public static WebElement nome(WebDriver driver) {
		// escrevendo primeiro nome
		driver.findElement(By.name("first_nameRegisterPage"));
		return element;
	}

	public static WebElement ultimonome(WebDriver driver) {
		// escrevendo ultimo nome
		driver.findElement(By.name("last_nameRegisterPage"));
		return element;
	}

	public static WebElement telefone(WebDriver driver) {
		// escrevendo telefone
		driver.findElement(By.name("phone_numberRegisterPage"));
		return element;
	}

	public static WebElement pais(WebDriver driver) {
		// selecionando o pais
		Select oSelect = new Select(driver.findElement(By.name("countryListboxRegisterPage")));
		oSelect.selectByVisibleText("Brazil");
		return element;
	}

	public static WebElement cidade(WebDriver driver) {
		// escrevendo cidade
		driver.findElement(By.name("cityRegisterPage"));
		return element;
	}

	public static WebElement endereco(WebDriver driver) {
		// escrevendo endereço
		driver.findElement(By.name("addressRegisterPage"));
		return element;
	}

	public static WebElement estado(WebDriver driver) {
		// escrevendo estado
		driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		return element;
	}

	public static WebElement cep(WebDriver driver) {
		// escrevendo cep
		driver.findElement(By.name("postal_codeRegisterPage"));
		return element;
	}

	public static WebElement termos(WebDriver driver) {
		// aceitando os termos
		driver.findElement(By.name("i_agree"));
		return element;
	}

	public static WebElement confirma(WebElement driver) {
		// aceitando os termos
		driver.findElement(By.id("register_btnundefined"));
		return element;
	}

//		driver.quit();

}
