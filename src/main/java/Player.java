public class Player {

    private float id;
    private String photo;
    private String web_name;
    private float team_code;
    private String status;
    private float code;
    private String first_name;
    private String second_name;
    private float squad_number;
    private String news;
    private float now_cost;
    private String news_added = null;
    private String chance_of_playing_this_round = null;
    private String chance_of_playing_next_round = null;
    private String value_form;
    private String value_season;
    private float cost_change_start;
    private float cost_change_event;
    private float cost_change_start_fall;
    private float cost_change_event_fall;
    private boolean in_dreamteam;
    private float dreamteam_count;
    private String selected_by_percent;
    private String form;
    private float transfers_out;
    private float transfers_in;
    private float transfers_out_event;
    private float transfers_in_event;
    private float loans_in;
    private float loans_out;
    private float loaned_in;
    private float loaned_out;
    private float total_points;
    private float event_points;
    private String points_per_game;
    private String ep_this = null;
    private String ep_next;
    private boolean special;
    private float minutes;
    private float goals_scored;
    private float assists;
    private float clean_sheets;
    private float goals_conceded;
    private float own_goals;
    private float penalties_saved;
    private float penalties_missed;
    private float yellow_cards;
    private float red_cards;
    private float saves;
    private float bonus;
    private float bps;
    private String influence;
    private String creativity;
    private String threat;
    private String ict_index;
    private float ea_index;
    private float element_type;
    private float team;


    // Getter Methods

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getWeb_name() {
        return web_name;
    }

    public void setWeb_name(String web_name) {
        this.web_name = web_name;
    }

    public float getTeam_code() {
        return team_code;
    }

    public void setTeam_code(float team_code) {
        this.team_code = team_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getCode() {
        return code;
    }

    public void setCode(float code) {
        this.code = code;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getSecond_name() {
        return second_name;
    }

    public void setSecond_name(String second_name) {
        this.second_name = second_name;
    }

    public float getSquad_number() {
        return squad_number;
    }

    public void setSquad_number(float squad_number) {
        this.squad_number = squad_number;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public float getNow_cost() {
        return now_cost;
    }

    public void setNow_cost(float now_cost) {
        this.now_cost = now_cost;
    }

    public String getNews_added() {
        return news_added;
    }

    public void setNews_added(String news_added) {
        this.news_added = news_added;
    }

    public String getChance_of_playing_this_round() {
        return chance_of_playing_this_round;
    }

    public void setChance_of_playing_this_round(String chance_of_playing_this_round) {
        this.chance_of_playing_this_round = chance_of_playing_this_round;
    }

    public String getChance_of_playing_next_round() {
        return chance_of_playing_next_round;
    }

    public void setChance_of_playing_next_round(String chance_of_playing_next_round) {
        this.chance_of_playing_next_round = chance_of_playing_next_round;
    }

    public String getValue_form() {
        return value_form;
    }

    public void setValue_form(String value_form) {
        this.value_form = value_form;
    }

    public String getValue_season() {
        return value_season;
    }

    public void setValue_season(String value_season) {
        this.value_season = value_season;
    }

    public float getCost_change_start() {
        return cost_change_start;
    }

    public void setCost_change_start(float cost_change_start) {
        this.cost_change_start = cost_change_start;
    }

    public float getCost_change_event() {
        return cost_change_event;
    }

    public void setCost_change_event(float cost_change_event) {
        this.cost_change_event = cost_change_event;
    }

    public float getCost_change_start_fall() {
        return cost_change_start_fall;
    }

    public void setCost_change_start_fall(float cost_change_start_fall) {
        this.cost_change_start_fall = cost_change_start_fall;
    }

    public float getCost_change_event_fall() {
        return cost_change_event_fall;
    }

    public void setCost_change_event_fall(float cost_change_event_fall) {
        this.cost_change_event_fall = cost_change_event_fall;
    }

    public boolean getIn_dreamteam() {
        return in_dreamteam;
    }

    public void setIn_dreamteam(boolean in_dreamteam) {
        this.in_dreamteam = in_dreamteam;
    }

    public float getDreamteam_count() {
        return dreamteam_count;
    }

    public void setDreamteam_count(float dreamteam_count) {
        this.dreamteam_count = dreamteam_count;
    }

    public String getSelected_by_percent() {
        return selected_by_percent;
    }

    public void setSelected_by_percent(String selected_by_percent) {
        this.selected_by_percent = selected_by_percent;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public float getTransfers_out() {
        return transfers_out;
    }

    public void setTransfers_out(float transfers_out) {
        this.transfers_out = transfers_out;
    }

    public float getTransfers_in() {
        return transfers_in;
    }

    public void setTransfers_in(float transfers_in) {
        this.transfers_in = transfers_in;
    }

    public float getTransfers_out_event() {
        return transfers_out_event;
    }

    public void setTransfers_out_event(float transfers_out_event) {
        this.transfers_out_event = transfers_out_event;
    }

    public float getTransfers_in_event() {
        return transfers_in_event;
    }

    public void setTransfers_in_event(float transfers_in_event) {
        this.transfers_in_event = transfers_in_event;
    }

    public float getLoans_in() {
        return loans_in;
    }

    public void setLoans_in(float loans_in) {
        this.loans_in = loans_in;
    }

    // Setter Methods

    public float getLoans_out() {
        return loans_out;
    }

    public void setLoans_out(float loans_out) {
        this.loans_out = loans_out;
    }

    public float getLoaned_in() {
        return loaned_in;
    }

    public void setLoaned_in(float loaned_in) {
        this.loaned_in = loaned_in;
    }

    public float getLoaned_out() {
        return loaned_out;
    }

    public void setLoaned_out(float loaned_out) {
        this.loaned_out = loaned_out;
    }

    public float getTotal_points() {
        return total_points;
    }

    public void setTotal_points(float total_points) {
        this.total_points = total_points;
    }

    public float getEvent_points() {
        return event_points;
    }

    public void setEvent_points(float event_points) {
        this.event_points = event_points;
    }

    public String getPoints_per_game() {
        return points_per_game;
    }

    public void setPoints_per_game(String points_per_game) {
        this.points_per_game = points_per_game;
    }

    public String getEp_this() {
        return ep_this;
    }

    public void setEp_this(String ep_this) {
        this.ep_this = ep_this;
    }

    public String getEp_next() {
        return ep_next;
    }

    public void setEp_next(String ep_next) {
        this.ep_next = ep_next;
    }

    public boolean getSpecial() {
        return special;
    }

    public void setSpecial(boolean special) {
        this.special = special;
    }

    public float getMinutes() {
        return minutes;
    }

    public void setMinutes(float minutes) {
        this.minutes = minutes;
    }

    public float getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(float goals_scored) {
        this.goals_scored = goals_scored;
    }

    public float getAssists() {
        return assists;
    }

    public void setAssists(float assists) {
        this.assists = assists;
    }

    public float getClean_sheets() {
        return clean_sheets;
    }

    public void setClean_sheets(float clean_sheets) {
        this.clean_sheets = clean_sheets;
    }

    public float getGoals_conceded() {
        return goals_conceded;
    }

    public void setGoals_conceded(float goals_conceded) {
        this.goals_conceded = goals_conceded;
    }

    public float getOwn_goals() {
        return own_goals;
    }

    public void setOwn_goals(float own_goals) {
        this.own_goals = own_goals;
    }

    public float getPenalties_saved() {
        return penalties_saved;
    }

    public void setPenalties_saved(float penalties_saved) {
        this.penalties_saved = penalties_saved;
    }

    public float getPenalties_missed() {
        return penalties_missed;
    }

    public void setPenalties_missed(float penalties_missed) {
        this.penalties_missed = penalties_missed;
    }

    public float getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(float yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public float getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(float red_cards) {
        this.red_cards = red_cards;
    }

    public float getSaves() {
        return saves;
    }

    public void setSaves(float saves) {
        this.saves = saves;
    }

    public float getBonus() {
        return bonus;
    }

    public void setBonus(float bonus) {
        this.bonus = bonus;
    }

    public float getBps() {
        return bps;
    }

    public void setBps(float bps) {
        this.bps = bps;
    }

    public String getInfluence() {
        return influence;
    }

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public String getCreativity() {
        return creativity;
    }

    public void setCreativity(String creativity) {
        this.creativity = creativity;
    }

    public String getThreat() {
        return threat;
    }

    public void setThreat(String threat) {
        this.threat = threat;
    }

    public String getIct_index() {
        return ict_index;
    }

    public void setIct_index(String ict_index) {
        this.ict_index = ict_index;
    }

    public float getEa_index() {
        return ea_index;
    }

    public void setEa_index(float ea_index) {
        this.ea_index = ea_index;
    }

    public float getElement_type() {
        return element_type;
    }

    public void setElement_type(float element_type) {
        this.element_type = element_type;
    }

    public float getTeam() {
        return team;
    }

    public void setTeam(float team) {
        this.team = team;
    }
}
