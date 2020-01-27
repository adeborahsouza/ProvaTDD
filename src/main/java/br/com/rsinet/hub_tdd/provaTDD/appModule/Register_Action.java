package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Register_Page;
import br.com.rsinet.hub_tdd.provaTDD.util.Constant;

public class Register_Action {
	private static Logger Log = Logger.getLogger(Logger.class.getName());

	public static void registrar(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Log.info("Adicionando uma espera implicita.");

		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btnUser(driver)));
		Log.info("Espera o elemento ser clicavel.");

		Home_Page.btnUser(driver).click();
		Log.info("Clica no elemento.");

		wait.until(ExpectedConditions.elementToBeClickable(Register_Page.register(driver)));
		Log.info("Espera o elemento ser clicavel.");

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", Register_Page.register(driver));
		Log.info("Clica no elemento.");

		Register_Page.user(driver).sendKeys(Constant.user);
		Log.info("Preenchendo o campo username.");

		Register_Page.email(driver).sendKeys(Constant.email);
		Log.info("Preenchendo o campo email.");

		Register_Page.password(driver).sendKeys(Constant.password);
		Log.info("Preenchendo o campo senha.");

		Register_Page.confPassword(driver).sendKeys(Constant.confPassword);
		Log.info("Preenchendo o campo de confirmação de senha.");

		Register_Page.name(driver).sendKeys(Constant.name);
		Log.info("Preenchendo o campo com o primeiro nome.");

		Register_Page.lastName(driver).sendKeys(Constant.lastname);
		Log.info("Preenchendo o campo com o último nome.");

		Register_Page.phone(driver).sendKeys(Constant.phone);
		Log.info("Preenchendo o campo telefone.");

		Register_Page.country(driver).selectByVisibleText(Constant.country);
		Log.info("Preenchendo o campo País.");

		Register_Page.city(driver).sendKeys(Constant.city);
		Log.info("Preenchendo o campo cidade.");

		Register_Page.address(driver).sendKeys(Constant.address);
		Log.info("Preenchendo o campo endereço.");

		Register_Page.state(driver).sendKeys(Constant.state);
		Log.info("Preenchendo o campo estado.");

		Register_Page.postalCode(driver).sendKeys(Constant.postalcode);
		Log.info("Preenchendo o campo cep.");

		Register_Page.agree(driver).click();
		Log.info("Concordando com termos.");

		Register_Page.btnRegister(driver).click();
		Log.info("Clicando no botão para confirmar registro.");

		wait.until(ExpectedConditions.textToBePresentInElement(Home_Page.txtUser(driver), Constant.user));
	}

	public static void registrarNegativo(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		Log.info("Adicionando uma espera implicita.");

		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btnUser(driver)));
		Log.info("Espera o elemento ser clicavel.");

		Home_Page.btnUser(driver).click();
		Log.info("Clica no elemento.");

		wait.until(ExpectedConditions.elementToBeClickable(Register_Page.register(driver)));
		Log.info("Espera o elemento ser clicavel.");

		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", Register_Page.register(driver));
		Log.info("Clica no elemento.");

		Register_Page.user(driver).sendKeys(Constant.user);
		Log.info("Preenchendo o campo username.");

		Register_Page.email(driver).sendKeys(Constant.email);
		Log.info("Preenchendo o campo email.");

		Register_Page.password(driver).sendKeys(Constant.password);
		Log.info("Preenchendo o campo senha.");

		Register_Page.confPassword(driver).sendKeys(Constant.confPassword);
		Log.info("Preenchendo o campo de confirmação de senha.");

		Register_Page.name(driver).sendKeys(Constant.name);
		Log.info("Preenchendo o campo com o primeiro nome.");

		Register_Page.lastName(driver).sendKeys(Constant.lastname);
		Log.info("Preenchendo o campo com o último nome.");

		Register_Page.phone(driver).sendKeys(Constant.phone);
		Log.info("Preenchendo o campo telefone.");

		Register_Page.country(driver).selectByVisibleText(Constant.country);
		Log.info("Preenchendo o campo País.");

		Register_Page.city(driver).sendKeys(Constant.city);
		Log.info("Preenchendo o campo cidade.");

		Register_Page.address(driver).sendKeys(Constant.address);
		Log.info("Preenchendo o campo endereço.");

		Register_Page.state(driver).sendKeys(Constant.state);
		Log.info("Preenchendo o campo estado.");

		Register_Page.postalCode(driver).sendKeys(Constant.postalcode);
		Log.info("Preenchendo o campo cep.");

		Register_Page.agree(driver).click();
		Log.info("Concordando com termos.");

		Register_Page.btnRegister(driver).click();
		Log.info("Clicando no botão para confirmar registro.");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,100)");

	}
}
