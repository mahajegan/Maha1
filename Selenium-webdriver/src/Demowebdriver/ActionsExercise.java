package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExercise {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://demoaut.com/");
		Thread.sleep(3000);
		//driver.findElement(By.name("userName")).sendKeys("sunil");
		//driver.findElement(By.name("password")).sendKeys("sunil");
		Actions MC = new Actions(driver);
		MC.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.ENTER).perform();
		//MC.sendKeys(Keys.RETURN).perform();

	}

}
