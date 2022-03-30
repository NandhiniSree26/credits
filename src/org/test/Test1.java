package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String[] args) throws AWTException {
		//lunch the set
         System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nandhini\\eclipse-workspace\\Actions\\driver\\chromedriver.exe");
   
        WebDriver driver =new ChromeDriver();
        //Get Url
        driver.get("https://en-gb.facebook.com/");
        
        WebElement txtUserName = driver.findElement(By.id("email"));
        txtUserName.sendKeys("test");
        Actions a = new Actions(driver);
        //to double click
        a.doubleClick(txtUserName).perform();
        //to right click
        a.contextClick(txtUserName).perform();
        Robot r = new Robot();
        
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        r.keyPress(KeyEvent.VK_CONTROL);
        r.keyPress(KeyEvent.VK_A);
        
	}
	

}



