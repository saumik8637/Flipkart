package com.flipkart.qa.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		 WebDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.get(" https://www.flipkart.com");
		 WebElement username= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input"));
		 username.sendKeys("7205738242");
		 WebElement pwd = driver.findElement(By.xpath("//*[@type='password']"));
		 pwd.sendKeys("Akanksha@2021");
		 WebElement submit= driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[4]/button"));
		 submit.click();
		 Thread.sleep(5000);
		 //clicking on search bar
		 WebElement searchclick=driver.findElement(By.xpath("//*[@title = 'Search for products, brands and more']"));
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		 searchclick.sendKeys("apple laptops");
		 
		 Thread.sleep(5000);
		// Select dropdown= new Select(searchclick);
		 //dropdown.selectByIndex(3);
		 WebElement thirdoption= driver.findElement(By.xpath("//*[@id='container']/div/div[1]/div[1]/div[2]/div[2]/form/ul/li[3]/div/a/div[2]"));
		 thirdoption.click();
		 
		 WebElement hightolowprice=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[1]/div/div/div[2]/div[4]"));
		 hightolowprice.click();
		 Thread.sleep(1000);
		 
		 WebElement highestprice=driver.findElement(By.xpath("//*[@id='container']/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[2]/div[1]/div[1]/div"));
		 		System.out.println(highestprice.getText());
		 		
		 		driver.quit();
		 		
		 	//	Action
	}

}
