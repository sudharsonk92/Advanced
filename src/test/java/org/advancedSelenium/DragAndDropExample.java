package org.advancedSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDropExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		WebElement toolTipBtn = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[20]/a/img"));

		toolTipBtn.click();
		
		WebElement toolTipText = driver.findElement(By.xpath("//input[@id='age']"));
		
		String toolTipText1 = toolTipText.getAttribute("title");
		
		System.out.println(toolTipText1);
		
		
	}

}
