import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Fteam {

    List<Player> allPlayers = new ArrayList<>();
    List<Player> currentSquad = new ArrayList<>();
    List<Player> startLineup = new ArrayList<>();
    List<Player> subLineup = new ArrayList<>();

    int currentTotalPrice;
    int remainingBalance;

    Player gk = new Player();
    Player gkSub = new Player();
    List<Player> df = new ArrayList<>();
    List<Player> md = new ArrayList<>();
    List<Player> fw = new ArrayList<>();


    //initial team selection

    //select GK
    /*
    "now_cost": 50,
    "chance_of_playing_this_round": null,
    "value_form": "0.0",
    "value_season": "0.0",
    "form": "0.0",
    "total_points": 124,
    "event_points": 0,
    "points_per_game": "3.6",
    "clean_sheets": 11,
    "penalties_saved": 1,
    "saves": 90,
    "bps": 627, https://www.premierleague.com/news/106533
    "influence": "722.4",
    "ict_index": "71.9",   https://www.premierleague.com/news/65567
    */



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

}
