package testECommerceSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class changeUserinfo {

	WebDriver driver = new FirefoxDriver();

	@Test
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.19.1-arm7hf\\geckodriver.exe");
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
	}

	@Test(dependsOnMethods= {"openBrowser"})
	public void Login() {
		// click sign in button
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

		// input email
		driver.findElement(By.id("email")).sendKeys("ja4oti@gmail.com");

		// input password
		driver.findElement(By.id("passwd")).sendKeys("ja4macobudo");

		// click login button
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();
	
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	@Test(dependsOnMethods= {"Login"})
	public void updateInfo() {
		// click on MY PERSONAL INFO BUTTON
		driver.findElement(By.xpath(
			"/html/body/div[1]/div[2]/div/div[3]/div/div/div[1]/ul/li[4]/a/span"
			)).click();
		
		String actual = driver.getTitle();
		String Expected = "Identity - My Store";

		try {
			Assert.assertEquals(actual, Expected);
			System.out.println("Change Info Page accessed succesfully");
		} catch (Exception e) {

			System.out.println("Error accessing profile page");
		}
		
		// change first name
		driver.findElement(By.id("firstname")).clear();
		driver.findElement(By.id("firstname")).sendKeys("Nelson");

		// change last name
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Mandela");

		// update email address
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("ja4oti@gmail.com");

		// input old password
		driver.findElement(By.name("old_passwd")).sendKeys("ja4macobudo");

		// click on save button
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/fieldset/div[11]/button")).click();

	}

}
