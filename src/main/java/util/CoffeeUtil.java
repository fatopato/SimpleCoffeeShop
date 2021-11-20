package util;

import lombok.extern.slf4j.Slf4j;

import java.io.FileInputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Properties;

@Slf4j
public class CoffeeUtil {

    private CoffeeUtil() {
        // private constructor
    }

    public static BigDecimal getPrice(String priceProp) {

        String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
        String appConfigPath = rootPath + "app.properties";
        Properties appProps = new Properties();
        try (FileInputStream inputStream = new FileInputStream(appConfigPath)) {
            appProps.load(inputStream);
        } catch (IOException e) {
            log.error(e.getMessage());
        }
        String property = appProps.getProperty(priceProp);
        if (property == null) {
            return BigDecimal.ZERO;
        } else {
            return new BigDecimal(property);
        }
    }
}
