package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
		
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
	    driver.get("http://leaftaps.com/opentaps/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	    driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.findElement(By.xpath("//*[@id='button']/a/img")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9600831045");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(1000);
		String firstLead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).getText();
	    System.out.println("Lead ID = " + firstLead);
	    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a[1]")).click();
	    driver.findElement(By.xpath("//a[text()='Delete']")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	    driver.findElement(By.xpath("//input[@name='id']")).sendKeys(firstLead);
	    driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    String noRecord = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	    System.out.println("Message = " + noRecord);
	    
	    Thread.sleep(5000);
	    driver.close();
	}

}
