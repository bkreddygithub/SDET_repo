package ipivot.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment1 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://services.smartbear.com/samples/TestComplete14/smartstore/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//to click on login.
		WebElement loginElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/header/div[1]/div/nav/nav[4]/div/a/span"));
		loginElement.click();
		
		
		//to create web register element.
		WebElement registerElement = driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/section/div/div/div/div[2]/div[2]/div[2]/div/div/a"));
		//to click on register element
		registerElement.click();
		
		//click on radio button
		
		String gender = "male";
		
		if(gender.equals("male")){
			WebElement maleRadioBtn  = driver.findElement(By.id("gender-male"));
			maleRadioBtn.click();
		} else {
		
		driver.findElement(By.id("//input[@id='gender-female']/following sibling::label")).click();
		}
		Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
		selectDay.selectByValue("14");
		Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
		selectMonth.selectByValue("5");
		Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
		selectYear.selectByValue("1985");
		
		driver.findElement(By.id("FirstName")).sendKeys("John");
		driver.findElement(By.id("LastName")).sendKeys("Hauge");
		driver.findElement(By.id("Email")).sendKeys("bhargavikreddy@gmail.com");
		driver.findElement(By.id("Username")).sendKeys("ipivottester");
		driver.findElement(By.id("Password")).sendKeys("pass@selenium");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("pass@selenium");
		driver.findElement(By.id("Company")).sendKeys("IPIVOT");
		
		driver.findElement(By.id("Newsletter")).click();
		driver.findElement(By.name("register-button")).click();
		
		
		
		
		
		
		
	}

}
