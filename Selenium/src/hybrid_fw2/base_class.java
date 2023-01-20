package hybrid_fw2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_class 
{
	public static WebDriver d;
    @BeforeMethod
    public void oa()
    {
    	System.setProperty("webdriver.gecko.driver", "./Softwares/geckodriver.exe");
    	d=new FirefoxDriver();
    	d.get("https://blazedemo.com/index.php");
    }
    @AfterMethod
    public void ca() throws InterruptedException
    {
    	//d.quit();
    	Thread.sleep(5000);
    }
}
