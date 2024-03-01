package commonLibs;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigUtils {

	public static Properties readProperties(String filename) throws IOException
	{
		FileInputStream fileReader=new FileInputStream(filename);
		
		Properties property=new Properties();
		property.load(fileReader);
		return property;
	}

}
