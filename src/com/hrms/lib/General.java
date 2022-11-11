package com.hrms.lib;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.Reporter;
import com.hrms.utility.Log;



public class General extends Global 
{
	// Standard rule:- To provide all re-usable functions/methods of whole application
	public void openApplication()
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();  // half object of global class
		driver.navigate().to(url);
		System.out.println("Application opened");
		Reporter.log("Application opened");
		Log.info("Application opened");
		
	}
	 
	public void closeApplication()
	{
		driver.quit();
		System.out.println("Application closed");
		Log.info("Application closed");
	}
	
	public void login()
	{
		driver.findElement(By.name(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		System.out.println("Login completed");
		Log.info("Login completed");
	}
	
	public void logout()
	{
		driver.findElement(By.linkText(link_logout)).click();
		System.out.println("Logout completed");
		Log.info("Logout completed");
	}
	
	public void enterFrame()
	{
		driver.switchTo().frame(frame_empinfo);
		System.out.println("Entered into frame");
		Log.info("Entered into frame");
	}
	
	public void exitFrame()
	{
		driver.switchTo().defaultContent();
		System.out.println("Exit from frame");
		Log.info("Exit from frame");
	}
	
	public void addNewEmp(){
		{
			driver.findElement(By.xpath(btn_Add)).click();
			driver.findElement(By.xpath(txt_EFN)).click();
			driver.findElement(By.xpath(txt_ELN)).click();
			
			driver.findElement(By.id(btn_save)).click();
			System.out.println("New Emp added");
			Log.info("New Emp added");
		}
	}

}
