package Demowebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C://Users//MahalakshmiKathamuth//Downloads//chromedriver_win32//chromedriver.exe");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\MahalakshmiKathamuth\\Downloads\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://demoaut.com/");
		//Store an element in a variable
		WebElement username = driver.findElement(By.name("userName"));
		if (username.isEnabled())
		{
		username.sendKeys("sunil");
		username.clear();
		username.sendKeys("sunil");
		//If we are passing a value in a field, then we have to use GetAttribute. - If any element value is dynamic in nature
		//GetText is for the labels, dropdown, links
		}
		if (username.isDisplayed()){
			System.out.println("UserName is displayed");
			String enteredusername=	username.getAttribute("value");
			String nameofvalue = username.getAttribute("name");
				System.out.println("Entered Username is: " +enteredusername);
				System.out.println("Name of the Value is: " +nameofvalue);
				String text = driver.findElement(By.xpath("//*[contains(text(),'Name:')]")).getText();
				System.out.println("GetText: " +text);
		}
		WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		password.sendKeys("sunil");
		WebElement signin = driver.findElement(By.xpath("//*[@name='login']"));
		signin.click();
		Thread.sleep(3000);
		WebElement roundway = driver.findElement(By.xpath("//*[@name='tripType' and @value='roundtrip']"));
		if ((roundway).isSelected())
		{
			WebElement oneway = driver.findElement(By.xpath("//*[@name='tripType' and @value='oneway']"));
			oneway.click();
		}
		//Storing a element which is drop down in a variable
		WebElement passengers = driver.findElement(By.xpath("//*[@name='passCount']"));
		//Select
		Select sel = new Select(passengers);
		List <WebElement> options = sel.getOptions();
		int count = options.size();
		System.out.println("Passengers Options: " +count);
		System.out.println("Options are:");
		for (int i=0;i<count;i++){
			System.out.println(options.get(i).getText());
		}
		sel.selectByVisibleText("1");
		System.out.println("FirstValue: " +passengers.getAttribute("value"));
		Thread.sleep(3000);
		sel.selectByIndex(3);
		System.out.println("SecondValue: " +passengers.getAttribute("value"));
		Thread.sleep(3000);
		sel.selectByValue("2");
		System.out.println("ThirdValue: " +passengers.getAttribute("value"));
		
		
		WebElement departfrom = driver.findElement(By.xpath("//*[@name='fromPort']"));
		Select sel2 = new Select(departfrom);
		List <WebElement> depart = sel2.getOptions();
		WebElement selectedvalue = sel2.getFirstSelectedOption();
		System.out.println("Selected Value: " +selectedvalue.getAttribute("value"));
		sel2.selectByValue("London");
		
	 driver.findElement(By.xpath("//*[@name='servClass' and @value='Business']")).click();
	 driver.findElement(By.xpath("//*[@name='findFlights']")).click();
	 driver.findElement(By.xpath("//*[@name='reserveFlights']")).click();
		
		String bookaflight = driver.getTitle();
		System.out.println(bookaflight);
		WebElement passenger1f = driver.findElement(By.xpath("//*[@name='passFirst0']"));
		passenger1f.sendKeys("Maha");
		WebElement passenger1l = driver.findElement(By.xpath("//*[@name='passLast0']"));
		passenger1l.sendKeys("Lakshmi");
		WebElement passenger2f = driver.findElement(By.xpath("//*[@name='passFirst1']"));
		passenger2f.sendKeys("Mithran");
		WebElement passenger2l = driver.findElement(By.xpath("//*[@name='passLast1']"));
		passenger2l.sendKeys("Jegan");
		WebElement creditno = driver.findElement(By.xpath("//*[@name='creditnumber']"));
		creditno.sendKeys("1234 5678 9765");
		//Same attributes for two check boxes(multiple) so we can use List of Webelements
		List <WebElement> checkbox = driver.findElements(By.xpath("//*[@name='ticketLess' and value='checkbox']"));
		System.out.println("check box size: " +checkbox.size());
		//To select both the check boxes in for loop - use int i = 0;i <checkbox.size;
		//to select only 2nd option use i=1;
		//to select only 1st option make i=0 and i<1;
		for (int i=0;i<checkbox.size();i++){
			checkbox.get(i).click();
		}
		//to click on both the check boxes using enhanced for loop
		/*for (WebElement e:checkbox)
		{
			e.click();
		}*/
		WebElement buyflights = driver.findElement(By.xpath("//*[@name='buyFlights']"));
		buyflights.click();
		driver.findElement(By.xpath("//*[contains (text(),'SIGN-OFF')]")).click();
	
	}
	
}
