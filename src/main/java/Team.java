import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Team {
    @JsonIgnore ArrayList<Object> current_event_fixture = new ArrayList<Object>();
    @JsonIgnore ArrayList<Object> next_event_fixture = new ArrayList<Object>();
    private float id;
    private String name;
    private float code;
    private String short_name;
    private boolean unavailable;
    private float strength;
    private float position;
    private float played;
    private float win;
    private float loss;
    private float draw;
    private float points;
    private boolean form;
    private String link_url;
    private float strength_overall_home;
    private float strength_overall_away;
    private float strength_attack_home;
    private float strength_attack_away;
    private float strength_defence_home;
    private float strength_defence_away;
    private float team_division;


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

    public float getCode() {
        return code;
    }

    public void setCode(float code) {
        this.code = code;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public boolean getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(boolean unavailable) {
        this.unavailable = unavailable;
    }

    public float getStrength() {
        return strength;
    }

    public void setStrength(float strength) {
        this.strength = strength;
    }

    public float getPosition() {
        return position;
    }

    public void setPosition(float position) {
        this.position = position;
    }

    public float getPlayed() {
        return played;
    }

    public void setPlayed(float played) {
        this.played = played;
    }

    public float getWin() {
        return win;
    }

    public void setWin(float win) {
        this.win = win;
    }

    public float getLoss() {
        return loss;
    }

    public void setLoss(float loss) {
        this.loss = loss;
    }

    public float getDraw() {
        return draw;
    }

    // Setter Methods

    public void setDraw(float draw) {
        this.draw = draw;
    }

    public float getPoints() {
        return points;
    }

    public void setPoints(float points) {
        this.points = points;
    }

    public boolean getForm() {
        return form;
    }

    public void setForm(boolean form) {
        this.form = form;
    }

    public String getLink_url() {
        return link_url;
    }

    public void setLink_url(String link_url) {
        this.link_url = link_url;
    }

    public float getStrength_overall_home() {
        return strength_overall_home;
    }

    public void setStrength_overall_home(float strength_overall_home) {
        this.strength_overall_home = strength_overall_home;
    }

    public float getStrength_overall_away() {
        return strength_overall_away;
    }

    public void setStrength_overall_away(float strength_overall_away) {
        this.strength_overall_away = strength_overall_away;
    }

    public float getStrength_attack_home() {
        return strength_attack_home;
    }

    public void setStrength_attack_home(float strength_attack_home) {
        this.strength_attack_home = strength_attack_home;
    }

    public float getStrength_attack_away() {
        return strength_attack_away;
    }

    public void setStrength_attack_away(float strength_attack_away) {
        this.strength_attack_away = strength_attack_away;
    }

    public float getStrength_defence_home() {
        return strength_defence_home;
    }

    public void setStrength_defence_home(float strength_defence_home) {
        this.strength_defence_home = strength_defence_home;
    }

    public float getStrength_defence_away() {
        return strength_defence_away;
    }

    public void setStrength_defence_away(float strength_defence_away) {
        this.strength_defence_away = strength_defence_away;
    }

    public float getTeam_division() {
        return team_division;
    }

    public void setTeam_division(float team_division) {
        this.team_division = team_division;
    }
}
