package FileReaders;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	public static Properties ReadConfigFile() {
		Properties prop = new Properties();
		File file = new File("D:\\SeleniumWorkspace\\DataDrivenFrmwrk\\src\\main\\java\\Config\\APP.Properties");
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		// load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}
	