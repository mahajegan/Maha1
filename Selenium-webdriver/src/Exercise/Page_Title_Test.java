package Exercise;

import java.awt.AWTException;
//Declare all packages 
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_Title_Test {

public static void main(String[] args) throws InterruptedException, AWTException {
	System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("http://demowebshop.tricentis.com/");
	driver.findElement(By.xpath("//*[contains (text(),'Log in')]")).click();
	driver.findElement(By.id("Email")).sendKeys("manzoormehadi26@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("manzoor");
	driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
	Thread.sleep(6000);
	String Expected = "manzoormehadi26@gmail.com";
	System.out.println("Expected: " +Expected);
	String mailid = driver.findElement(By.xpath("//*[@class='account']")).getText();
	System.out.println("Actual: " +mailid);
	if(mailid.equals(Expected)){
		System.out.println("Successfully logged into manzoormehadi26@gmail.com");
	}
	else
		System.out.println("Not logged into manzoormehadi26@gmail.com");
	
	
}
}