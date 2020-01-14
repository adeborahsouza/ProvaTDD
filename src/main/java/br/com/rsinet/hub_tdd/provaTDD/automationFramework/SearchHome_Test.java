package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.provaTDD.appModule.ClickSearch_Action;


public class SearchHome_Test {
	private static WebDriver driver = null;

	@BeforeMethod
	public static void openBrowser() {
		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com");
	}
	@Test
	public void searchHomePositivo() {
		// chama os metodos criados nas paginas de ação
		ClickSearch_Action.pesquisarinicio(driver);
//	 valor esperado / valor comparando
//		Assert.assertEquals(true, Home_Page.btnsignout(driver).isEnabled());
	}
	
//	
//	@Test
//	public void searchHomeNegativo() {
//		// chama os metodos criados nas paginas de ação
//		ClickSearch_Action.pesquisarinicio(driver);
////	 valor esperado / valor comparando
////		Assert.assertEquals(false, Home_Page.btnsignout(driver).isEnabled());
//	}
//	

//	@AfterMethod
//	public static void encerra() {
//		driver.quit();
//	}
	
}