package org.advancedSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandleExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(0);
		
		WebElement button1 = driver.findElement(By.id("Click"));
		
		button1.click();
		
		WebElement button2 = driver.findElement(By.id("Click"));
		
		String frameValue = button2.getText();
		
		System.out.println(frameValue);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		
		WebElement nestedFrame = driver.findElement(By.id("Click1"));
		
		nestedFrame.click();
		
		driver.switchTo().defaultContent();
		
		List<WebElement> noOfFrames = driver.findElements(By.tagName("iframe"));
		
		for (WebElement count : noOfFrames) {
			System.out.println(count.getSize());
		}

	}

}
