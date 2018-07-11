import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;

public class Ffeplai {
    public static void main(String[] args) throws MalformedURLException {

        //Welcome!
        System.out.println("Welcome to ffeplai!" + System.lineSeparator());

        //Get fresh data
        Data freshData = new Data();
        try {
            freshData.getDataFromJson();
        } catch (IOException e) {
            e.printStackTrace();
        }

        Connection connection = connectionFactory.getConnection();

    }
}
