import java.util.Comparator;
import java.util.List;

/**
 * Collects statics about players stats (max, min values, etc.).
 * This is for not recalculating it each time when normalized rating is needed.
 */
class FStats {

    public static Stats ictIndexRatingStats;
    public static Stats creativityStats;
    public static Stats penaltiesSavedStats;
    public static Stats bpsStats;
    public static Stats savesStats;
    public static Stats cleanSheetsStats;
    public static Stats pointsPerGameStats;

    public static void calcStats (List<Player> players) {

        ictIndexRatingStats = calcIctIndexStats(players);
        creativityStats = calcCreativityStats(players);
        penaltiesSavedStats = calcPenaltiesSavedStats(players);
        bpsStats = calcBpsStats(players);
        savesStats = calcSavesStats(players);
        cleanSheetsStats = calcCleanSheetsStats(players);
        pointsPerGameStats = calcPointsPerGameStats(players);
    }

    public static Stats calcIctIndexStats(List<Player> playerList) {

        Stats stats = new Stats();
        stats.min = playerList.stream().min(Comparator.comparing(Player::getIct_index)).get().getIct_index();
        stats.max = playerList.stream().max(Comparator.comparing(Player::getIct_index)).get().getIct_index();
        stats.diff = stats.max - stats.min;

        return stats;
    }

    public static Stats calcCreativityStats (List<Player> playerList) {

        Stats stats = new Stats();
        stats.min = playerList.stream().min(Comparator.comparing(Player::getCreativity)).get().getCreativity();
        stats.max = playerList.stream().max(Comparator.comparing(Player::getCreativity)).get().getCreativity();
        stats.diff = stats.max - stats.min;

        return stats;
    }


    public static Stats calcPenaltiesSavedStats(List<Player> playerList) {
        Stats stats = new Stats();
        stats.min = playerList.stream().min(Comparator.comparing(Player::getPenalties_saved)).get().getPenalties_saved();
        stats.max = playerList.stream().max(Comparator.comparing(Player::getPenalties_saved)).get().getPenalties_saved();
        stats.diff = stats.max - stats.min;

        return stats;
    }

    public static Stats calcBpsStats(List<Player> playerList) {
        Stats stats = new Stats();
        stats.min = playerList.stream().min(Comparator.comparing(Player::getBps)).get().getBps();
        stats.max = playerList.stream().max(Comparator.comparing(Player::getBps)).get().getBps();
        stats.diff = stats.max - stats.min;

        return stats;
    }


    public static Stats calcSavesStats(List<Player> playerList) {
        Stats stats = new Stats();
        stats.min = playerList.stream().min(Comparator.comparing(Player::getSaves)).get().getSaves();
        stats.max = playerList.stream().max(Comparator.comparing(Player::getSaves)).get().getSaves();
        stats.diff = stats.max - stats.min;

        return stats;
    }

    public static Stats calcCleanSheetsStats(List<Player> playerList) {
        Stats stats = new Stats();
        stats.min = playerList.stream().min(Comparator.comparing(Player::getClean_sheets)).get().getClean_sheets();
        stats.max = playerList.stream().max(Comparator.comparing(Player::getClean_sheets)).get().getClean_sheets();
        stats.diff = stats.max - stats.min;

        return stats;
    }

    public static Stats calcPointsPerGameStats(List<Player> playerList) {
        Stats stats = new Stats();
        stats.min = playerList.stream().min(Comparator.comparing(Player::getPoints_per_game)).get().getPoints_per_game();
        stats.max = playerList.stream().max(Comparator.comparing(Player::getPoints_per_game)).get().getPoints_per_game();
        stats.diff = stats.max - stats.min;

        return stats;
    }
}
