import java.util.Comparator;
import java.util.List;

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
*/

public class Fgk extends Player {

    protected float normalizedRating;
    protected float pointsPointsPerGame;
    protected float pointsCleanSheets;
    protected float pointsSaves;
    protected float pointsBps;

    public Fgk(Player pl) {
        super();
        this.setNow_cost(pl.getNow_cost());
        this.setFirst_name(pl.getFirst_name());
        this.setSecond_name(pl.getSecond_name());
        this.setTeam(pl.getTeam());
        this.setTotal_points(pl.getTotal_points());

        this.setPoints_per_game(pl.getPoints_per_game());
        this.setClean_sheets(pl.getClean_sheets());
        this.setSaves(pl.getSaves());
        this.setBps(pl.getBps());
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

    public void calcPointsPerGameRating(List<Fgk> gks, Fgk currentGk, int weight) {

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

    public void calcCleanSheetsRating(List<Fgk> gks, Fgk currentGk, int weight) {

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

    public void calcSavesRating(List<Fgk> gks, Fgk currentGk, int weight) {

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

    public void calcBpsRating(List<Fgk> gks, Fgk currentGk, int weight) {

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

    //print GK
    @Override
    protected void printPlayer() {
        System.out.println(String.format(this.getFirst_name() + " " + this.getSecond_name() + " [" + this.getTeam()
                + "] " + this.getNow_cost() + " " + this.getTotal_points() + " " + this.getNormalizedRating()));
    }
}
