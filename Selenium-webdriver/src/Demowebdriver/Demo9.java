package Demowebdriver;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo9 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("http://realestate.upskills.in/wp-admin/");
		String Actual = driver.getCurrentUrl();
		driver.findElement(By.id("user_login")).sendKeys("admin");
		driver.findElement(By.id("user_pass")).sendKeys("adminuser@12345");
		driver.findElement(By.xpath("//*[@name='login']")).click();
		Thread.sleep(3000);
		WebElement link = driver.findElement(By.xpath("//*[contains(text(),'Howdy')]"));
		Actions act = new Actions(driver);
		act.contextClick(link).build().perform();
		//contextclick is for right click
		//Right click - is not web based level automation, its common to all browsers - so its browser level operation - so actions wont work
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		//Control tab is to go to the new window which was opened recently
		robot.keyPress(KeyEvent.VK_CONTROL);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(3000);
		String Expected =  driver.getCurrentUrl();
		System.out.println(Expected);
		if (Expected.equals(Actual))
			System.out.println("Its Same");
		else
			System.out.println("Not Same");
			System.out.println("Expected: " +Expected);
			System.out.println("Actual: " +Actual);
			
		
	}

}
