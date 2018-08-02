public class Player {

    public static int id;
    private String photo;
    private String web_name;
    private int team_code;
    private String status;
    private int code;
    private String first_name;
    private String second_name;
    private int squad_number;
    private String news;
    private int now_cost;
    private String news_added;
    private int chance_of_playing_this_round;
    private int chance_of_playing_next_round;
    private String value_form;
    private String value_season;
    private int cost_change_start;
    private int cost_change_event;
    private int cost_change_start_fall;
    private int cost_change_event_fall;
    private boolean in_dreamteam;
    private int dreamteam_count;
    private float selected_by_percent;
    private String form;
    private int transfers_out;
    private int transfers_in;
    private int transfers_out_event;
    private int transfers_in_event;
    private int loans_in;
    private int loans_out;
    private int loaned_in;
    private int loaned_out;
    private int total_points;
    private int event_points;
    private float points_per_game;
    private String ep_this;
    private String ep_next;
    private boolean special;
    private int minutes;
    private int goals_scored;
    private int assists;
    private int clean_sheets;
    private int goals_conceded;
    private int own_goals;
    private int penalties_saved;
    private int penalties_missed;
    private int yellow_cards;
    private int red_cards;
    private int saves;
    private int bonus;
    private int bps;
    private float influence;
    private float creativity;
    private float threat;
    private float ict_index;
    private int ea_index;
    private int element_type;
    private int team;

    public Player() {

    }


    // Getter Methods

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public int getTeam_code() {
        return team_code;
    }

    public void setTeam_code(int team_code) {
        this.team_code = team_code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCode(int code) {
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

    public int getSquad_number() {
        return squad_number;
    }

    public void setSquad_number(int squad_number) {
        this.squad_number = squad_number;
    }

    public String getNews() {
        return news;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public int getNow_cost() {
        return now_cost;
    }

    public void setNow_cost(int now_cost) {
        this.now_cost = now_cost;
    }

    public String getNews_added() {
        return news_added;
    }

    public void setNews_added(String news_added) {
        this.news_added = news_added;
    }

    public int getChance_of_playing_this_round() {
        return chance_of_playing_this_round;
    }

    public void setChance_of_playing_this_round(int chance_of_playing_this_round) {
        this.chance_of_playing_this_round = chance_of_playing_this_round;
    }

    public int getChance_of_playing_next_round() {
        return chance_of_playing_next_round;
    }

    public void setChance_of_playing_next_round(int chance_of_playing_next_round) {
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

    public int getCost_change_start() {
        return cost_change_start;
    }

    public void setCost_change_start(int cost_change_start) {
        this.cost_change_start = cost_change_start;
    }

    public int getCost_change_event() {
        return cost_change_event;
    }

    public void setCost_change_event(int cost_change_event) {
        this.cost_change_event = cost_change_event;
    }

    public int getCost_change_start_fall() {
        return cost_change_start_fall;
    }

    public void setCost_change_start_fall(int cost_change_start_fall) {
        this.cost_change_start_fall = cost_change_start_fall;
    }

    public int getCost_change_event_fall() {
        return cost_change_event_fall;
    }

    public void setCost_change_event_fall(int cost_change_event_fall) {
        this.cost_change_event_fall = cost_change_event_fall;
    }

    public boolean getIn_dreamteam() {
        return in_dreamteam;
    }

    public void setIn_dreamteam(boolean in_dreamteam) {
        this.in_dreamteam = in_dreamteam;
    }

    public int getDreamteam_count() {
        return dreamteam_count;
    }

    public void setDreamteam_count(int dreamteam_count) {
        this.dreamteam_count = dreamteam_count;
    }

    public float getSelected_by_percent() {
        return selected_by_percent;
    }

    public void setSelected_by_percent(float selected_by_percent) {
        this.selected_by_percent = selected_by_percent;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public int getTransfers_out() {
        return transfers_out;
    }

    public void setTransfers_out(int transfers_out) {
        this.transfers_out = transfers_out;
    }

    public int getTransfers_in() {
        return transfers_in;
    }

    public void setTransfers_in(int transfers_in) {
        this.transfers_in = transfers_in;
    }

    public int getTransfers_out_event() {
        return transfers_out_event;
    }

    public void setTransfers_out_event(int transfers_out_event) {
        this.transfers_out_event = transfers_out_event;
    }

    public int getTransfers_in_event() {
        return transfers_in_event;
    }

    public void setTransfers_in_event(int transfers_in_event) {
        this.transfers_in_event = transfers_in_event;
    }

    public int getLoans_in() {
        return loans_in;
    }

    public void setLoans_in(int loans_in) {
        this.loans_in = loans_in;
    }


    // Setter Methods

    public int getLoans_out() {
        return loans_out;
    }

    public void setLoans_out(int loans_out) {
        this.loans_out = loans_out;
    }

    public int getLoaned_in() {
        return loaned_in;
    }

    public void setLoaned_in(int loaned_in) {
        this.loaned_in = loaned_in;
    }

    public int getLoaned_out() {
        return loaned_out;
    }

    public void setLoaned_out(int loaned_out) {
        this.loaned_out = loaned_out;
    }

    public int getTotal_points() {
        return total_points;
    }

    public void setTotal_points(int total_points) {
        this.total_points = total_points;
    }

    public int getEvent_points() {
        return event_points;
    }

    public void setEvent_points(int event_points) {
        this.event_points = event_points;
    }

    public float getPoints_per_game() {
        return points_per_game;
    }

    public void setPoints_per_game(float points_per_game) {
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

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getGoals_scored() {
        return goals_scored;
    }

    public void setGoals_scored(int goals_scored) {
        this.goals_scored = goals_scored;
    }

    public int getAssists() {
        return assists;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public int getClean_sheets() {
        return clean_sheets;
    }

    public void setClean_sheets(int clean_sheets) {
        this.clean_sheets = clean_sheets;
    }

    public int getGoals_conceded() {
        return goals_conceded;
    }

    public void setGoals_conceded(int goals_conceded) {
        this.goals_conceded = goals_conceded;
    }

    public int getOwn_goals() {
        return own_goals;
    }

    public void setOwn_goals(int own_goals) {
        this.own_goals = own_goals;
    }

    public int getPenalties_saved() {
        return penalties_saved;
    }

    public void setPenalties_saved(int penalties_saved) {
        this.penalties_saved = penalties_saved;
    }

    public int getPenalties_missed() {
        return penalties_missed;
    }

    public void setPenalties_missed(int penalties_missed) {
        this.penalties_missed = penalties_missed;
    }

    public int getYellow_cards() {
        return yellow_cards;
    }

    public void setYellow_cards(int yellow_cards) {
        this.yellow_cards = yellow_cards;
    }

    public int getRed_cards() {
        return red_cards;
    }

    public void setRed_cards(int red_cards) {
        this.red_cards = red_cards;
    }

    public int getSaves() {
        return saves;
    }

    public void setSaves(int saves) {
        this.saves = saves;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int getBps() {
        return bps;
    }

    public void setBps(int bps) {
        this.bps = bps;
    }

    public float getInfluence() {
        return influence;
    }

    public void setInfluence(float influence) {
        this.influence = influence;
    }

    public float getCreativity() {
        return creativity;
    }

    public void setCreativity(float creativity) {
        this.creativity = creativity;
    }

    public float getThreat() {
        return threat;
    }

    public void setThreat(float threat) {
        this.threat = threat;
    }

    public float getIct_index() {
        return ict_index;
    }

    public void setIct_index(float ict_index) {
        this.ict_index = ict_index;
    }

    public int getEa_index() {
        return ea_index;
    }

    public void setEa_index(int ea_index) {
        this.ea_index = ea_index;
    }

    public int getElement_type() {
        return element_type;
    }

    public void setElement_type(int element_type) {
        this.element_type = element_type;
    }

    public int getTeam() {
        return team;
    }

    public void setTeam(int team) {
        this.team = team;
    }

    protected void printPlayer() {
        System.out.println(String.format(this.first_name + " " + this.second_name + " [" + this.team+ "] " + this.now_cost + " " + this.total_points));
    }
/*
    @Override
    public String toString() {
        return String.format(this.first_name + " " + this.second_name + " [" + this.team+ "] " + this.now_cost + " " + this.total_points + "\n");
    }*/
}
