package Demowebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//This is to set the property of geckodriver/chrome driver 
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\MahalakshmiKathamuth\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		//System.setProperty("webdriver.ie.driver", "C:\\Users\\MahalakshmiKathamuth\\Downloads\\IEDriverServer_x64_3.14.0(1)\\IEDriverServer.exe");
		//webdriver is a interface of selenium which contains all the browser implementation
		//WebDriver driver = new FirefoxDriver();
		//if we use ChromeDriver is for running only in chrome, similarly for firefox.. If we need to execute it all browser, we shd use WebDriver
		ChromeDriver chdriver = new ChromeDriver();
		//WebDriver iedriver = new InternetExplorerDriver();
		//API's are commands to maximize the browser and open the url
		chdriver.manage().window().maximize();
		//chdriver.get("https://opensource-demo.orangehrmlive.com/");//this is the direct method
		//Alternate API to open a URL (Navigation method)
		chdriver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		String ExpectedTitle="OrangeHRM";
		//Wait - Should not use in real time
		Thread.sleep(3000);
		//Refresh web page (Navigation method)
		chdriver.navigate().refresh();
		chdriver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys("Admin");
		chdriver.findElement(By.name("txtPassword")).sendKeys("admin123");
		chdriver.findElement(By.id("btnLogin")).click();
		String ActualTitle=chdriver.getTitle();
		System.out.println("Lets print the actual title");
		System.out.println("Actual Title is: " +ActualTitle);
		if (ExpectedTitle.equals(ActualTitle)){
			//chdriver.findElement(By.linkText("Welcome Admin")).click();
			Thread.sleep(3000);
			chdriver.findElement(By.xpath("//*[@id='welcome']")).click();
			Thread.sleep(3000);
			chdriver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[2]/a")).click();
			//*[containts(text(),'Logout')]
			System.out.println("Logout button clicked");
			//to close multiple browsers
			//chdriver.quit();
		}
		else 
			System.out.println("Title is not the same");
		chdriver.close();
		
		
		
		
	}

}
