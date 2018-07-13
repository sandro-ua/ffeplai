import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
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
        fTeam.gk = fTeam.selectMainGk(players, 1, 999).get(0);
        //sub GK
        fTeam.gkSub = fTeam.selectSubGk(players, 1, 45).get(0);
        fTeam.df = fTeam.selectDfs (players, 5, 65);
        fTeam.md = fTeam.selectMds (players, 5, 90);
        fTeam.fw = fTeam.selectFws (players, 3, 90);

        fTeam.currentSquad.add (fTeam.gk);
        fTeam.currentSquad.add (fTeam.gkSub);
        fTeam.currentSquad.addAll (fTeam.df);
        fTeam.currentSquad.addAll (fTeam.md);
        fTeam.currentSquad.addAll (fTeam.fw);

        fTeam.currentTotalPrice = fTeam.currentSquad.stream().mapToInt(Player::getNow_cost).sum();
        fTeam.remainingBalance = 1000 - fTeam.currentTotalPrice;

        fTeam.printFteam(fTeam);

        System.out.println(System.lineSeparator() + "Total price: " + fTeam.currentTotalPrice);
        System.out.println("Remaining Balance: " + fTeam.remainingBalance);
    }
}
