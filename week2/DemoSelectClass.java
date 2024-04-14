package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoSelectClass {
	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
	     driver.get("https://en-gb.facebook.com/");
	       
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	     driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Sushil");
	     driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("K");
	     driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("sushil4569@gmail.com");
	     driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("abcdef");
	     driver.findElement(By.xpath("//*[@id='day']/option[4]")).click();
	     driver.findElement(By.xpath("//*[@id='month']/option[8]")).click();
	     driver.findElement(By.xpath("//*[@id='year']/option[7]")).click();
	     driver.findElement(By.xpath("//label[text()='Male']")).click();
	}

}
