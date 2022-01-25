package org.advancedSelenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		WebElement windowPage = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[11]/a/img"));
		
		windowPage.click();
		
		String parentWindow = driver.getWindowHandle();
		
		System.out.println(parentWindow);
		
		WebElement homePage = driver.findElement(By.id("home"));
		
		homePage.click();
		
		Set<String> handles= driver.getWindowHandles();
		
		
		for (String newWindow : handles) {
			driver.switchTo().window(newWindow);
		}
		
		WebElement editBox = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[1]/a"));

		editBox.click();
		
		String childWindow=driver.getWindowHandle();
		System.out.println(childWindow);
		driver.close();
		
		driver.switchTo().window(parentWindow);
		
		WebElement multipleWindow = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		
		multipleWindow.click();
		
		int numOfWindowsOpen = driver.getWindowHandles().size();
		
		System.out.println(numOfWindowsOpen);
		
		WebElement doNotCloseMe = driver.findElement(By.id("color"));
		
		doNotCloseMe.click();
		
		//except parent window close remaining windows
		
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		for (String allWindows : newWindowHandles) {
			if (!allWindows.equals(parentWindow)) {
				driver.switchTo().window(allWindows);
				driver.close();
			}
		}
		
		//driver.quit();
	}

}
