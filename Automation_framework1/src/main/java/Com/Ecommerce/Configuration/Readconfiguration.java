package Com.Ecommerce.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Readconfiguration {

	Properties pro;
	public Readconfiguration()  {
		
		File src = new File("C:\\Users\\user\\eclipse-workspace\\Automation_framework1\\src\\main\\java\\Com\\Ecommerce\\Configuration\\Config.properties");
	
	FileInputStream fis;
	try {
		fis = new FileInputStream(src);
		pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		System.out.println(e.getMessage());
		e.printStackTrace();
	}
	}
	
	public String getApplicationURL() {
		String url= pro.getProperty("baseURL");
	    return url;
		}
	
	public String getUsername() {
		String Username=pro.getProperty("username");
	    return Username;	
	}
	
	public String getPassword() {
		String Password=pro.getProperty("password");
	    return Password;	
	}
	
	public String getChromepath() {
		String Chromepath=pro.getProperty("chromepath");
	    return Chromepath;	
	}
	
	
}
