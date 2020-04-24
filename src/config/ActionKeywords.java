package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ActionKeywords {

	public static WebDriver driver = new FirefoxDriver();

		@Test(priority = 0)
		public static void openBrowser() {
			System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.19.1-arm7hf\\geckodriver.exe");

		}

		@Test(priority = 1)
		public static void navigate() {
			driver.get("http://automationpractice.com/index.php");

		}

		@Test(priority = 2)
		public static void openLoginpage() {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();

		}

		@Test(priority = 3)
		public static void inputEmail() {
			driver.findElement(By.id("email")).sendKeys("ja4oti@gmail.com");
		}

		@Test(priority = 4)
		public static void inputPassword() {
			driver.findElement(By.id("passwd")).sendKeys("ja4macobudo");
		}

		@Test(priority = 5)
		public static void clickLoginbutton() {
			driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]")).click();

			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 6)
		public static void Logout() {
			driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[2]/div/div/nav/div[2]/a")).click();

			try {
				Thread.sleep(3000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Test(priority = 7)
		public static void closeBrowser() {
			driver.close();
		}

	}

