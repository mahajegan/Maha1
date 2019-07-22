package Demowebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		String username = driver.findElement(By.id("txtUsername")).getAttribute("value");
		System.out.println("Value of User Name is: " +username);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(3000);
		//driver.findElement(By.linkText("Performance")).click();
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of Links are: " +links.size());
		for (WebElement l:links)
		{
			String alllinks = l.getText();
			System.out.println(alllinks);
		}
	}

}
