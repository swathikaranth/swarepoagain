package swagitnewagain.swagitagain;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AppTest 
{

	@Test
	
	public void swatrial(){
		
		System.setProperty("webdriver.chrome.driver","C:/Users/KVK/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
