package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Property {

    private static final String APP = "src/test/resources/app.properties";

    private Property() {}

    public static Properties getPropertyFiles(String propertyFile) {
        Properties properties = new Properties();
        try(InputStream inputStream = new FileInputStream(propertyFile)){
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public static String getAppProperty(String property) {
        return getPropertyFiles(APP).getProperty(property);
    }
}
