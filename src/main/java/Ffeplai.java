import java.io.IOException;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

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
        System.out.println("Remaining Balance: " + fTeam.remainingBalance + System.lineSeparator());

        //working with normalized rating

        //Player pl = new Player();
        //Fgk fPlayer = new Fgk(pl);

        List<Fgk> fGks = new ArrayList<>();

        for (Player pl : players) {
            if (pl.getElement_type() == 1)
            fGks.add((new Fgk(pl)));
        }

        for (Fgk gk : fGks) {
            gk.calcPointsPerGameRating(fGks, gk, 10);
            gk.calcCleanSheetsRating(fGks, gk, 10);
            gk.calcSavesRating(fGks, gk, 10);
            gk.calcBpsRating(fGks, gk, 10);
        }

        //selecting 5 gks
        fGks = fGks.stream().sorted(Comparator.comparing(Fgk::getNormalizedRating)
                .reversed())
                .limit(10)
                .collect(toList());

        //print top 5 gks
        for (Fgk gk : fGks) {
            gk.printPlayer();
        }

    }
}
