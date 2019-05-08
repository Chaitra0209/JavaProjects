package com.uttara.Selenium;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Got errors on last 3 import stmts, resolved it by downloading the selenium server from the Se website
// Followed the steps in the link http://www.assertselenium.com/eclipse-2/how-to-setup-a-webdriver-project-in-eclipse/


public class TwitterLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwitterLogin obj = new TwitterLogin();

		obj.loginBrowser();
	}

	public void loginBrowser() {

		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();

		driver.manage().timeouts().pageLoadTimeout(15,TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://twitter.com/login");
		
		driver.findElement(By.xpath("//div[@id='page-container']/div/div/form/fieldset/div/input")).click();

		driver.findElement(By.xpath("//div[@id='page-container']/div/div/form/fieldset/div/input")).sendKeys("chaitraanand25@gmail.com");
		
		driver.findElement(By.xpath("//div[@id='page-container']/div/div/form/fieldset/div[2]/input")).click();

		driver.findElement(By.xpath("//div[@id='page-container']/div/div/form/fieldset/div[2]/input")).sendKeys("Bh@v@n!5");

		driver.findElement(By.xpath("//div[@id='page-container']/div/div/form/div[2]/button")).click();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//li[@id='user-dropdown']/a"));
		
		driver.findElement(By.xpath("//li[@id='user-dropdown']/a")).click();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//li[@id='signout-button']/button")).click();
		
	}
}
