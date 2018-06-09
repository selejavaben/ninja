package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class CommerceHook {
	
	private static WebDriver chromeDriver;
	private static WebDriver firefoxDriver;
	
	@Before("@chrome")
	public void setUpChrome() {
		chromeDriver = new ChromeDriver();
	}
	
	@Before("@firefox")
	public void setUpFireFox() {
		firefoxDriver = new FirefoxDriver();
	}
	
	@After("@chrome")
	public void endChrome() {
		chromeDriver.quit();
	}
	
	@After("@firefox")
	public void endFireFox() {
		firefoxDriver.quit();
	}
	
	public static WebDriver getChromeDriver() {
		return chromeDriver;
	}
	
	public static WebDriver getFireFoxDriver() {
		return firefoxDriver;
	}
	

}
