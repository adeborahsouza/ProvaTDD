package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Register_Page {
	private static WebElement element = null;
	
	public static WebElement user(WebDriver driver) {
		element = driver.findElement(By.name("usernameRegisterPage"));
		return element;
	}

	public static WebElement email(WebDriver driver) {
		// escrevendo email
		element = driver.findElement(By.name("emailRegisterPage"));
		return element;
	}

	public static WebElement password(WebDriver driver) {
		// escrevendo senha
		element = driver.findElement(By.name("passwordRegisterPage"));
		return element;
	}

	public static WebElement confpassword(WebDriver driver) {
		// confirmando senha
		element = driver.findElement(By.name("confirm_passwordRegisterPage"));
		return element;
	}

	public static WebElement name(WebDriver driver) {
		// escrevendo primeiro nome
		element = driver.findElement(By.name("first_nameRegisterPage"));
		return element;
	}

	public static WebElement lastname(WebDriver driver) {
		// escrevendo ultimo nome
		element = driver.findElement(By.name("last_nameRegisterPage"));
		return element;
	}

	public static WebElement phone(WebDriver driver) {
		// escrevendo telefone
		element = driver.findElement(By.name("phone_numberRegisterPage"));
		return element;
	}

	public static Select country(WebDriver driver) {
		// selecionando o pais
		element = driver.findElement(By.name("countryListboxRegisterPage"));
		Select oSelect = new Select(element);
		return oSelect;
	}

	public static WebElement city(WebDriver driver) {
		// escrevendo cidade
		element = driver.findElement(By.name("cityRegisterPage"));
		return element;
	}

	public static WebElement address(WebDriver driver) {
		// escrevendo endereço
		element = driver.findElement(By.name("addressRegisterPage"));
		return element;
	}

	public static WebElement state(WebDriver driver) {
		// escrevendo estado
		element = driver.findElement(By.name("state_/_province_/_regionRegisterPage"));
		return element;
	}

	public static WebElement postalcode(WebDriver driver) {
		// escrevendo cep
		element = driver.findElement(By.name("postal_codeRegisterPage"));
		return element;
	}

	public static WebElement agree(WebDriver driver) {
		// aceitando os termos
		element = driver.findElement(By.name("i_agree"));
		return element;
	}

	public static WebElement register(WebDriver driver) {
		// aceitando os termos
		element = driver.findElement(By.xpath("/html/body/login-modal/div/div/div[3]/a[2]"));
		return element;
	}
	
	public static WebElement btnRegister(WebDriver driver) {
		// aceitando os termos
		element = driver.findElement(By.id("register_btnundefined"));
		return element;
	}
	
	

//		driver.quit();

}
