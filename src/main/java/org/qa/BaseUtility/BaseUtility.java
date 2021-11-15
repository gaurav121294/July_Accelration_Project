package org.qa.BaseUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseUtility {

WebDriver driver;



	
public WebDriver startup(String browserName,String url)
{
	String projectpath=System.getProperty("user.dir");
	System.out.println("projectpath="+projectpath);
	
	if(browserName.equalsIgnoreCase("chrome")||browserName.equalsIgnoreCase("ch"))
			{
		System.setProperty("webdriver.chrome.driver", projectpath+"\\Driver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  //		WebDriver driver=new EdgeDriver();
//we remove driver because we globaly declare.we want catch url
			}
	if(browserName.equalsIgnoreCase("firefox")||browserName.equalsIgnoreCase("fi"))
	{
		System.setProperty("webdriver.gecko.driver", projectpath+"\\Driver\\geckodriver.exe");
		 driver=new FirefoxDriver();
	}
	if(browserName.equalsIgnoreCase("edge")||browserName.equalsIgnoreCase("ed"))
	{
		System.setProperty("webdriver.edge.driver", projectpath+"\\Driver\\edgedriver.exe");
		 driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	return driver;
	
}
public void selectByindex(WebElement ele,int index) {
	Select sel=new Select(ele);
	sel.selectByIndex(index);
}
public void selectBytext(WebElement ele,String value) {
	Select sel=new Select(ele);
	sel.selectByVisibleText(value);
}
public void selectByvalue(WebElement ele,String value) {
	Select sel=new Select(ele);
	sel.selectByValue(value);
}
public void waitTillElementVisible(WebDriver driver,By obj,int time) {
	WebDriverWait wt=new WebDriverWait (driver,time);
	wt.until(ExpectedConditions.visibilityOfElementLocated(obj));
}

public void actioDraganddrop1(WebElement source,WebElement target) {
	Actions act=new Actions(driver);
	act.dragAndDrop(source, target);
}
public void actioDraganddrop2(WebElement source,WebElement target) {
	Actions act=new Actions(driver);
	act.moveToElement(target);
}
public void actioDraganddrop3(WebElement source,WebElement target) {
	Actions act=new Actions(driver);
	act.release(target);
}
public void actioDraganddrop(WebElement source,WebElement target) {
	Actions act=new Actions(driver);
	act.build();
}
}
