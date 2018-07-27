import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Fteam {

    private List<Fplayer> allPlayers = new ArrayList<>();
    private List<Fplayer> currentSquad = new ArrayList<>();
    private List<Fplayer> startLineup = new ArrayList<>();
    private List<Fplayer> subLineup = new ArrayList<>();

    int currentTotalPrice;
    int remainingBalance;

    /*
    ///////////////// This block of code is simple team selection. Based on several strict parameters.

    //Fplayer gk = new Fplayer();
    //Fplayer gkSub = new Fplayer();
    List<Player> df = new ArrayList<>();
    List<Player> md = new ArrayList<>();
    List<Player> fw = new ArrayList<>();


    //initial team selection

    public List<Player> selectMainGk (List<Player> allPlayers, int resultQuantity, int maxCost) {

        List<Player> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .filter(p -> p.getClean_sheets() > 10)
                .filter(p -> p.getNow_cost() < maxCost)
                .filter(p -> p.getInfluence() > 800.0)
                .sorted(Comparator.comparing(Player::getTotal_points))
                .limit(resultQuantity)
                .collect(toList());
        return gks_only;
    }


    public List<Player> selectSubGk (List<Player> allPlayers, int resultQuantity, int maxCost) {

        List<Player> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Player::getTotal_points))
                .limit(resultQuantity)
                .collect(toList());

        return gks_only;
    }

    public List<Player> selectDfs (List<Player> allPlayers, int resultQuantity, int maxCost) {

        List<Player> defs_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 2)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Player::getPoints_per_game).reversed())
                .limit(resultQuantity)
                .collect(toList());
        return defs_only;
    }

    public List<Player> selectMds (List<Player> allPlayers, int resultQuantity, int maxCost) {

        List<Player> mds_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 3)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Player::getPoints_per_game).reversed())
                .limit(resultQuantity)
                .collect(toList());
        return mds_only;
    }

    public List<Player> selectFws (List<Player> allPlayers, int resultQuantity, int maxCost) {

        List<Player> fws_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 4)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Player::getGoals_scored).reversed())
                .limit(resultQuantity)
                .collect(toList());
        return fws_only;
    }

    public void printFteam (Fteam fteam) {
        for (Player p : fteam.currentSquad) {
            p.printPlayer();
        }
    }



*/


    // Selecting team based on rating.

    public List<Fplayer> selectMainGk (List<Fplayer> allPlayers, int resultQuantity, int maxCost) {

        List<Fplayer> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .sorted(Comparator.comparing(Fplayer::getNormalizedRating).reversed())
                .limit(resultQuantity)
                .collect(toList());

        return gks_only;
    }
}
