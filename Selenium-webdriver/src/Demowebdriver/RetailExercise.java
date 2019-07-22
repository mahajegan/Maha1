package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class RetailExercise {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://retail.upskills.in/admin/");
	driver.findElement(By.id("input-username")).sendKeys("admin");
	driver.findElement(By.name("password")).sendKeys("admin@123");
	Actions MC = new Actions(driver);
	MC.sendKeys(Keys.RETURN).perform();
	WebElement catalog = driver.findElement(By.xpath("//*[@id='menu-catalog']"));
	MC.moveToElement(catalog).click().build().perform();
	//we can give click and perform also without build. Build is to compile and run it. Both works.

	
	}

}
