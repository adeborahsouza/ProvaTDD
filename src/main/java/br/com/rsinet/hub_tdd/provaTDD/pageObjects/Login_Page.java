package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	private static WebElement element = null;
	
//	public static WebElement caixa(WebDriver driver) {
//		driver.findElement(By.name("username"));
//		return element;
//	}

	public static WebElement btnCadastro(WebDriver driver) {
		// clica no icone de login
		driver.findElement(By.linkText("CREATE NEW ACCOUNT")).sendKeys(Keys.ENTER);
		return element;
	}

}
