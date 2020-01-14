package br.com.rsinet.hub_tdd.provaTDD.appModule;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Home_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Login_Page;
import br.com.rsinet.hub_tdd.provaTDD.pageObjects.Register_Page;

public class Register_Action {
	public static void registrar(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btnUser(driver)));
		
		Home_Page.btnUser(driver).click();

		wait.until(ExpectedConditions.elementToBeClickable(Register_Page.register(driver)));
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", Register_Page.register(driver));

		Register_Page.user(driver).sendKeys("DDDDDFA");
		Register_Page.email(driver).sendKeys("adeborahsouza@gmail.com");
		Register_Page.password(driver).sendKeys("68335740Bf*");
		Register_Page.confpassword(driver).sendKeys("68335740Bf*");
		Register_Page.name(driver).sendKeys("Deborah");
		Register_Page.lastname(driver).sendKeys("Souza");
		Register_Page.phone(driver).sendKeys("11984193082");
		Register_Page.country(driver).selectByVisibleText("Brazil");
		Register_Page.city(driver).sendKeys("Osasco");
		Register_Page.address(driver).sendKeys("Rua Joaquim Rodrigues, 24");
		Register_Page.state(driver).sendKeys("São Paulo");
		Register_Page.postalcode(driver).sendKeys("06240-122");
		Register_Page.agree(driver).click();
		Register_Page.btnRegister(driver).click();
	}

}
