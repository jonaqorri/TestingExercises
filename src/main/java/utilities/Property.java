package utilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.function.Supplier;
import java.util.logging.Logger;

public class Property {

    private static final String APP = "src/test/resources/app.properties";

    private Property() {}

    private static final Logger log = Logger.getLogger(String.valueOf(Property.class));

    public static String getPropertyFiles(String propertyFile) {
        if(System.getProperty(propertyFile) != null) {
            return System.getProperty(propertyFile).trim();
        }

        Properties properties = new Properties();
        try (InputStream inputStream = Property.class.getClassLoader().getResourceAsStream(APP)) {
            properties.load(inputStream);
        } catch (NullPointerException | IOException e) {
            log.info((Supplier<String>) e);
        }

        String fullProperty = properties.getProperty(propertyFile);
        if(fullProperty != null) {
            fullProperty = fullProperty.trim();
        }
        return fullProperty;
    }

}
