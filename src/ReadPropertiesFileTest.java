import java.io.*;
import java.util.*;
public class ReadPropertiesFileTest {
    public static void main(String args[]) throws IOException {
        Properties prop = readPropertiesFile("/Users/shriyathai/IdeaProjects/example/src/config.properties");
        System.out.println( prop.getProperty("url"));
        System.out.println(prop.getProperty("count"));
    }
    public static Properties readPropertiesFile(String fileName) throws IOException {
        FileInputStream fis = null;
        Properties prop = null;
        try {
            fis = new FileInputStream(fileName);
            prop = new Properties();
            prop.load(fis);
        } catch(FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        } catch(IOException ioe) {
            ioe.printStackTrace();
        } finally {
            fis.close();
        }
        return prop;
    }
}
