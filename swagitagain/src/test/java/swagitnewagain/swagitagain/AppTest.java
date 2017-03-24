package swagitnewagain.swagitagain;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeOptions;

public class AppTest 
{

	@Test
	
	public void swatrial(){
		
		
		System.setProperty("webdriver.chrome.driver","C:/Program Files/chromedriver_win32 (1)/chromedriver.exe");
		ChromeOptions options = new ChromeOptions(); 
		options.setBinary("C:/Program Files (x86)/Google/Chrome/Application/chrome.exe"); 
		ChromeDriver driver = new ChromeDriver(options);
		String eTitle= "Meet Guru99";
		String aTitle= "";
		driver.get("http://www.guru99.com/");
		driver.manage().window().maximize();
		aTitle= driver.getTitle();
		
		if(aTitle.contentEquals(eTitle)){
			System.out.println("Test passed");
			
		}else{
			System.out.println("Test failed");
		}
		
		driver.close();
		
	}
	
    }
