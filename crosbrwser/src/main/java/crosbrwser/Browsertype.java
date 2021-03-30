package crosbrwser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browsertype {
	public class bchrome{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Desktop\\chrome\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	}
	public class bfirefox{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\hp\\Desktop\\chrome\\geckodriver.exe");
		WebDriver driver==new FirefoxDriver();
	}

}

