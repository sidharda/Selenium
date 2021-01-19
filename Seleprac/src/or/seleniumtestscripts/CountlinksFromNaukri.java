package or.seleniumtestscripts;

import org.openqa.selenium.By;
import org.seleprac.basepage.Basepage;

public class CountlinksFromNaukri extends Basepage{
	
	public static void main(String[] args) {
		invokeBrowser("Chrome");
		enterurl("https://www.naukri.com/");
		driver.findElement(By.name("keyword")).sendKeys("Selenium");
		driver.findElement(By.className("btn")).click();
		
		
		
		
		/*List<WebElement> list=driver.findElements(By.tagName("btn"));
		System.out.println(list.size());
		for(WebElement listEle : list){
			System.out.println(listEle.getText());
		}*/
		

	}

}
