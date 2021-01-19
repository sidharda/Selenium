package org.seleprac;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumPrac {
	public static WebDriver driver;

	public static void main(String[] args) {
		verifyuser();
		verifycreateduser() ;
		
	}

	public static void verifyuser() {
		System.setProperty("webdriver.chrome.driver", "../Seleprac/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://training.openspan.com/login");
		WebElement username=driver.findElement(By.id("user_name"));
		if(username.isDisplayed()){
			username.sendKeys("1234");
			System.out.println("Username Entered");
		}else{
			System.out.println("Unable to enter Username");
		}
		
		
		
		WebElement Password=driver.findElement(By.id("user_pass"));
		if(Password.isDisplayed()){
			Password.sendKeys("1234");
			System.out.println("Password Entered");
		}else{
			System.out.println("Unable to enter Password");
		}
		WebElement loginButton=driver.findElement(By.id("login_button"));
		if(loginButton.isEnabled()){
			loginButton.click();
			System.out.println("LoginButton clicked");
		}else{
			System.out.println("Unable to click LoginButton");
		}

	}

	public static void verifyproductcheckout() {
		WebElement ele = driver.findElement(By.linkText("Products"));

		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();

		WebElement beverages=driver.findElement(By.linkText("Beverages"));
		if(beverages.isEnabled()){
			beverages.click();
			System.out.println("beverages clicked");
		}else{
			System.out.println("Unable to click beverages");
		}
		WebElement selectproduct=driver.findElement(By.linkText("Ipoh Coffee"));
		if(selectproduct.isEnabled()){
			selectproduct.click();
			System.out.println("product selected");
		}else{
			System.out.println("Unable to select product");
		}
		WebElement productEle=driver.findElement(By.id("product_quantity43"));
         Select select=new Select(productEle);
         select.selectByIndex(0);
         select.selectByValue("9");
         select.selectByVisibleText("11");
         WebElement clickorder= driver.findElement(By.name("Order"));
         if(clickorder.isEnabled()){
        	 clickorder.click();
 			System.out.println("product quantity selected");
 		}else{
 			System.out.println("Unable to select product quantity");
 		}
 		WebElement edityourcart=  driver.findElement(By.name("edit_your_cart"));
         if(edityourcart.isEnabled()){
        	 edityourcart.click();
 			System.out.println("edityourcart clicked");
 		}else{
 			System.out.println("Unable to click edityourcart");
 		}
         WebElement next=driver.findElement(By.name("next"));
         if(next.isEnabled()){
        	 next.click();
 			System.out.println("next clicked");
 		}else{
 			System.out.println("Unable to click next");
 		}
         WebElement billingfname=driver.findElement(By.name("bfirst_name"));
         if(billingfname.isDisplayed()){
        	 billingfname.sendKeys("Sidhu");
 			System.out.println("billingfname Entered");
 		}else{
 			System.out.println("Unable to enter billingfname");
 		}
         WebElement billinglname=driver.findElement(By.name("blast_name"));
 		if(billinglname.isDisplayed()){
 			billinglname.sendKeys("Vempati");
			System.out.println("billinglname Entered");
		}else{
			System.out.println("Unable to enter billinglname");
		}
		WebElement billingaddress=driver.findElement(By.name("bstreet_address"));
 		if(billingaddress.isDisplayed()){
 			billingaddress.sendKeys("Mangalagiri");
			System.out.println("billingaddress Entered");
		}else{
			System.out.println("Unable to enter billingaddress");
		}
		WebElement billingzipcode=driver.findElement(By.name("bzip_code"));
		if(billingzipcode.isDisplayed()){
			billingzipcode.sendKeys("555555");
			System.out.println("billingzipcode Entered");
		}else{
			System.out.println("Unable to enter billingzipcode");
		}
		WebElement billingareacode=driver.findElement(By.name("barea_code"));
		if(billingareacode.isDisplayed()){
			billingareacode.sendKeys("12345");
			System.out.println("billingareacode Entered");
		}else{
			System.out.println("Unable to enter billingareacode");
		}
		WebElement billingpphone=driver.findElement(By.name("bprimary_phone"));
		if(billingpphone.isDisplayed()){
			billingpphone.sendKeys("9848984800");
			System.out.println("billingpphone Entered");
		}else{
			System.out.println("Unable to enter billingpphone");
		}
		
		WebElement shippingfname=driver.findElement(By.name("sfirst_name"));
		if(shippingfname.isDisplayed()){
			shippingfname.sendKeys("Sidhu");
			System.out.println("shippingfname Entered");
		}else{
			System.out.println("Unable to enter shippingfname");
		}
		WebElement shippinglname=driver.findElement(By.name("slast_name"));
 		if(shippinglname.isDisplayed()){
 			shippinglname.sendKeys("Vempati");
			System.out.println("shippinglname Entered");
		}else{
			System.out.println("Unable to enter shippinglname");
		}
 		WebElement shippingaddress=driver.findElement(By.name("sstreet_address"));
 		if(shippingaddress.isDisplayed()){
 			shippingaddress.sendKeys("Mangalagiri");
			System.out.println("shippingaddress Entered");
		}else{
			System.out.println("Unable to enter shippingaddress");
		}
 		WebElement shippingzipcode=driver.findElement(By.name("szip_code"));
		if(shippingzipcode.isDisplayed()){
			shippingzipcode.sendKeys("555555");
			System.out.println("shippingzipcode Entered");
		}else{
			System.out.println("Unable to enter shippingzipcode");
		}
		WebElement clicknext=driver.findElement(By.id("next2_button"));
		if(clicknext.isEnabled()){
			clicknext.click();
			System.out.println("clicknext selected");
		}else{
			System.out.println("Unable to select clicknext");
		}
		WebElement billing=driver.findElement(By.id("bill_me"));
		if(billing.isEnabled()){
			billing.click();
			System.out.println("billing selected");
		}else{
			System.out.println("Unable to select billing");
		}
		WebElement puchaseorderno=driver.findElement(By.id("purchase_order_number"));
		if(puchaseorderno.isDisplayed()){
			puchaseorderno.sendKeys("989898");
			System.out.println("puchaseorderno Entered");
		}else{
			System.out.println("Unable to enter puchaseorderno");
		}
		WebElement clicksubmit=driver.findElement(By.name("submit"));
		if(clicksubmit.isEnabled()){
			clicksubmit.click();
			System.out.println("submit clicked");
		}else{
			System.out.println("Unable to submit");
		}
		
		
		String thankyoumessage=driver.findElement(By.xpath("//*[@id'load_content']//p[2]")).getText();
		if(thankyoumessage.equals("Thank you for placing an order with ACME!")){
			System.out.println("Order Placed Successfully");
			
		}else{
			System.out.println("Unable to place order");
		}
	}
	
		
		

	public static void verifycreateduser() {
		WebElement ele = driver.findElement(By.xpath("//img[@alt='Settings']"));

		Actions actions = new Actions(driver);
		actions.moveToElement(ele).build().perform();
		driver.findElement(By.linkText("Users")).click();
		driver.findElement(By.id("fname")).sendKeys("VLN");
		driver.findElement(By.id("lname")).sendKeys("Kumar");
		driver.findElement(By.id("email")).sendKeys("sivanandasidharda@gmail.com");
		driver.findElement(By.id("login_button")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

}
