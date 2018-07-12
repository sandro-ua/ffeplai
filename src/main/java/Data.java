import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.xml.internal.bind.v2.TODO;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;


public class Data {

//    TODO: for now stats will load from file
//    URL urlEvents = new URL("https://fantasy.premierleague.com/drf/events/");
//    URL urlPlayers = new URL("https://fantasy.premierleague.com/drf/elements");
//    URL urlTeams = new URL("https://fantasy.premierleague.com/drf/teams");

    File fileEvents = new File("src/main/resources/events.json");
    File filePlayers = new File("src/main/resources/players.json");
    File fileTeams = new File("src/main/resources/teams.json");

    public Data() throws MalformedURLException {
    }

    public List<Player> getDataFromJson() throws IOException {
        ObjectMapper mapper = new ObjectMapper();

        List<Event> events = mapper.readValue(fileEvents, new TypeReference<List<Event>>() {});
        List<Player> players = mapper.readValue(filePlayers, new TypeReference<List<Player>>() {});
        List<Team> teams = mapper.readValue(fileTeams, new TypeReference<List<Team>>() {});

        //update DB
        //TODO:
        // write code that'll update db data with json data

        //connect to DB
        //DbConnection dbConnection = new DbConnection();
        //Connection conn = dbConnection.getConnection();

        return players;

    }




}
