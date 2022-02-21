package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
		
		WebDriver driver = new ChromeDriver();
	    driver.get("https://demoqa.com/alerts");    
		
		//Maximize window
		driver.manage().window().maximize();
		
		//wait for browser to load - implicit
				driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
				
				// =============== Alert Accept
				
				WebElement element = driver.findElement(By.xpath("//*[@id='alertButton']"));
				element.click();
				Alert alert0 = driver.switchTo().alert();
				System.out.println(alert0.getText());
				alert0.accept();
			
				// ===================== Alert Cancel
				WebElement element1 = driver.findElement(By.xpath("//*[@id='confirmButton']"));
				element1.click();
				Alert alert1 = driver.switchTo().alert();
				System.out.println(alert1.getText());
				alert1.dismiss();
				
				//============= Alert Message
				
				WebElement element2 = driver.findElement(By.xpath("//*[@id='promtButton']"));
				((JavascriptExecutor) driver).executeScript("argument[0].click()",element);
				Alert alert2 = driver.switchTo().alert();
				String alertText = alert2.getText();
				System.out.println("alert text is " + alertText);
				//============send some text to the alert
				alert2.sendKeys("sayali");
				alert2.accept();
				

			}

		}

