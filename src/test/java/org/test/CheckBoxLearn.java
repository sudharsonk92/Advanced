package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxLearn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kavitha\\eclipse-Sudharson\\SeleniumBasics\\Lib\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.leafground.com/");

		WebElement checkBoxPage = driver.findElement(By.xpath("//*[@id=\"post-153\"]/div[2]/div/ul/li[7]/a"));

		checkBoxPage.click();

		WebElement chekBox1 = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div[1]/input"));
		
		chekBox1.click();
		
		//need to deselect the checkbok 
		
		WebElement notSelected = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[1]/input"));
		
		if (notSelected.isSelected()) {
			notSelected.click();
		}
		
		WebElement selectedBox = driver.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[3]/div[2]/input"));

		if (selectedBox.isSelected()) {
			selectedBox.click();
		}
		
		
	}

}
