package day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Second {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();

		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("companyName");
		driver.findElementById("createLeadForm_firstName").sendKeys("firstName");
		driver.findElementById("createLeadForm_lastName").sendKeys("lastname");
		
		//Select:

		//Drop down (to acheive, access select class)
		//select is a Class.
		WebElement srcVisibleText= driver.findElementById("createLeadForm_dataSourceId");
		Select visibleText = new Select(srcVisibleText);
		visibleText.selectByVisibleText("Employee");
		
		WebElement srcValue= driver.findElementById("createLeadForm_marketingCampaignId");
		Select value = new Select(srcValue);
		value.selectByValue("CATRQ_CARNDRIVER");
		
		WebElement srcIndex= driver.findElementById("createLeadForm_currencyUomId");
		Select index = new Select(srcIndex);
		index.selectByIndex(index.getOptions().size()-2);
		
		//Print title, url, element name:
		System.out.print(driver.getTitle());
		System.out.print(driver.getCurrentUrl());
		System.out.print(driver.findElementByTagName("h2").getText()); //Demo sales manager

				
		
		//driver.findElementByClassName("smallSubmit").click();

	}

}
