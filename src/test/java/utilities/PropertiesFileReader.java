package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	
	String filePath;
	
	public PropertiesFileReader(String filePath) {
		this.filePath = filePath;
	}	
	public Properties properties() throws IOException {
		Properties properties = new Properties();
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filePath);
			properties.load(fis);
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			fis.close();
		}
		return properties;
	}

}
