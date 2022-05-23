package de.hrw.progra2.assignment5;

public class Intern extends RegularEmployee {

    public Intern(String name, float mo, float tu, float we, float th, float fr, float salary, int bonus) {
        super(name, mo, tu, we, th, fr, 0, salary, bonus);
    }

    @Override
    public boolean validLabourHours() {

        for (float labourHour : this.getLabourHours()) {

            //Solange der Praktikant an keinem Tag mehr als 8 Stunden arbeitet,
            //bleibt er auch insgesamt unter den 40 Std. in der Woche.
            if (labourHour > 8) {
                return false;
            }
        }

        return true;

    }

    @Override
    public String toString() {
        return "Intern{" + super.toString() + "}";
    }
}
