package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxAutomate {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		WebElement button = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[2]/a/img"));

		button.click();

		WebElement getPositionButton = driver.findElement(By.id("position"));

		Point XyValue = getPositionButton.getLocation();

		int xValue = XyValue.getX();

		int yValue = XyValue.getY();

		System.out.println("X axis location is " + xValue + " Y axis location is " + yValue);

		// Find button color

		WebElement getButtonColor = driver.findElement(By.id("color"));

		String color = getButtonColor.getCssValue("background-color");

		System.out.println("Button back ground color is " + color);

		// Size of the button
		
		WebElement getButtonSize = driver.findElement(By.id("size"));
		
		int height = getButtonSize.getSize().getHeight();
		
		int width = getButtonSize.getSize().getWidth();
		
		System.out.println("Button height is : "+height + "Button width is : "+ width);
		
		//click the home page button
		
		WebElement returnToHomePage = driver.findElement(By.id("home"));
		
		returnToHomePage.click();

	}

}
