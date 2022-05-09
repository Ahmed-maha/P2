package de.hrw.progra2.assignment5;

public abstract class RegularEmployee extends Employee implements CheckLabourHours, IsBoundToHourLimitation{

    private int vacation;
    private float salary;
    private int bonus;


    public RegularEmployee(int vacation, float salary, int bonus) {
        this.vacation = vacation;
        this.salary = salary;
        this.bonus = bonus;
    }

    public RegularEmployee(float salary, int bonus) {
        this.salary = salary;
        this.bonus = bonus;
    }

    public RegularEmployee(int vacation) {
        this(0.0f, 0);
        this.vacation = vacation;
    }

    public boolean isFulltimeEmployee() {

        float counter = 0.0f;

        for (float labourHour : this.getLabourHours()) {
            counter += labourHour;
        }

        return counter > 35;

    }

    public String returnLabourHourWarning(){
        if (validLabourHours()) {
            return "Arbeitsstunden gültig";
        } else {
            return "Warnung, Arbeitsstunden ungültig!";
        }
    }



}
