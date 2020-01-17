package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Register_Action;
import br.com.rsinet.hub_tdd.provaTDD.driverFactory.DriverManager;
import br.com.rsinet.hub_tdd.provaTDD.util.Print_Func;

public class Register_Test {
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	private static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		driver = DriverManager.startChrome();
		Log.info("Iniciando o ChromeDriver.");

	}

	@Test(priority = 0)
	public void registerPositivo() {
		DriverManager.openWebSite(driver);
		Reporter.log("ChromeDriver inicializado com sucesso.");

		Register_Action.registrar(driver);
		Log.info("Chamando o método de registro.");

		Reporter.log("Pesquisa realizada com sucesso.");
		assertEquals("http://advantageonlineshopping.com/#/", driver.getCurrentUrl());
		Print_Func.captureScreenShot(driver);
		Log.info("Print da tela.");

	}

	@Test(priority = 1)
	public void registerNegativo() {
		DriverManager.openWebSite(driver);
		Reporter.log("ChromeDriver inicializado com sucesso.");
		Register_Action.registrarNegativo(driver);
		assertEquals("http://advantageonlineshopping.com/#/register", driver.getCurrentUrl());
		Print_Func.captureScreenShot(driver);
		Log.info("Print da tela.");

	}

	@AfterMethod
	public static void encerra() {
		DriverManager.closeChrome(driver);
		Log.info("Encerrando o navegador.");
	}

}