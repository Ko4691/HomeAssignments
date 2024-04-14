package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
		boolean enabled = driver.findElement(By.xpath("//*[@id=\"j_idt87:city2\"]/div/div[2]/div/div[2]/span")).isSelected();
	     System.out.println(enabled);
	     String Default = driver.findElement(By.xpath("//*[@id=\"j_idt87:console2\"]/tbody/tr/td[3]/label")).getText();
		    System.out.println("Default selected radio button = " + Default);
		    
		    boolean enabled1 = driver.findElement(By.xpath("//*[@id=\"j_idt87:age\"]/div/div[2]/div/div[2]/span")).isSelected();
		     System.out.println(enabled1);
	    
	}
}
