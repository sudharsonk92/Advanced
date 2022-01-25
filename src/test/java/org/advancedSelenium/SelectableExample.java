package org.advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelectableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/selectable.html");

		List<WebElement> selectableList = driver.findElements(By.xpath("//*[@id='selectable']/li"));

		int listSize = selectableList.size();

		System.out.println(listSize);

		// Method 1 - keyDown

		/*
		 * Actions actions = new Actions(driver);
		 * 
		 * actions.keyDown(Keys.CONTROL) .click(selectableList.get(0))
		 * .click(selectableList.get(1)) .click(selectableList.get(2))
		 * .build().perform();
		 */
		
		//method 2 - clickandhold 
		Actions actions = new Actions(driver);
		actions.clickAndHold(selectableList.get(0))
		.clickAndHold(selectableList.get(1))
		.clickAndHold(selectableList.get(2))
		.build().perform();
		

	}

}
