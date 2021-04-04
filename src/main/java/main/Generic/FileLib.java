package main.Generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileLib {

    public Properties getData() throws IOException {
        FileInputStream fis = new FileInputStream("src/main/resources/data.properties");
        Properties properties = new Properties();
        properties.load(fis);
  //      properties.load(fis);
        return properties;
    }
}
