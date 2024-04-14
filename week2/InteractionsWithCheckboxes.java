package assignments.week2;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class InteractionsWithCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		
	     driver.get("https://leafground.com/checkbox.xhtml");
	     driver.manage().window().maximize();   
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	     
	     driver.findElement(By.xpath("//*[text()='Basic']")).click();
	     driver.findElement(By.xpath("//*[text()='Ajax']")).click();
	     
	     String ajaxtext = driver.findElement(By.xpath("//span[@class='ui-growl-title']")).getText();
	     System.out.println("Notification is = " + ajaxtext);
	     driver.findElement(By.xpath("//*[text()='Java']")).click();
	     driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]")).click();
	     String tristatetext = driver.findElement(By.xpath("//*[@id=\"j_idt87:id_container\"]/div/div/div[2]")).getText();
	     System.out.println("Tri State Check box = " + tristatetext);
	     driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt100\"]/div[2]")).click();
	     String toogletext = driver.findElement(By.xpath("//*[@id=\"j_idt87:msg_container\"]/div/div/div[2]")).getText();
	     System.out.println("Toogle Switch is = " + toogletext);
	     boolean enabled = driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt102\"]/span")).isSelected();
	     System.out.println(enabled);
	     driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple\"]/div[3]")).click();
	     driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[2]/label")).click();
	     driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[2]/ul/li[3]/label")).click();
	     driver.findElement(By.xpath("//*[@id=\"j_idt87:multiple_panel\"]/div[1]/a/span")).click();
	 	
	     driver.close();
	}
}
