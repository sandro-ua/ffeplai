import java.util.Comparator;
import java.util.List;

public class Fplayer extends Player {

    protected float normalizedRating;
    protected float pointsPointsPerGame;
    protected float pointsCleanSheets;
    protected float pointsSaves;
    protected float pointsBps;
    protected float penaltiesSaved;

    public Fplayer(Player pl) {
        super();
        this.setNow_cost(pl.getNow_cost());
        this.setFirst_name(pl.getFirst_name());
        this.setSecond_name(pl.getSecond_name());
        this.setTeam(pl.getTeam());
        this.setTotal_points(pl.getTotal_points());

        //gk
        this.setPoints_per_game(pl.getPoints_per_game());
        this.setClean_sheets(pl.getClean_sheets());
        this.setSaves(pl.getSaves());
        this.setBps(pl.getBps());
        this.setPenaltiesSaved(pl.getPenalties_saved());

    }

    public float getPenaltiesSaved() {
        return penaltiesSaved;
    }

    public void setPenaltiesSaved(float penaltiesSaved) {
        this.penaltiesSaved = penaltiesSaved;
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

    public void calcPointsPerGameRating(List<Fplayer> gks, Fplayer currentGk, int weight) {

        float max = gks.stream().max(Comparator.comparing(Player::getPoints_per_game)).get().getPoints_per_game();
        float min = gks.stream().min(Comparator.comparing(Player::getPoints_per_game)).get().getPoints_per_game();
        float diff = max - min;

        if (diff == 0) {
            pointsPointsPerGame = 0;
        } else {
            pointsPointsPerGame = (currentGk.getPoints_per_game() / diff * weight);
        }
        setPointsPointsPerGame(pointsPointsPerGame);
        setNormalizedRating(getNormalizedRating() + pointsPointsPerGame);
    }

    public void calcCleanSheetsRating(List<Fplayer> gks, Fplayer currentGk, int weight) {

        int max = gks.stream().max(Comparator.comparing(Player::getClean_sheets)).get().getClean_sheets();
        int min = gks.stream().min(Comparator.comparing(Player::getClean_sheets)).get().getClean_sheets();
        int diff = max - min;

        if (diff == 0) {
            pointsCleanSheets = 0;
        } else {
            pointsCleanSheets = (currentGk.getClean_sheets() / diff * weight);
        }

        setPointsCleanSheets(pointsCleanSheets);
        setNormalizedRating(getNormalizedRating() + pointsCleanSheets);
    }

    public void calcSavesRating(List<Fplayer> gks, Fplayer currentGk, int weight) {

        int max = gks.stream().max(Comparator.comparing(Player::getSaves)).get().getSaves();
        int min = gks.stream().min(Comparator.comparing(Player::getSaves)).get().getSaves();
        int diff = max - min;

        if (diff == 0) {
            pointsSaves = 0;
        } else {
            pointsSaves = (currentGk.getSaves() / diff * weight);
        }
        setPointsSaves(pointsSaves);
        setNormalizedRating(getNormalizedRating() + pointsSaves);
    }

    public void calcBpsRating(List<Fplayer> gks, Fplayer currentGk, int weight) {

        int max = gks.stream().max(Comparator.comparing(Player::getBps)).get().getBps();
        int min = gks.stream().min(Comparator.comparing(Player::getBps)).get().getBps();
        int diff = max - min;

        if (diff == 0) {
            pointsBps = 0;
        } else {
            pointsBps = (currentGk.getBps() / diff * weight);
        }

        setPointsBps(pointsBps);
        setNormalizedRating(getNormalizedRating() + pointsBps);
    }

    public void calcPenaltiesSavedRating(List<Fplayer> gks, Fplayer currentGk, int weight) {

        int max = gks.stream().max(Comparator.comparing(Player::getPenalties_saved)).get().getPenalties_saved();
        int min = gks.stream().min(Comparator.comparing(Player::getPenalties_saved)).get().getPenalties_saved();
        int diff = max - min;

        if (diff == 0) {
            penaltiesSaved = 0;
        } else {
            penaltiesSaved = (currentGk.getBps() / diff * weight);
        }

        setPenaltiesSaved(penaltiesSaved);
        setNormalizedRating(getNormalizedRating() + penaltiesSaved);
    }

    //print Fplayer
    @Override
    protected void printPlayer() {
        System.out.println(String.format(this.getFirst_name() + " " + this.getSecond_name()  + " " +
                + this.getNow_cost()   + " " +  this.getNormalizedRating()  + " " +  this.getPointsBps() + " | "
                + this.getPointsPointsPerGame() + " | " + this.getPointsSaves()  + " | " + this.getPointsCleanSheets()));
    }
}
