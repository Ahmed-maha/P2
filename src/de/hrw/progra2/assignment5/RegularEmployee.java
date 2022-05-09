package de.hrw.progra2.assignment5;

public abstract class RegularEmployee extends Employee implements CheckLabourHours, IsBoundToHourLimitation{

    private int vacation;
    private float salary;
    private int bonus;



    public boolean isFulltimeEmployee() {

        float counter = 0.0f;

        for (float labourHour : labourHours) {
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
