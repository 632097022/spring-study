package com.spring;

import java.util.List;
public class Meeting {
    private String theme;
    private List<Boss> Bosses;
    public Meeting() {
    }

    public String getTheme() {
        return theme;
    }

    @Override
    public String toString() {
        return "Meeting{" +
                "theme='" + theme + '\'' +
                ", Bosses=" + Bosses +
                '}';
    }

    public List<Boss> getBosses() {
        return Bosses;
    }

    public void setBosses(List<Boss> bosses) {
        Bosses = bosses;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Meeting(String theme, List<Boss> bosses) {
        this.theme = theme;
        Bosses = bosses;
    }
}
