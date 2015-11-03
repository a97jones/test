package mypackage;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class myclass {
	
	public static void main(String[] args) {
		//declaration and instantiation of objects/variables
		WebDriver  driver = new FirefoxDriver();
		String baseUrl = "https://www.mobymax.com";
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		//launch Firefox and direct it to the Base URL 
		driver.get(baseUrl);
		
		//find and edit first name field
		driver.findElement(By.name("data[FirstName]")).sendKeys("Alfred");
		
		//find and edit last name field
		driver.findElement(By.name("data[LastName]")).sendKeys("Jones");
		
		//find and edit zip code field
		driver.findElement(By.name("data[ZipCode]")).sendKeys("20001");

		//find and click school field
		driver.findElement(By.name("data[School]")).click();
		
		//find and click school field
		driver.findElement(By.id("47363")).click();
		
		//find and edit email field
		driver.findElement(By.name("data[Email]")).sendKeys("456test@gmail.com");
				
		//find and edit password field
		driver.findElement(By.name("data[Password]")).sendKeys("123password");	
		
		//find and click register button
		driver.findElement(By.id("register-button")).click();

		}

}



