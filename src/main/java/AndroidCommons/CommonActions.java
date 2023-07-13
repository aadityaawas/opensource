package AndroidCommons;

import java.io.File;
import java.util.Properties;

public class CommonActions {
	
	public static void printMessage(String msg)
	{
		System.out.println(msg);
	}
	
	public void sleep(int sleepTime) throws InterruptedException
	{
		Thread.sleep(sleepTime);
	}

	public Properties readPropertyFile()
	{
		Properties property = new Properties();
		FileInputStream inputStream = new FileInputStream(new File(System.getProperty("user.dir")+"src\\main\\java\\com\\opensource\\Resources\\GeneralData.properties"));
		property.load(inputStream);
		return property;
		
	}
	
	
}
