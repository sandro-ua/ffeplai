import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Fteam {

    protected List<Fplayer> currentSquad = new ArrayList<>();
    protected List<Fplayer> startLineup = new ArrayList<>();
    protected List<Fplayer> subLineup = new ArrayList<>();

    int currentTotalPrice;
    int remainingBalance;

    List<Fplayer> gk = new ArrayList<>(2);
    List<Fplayer> df = new ArrayList<>(5);
    List<Fplayer> md = new ArrayList<>(5);
    List<Fplayer> fw = new ArrayList<>(3);

    public List<Fplayer> selectMainGk (List<Fplayer> allPlayers, int resultQuantity, int maxCost) {

        List<Fplayer> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Fplayer::getNormalizedRating).reversed())
                .limit(resultQuantity)
                .collect(toList());

        return gks_only;
    }

    public List<Fplayer> selectSubGk (List<Fplayer> allPlayers, int resultQuantity, int maxCost) {

        List<Fplayer> gks_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 1)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Fplayer::getNormalizedRating).reversed())
                .limit(resultQuantity)
                .collect(toList());

        return gks_only;
    }

    public List<Fplayer> selectDfs (List<Fplayer> allPlayers, int resultQuantity, int maxCost) {

        List<Fplayer> defs_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 2)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Fplayer::getNormalizedRating).reversed())
                .limit(resultQuantity)
                .collect(toList());
        return defs_only;
    }

    public List<Fplayer> selectMds (List<Fplayer> allPlayers, int resultQuantity, int maxCost) {

        List<Fplayer> mds_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 3)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Fplayer::getNormalizedRating).reversed())
                .limit(resultQuantity)
                .collect(toList());
        return mds_only;
    }

    public List<Fplayer> selectFws (List<Fplayer> allPlayers, int resultQuantity, int maxCost) {

        List<Fplayer> fws_only = allPlayers.stream()
                .filter(p -> p.getElement_type() == 4)
                .filter(p -> p.getNow_cost() < maxCost)
                .sorted(Comparator.comparing(Fplayer::getNormalizedRating).reversed())
                .limit(resultQuantity)
                .collect(toList());
        return fws_only;
    }

    public void printFteam (Fteam fteam) {
        for (Fplayer p : fteam.currentSquad) {
            p.printPlayer();
        }
    }

    protected void reCalcFteamValues(Fteam fTeam) {

        currentTotalPrice = fTeam.currentSquad.stream().filter(o -> o.getNow_cost() > 0).mapToInt(Fplayer::getNow_cost).sum();
    }

    private Fplayer selectPlayerToTransferOut (Fteam fteam) {
        Fplayer playerOut = null;
        return playerOut;
    }


    
    private Fplayer selectPlayerToTransferIn (List <Fplayer> allPlayers) {
        Fplayer playerIn = null;
        return playerIn;
    }

    private Fteam makeTransfer (Fteam fteam, Fplayer outPlayer, Fplayer inPlayer) {
        fteam.currentSquad.remove(outPlayer);
        fteam.currentSquad.remove(inPlayer);
        if (outPlayer.getElement_type() == inPlayer.getElement_type()) {
            switch (outPlayer.getElement_type()) {
                case 1:
                    fteam.gk.remove(outPlayer);
                    fteam.gk.add(inPlayer);
                case 2:
                    fteam.df.remove(outPlayer);
                    fteam.df.add(inPlayer);
                case 3:
                    fteam.md.remove(outPlayer);
                    fteam.md.add(inPlayer);
                case 4:
                    fteam.fw.remove(outPlayer);
                    fteam.fw.add(inPlayer);
            }
            reCalcFteamValues(fteam);
        }
            else {
            System.out.println("Transfer can't be done. Positions do not match.");
        }


        return fteam;
    }

}
