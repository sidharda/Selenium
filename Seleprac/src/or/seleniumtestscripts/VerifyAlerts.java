package or.seleniumtestscripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.seleprac.basepage.Basepage;

public class VerifyAlerts extends Basepage{

	public static void main(String[] args) {
		invokeBrowser("Chrome");
		enterurl("http://demo.automationtesting.in/Alerts.html");
		driver.findElement(By.xpath("//a[@href='#OKTab']"));
		driver.findElement(By.id("OKTab")).click();
		Alert alert=driver.switchTo().alert();
		String alertText=alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		driver.findElement(By.xpath("//a[@href='#CancelTab']"));
		driver.findElement(By.id("CancelTab")).click();
		driver.switchTo().alert();
		String alertText2=alert.getText();
		System.out.println(alertText2);
		alert.dismiss();
		
		driver.findElement(By.xpath("//a[@href='#Textbox']"));
		driver.findElement(By.id("Textbox")).click();
		driver.switchTo().alert();
		String alertText3=alert.getText();
		System.out.println(alertText3);
		alert.sendKeys("I'm learning Selenium");
	
		

	}

	

	
}
