package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Navigation Methods:
		//1st Navigation Method
		driver.navigate().to("http://demoaut.com/");
		String url = driver.getTitle();
		/*driver.findElement(By.linkText("Cruises")).click();
		//2nd Navigation Method
		driver.navigate().back();
		Thread.sleep(3000);
		//3rd Navigation Method
		driver.navigate().forward();
		Thread.sleep(3000);
		//4th Navigation Method
		driver.navigate().refresh();*/
		System.out.println(driver.findElement(By.tagName(url)).getText());
	
		
	}

}
