package Config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import Test.PropertiesFileWithTestNG;

public class PropertiesFile {
	static Properties prop = new Properties();
	static String proLocation = System.getProperty("user.dir");
	static String strBrowser;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		getProperties();
		//setProperties();

	}
	public static void getProperties()  {

		try {
			//Properties prop = new Properties();
			//String proLocation = System.getProperty("user.dir");
			InputStream input = new FileInputStream(proLocation+"/src/test/java/Config/config.properties");
			prop.load(input);
			strBrowser = prop.getProperty("browser");
			PropertiesFileWithTestNG.browserName = strBrowser;
			System.out.println(strBrowser);

		} catch (FileNotFoundException exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	public static void setProperties() {
		try { 
			OutputStream output = new FileOutputStream(proLocation+"/src/test/java/Config/config.properties");
			prop.setProperty("browser","chrome");
			prop.store(output, null);
			String newBrowser = prop.getProperty("browser");
			System.out.println(newBrowser);
		} 
		catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			exp.printStackTrace();			
		}  
	}
}
