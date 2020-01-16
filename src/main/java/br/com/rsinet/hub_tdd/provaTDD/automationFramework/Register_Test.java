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
import br.com.rsinet.hub_tdd.provaTDD.util.Print_Func;

public class Register_Test {
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	private static WebDriver driver;

	@BeforeMethod
	public static void openBrowser() {
		DOMConfigurator.configure("log4j.xml");
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");
		Log.info("Iniciando o ChromeDriver.");

		driver.manage().window().maximize();
		Log.info("Maximizando a tela.");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Log.info("Adicionando uma espera implicita.");

		driver.get("http://advantageonlineshopping.com");
		Log.info("Acessando o site através da url.");
	}

	@Test(priority = 0)
	public void registerPositivo() {
		Reporter.log("ChromeDriver inicializado com sucesso.");

		Register_Action.registrar(driver);
		Log.info("Chamando o método de registro.");

		Reporter.log("Pesquisa realizada com sucesso.");
		assertEquals("http://advantageonlineshopping.com/#/", driver.getCurrentUrl());
		Print_Func.captureScreenShot(driver);

	}

	@Test(priority = 1)
	public void registerNegativo() {
		Register_Action.registrarNegativo(driver);
		assertEquals("http://advantageonlineshopping.com/#/register", driver.getCurrentUrl());
		Print_Func.captureScreenShot(driver);
		
	}

	@AfterMethod
	public static void encerra() {
		driver.quit();
		Log.info("Encerrando o navegador.");
	}

}