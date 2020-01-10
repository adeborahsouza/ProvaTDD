package br.com.rsinet.hub_tdd.provaTDD.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login_Page {
	private static WebElement element = null;

	public static WebElement btnUser(WebDriver driver) {
		// clica no icone de login
		driver.findElement(By.id("menuUserSVGPath"));
		return element;
	}

}
