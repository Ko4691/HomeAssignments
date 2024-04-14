package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
	    
		driver.findElement(By.xpath("//*[@id='button']/a/img")).click();
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("AK Test");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Selenium Automation Tester.");
		
		WebElement selectElement = driver.findElement(By.name("industryEnumId"));
        Select Industry = new Select(selectElement);
        Industry.selectByValue("IND_SOFTWARE");
        
        WebElement selectElement1 = driver.findElement(By.name("ownershipEnumId"));
        Select ownership = new Select(selectElement1);
        ownership.selectByVisibleText("S-Corporation");
        
        WebElement selectElement3 = driver.findElement(By.id("dataSourceId"));
        Select source = new Select(selectElement3);
        source.selectByValue("LEAD_EMPLOYEE");
        
        WebElement selectElement4 = driver.findElement(By.id("marketingCampaignId"));
        Select marketing = new Select(selectElement4);
        marketing.selectByIndex(5);
        
        WebElement selectElement5 = driver.findElement(By.id("generalStateProvinceGeoId"));
        Select state = new Select(selectElement5);
        state.selectByValue("TX");
        
        driver.findElement(By.xpath("//input[@value='Create Account']")).click();
        
        String AccountName = driver.findElement(By.xpath("//table[@class='fourColumnForm']//span[@class='tabletext']")).getText();
	    System.out.println("Account Name is verified = " + AccountName);
	    
	    driver.close();
	}

}
