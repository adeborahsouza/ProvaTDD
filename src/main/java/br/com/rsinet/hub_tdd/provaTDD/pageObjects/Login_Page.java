package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	private static WebElement element = null;

	// encontra o elemento e cria o método btncadastro
	public static WebElement nome (WebDriver driver) {
		driver.findElement(By.name("usernameRegisterPage"));
		return element;
	}
	
	public static WebElement password (WebDriver driver) {
		driver.findElement(By.name("password"));
		return element;
	}
	
	public static WebElement btnlogin (WebDriver driver) {
		driver.findElement(By.id("sign_in_btnundefined"));
		return element;
	}

	
	// encontra o elemento e cria o método btncadastro
//	public static WebElement btnCadastro(WebDriver driver) {
//		// clica no icone de login
//		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).sendKeys(Keys.ENTER);
//		return element;
//	}

}
