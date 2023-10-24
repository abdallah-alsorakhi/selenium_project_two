package my_progect1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MyFirestTestCase {
	// here we define where we want see the result and use the browsers;
	
	//WebDriver driver = new ChromeDriver();
	//WebDriver driver2 = new FirefoxDriver();
	
	WebDriver driver3 = new EdgeDriver();

	@BeforeTest
	
	public void mySetup() {
	///driver.get("https://www.saucedemo.com/");	
	//driver2.get("https://www.saucedemo.com/");
		//here we took the url for the website that we want to test;
	driver3.get("https://www.saucedemo.com/");	
	// here we called the element that we want to use by x path; 
	driver3.findElement(By.xpath("//*[@id=\"user-name\"]")).sendKeys("standard_user");
	driver3.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("secret_sauce");
	
	//here we called the btn by the id and the order click to make the btn click by it self;
	
	driver3.findElement(By.id("login-button")).click();
	//here to make the window be maximized automatically;
	
	driver3.manage().window().maximize();
	
	// here we make the chart add all items automatically;
	
	List<WebElement> addtoCartButtons = driver3.findElements(By.className("btn_primary"));	
	
	for(int i = 0 ;i<addtoCartButtons.size();i++) {
		addtoCartButtons.get(i).click();
		System.out.println("ahmad");
	}
	
	// we made chart to add all items name ;
	
	List<WebElement> nameCartButtons = driver3.findElements(By.className("inventory_item_name"));
	List <WebElement> item_Price = driver3.findElements(By.className("inventory_item_price"));
	for(int i = 0 ;i<nameCartButtons.size();i++) {
		String productName =nameCartButtons.get(i).getText();
		System.out.println("product called ="+productName );
		System.out.println("the price is " + item_Price.get(i).getText());
	}
	
	
	
	
	}

	@Test ()
	
	public void MyFierstTest() {}
	
	@AfterTest
	
	public void myPostTesting() {}
	
	
	
	

}
