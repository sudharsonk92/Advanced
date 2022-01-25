package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");
		
		WebElement dropDownButton = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[5]/a"));
		
		dropDownButton.click();
		
		WebElement dropDown = driver.findElement(By.id("dropdown1"));
		
		Select select = new Select(dropDown);
		
		select.selectByIndex(1);
		select.selectByValue("2");
		select.selectByVisibleText("Appium");
		
		List<WebElement> getAll = select.getOptions();
		
		int size = getAll.size();
		
		System.out.println(size);
		
		dropDown.sendKeys("Appium");
		
		

	}

}
