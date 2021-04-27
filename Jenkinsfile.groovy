pipeline {
	agent any
	stages {
		stage ('One') {
			steps {
				echo 'Hello, this is a pipeline demo'
				}
			}
		stage ('Two') {
			steps {
				input ('Do u want to continue')
				}
			}
		stage ('Three') {
			when {
				not {
					branch "master"
					}
				}
			steps {
				echo 'Hello'
				}
			}
		stage ('Four') {
			steps {
					package lsi;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//import java.util.concurrent.TimeUnit;

public class submit {

	public static void main (String[] args) {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Amit\\chromedriver_win32\\chromedriver.exe");					
	        WebDriver driver = new ChromeDriver();	
	        	driver.manage().window().maximize();
	        	String baseUrl = ("https://www.flooringsupplies.co.uk/?gclid=Cj0KCQiAk53-BRD0ARIsAJuNhptGm733OCK_bbUVUCtr7cFO6yDS23HiBlMqLtu33VUoid3ZNYbXGz4aAkkXEALw_wcB");
	        	driver.get(baseUrl);
	      	
	        	driver.findElement(By.xpath("//*[@id=\"megaMenuHeaders\"]/div[2]/a[1]/span[1]")).click();
	        	System.out.println(driver.getTitle());
	        	if(driver.getTitle().equals("Laminate Flooring | Laminate Floors | FlooringSupplies.co.uk"))
	        	{
	        		System.out.println("Test Pass");
	        	}
	        	
	        	else
	        	{
	        		System.out.println("Test Fail");
	        	}
	        	driver.close();
	}
}

			
					}
			
			}
		}
	}
	