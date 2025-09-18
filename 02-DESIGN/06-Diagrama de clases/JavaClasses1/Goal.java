package org.example.JavaClasses1;

public class Goal {
    private int id;
    private int nameMeta;
    private String objective;
    private String dateLimit;
    private String valueConcurrent;
    private User user;
    private IncomeGoal incomeGoal;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNameMeta() {
        return nameMeta;
    }

    public void setNameMeta(int nameMeta) {
        this.nameMeta = nameMeta;
    }

    public String getObjective() {
        return objective;
    }

    public void setObjective(String objective) {
        this.objective = objective;
    }

    public String getDateLimit() {
        return dateLimit;
    }

    public void setDateLimit(String dateLimit) {
        this.dateLimit = dateLimit;
    }

    public String getValueConcurrent() {
        return valueConcurrent;
    }

    public void setValueConcurrent(String valueConcurrent) {
        this.valueConcurrent = valueConcurrent;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public IncomeGoal getIncomeGoal() {
        return incomeGoal;
    }

    public void setIncomeGoal(IncomeGoal incomeGoal) {
        this.incomeGoal = incomeGoal;
    }
}