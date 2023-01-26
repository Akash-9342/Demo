package Com.Ecommerce.BaseClass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.math3.stat.inference.TestUtils;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverInfo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.beust.jcommander.Parameter;

import Com.Ecommerce.Configuration.Readconfiguration;
import net.bytebuddy.utility.RandomString;

public class Ecommerce_BaseClass {

	
	Readconfiguration readconfig= new Readconfiguration();
	public String baseURL = readconfig.getApplicationURL();
	public String username = readconfig.getUsername();
	public String password = readconfig.getPassword();
	
     public static WebDriver driver;
	public static  Logger logger;
	@Parameter
	@BeforeMethod
	public void initialization() {
				
		logger = logger.getLogger("30JulyEcommerce");
		PropertyConfigurator.configure("Log4j.properties");
		System.setProperty("webdriver.chrome.driver", readconfig.getChromepath() );
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(25,TimeUnit.SECONDS);
		 
		 driver.get(baseURL);
		
	}
		 public String getScreenshotAs(String Testcasename) throws IOException {
			 TakesScreenshot ts = (TakesScreenshot) driver;
			File Source= ts.getScreenshotAs(OutputType.FILE);
			String Random = RandomString.make(5);
			String destination = System.getProperty("user.dir")+"/Screenshot/"+ Testcasename +""+ Random +".png";
			FileUtils.copyFile(Source , new File(destination));
			return destination;
		 }
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
}
