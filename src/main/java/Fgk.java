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
        "influence": "722.4",
        "ict_index": "71.9",   https://www.premierleague.com/news/65567
*/


public class Fgk extends Player {

    protected float normalizedRating;
    protected float pointsPointsPerGame;
    protected float pointsCleanSheets;

    public Fgk(Player pl) {
        super();
        this.setPoints_per_game(pl.getPoints_per_game());
        this.setNow_cost(pl.getNow_cost());
        this.setFirst_name(pl.getFirst_name());
        this.setSecond_name(pl.getSecond_name());
        this.setTeam(pl.getTeam());
        this.setTotal_points(pl.getTotal_points());
    }

    public float getNormalizedRating() {
        return normalizedRating;
    }

    public void setNormalizedRating(float normalizedRating) {
        this.normalizedRating = normalizedRating;
    }

    public float getPointsPointsPerGame() {
        return pointsPointsPerGame;
    }

    public void setPointsPointsPerGame(float pointsPointsPerGame) {
        this.pointsPointsPerGame = pointsPointsPerGame;
    }

    public void calcPointsPerGameRating(List<Fgk> gks, Fgk currentGk, int weight) {

        float max = gks.stream().max(Comparator.comparing(Player::getPoints_per_game)).get().getPoints_per_game();
        float min = gks.stream().min(Comparator.comparing(Player::getPoints_per_game)).get().getPoints_per_game();
        float diff = max - min;

        float normalizedRating = currentGk.getPoints_per_game() * 100 / diff;
        float pointsPointsPerGame = (normalizedRating * weight)/100;

        setPointsPointsPerGame(pointsPointsPerGame);
        setNormalizedRating(normalizedRating);
    }

    @Override
    protected void printPlayer() {
        System.out.println(String.format(this.getFirst_name() + " " + this.getSecond_name() + " [" + this.getTeam()
                + "] " + this.getNow_cost() + " " + this.getTotal_points() + " " + this.getPointsPointsPerGame()));
    }

}
