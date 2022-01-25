package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadiButtonSteps {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		WebElement radioButtonPage = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[6]/a"));

		radioButtonPage.click();

		WebElement unChecked = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[2]/input"));

		boolean status1 = unChecked.isSelected();

		WebElement checked = driver
				.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/label[3]/input"));
		
		boolean status2 = checked.isSelected();
		
		System.out.println(status1);
		System.out.println(status2);

	}

}
