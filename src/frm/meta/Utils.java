package frm.meta;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
 * this class contains the general utility-level functions
 */
public class Utils {

	public static Properties loadData (String filePath) throws IOException{
		File file =new File(filePath);
		if (!file.exists())
			return null;
		else {
		Properties p = new Properties();
		p.load(new FileReader(file));
		return p;
		}
	}
}
