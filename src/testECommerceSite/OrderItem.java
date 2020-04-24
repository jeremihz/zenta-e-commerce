package testECommerceSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class OrderItem {

	WebDriver driver = new FirefoxDriver();

	@Test(priority = 1)
	public void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.19.1-arm7hf\\geckodriver.exe");
		driver.manage().window().maximize();

		driver.get("http://automationpractice.com/index.php");
	}

	@Test(priority = 2)
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
			e.printStackTrace();
		}

	}

	@Test(priority = 3)
	public void orderDress() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[6]/ul/li[2]/a")).click();

		// order by properties>short skirts
		driver.findElement(By.id("layered_id_feature_19")).click();

		WebElement element = driver
				.findElement(By.xpath("http://automationpractice.com/img/p/1/0/10-home_default.jpg"));

		Actions action = new Actions(driver);

		action.moveToElement(element).build().perform();

		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[1]/span"))
				.click();
	}

	@Test(priority = 4)
	public void orderDress1() {

		// switch to new window/browser popup
		for (String window2 : driver.getWindowHandles()) {

			driver.switchTo().window(window2);
		}
		// click on proceed to checkout
		driver.findElement(
				By.xpath("/html/body/div[1]/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a/span")).click();

		// proceed to address<user signed in>
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/p[2]/a[1]/span")).click();

		// proceed to shipping
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button")).click();

		// proceed to payment
		driver.findElement(By.id("cgv")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/form/p/button")).click();

		// on payments page>confirm bank>confirm order
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/div/div[3]/div[1]/div/p/a")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/p/button")).click();

	}
}
