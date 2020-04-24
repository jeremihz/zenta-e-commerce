package testECommerceSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class testLogin {

	WebDriver driver = new FirefoxDriver();

	@Test(priority = 0)
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.19.1-arm7hf\\geckodriver.exe");
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void navigate() {
		driver.get("http://automationpractice.com/index.php");

	}

	@Test(priority = 2)
	public void openLoginpage() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

		String actual = driver.getTitle();
		String Expected = "Login - My Store";

		try {
			Assert.assertEquals(actual, Expected);
			System.out.println("User Succesful in accessing Login Page");
		} catch (Exception e) {

			System.out.println("ERROR ACCESSING LOGIN PAGE");
		}

	}

	@Test(priority = 3)
	public void inputEmail() {
		driver.findElement(By.id("email")).sendKeys("ja4oti@gmail.com");
	}

	@Test(priority = 4)
	public void inputPassword() {
		driver.findElement(By.id("passwd")).sendKeys("ja4macobudo");
	}

	@Test(priority = 5)
	public void clickLoginbutton() {
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String actual = driver.getTitle();
		String Expected = "My account - My Store";

		try {
			Assert.assertEquals(actual, Expected);
			System.out.println("login Test passed");
		} catch (Exception e) {

			System.out.println("ERROR:LOGIN FAILED");
		}

		// cookies must be deleted for automation engine to successfully log out.
		// If cookies not deleted LOGOUT ERROR OCCURS
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 6)
	public void Logout() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		String actual = driver.getTitle();
		String Expected = "Login - My Store";

		try {
			Assert.assertEquals(actual, Expected);
			System.out.println("User Succesfully loged out");
		} catch (Exception e) {

			System.out.println("ERROR::LOGOUT UNSUCCESSFUL");
		}
	}

	@Test(priority = 7)
	public void closeBrowser() {
		driver.close();
	}

}
