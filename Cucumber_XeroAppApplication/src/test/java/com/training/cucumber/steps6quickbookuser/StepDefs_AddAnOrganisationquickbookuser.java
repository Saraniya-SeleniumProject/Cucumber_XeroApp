package com.training.cucumber.steps6quickbookuser;

import java.awt.List;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs_AddAnOrganisationquickbookuser {
WebDriver driver;
	
	@Given ("^User logs into the application with correct username and pwd$")
	
	public void user_logs_into_the_application_with_correct_username_and_pwd() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\senid\\Downloads\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.xero.com/");
		WebElement username = driver.findElement(By.xpath("//input[@id='email']"));
		username.sendKeys("charu.vasu@gmail.com");
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Yellow@0329");
		WebElement LoginButton = driver.findElement(By.xpath("//button[@id='submitButton']"));
		LoginButton.click();
	}
	
	 @Then ("^Click on myXero link from the top left menu$")
	 
	 public void click_on_myXero_link_from_the_top_left_menu() throws Throwable
	 {
		//Scrolling
		 WebElement usermenuDropdown = driver.findElement(By.xpath("//span[@class='xrh-appbutton--text']"));
		 usermenuDropdown.click();
		 Thread.sleep(1000);
		 WebElement MyXeroLink = driver.findElement(By.xpath("//a[contains(text(),'My Xero')]"));
		 Actions actions = new Actions(driver);
		 actions.moveToElement(MyXeroLink);
		 actions.perform();
		 MyXeroLink.click();
		 
	 }
	 
	 @When ("^Add one more organisation with paid version$")
	 
	 public void add_one_more_organisation_with_paid_version() throws Throwable
	 {
		    driver.get("https://my.xero.com/!xkcD/Dashboard");
		    
			String windowHandle = driver.getWindowHandle();
		    driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		    
		    ArrayList tabs = new ArrayList (driver.getWindowHandles());
		    System.out.println(tabs.size());
		    driver.switchTo().window((String) tabs.get(0)); 
		    
		    driver.get("https://go.xero.com/onboarding/setup");
			 
			 
			 //NameOfTheOrganisation text box
			 WebElement NameOfTheOrganisation = driver.findElement(By.xpath("//*[@data-automationid='organisation-name--input']"));
			 NameOfTheOrganisation.sendKeys("Self");
			 
			//Country Select Dropdown 
			 java.util.List<WebElement> dropdown_list =  driver.findElements(By.xpath("//*[@data-automationid='country-autocompleter--list--body']"));
			 //System.out.println("The Options in the Dropdown are: " + dropdown_list.size());
			 for(int i=0; i<dropdown_list.size(); i++)
				{
					// Printing All the options from the dropdown
					System.out.println(dropdown_list.get(i).getText());
					
					// Checking the condition whether option in text "Angular" is comming
					if(dropdown_list.get(i).getText().contains("United States"))
					{
						// Clicking if text "United States" is there
						dropdown_list.get(i).click();
						
						// Breaking the condition if the condition get satisfied
						break;
					}else {driver.quit();} 
				}
			
			//TimeZone Select Dropdown 
			 java.util.List<WebElement> dropdown_list2 =  driver.findElements(By.xpath("//*[@data-automationid='timezone-autocompleter--list--body']"));
			 //System.out.println("The Options in the Dropdown are: " + dropdown_list2.size());
			 for(int i=0; i<dropdown_list2.size(); i++)
				{
					
					// Checking the condition whether option in text is coming
					if(dropdown_list2.get(i).getText().contains("(UTC-08:00) Pacific Time (US & Canada)"))
					{ 
					{
						// Clicking if text is there
						dropdown_list2.get(i).click();
						
						// Breaking the condition if the condition get satisfied
						break;
					}
				}else {driver.quit();} 
				}
			 WebElement RoleOfTheOrganisation = driver.findElement(By.xpath("//*[@data-automationid='industry-autocompleter--input']"));
			 RoleOfTheOrganisation.sendKeys("accounting");
			 Thread.sleep(1000);
			 RoleOfTheOrganisation.sendKeys(Keys.ENTER);
			
			
			 
	 		  
			 driver.switchTo().parentFrame();
			 
			 WebElement QuickBooksClickArea = driver.findElement(By.xpath("//div[@class='xui-accordiontrigger']"));
			 QuickBooksClickArea.click();
			
				
				
				WebElement quickbookuserchkbox = driver.findElement(By.xpath("//div[@class='xui-styledcheckboxradio--checkbox xui-styledcheckboxradio--checkbox-small']"));
				quickbookuserchkbox.click();
				System.out.println (quickbookuserchkbox.isSelected());
				
				
				
				
		   //Click on BuyNow Button
			WebElement Continue_Button= driver.findElement(By.xpath("//button[@class='xui-button xui-actions--secondary xui-button-main xui-button-medium']"));
			Continue_Button.click();
			
			
			      			 
	 }


			@Then("^Check the currentlyusingquickbooks checkbox and click buynow button$")
			
			public void check_the_currentlyusingquickbooks_checkbox_and_click_buynow_button() throws Exception
			{
				
	 		
}
}
