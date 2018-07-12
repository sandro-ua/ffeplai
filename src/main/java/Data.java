import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.Connection;
import java.util.List;


public class Data {

    URL urlEvents = new URL("https://fantasy.premierleague.com/drf/events/");
    URL urlPlayers = new URL("https://fantasy.premierleague.com/drf/elements");
    URL urlTeams = new URL("https://fantasy.premierleague.com/drf/teams");


    public Data() throws MalformedURLException {
    }

    public void getDataFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Event> events = mapper.readValue(urlEvents, new TypeReference<List<Event>>() {});
        List<Player> players = mapper.readValue(urlPlayers, new TypeReference<List<Player>>() {});
        List<Team> teams = mapper.readValue(urlTeams, new TypeReference<List<Team>>() {});

        //update DB
        //TODO:
        // write code that'll update db data with json data

        //connect to DB
        //DbConnection dbConnection = new DbConnection();
        //Connection conn = dbConnection.getConnection();


    }




}
