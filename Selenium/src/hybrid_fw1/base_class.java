package hybrid_fw1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class base_class {

	public static WebDriver d;
	
	@Parameters({"key","value","url"})	
	@BeforeMethod	
	public void openapp(String key,String value,String url )
	{
		System.setProperty(key,value);
		d=new FirefoxDriver();
		d.get(url);
	}
	@AfterMethod
	public void closeapp()
	{
		//d.close();
	}
}