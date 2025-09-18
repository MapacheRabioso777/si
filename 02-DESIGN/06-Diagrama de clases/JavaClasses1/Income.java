package org.example.JavaClasses1;

import java.sql.Timestamp;

public class Income {
    private int id;
    private String description;
    private Timestamp date;
    private int value;
    private String frequency;
    private User user;
    private IncomeGoal incomeGoal;

    public IncomeGoal getIncomeGoal() {
        return incomeGoal;
    }

    public void setIncomeGoal(IncomeGoal incomeGoal) {
        this.incomeGoal = incomeGoal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}