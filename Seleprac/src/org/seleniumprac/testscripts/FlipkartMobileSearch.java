package org.seleniumprac.testscripts;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.seleprac.basepage.Basepage;

public class FlipkartMobileSearch  extends Basepage{

	public static void main(String[] args) {
		invokeBrowser("chrome");
		driver.manage().window().maximize();
		enterurl("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Apple");
		driver.findElement(By.name("btnK")).click();
		
		List<WebElement> list=driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for(WebElement listEle : list){
			System.out.println(listEle.getText());
		}
		
		driver.findElement(By.xpath("//*[@id='rso']/div[1]/div/div/div/div[1]/a/div/cite")).click();
		
		driver.findElement(By.xpath("//*[@id='ac-globalfooter']/div/section[2]/div[1]/a")).click();
		
		driver.findElement(By.id("service-buttonheading")).click();
		
		driver.findElement(By.id("serviceAddress")).sendKeys("522501");
		
		driver.findElement(By.id("service-products")).click();
		
		driver.findElement(By.id("ui-id-72")).click();
		
		driver.findElement(By.id("service-form-submit")).click();
		
		
		
		
		

	}

}
