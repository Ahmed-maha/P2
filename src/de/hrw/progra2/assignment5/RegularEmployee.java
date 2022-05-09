package de.hrw.progra2.assignment5;

public abstract class RegularEmployee extends Employee implements CheckLabourHours, IsBoundToHourLimitation{

    private final int vacation;
    private float salary;
    private int bonus;


    public RegularEmployee(int vacation, float salary, int bonus) {
        this.vacation = vacation;
        this.salary = salary;
        this.bonus = bonus;
    }

    public int getVacation() {
        return vacation;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public boolean isFulltimeEmployee() {

        float counter = 0.0f;

        for (float labourHour : this.getLabourHours()) {
            counter += labourHour;
        }

        return counter > 35;

    }

    @Override
    public String returnLabourHourWarning(){
        if (validLabourHours()) {
            return "Arbeitsstunden gültig";
        } else {
            return "Warnung, Arbeitsstunden ungültig!";
        }
    }



}
