import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class propertiesdemo {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        FileInputStream fi = new FileInputStream("src/test/resources/config.properties");
        properties.load(fi);
        System.out.println(properties);
    }
}
