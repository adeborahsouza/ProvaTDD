package br.com.rsinet.hub_tdd.provaTDD.automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import br.com.rsinet.hub_tdd.provaTDD.appModule.Home_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.Register_Action;
import br.com.rsinet.hub_tdd.provaTDD.appModule.SignIn_Action;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;

public class POM_TC {
	private static WebDriver driver = null;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.drive", "C:\\Users\\deborah.souza\\Downloads\\chromedriver_win32");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://advantageonlineshopping.com/#/");

		Home_Action.clicar(driver);
		SignIn_Action.logar(driver);
		Register_Action.registrar(driver);
		
//		Home_Action.pesquisar(driver);

	}
}
