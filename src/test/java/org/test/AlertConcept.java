package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertConcept {

	public static void main(String[] args) {
		// Alert handling
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		WebElement alertPage = driver.findElement(By.xpath("//*[@id='post-153']/div[2]/div/ul/li[9]/a/img"));
		
		alertPage.click();
		
		WebElement alert1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button"));

		alert1.click();
		
		Alert alert3 = driver.switchTo().alert();
		Alert alert = alert3;
		Alert simpleAlert = alert;
		
		simpleAlert.accept();
		
		//Confirm Alert
		
		WebElement alert2 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		
		alert2.click();
		
		Alert confirmAlert = driver.switchTo().alert();
		
		confirmAlert.dismiss();
		
		//Prompt Alert
		
		WebElement Alert3 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div/div/button"));
		
		Alert3.click();
		
		Alert promptAlert = driver.switchTo().alert();
		
		promptAlert.sendKeys("Greens Technologies");
		
		promptAlert.accept();
	}

}
