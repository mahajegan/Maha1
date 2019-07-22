package Demowebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Click on All Links in Mercury Link and find which is working and which is not
public class Demo4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demoaut.com/");
	
		//Get the title
		String underconstitle = "Under Construction: Mercury Tours"; 
		List <WebElement> links = driver.findElements(By.tagName("a"));
		//Storing the size of links in linktext
		String [] linktext = new String [links.size()];
		int i=0;
		//Extract the links text of each link element
		for (WebElement e:links){
			linktext[i]=e.getText();
			i++;
		}
		//test whether each link is working or not
		for (String t:linktext){
			driver.findElement(By.linkText(t)).click();
			if (driver.getTitle().equals(underconstitle)){
				System.out.println("\"" + t + "\" + is underconstruction");
			}
			else
			{
				System.out.println("\"" + t + "\" + is Working");
			}
			driver.navigate().back();
		}
		//to close the active browser/current browser
		//Common to both: quit and close
		//There is no return type between driver.close and driver.quit
		//It will not accept any arguments inside ()
		driver.close();
		//to close all the browser which are opened through selenium instance
		driver.quit();
	
		//driver.navigate.to - Navigation Method
}
	
}