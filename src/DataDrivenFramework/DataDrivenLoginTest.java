package DataDrivenFramework;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utility.Exceldata;


public class DataDrivenLoginTest extends Exceldata {

	WebDriver driver;
	Map<String, Object[]> testresultdata;

	@Test (dataProvider = "TestData")
	public void userLogin (String Email, String Password, String Test_Results) {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.19.1-arm7hf\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://automationpractice.com/index.php?controller=my-account");
		driver.findElement(By.id("email")).sendKeys(Email);
		driver.findElement(By.id("passwd")).sendKeys(Password);
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

		String actual = driver.getTitle();
		String Expected = "My account - My Store";

		try {
			Assert.assertEquals(actual, Expected);
			System.out.println("login Test Case is Pass");
		} catch (Exception e) {

			System.out.println("Login Test Case is Fail");
		}
		
	}
	}
