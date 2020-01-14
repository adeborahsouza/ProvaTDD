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
import br.com.rsinet.hub_tdd.provaTDD.util.Constant;

public class Register_Action {
	public static void registrar(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);

		wait.until(ExpectedConditions.elementToBeClickable(Home_Page.btnUser(driver)));

		Home_Page.btnUser(driver).click();

		wait.until(ExpectedConditions.elementToBeClickable(Register_Page.register(driver)));
		JavascriptExecutor jsExec = (JavascriptExecutor) driver;
		jsExec.executeScript("arguments[0].click();", Register_Page.register(driver));

		Register_Page.user(driver).sendKeys(Constant.user);
		Register_Page.email(driver).sendKeys(Constant.email);
		Register_Page.password(driver).sendKeys(Constant.password);
		Register_Page.confpassword(driver).sendKeys(Constant.confpassword);
		Register_Page.name(driver).sendKeys(Constant.name);
		Register_Page.lastname(driver).sendKeys(Constant.lastname);
		Register_Page.phone(driver).sendKeys(Constant.phone);
		Register_Page.country(driver).selectByVisibleText(Constant.country);
		Register_Page.city(driver).sendKeys(Constant.city);
		Register_Page.address(driver).sendKeys(Constant.address);
		Register_Page.state(driver).sendKeys(Constant.state);
		Register_Page.postalcode(driver).sendKeys(Constant.postalcode);
		Register_Page.agree(driver).click();
		Register_Page.btnRegister(driver).click();
	}

}
