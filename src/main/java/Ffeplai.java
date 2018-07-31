import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Ffeplai {
    public static void main(String[] args) throws IOException, SQLException {

        long lStartTime = System.currentTimeMillis();

        //Welcome!
        System.out.println("Welcome to ffeplai!" + System.lineSeparator());

        //Get fresh data
        Data freshData = new Data();

        //update files from https://fantasy.premierleague.com/
        //freshData.updateLocalJsonFiles();

        List<Player> players = null;
        try {
            players = freshData.getPlayersDataFromJson();
        } catch (IOException e) {
            e.printStackTrace();
        }

        List<Team> teams = null;
        try {
            teams = freshData.getTeamsDataFromJson();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        Fstats.calcStats(players);

        /*
        //connect to DB
        DbConnection dbConnection = new DbConnection();
        Connection conn = dbConnection.getConnection();
        */


        //working with normalized rating
        List<Fplayer> allFplayers = new ArrayList<>();

        for (Player pl : players) {
            allFplayers.add((new Fplayer(pl)));
        }

        for (Fplayer pl : allFplayers) {
            pl.calcPointsPerGameRating(pl, 10);
            pl.calcCleanSheetsRating(pl, 10);
            pl.calcSavesRating(pl, 10);
            pl.calcBpsRating(pl, 10);
            pl.calcPenaltiesSavedRating(pl, 10);
            pl.calcCreativityRating(pl, 10);
            pl.calcIctIndexRating(pl, 10);
        }

        Fteam fTeam = new Fteam();

        //main GK
        fTeam.gk.add(fTeam.selectMainGk(allFplayers, 1, 999).get(0));
        //sub GK
        fTeam.gk.add(fTeam.selectSubGk(allFplayers, 1, 500).get(0));
        fTeam.df = fTeam.selectDfs(allFplayers, 5, 65);
        fTeam.md = fTeam.selectMds(allFplayers, 5, 90);
        fTeam.fw = fTeam.selectFws(allFplayers, 3, 90);

        fTeam.currentSquad.addAll(fTeam.gk);
        fTeam.currentSquad.addAll(fTeam.df);
        fTeam.currentSquad.addAll(fTeam.md);
        fTeam.currentSquad.addAll(fTeam.fw);

        fTeam.reCalcFteamValues(fTeam);

        fTeam.currentTotalPrice = fTeam.currentSquad.stream().mapToInt(Player::getNow_cost).sum();
        fTeam.remainingBalance = 1000 - fTeam.currentTotalPrice;

        fTeam.printFteam(fTeam);

        System.out.println(System.lineSeparator() + "Total price: " + fTeam.currentTotalPrice);
        System.out.println("Remaining Balance: " + fTeam.remainingBalance + System.lineSeparator());


        long lEndTime = System.currentTimeMillis();
        long output = lEndTime - lStartTime;
        System.out.println(System.lineSeparator() + "Elapsed time in milliseconds: " + output);
    }
}
