package vinay;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radio {
	

	WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
		 
			
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
 


	}
}


