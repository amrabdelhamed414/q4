package Q5;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class Main {
    public static void main(String[] args){
        URL url = null;
        Scanner data = null;
        try {
            url=new URL("https://www.javatpoint.com/java-tutorial");
            data = new Scanner(url.openStream());
        } catch (Exception e) {
            System.out.println("Found Problem! >_<");
        }
        int count = 0;
        while (data.hasNext())
            count++;
        System.out.println(count);
    }
}