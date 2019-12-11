
package ipivot.selenium;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Alert;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.TestCase;

import java.util.concurrent.TimeUnit;



public class SeleniumAssignmen3 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step1: Navigate to URL on GoogleChrome:  http://qdpm.net/demo/v9/index.php
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qdpm.net/demo/v9/index.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//Step2: Login with Administrator 
		
		driver.findElement(By.name("login[email]")).sendKeys("administrator@localhost.com");
		driver.findElement(By.name("login[password]")).sendKeys("administrator");
		driver.findElement(By.xpath("(//button[contains(text(),'Login')])")).submit();
	
		
	
		//Step3: Verify dashboard title after logged in successfully.

		String currentURL = driver.getCurrentUrl();
		System.out.println("currentURL is:"+currentURL);
	
		//step4: Verify that all options are present on dash board page.  

		boolean dashboardPresent = driver.findElement(By.xpath("//span[text() = 'Dashboard']")).isDisplayed();
		Assert.assertEquals(dashboardPresent, true);
		
		boolean projectsPresent = driver.findElement(By.xpath("//span[text() = 'Projects']")).isDisplayed();
		Assert.assertEquals(projectsPresent, true);
		boolean tasksPresent = driver.findElement(By.xpath("//span[text() = 'Tasks']")).isDisplayed();
		Assert.assertEquals(tasksPresent, true);
		boolean ticketsPresent = driver.findElement(By.xpath("//span[text() = 'Tickets']")).isDisplayed();
		Assert.assertEquals(ticketsPresent, true);
		boolean discussionsPresent = driver.findElement(By.xpath("//span[text() = 'Discussions']")).isDisplayed();
		Assert.assertEquals(discussionsPresent, true);
		boolean reportsPresent = driver.findElement(By.xpath("//span[text() = 'Reports']")).isDisplayed();
		Assert.assertEquals(reportsPresent, true);
		boolean usersPresent = driver.findElement(By.xpath("//span[text() = 'Users']")).isDisplayed();
		Assert.assertEquals(usersPresent, true);
		boolean configurationPresent = driver.findElement(By.xpath("//span[text() = 'Configuration']")).isDisplayed();
		Assert.assertEquals(configurationPresent, true);
		boolean toolsPresent = driver.findElement(By.xpath("//span[text() = 'Tools']")).isDisplayed();
		Assert.assertEquals(toolsPresent, true);
		boolean qdpmPresent = driver.findElement(By.xpath("//span[text() = 'qdPM Extended']")).isDisplayed();
		Assert.assertEquals(qdpmPresent, true);
		
		//Step5:  Click on “Add Task” button 
		driver.findElement(By.xpath("//button[text()='Add Task']")).click();
		driver.switchTo().activeElement();
		
		//Step6: Select “Test Project1” from project drop down list.
		WebElement projectDD = driver.findElement(By.id("form_projects_id"));
		//WebElement projectDD = driver.findElement(By.xpath("/html/body/div[8]/div/form/div/div/div/div/select"));
		Select selectprojectDD = new Select (projectDD);
		selectprojectDD.selectByIndex(1);
			
		//Step7: Enter below data Under General tab
		WebElement typeDD = driver.findElement(By.id("tasks_tasks_type_id"));
		Select selecttypeDD = new Select (typeDD);
		selecttypeDD.selectByVisibleText("Defects (Hourly rate $0.00)");
		
		driver.findElement(By.xpath("//input[@id='tasks_name']")).sendKeys("Bhargavi");
		
		WebElement statusDD = driver.findElement(By.id("tasks_tasks_status_id"));
		Select selectStatusDD = new Select (statusDD);
		selectStatusDD.selectByVisibleText("Lost");
		
		WebElement priorityDD = driver.findElement(By.id("tasks_tasks_priority_id"));
		Select selectPriorityDD = new Select (priorityDD);
		selectPriorityDD.selectByValue("3");
		
		WebElement labelDD = driver.findElement(By.id("tasks_tasks_label_id"));
		Select selectLabelDD = new Select (labelDD);
		selectLabelDD.selectByVisibleText("Issue");
		
		driver.findElement(By.xpath("//input[@id='tasks_assigned_to_2']")).click();
		driver.findElement(By.xpath("//input[@id='tasks_assigned_to_4']")).click();
		
		WebElement createdbyDD = driver.findElement(By.id("tasks_created_by"));
		Select selectCreatedbyDD = new Select (createdbyDD);
		selectCreatedbyDD.selectByVisibleText("manager");
		
		//Step8: Switch to time tab and enter below data.

		driver.findElement(By.xpath("//a[@href='#tab_time']")).click();
		
		driver.findElement(By.id("tasks_estimated_time")).sendKeys("11");
		
		driver.findElement(By.xpath("//input[@id='tasks_start_date']")).sendKeys("2019-12-27");
		
		driver.findElement(By.id("tasks_due_date")).sendKeys("2019-12-31");
		
		WebElement progressDD = driver.findElement(By.id("tasks_progress"));
		Select selectProgressDD = new Select(progressDD);
		selectProgressDD.selectByValue("20");
		
		//Step9: Switch to attachment tab. 

		driver.findElement(By.xpath("//a[@href='#tab_attachments']")).click();
		
		driver.findElement(By.id("uploadify_file_upload")).sendKeys("/Users/ckasireddy/Desktop/practice 1.xlsx");
		
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		
		
		//Step 10: Logout of application 
		
		driver.findElement(By.xpath("//a[@class = 'dropdown-toggle']")).click();
		driver.findElement(By.xpath("//a[@href='/demo/v9/index.php/login/logoff']")).click();
		
		//Step 11: Once logged out, verify the page title (using assertion)
		
		String actualPageTitle = driver.getTitle();
		String expectedPageTitle = "qdPM | Login";
		Assert.assertEquals(actualPageTitle, expectedPageTitle, "Titles are Matching");
		
		//Step 12: Login again with credentials given in step2.

		driver.findElement(By.name("login[email]")).sendKeys("administrator@localhost.com");
		driver.findElement(By.name("login[password]")).sendKeys("administrator");
		driver.findElement(By.xpath("(//button[contains(text(),'Login')])")).submit();
		
		//Step 13: Click on Tasks (In the left side list items) & click on “View All” option.

		driver.findElement(By.xpath("//a[@href = '/demo/v9/index.php/tasks']/span[text() = 'Tasks']")).click();
		driver.findElement(By.xpath("//a[@href = '/demo/v9/index.php/tasks']/span[text() = 'View All']")).click();
		
		//Step14: Do mouse hover on Search field

		WebElement searchFieldDD = driver.findElement(By.id("yui-gen1"));
		Actions action1 = new Actions(driver);
		action1.moveToElement(searchFieldDD).build().perform();
		
		//Step15: Enter your name (used in step 7) in search box and then click on Search button.

		driver.findElement(By.id("search_keywords")).sendKeys("Bhargavi");
		driver.findElement(By.xpath("//input[@value = 'Search']")).click();
		
		//Step16: Verify the search result. It is in table format. Verify table data against what you have entered in                                                                 Step 7, 8. (Not all data, but whatever data is present in table.)
		
		 boolean labelDisplayed = driver.findElement(By.xpath("//table//tr/td[text()='Issue']")).isDisplayed();
 		 Assert.assertEquals(labelDisplayed, true);
 		 boolean nameDisplayed = driver.findElement(By.xpath("//a[text()='Bhargavi']")).isDisplayed();
		 Assert.assertEquals(nameDisplayed, true);
		 boolean statusDisplayed = driver.findElement(By.xpath("//td[text()='Lost']")).isDisplayed();
		 Assert.assertEquals(statusDisplayed, true);
		 boolean assignedtoDisplayed = driver.findElement(By.xpath("//tr[@class='odd']/td[text()='Lost']/following-sibling::td")).isDisplayed();
		 Assert.assertEquals(assignedtoDisplayed, true);
		
		//Step 17: Delete the record you created by Clicking on delete icon Present under Action column of table.
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[2]/a[@class='btn btn-default btn-xs purple']")).click();
		
		//Step18: After you click on delete, it will ask for confirmation in Alert. So switch to that alert and accept it.
			
		Alert al =driver.switchTo().alert();
		al.accept();
			
		//Step19: Verify that user is deleted from system. 
		 WebElement searchField = driver.findElement(By.xpath("//div[@id='search_menu']"));
		 Actions movemouseonSearch1 = new Actions(driver);
		 movemouseonSearch1.moveToElement(searchField).build().perform();
		 
		 WebElement searchText = driver.findElement(By.xpath("//td/input[@id='search_keywords']"));
		 searchText.sendKeys("Bhargavi");
		 
		 WebElement searchButton = driver.findElement(By.xpath("//td/input[@class='btn btn-default']"));
		 searchButton.click();

		//Step20: Logout of application & close browser.
 		 	
 		driver.findElement(By.xpath("//a[@href='#']")).click();
 		
 		driver.findElement(By.xpath("//a[@href='/demo/v9/index.php/login/logoff']")).click();
		
 		driver.close();
	}
}

