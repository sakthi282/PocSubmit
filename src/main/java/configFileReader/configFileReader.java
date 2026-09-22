package configFileReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configFileReader {

    Properties pro;

    public configFileReader() throws IOException {
        FileInputStream fi = new FileInputStream("src/test/resources/ConFig.properties");

        pro=new Properties();
        pro.load(fi);

    }


    public String getbrowser()
    {
        return pro.getProperty("Browser");
    }


    public String geturl1()
    {
        return pro.getProperty("url1");
    }
    public String geturl2()
    {
        return pro.getProperty("url2");
    }
}
