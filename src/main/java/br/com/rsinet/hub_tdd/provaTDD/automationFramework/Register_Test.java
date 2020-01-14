package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Home_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Register_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Search_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class Register_Test {
	private static WebDriver driver = null;

	@BeforeMethod
	public static void openBrowser() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com");
	}

	@Test(priority = 0)
	public void registerPositivo() {
		// chama os metodos criados nas paginas de ação
		Register_Action.registrar(driver);

	}

//	@Test(priority = 1)
//	public void registerNegativo() {
//		// chama os metodos criados nas paginas de ação
//		Register_Action.registrar(driver);
//	}

//	@AfterMethod
//	public static void encerra() {
//		driver.quit();
//	}

}