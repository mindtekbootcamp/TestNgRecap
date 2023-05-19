package utitlies;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static FileInputStream input;
    private static Properties properties;

    static{
        try {
            input=new FileInputStream(System.getProperty("user.dir")+"/src/test/resources/configurations/qa-configuration.properties");
            properties=new Properties();
            properties.load(input);
        } catch (FileNotFoundException e) {
            System.out.println("File path is invalid");
        } catch (IOException e) {
            System.out.println("Exception was there when we were trying to load the properties file");
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                System.out.println("Exception was there when we were trying to close FileInputStream object.");
            }
        }
        System.out.println("In static block");
    }

    public static String getProperty(String key){
        return properties.getProperty(key);
    }

    public static void main(String[] args) {
        System.out.println(getProperty("browser"));
        System.out.println(getProperty("AppURL"));
    }

}
