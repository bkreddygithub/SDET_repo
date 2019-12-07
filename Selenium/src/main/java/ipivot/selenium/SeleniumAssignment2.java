package ipivot.selenium;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumAssignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtalks.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		WebElement makedd = driver.findElement(By.id("make"));
		Select selectMakedd=new Select (makedd);
		selectMakedd.selectByVisibleText("BMW");

		
		WebElement modeldd = driver.findElement(By.id("model"));
		Select selectModeldd = new Select (modeldd);
		selectModeldd.selectByVisibleText("Moped");	
	
		
		driver.findElement(By.id("cylindercapacity")).sendKeys("1500");
		
		driver.findElement(By.id("engineperformance")).sendKeys("1200");
		
		driver.findElement(By.id("dateofmanufacture")).sendKeys("01/30/2019");
		
		WebElement noOfSeats = driver.findElement(By.id("numberofseats"));
		Select selectNoOfSeats = new Select (noOfSeats);
		selectNoOfSeats.selectByIndex(3);
		
		WebElement noOfSeats1 = driver.findElement(By.id("numberofseatsmotorcycle"));
		new Select (noOfSeats1).selectByIndex(2);;
		
		driver.findElement(By.xpath("//input[@id='righthanddriveyes']/parent::label")).click();
		
		WebElement fuelType1 = driver.findElement(By.id("fuel"));
		Select selectfuelType1 = new Select (fuelType1);
		selectfuelType1.selectByValue("Diesel");
				
		driver.findElement(By.id("payload")).sendKeys("900");
		driver.findElement(By.id("totalweight")).sendKeys("200");
		driver.findElement(By.id("listprice")).sendKeys("20000");
		driver.findElement(By.id("licenseplatenumber")).sendKeys("x34");
		driver.findElement(By.id("annualmileage")).sendKeys("30000");
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
		driver.findElement(By.id("firstname")).sendKeys("BHARGAVI");
		driver.findElement(By.id("lastname")).sendKeys("KASIREDDY");
		driver.findElement(By.id("birthdate")).sendKeys("05/14/1985");
		
		driver.findElement(By.xpath("//input[@id='genderfemale']/parent::label")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("yarrow cicrle");
		
		
		WebElement countrydd = driver.findElement(By.id("country"));
		Select selectCountrydd = new Select (countrydd);
		selectCountrydd.selectByVisibleText("United States");
		
		driver.findElement(By.id("zipcode")).sendKeys("08810");
		driver.findElement(By.id("city")).sendKeys("Dayton");
		
		WebElement occupationdd = driver.findElement(By.id("occupation"));
		Select selectOccupationdd = new Select (occupationdd);
		selectOccupationdd.selectByIndex(5);
		
		driver.findElement(By.xpath("//input[@id='speeding']/parent::label")).click();
		driver.findElement(By.xpath("//input[@id = 'bungeejumping']/parent::label")).click();
		
		driver.findElement(By.id("website")).sendKeys("www.bmw.com");
		
		driver.findElement(By.id("nextenterproductdata")).click();
		
		driver.findElement(By.id("startdate")).sendKeys("03/01/2020");
		
		WebElement insuranceSumdd = driver.findElement(By.id("insurancesum"));
		Select selectInsuranceSum = new Select (insuranceSumdd);
		selectInsuranceSum.selectByIndex(5);
		
		WebElement meritratingdd = driver.findElement(By.id("meritrating"));
		Select selectMeritRatingdd = new Select (meritratingdd);
		selectMeritRatingdd.selectByIndex(6);
		
		WebElement damageInsurancedd = driver.findElement(By.id("damageinsurance"));
		Select selectDamageInsurancedd = new Select (damageInsurancedd);
		selectDamageInsurancedd.selectByVisibleText("Full Coverage");
		
		driver.findElement(By.xpath("//input[@id = 'EuroProtection']/parent::label")).click();
		
		WebElement courtesycardd = driver.findElement(By.id("courtesycar"));
		Select selectCourtesycardd = new Select (courtesycardd);
		selectCourtesycardd.selectByValue("Yes");
		
		driver.findElement(By.id("nextselectpriceoption")).click();
		
		driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[3]")).click();
	
		String actualSilverPrice = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[2]")).getText();
		String actualGoldPrice = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[3]")).getText();
		String actualPlatinumPrice = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr[1]/td[4]")).getText();
		
		
		System.out.println("actualSilverPrice:"+actualSilverPrice);
		System.out.println("actualGoldPrice:"+actualGoldPrice);
		System.out.println("actualPlatinumPrice:"+actualPlatinumPrice);
		
		int totalRows = driver.findElements(By.xpath("//table[@id='priceTable']/tbody/tr")).size();
		System.out.println("total Rows: "+totalRows);
		
		//get total number of columns
		int totalColumns = driver.findElements(By.xpath("//table[@id ='priceTable']/tbody/tr[1]/td")).size();
		System.out.println("total columns: "+totalColumns);
		
	for(int rows=1; rows <=totalRows; rows++){	
		for (int columns=1; columns<=totalColumns; columns++) {
		
				String price = driver.findElement(By.xpath("//table[@id='priceTable']/tbody/tr["+rows+"]/td["+columns+"]")).getText();
				System.out.print(price+"\t");
		}
	  }
	}
}


	