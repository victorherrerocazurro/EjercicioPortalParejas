package com.portal.parejas;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AfinesIT {
	private WebDriver driver;
	private String baseUrl;
	private StringBuffer verificationErrors = new StringBuffer();

	@Before
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "http://localhost:8081/Web/Parejas/afines.html?id=7";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void testAfinesIT() throws Exception {
		driver.get(baseUrl);

		List<WebElement> filas = driver.findElements(By.tagName("TR"));

		Assert.assertEquals(8, filas.size());

		List<WebElement> camposPrimerRegistro = filas.get(1).findElements(By.tagName("TD"));

		Assert.assertEquals("Juan", camposPrimerRegistro.get(0).getText());
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			Assert.fail(verificationErrorString);
		}
	}
}
