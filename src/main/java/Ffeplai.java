import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Ffeplai {
    public static void main(String[] args) throws MalformedURLException, SQLException {

        //Welcome!
        System.out.println("Welcome to ffeplai!" + System.lineSeparator());

        //Get fresh data
        Data freshData = new Data();
        List<Player> players = null;
        try {
            players = freshData.getDataFromJson();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        //connect to DB
        DbConnection dbConnection = new DbConnection();
        Connection conn = dbConnection.getConnection();
        */

        Fteam fTeam = new Fteam();
        //main GK
        fTeam.gk = fTeam.selectGoalkeeper(players, 1, 999).get(0);
        //sub GK
        fTeam.gkSub = fTeam.selectSubGk(players, 1, 45).get(0);


    }
}
