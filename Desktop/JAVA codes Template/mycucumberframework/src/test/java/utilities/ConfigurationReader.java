package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;
    //WE ARE OPENING A FILE, USING FILE INPUT STREAM
    //WE ARE LOADING THE properties IN THAT FILE
    //THEN WE READ properties FILE
    //creating static block to initialize
    static {
        String path ="configuration.properties";
        try {
            //To open a file, we use FileInputStream
            FileInputStream file=new FileInputStream(path);//opening configuration.properties
            properties=new Properties();//We are initializing the properties file
            properties.load(file);//loading the file
            file.close();//closing the file
        } catch (Exception e) {
            //System.out.println("Path is not found");
            e.printStackTrace();
        }
    }
    //We create static method to read
    //This method will return the value, when user enter the key
    //
    public static String getProperty(String key){
        return properties.getProperty(key);
    }


}
