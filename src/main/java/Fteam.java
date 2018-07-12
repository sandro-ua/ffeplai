import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Fteam {

    List<Player> allPlayers;

    Player[] currentSquad = new Player[15];
    Player[] startLineup = new Player[11];
    Player[] subLineup = new Player[11];

    int currentTotalPrice;
    int remainingBalance;

    Player gk = new Player();
    Player[] df = new Player[5];
    Player[] md = new Player[5];
    Player[] fw = new Player[3];
    Player gkSub = new Player();

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



    public List<Player> selectGoalkeeper (List<Player> allPlayers, int resultQuantity, int maxCost) {

        List<Player> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .filter(p -> p.getClean_sheets() > 10)
                .filter(p -> p.getNow_cost() < maxCost)
                .filter(p -> p.getInfluence() > 800.0)
                .sorted(Comparator.comparing(Player::getSaves))
                .limit(resultQuantity)
                .collect(toList());
        System.out.println(gks_only);

        return gks_only;
    }


    public List<Player> selectSubGk (List<Player> allPlayers, int resultQuantity, int maxCost) {

        List<Player> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Player::getSaves))
                .limit(resultQuantity)
                .collect(toList());
        System.out.println(gks_only);

        return gks_only;
    }


}
