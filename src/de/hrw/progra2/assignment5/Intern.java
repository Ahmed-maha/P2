package de.hrw.progra2.assignment5;

public class Intern extends RegularEmployee{

    public Intern() {
        super(0);
    }

    @Override
    public boolean validLabourHours(){

        for (float labourHour : this.getLabourHours()) {

            //Solange der Praktikant an keinem Tag mehr als 8 Stunden arbeitet,
            //bleibt er auch insgesamt unter den 40 Std. in der Woche.
            if (labourHour > 8){
                return false;
            }
        }

        return true;

    }

}
