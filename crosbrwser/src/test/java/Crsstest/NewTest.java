package Crsstest;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import crosbrwser.Browsertype;

public class NewTest {
	@Test
	@Parameters("browsername")
	public void f(String browser) {
	  
		
		if(browser.equalsIgnoreCase("firefox"))
	  {

			 Browsertype obj=new Browsertype();	
		obj.bfirefox();
	}
	  
		if(browser.equalsIgnoreCase("chrome"))
		{

			 Browsertype obj=new Browsertype();
			obj.bchrome();
		}  
	  
  }
	
	
}
