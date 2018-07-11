import java.io.IOException;
import java.net.MalformedURLException;

public class Ffeplai {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println("Welcome to ffeplai!" + System.lineSeparator());
        Data freshData = new Data();
        try {
            freshData.getDataFromJson();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
