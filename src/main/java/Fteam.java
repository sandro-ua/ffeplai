import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class Fteam {

    Fplayer[] currentSquad = new Fplayer[15];
    Fplayer[] startLineup = new Fplayer[11];
    Fplayer[] subLineup = new Fplayer[11];

    int currentTotalPrice;
    int remainingBalance;

    Fplayer[] gk = new Fplayer[2];
    Fplayer[] df = new Fplayer[5];
    Fplayer[] md = new Fplayer[5];
    Fplayer[] fw = new Fplayer[3];

    //initial team selection

    //select GK
    public List<Player> selectGoalkeepres (List<Player> allPlayers) {
        //Fplayer[] selectedGk = new Fplayer[2];

        List<Player> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .filter(player -> player.getClean_sheets() > 10)
                .collect(toList());
        System.out.println(gks_only);


        return gks_only;
    }

}
