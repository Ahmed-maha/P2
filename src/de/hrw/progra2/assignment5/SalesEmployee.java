package de.hrw.progra2.assignment5;

public class SalesEmployee extends RegularEmployee {

    public SalesEmployee(String name, float mo, float tu, float we, float th, float fr, float salary, int bonus) {
        super(name, mo, tu, we, th, fr, 20, salary, bonus);
    }

    @Override
    public boolean validLabourHours() {

        float counter = 0.0f;

        for (float labourHour : this.getLabourHours()) {

            counter += labourHour;

            if (counter > 48) {
                return false;
            }
        }

        return true;

    }

    @Override
    public String toString() {
        return "SalesEmployee{" + super.toString() + "}";
    }

}
