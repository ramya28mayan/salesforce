package saleforce_01;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateAccount_001 extends BaseClass{
	
	@Test
	public void createaccount() {

		

		//Click on the toggle menu button
		driver.findElement(By.xpath("//button[@title='App Launcher']")).click();

		//Click view All and click Sales from App Launcher
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		try {
			driver.findElement(By.xpath("//p[text()='Sales']")).click();}
		catch(org.openqa.selenium.NoSuchElementException e) {
			Reporter.log("Network is Slow");
		}

		//Click on Accounts tab 
		//driver.findElement(By.xpath("//a[@title='Accounts']")).click();

		WebElement element = driver.findElement(By.xpath("//a[@title='Accounts']"));
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);

		//Click on New button
		driver.findElement(By.xpath("//a[@title='New']")).click();





	}

}
