import com.sun.org.apache.bcel.internal.generic.FSTORE;

import java.util.Comparator;
import java.util.List;

public class Fplayer extends Player {

    private float normalizedRating;
    private float pointsPointsPerGame;
    private float pointsCleanSheets;
    private float pointsSaves;
    private float pointsBps;
    private float pointsPenaltiesSaved;
    private float pointsCreativity;
    private float pointsIct_index;


    public Fplayer(Player pl) {
        super();
        this.setNow_cost(pl.getNow_cost());
        this.setFirst_name(pl.getFirst_name());
        this.setSecond_name(pl.getSecond_name());
        this.setTeam(pl.getTeam());
        this.setTotal_points(pl.getTotal_points());
        this.setCreativity(pl.getCreativity());
        this.setIct_index(pl.getIct_index());

        //gk
        this.setPoints_per_game(pl.getPoints_per_game());
        this.setClean_sheets(pl.getClean_sheets());
        this.setSaves(pl.getSaves());
        this.setBps(pl.getBps());
        this.setPenalties_saved(pl.getPenalties_saved());

    }


    public float getNormalizedRating() {
        return normalizedRating;
    }

    public void setNormalizedRating(float normalizedRating) {
        this.normalizedRating = normalizedRating;
    }

    public float getPointsCleanSheets() {
        return pointsCleanSheets;
    }

    public void setPointsCleanSheets(float pointsCleanSheets) {
        this.pointsCleanSheets = pointsCleanSheets;
    }

    public float getPointsPointsPerGame() {
        return pointsPointsPerGame;
    }

    public void setPointsPointsPerGame(float pointsPointsPerGame) {
        this.pointsPointsPerGame = pointsPointsPerGame;
    }

    public float getPointsSaves() {
        return pointsSaves;
    }

    public void setPointsSaves(float pointsSaves) {
        this.pointsSaves = pointsSaves;
    }

    public float getPointsBps() {
        return pointsBps;
    }

    public void setPointsBps(float pointsBps) {
        this.pointsBps = pointsBps;
    }

    public float getPointsCreativity() {
        return pointsCreativity;
    }

    public void setPointsCreativity(float pointsCreativity) {
        this.pointsCreativity = pointsCreativity;
    }

    public float getPointsPenaltiesSaved() {
        return pointsPenaltiesSaved;
    }

    public void setPointsPenaltiesSaved(float pointsPenaltiesSaved) {
        this.pointsPenaltiesSaved = pointsPenaltiesSaved;
    }

    public float getPointsIct_index() {
        return pointsIct_index;
    }

    public void setPointsIct_index(float pointsIct_index) {
        this.pointsIct_index = pointsIct_index;
    }

    public void calcPointsPerGameRating(Fplayer currentGk, int weight) {

        if (FStats.pointsPerGameStats.diff == 0) {
            pointsPointsPerGame = 0;
        } else {
            pointsPointsPerGame = currentGk.getPoints_per_game() / FStats.pointsPerGameStats.diff * weight;
        }
        setPointsPointsPerGame(pointsPointsPerGame);
        setNormalizedRating(getNormalizedRating() + pointsPointsPerGame);
    }

    public void calcCleanSheetsRating(Fplayer currentGk, int weight) {

        if (FStats.cleanSheetsStats.diff == 0) {
            pointsCleanSheets = 0;
        } else {
            pointsCleanSheets = currentGk.getClean_sheets() / FStats.cleanSheetsStats.diff * weight;
        }

        setPointsCleanSheets(pointsCleanSheets);
        setNormalizedRating(getNormalizedRating() + pointsCleanSheets);
    }

    public void calcSavesRating(Fplayer currentGk, int weight) {

        if (FStats.savesStats.diff == 0) {
            pointsSaves = 0;
        } else {
            pointsSaves = currentGk.getSaves() / FStats.savesStats.diff * weight;
        }
        setPointsSaves(pointsSaves);
        setNormalizedRating(getNormalizedRating() + pointsSaves);
    }

    public void calcBpsRating(Fplayer currentGk, int weight) {

        if (FStats.bpsStats.diff == 0) {
            pointsBps = 0;
        } else {
            pointsBps = currentGk.getBps() / FStats.bpsStats.diff * weight;
        }

        setPointsBps(pointsBps);
        setNormalizedRating(getNormalizedRating() + pointsBps);
    }

    public void calcPenaltiesSavedRating(Fplayer currentGk, int weight) {

        if (FStats.penaltiesSavedStats.diff == 0) {
            pointsPenaltiesSaved = 0;
        } else {
            pointsPenaltiesSaved = currentGk.getPenalties_saved() / FStats.penaltiesSavedStats.diff * weight;
        }

        setPointsPenaltiesSaved(pointsPenaltiesSaved);
        setNormalizedRating(getNormalizedRating() + pointsPenaltiesSaved);
    }

    public void calcCreativityRating(Fplayer currentGk, int weight) {

        if (FStats.creativityStats.diff == 0) {
            pointsCreativity = 0;
        } else {
            pointsCreativity = currentGk.getCreativity() / FStats.creativityStats.diff * weight;
        }

        setPointsCreativity(pointsCreativity);
        setNormalizedRating(getNormalizedRating() + pointsCreativity);
    }

    public void calcIctIndexRating(Fplayer currentPl, int weight) {

        if (FStats.ictIndexRatingStats.diff == 0) {
            pointsIct_index = 0;
        } else {
            pointsIct_index = currentPl.getIct_index() / FStats.ictIndexRatingStats.diff * weight;
        }

        setIct_index(pointsIct_index);
        setNormalizedRating(getNormalizedRating() + pointsIct_index);
    }


    //print Fplayer
    @Override
    protected void printPlayer() {
        System.out.println(String.format(this.getFirst_name() + " " + this.getSecond_name()  + " " +
                + this.getNow_cost()   + " " +  this.getNormalizedRating()));
    }

    /*@Override
    protected void printPlayer() {
        System.out.println(String.format(this.getFirst_name() + " " + this.getSecond_name() + " C: " + this.getCreativity() + " R: " + this.getPointsCreativity()));
    }*/


}
