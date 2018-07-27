import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Data {

    private URL urlEvents = new URL("https://fantasy.premierleague.com/drf/events/");
    private URL urlPlayers = new URL("https://fantasy.premierleague.com/drf/elements");
    private URL urlTeams = new URL("https://fantasy.premierleague.com/drf/teams");

    private File fileEvents = new File("src/main/resources/events.json");
    private File filePlayers = new File("src/main/resources/players.json");
    private File fileTeams = new File("src/main/resources/teams.json");

    public Data() throws MalformedURLException {
    }

    public List<Player> getPlayersDataFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Player> players = mapper.readValue(filePlayers, new TypeReference<List<Player>>() {
        });

        return players;
    }

    public List<Team> getTeamsDataFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Team> teams = mapper.readValue(fileTeams, new TypeReference<List<Team>>() {
        });

        return teams;
    }

    public List<Event> getEventsDataFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Event> events = mapper.readValue(fileTeams, new TypeReference<List<Team>>() {
        });

        return events;
    }

    public void updateLocalJsonFiles() throws IOException {

        FileUtils.copyURLToFile(urlPlayers, filePlayers);
        FileUtils.copyURLToFile(urlEvents, fileEvents);
        FileUtils.copyURLToFile(urlTeams, fileTeams);
    }


    //update DB
    //TODO:
    // write code that'll update mysql db data with json data

    //connect to DB
    //DbConnection dbConnection = new DbConnection();
    //Connection conn = dbConnection.getConnection();

}
