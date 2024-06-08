package demowebshop.fileutility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
	FileInputStream fis;

	public String fetchProperty(String key) {
		try {
			fis = new FileInputStream("./src/test/resources/demowebshop.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Properties pobj = new Properties();
		try {
			pobj.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String data = pobj.getProperty(key);
		return data;

	}


}
