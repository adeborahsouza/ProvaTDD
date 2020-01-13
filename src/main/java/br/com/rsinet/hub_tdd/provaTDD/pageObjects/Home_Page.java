package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Home_Page {

	private static WebElement element = null;

	public static WebElement btnUser(WebDriver driver) {
		// encontrando o elemento de user e clicando
		element = driver.findElement(By.id("menuUser"));
		return element;
	}

	public static WebElement mobile_search(WebDriver driver) {
		// encontrando o elemento lupa e clicando
		element = driver.findElement(By.id("searchSection"));
		return element;
	}
	public static WebElement escrevepesquisa (WebDriver driver) {
		element = driver.findElement(By.id("autoComplete"));
		return element;
	}
	
	public static WebElement produto (WebDriver driver) {
		element = driver.findElement(By.linkText("HP Pavilion 15t Touch Laptop")); 
		return element;
	}

	
}
