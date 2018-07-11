public class Event {

    private float id;
    private String name;
    private String deadline_time;
    private float average_entry_score;
    private boolean finished;
    private boolean data_checked;
    private String highest_scoring_entry = null;
    private float deadline_time_epoch;
    private float deadline_time_game_offset;
    private String deadline_time_formatted;
    private String highest_score = null;
    private boolean is_previous;
    private boolean is_current;
    private boolean is_next;


    // Getter Methods

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadline_time() {
        return deadline_time;
    }

    public void setDeadline_time(String deadline_time) {
        this.deadline_time = deadline_time;
    }

    public float getAverage_entry_score() {
        return average_entry_score;
    }

    public void setAverage_entry_score(float average_entry_score) {
        this.average_entry_score = average_entry_score;
    }

    public boolean getFinished() {
        return finished;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public boolean getData_checked() {
        return data_checked;
    }

    public void setData_checked(boolean data_checked) {
        this.data_checked = data_checked;
    }

    public String getHighest_scoring_entry() {
        return highest_scoring_entry;
    }

    public void setHighest_scoring_entry(String highest_scoring_entry) {
        this.highest_scoring_entry = highest_scoring_entry;
    }

    // Setter Methods

    public float getDeadline_time_epoch() {
        return deadline_time_epoch;
    }

    public void setDeadline_time_epoch(float deadline_time_epoch) {
        this.deadline_time_epoch = deadline_time_epoch;
    }

    public float getDeadline_time_game_offset() {
        return deadline_time_game_offset;
    }

    public void setDeadline_time_game_offset(float deadline_time_game_offset) {
        this.deadline_time_game_offset = deadline_time_game_offset;
    }

    public String getDeadline_time_formatted() {
        return deadline_time_formatted;
    }

    public void setDeadline_time_formatted(String deadline_time_formatted) {
        this.deadline_time_formatted = deadline_time_formatted;
    }

    public String getHighest_score() {
        return highest_score;
    }

    public void setHighest_score(String highest_score) {
        this.highest_score = highest_score;
    }

    public boolean getIs_previous() {
        return is_previous;
    }

    public void setIs_previous(boolean is_previous) {
        this.is_previous = is_previous;
    }

    public boolean getIs_current() {
        return is_current;
    }

    public void setIs_current(boolean is_current) {
        this.is_current = is_current;
    }

    public boolean getIs_next() {
        return is_next;
    }

    public void setIs_next(boolean is_next) {
        this.is_next = is_next;
    }
}