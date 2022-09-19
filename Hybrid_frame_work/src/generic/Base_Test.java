package generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_Test implements framework_constants
{
private static final String chrome_key = null;
private static final String chrome_value = null;
public WebDriver driver;
@BeforeMethod
public void openApp1()
{
	System.setProperty(chrome_key, chrome_value);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get(baseURl);
}
@AfterMethod
public void closeAppln()
{
	driver.close();
	
}
}
