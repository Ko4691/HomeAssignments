package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//*[@id='button']/a/img")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("LEAD");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("AKL");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Leads");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("KOT");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is a Test Leader");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
		
		WebElement selectElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select ownership = new Select(selectElement);
        ownership.selectByVisibleText("New York");
        
        driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        
        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_description']")).clear();
        driver.findElement(By.xpath("//textarea[@id='updateLeadForm_importantNote']")).sendKeys("Cleared Desc");
        driver.findElement(By.xpath("//input[@value='Update']")).click();
        String title = driver.getTitle();
        System.out.println(title);
        
        driver.close();
	}

}
