package testECommerceSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class contactUSpage {

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
	}

	@Test(priority = 6)
	public void ContactUS() {
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[3]/a")).click();

		System.out.println(driver.getTitle());
		
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Select select1 = new Select(driver.findElement(By.xpath("//*[@id=\"id_contact\"]")));
		select1.selectByIndex(1);

		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("ja4oti@gmail.com");

		Select select2 = new Select(driver.findElement(
				By.xpath("/html/body/div[1]/div[2]/div/div[3]/div/form/fieldset/div[1]/div[1]/div[2]/div/select")));
		select2.selectByIndex(1);

		Select select3 = new Select(driver.findElement(By.xpath("//*[@id=\"30974_order_products\"]")));
		select3.selectByIndex(1);

		driver.findElement(By.id("message"))
				.sendKeys("Please add more items on the site, I cannot find alot of things that i need");

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 7)
	public void clickSend() {
		driver.findElement(By.xpath("//*[@id=\"submitMessage\"]")).click();
		
		System.out.println("your message has been successfully sent");

		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test(priority = 8)
	public void closeBrowser() {
		driver.close();

	}

}
