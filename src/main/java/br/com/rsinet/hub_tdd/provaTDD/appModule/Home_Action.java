package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Home_Action {


	public static void pesquisar(WebDriver driver) {
		Home_Page.mobile_search(driver).click();
		Home_Page.escrevepesquisa(driver).sendKeys("HP PRO TABLET 608 G1");
	}

}