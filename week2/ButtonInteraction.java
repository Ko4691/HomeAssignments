package assignments.week2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonInteraction {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[text()='Click']")).click();
		String title = driver.getTitle();
	    System.out.println(title);
	    driver.findElement(By.xpath("//*[@id=\"menuform:j_idt40\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"menuform:m_button\"]/a/span")).click();
	    boolean enabled1 = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt92\"]")).isEnabled();
	     System.out.println(enabled1);
	     
	     Point position = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt94\"]/span[2]")).getLocation();
	     System.out.println("Position of Submit Button is =" +position);
	     
	     String background = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt96\"]/span[2]")).getCssValue("color");
	     System.out.println("Background Color of the button is ="+ background);
	     
	     Dimension Imagewidth = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt98\"]")).getSize();
	     System.out.println("Size of the button is ="+ Imagewidth);
	     
	     driver.close();
	}

}
