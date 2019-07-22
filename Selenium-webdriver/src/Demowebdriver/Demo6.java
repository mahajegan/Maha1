package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demoaut.com/");
		WebElement cruise = driver.findElement(By.linkText("Cruises"));
		//Keyboard Actions or Mouse Movements using Selenium command Actions
		//Defining actions in the driver - browser
		Actions move = new Actions(driver); //Actions - multiple Actions
		//mouse over on cruise
		//build is to compile that step
		Action mouseover = move.moveToElement(cruise).build();
		//move to that elements
		mouseover.perform();
		//to click enter from the keyboard
		move.sendKeys(cruise,(Keys.ENTER)).perform();
		//This also click enter from keyboard
		move.sendKeys(cruise,(Keys.RETURN)).perform();
	}

}
