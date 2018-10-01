package com.hsbcnet.base;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public static Logger log=Logger.getLogger(BaseTest.class);
	public Properties config;
	public FileInputStream fl;
	public static  WebDriver driver=null;
	
	@BeforeSuite
	public void setProperty() throws IOException{
		log.info("*****Project started******");
		log.info("Loading Config File");
	
		//Loading the configuration File 
		config =new Properties();
		fl= new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/hsbcnet/config/config.properties");
		config.load(fl);
	
		log.info("Config File Loaded succesfully......");
//		System.out.println("URL+++++++"+config.getProperty("url"));
		
		if(System.getProperty("os.name").contains("Windows")){
			if(config.getProperty("browser").equalsIgnoreCase("firefox")){
				log.debug("Browser====>"+config.getProperty("browser"));
				driver =new FirefoxDriver();
			}else if(config.getProperty("browser").equalsIgnoreCase("chrome")){
				log.debug("Browser====>"+config.getProperty("browser"));
				System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/main/resources/driverfile/chromedriver.exe");
				driver =new ChromeDriver();
			}
		}
	}
	
	@BeforeTest
	public void setURL(){
		String offUrl=config.getProperty("offurl");
		log.info("URL opening...");
		driver.get(offUrl);
	}
	
	@AfterSuite
	public void closeBrowser(){
		driver.close();
	}
	
 
}
