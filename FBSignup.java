package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);

		WebElement CreateNewButton = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		CreateNewButton.click();
		WebElement FirstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement SurName = driver.findElement(By.xpath("//input[@name='lastname']"));
		WebElement Mobile = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		WebElement Gender = driver.findElement(By.xpath("//label[@class= '_58mt']"));
		
		FirstName.sendKeys("sayali");
		SurName.sendKeys("chougule");
		Mobile.sendKeys("9607111086");
		Password.sendKeys("nofaith@30");
		Gender.click();
		
		Select date = new Select(driver.findElement(By.xpath("id('day')")));
		date.selectByVisibleText("30");
		Select month = new Select(driver.findElement(By.xpath("id('month')")));
	    month.selectByVisibleText("Nov");
	    Select year = new Select(driver.findElement(By.xpath("id('year')")));
	    year.selectByVisibleText("1995");
	    
	    WebElement Signup = driver.findElement(By.xpath("//button[@type='submit']"));
	     Signup.submit();
		
	}
}
