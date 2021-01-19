package org.seleprac.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Basepage {
	
		public static WebDriver driver=null;
		
		public static void invokeBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver", "../Seleprac/Drivers/chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("Chrome Driver is invoked");
			}else if(browser.equalsIgnoreCase("Firefox")){
				System.setProperty("webdriver.gecko.driver", "../Seleprac/Drivers/geckodriver.exe");
				driver= new FirefoxDriver();
				System.out.println("Firefox Driver is invoked");
			}else if(browser.equalsIgnoreCase("IE")){
				System.setProperty("webdriver.ie.driver", "../Seleprac/Drivers/IEDriverServer.exe");
				driver= new InternetExplorerDriver();
				System.out.println("InternetExplorer Driver is invoked");
			}else{
				System.out.println("Unable to invoke IE Browser");
			}
		
		}
		public static void enterurl(String url){
			driver.get(url);
		}
		
	

}
