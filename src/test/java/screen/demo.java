package screen;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class demo {
	
	@Test
	public void Tstdemo() throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\SOFT\\lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		Thread.sleep(2000);
		
		//screenshots
		
		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
			FileUtils.copyFile(screenshotFile, new File("screenshots\\screenshot1.jpg"));
		
		
		
			// TODO Auto-generated catch block
		
			Thread.sleep(2000);
		
		driver.findElement(By.linkText("compendiumdev")).click();
		

		File screenshotFile1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		
			FileUtils.copyFile(screenshotFile1, new File("screenshots\\screenshot2.jpg"));
		
		
		
		driver.close();
		
		
		
	}
	
	

}
