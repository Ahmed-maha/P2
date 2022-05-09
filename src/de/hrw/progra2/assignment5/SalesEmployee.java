package de.hrw.progra2.assignment5;

public class SalesEmployee extends RegularEmployee {

    public SalesEmployee() {
        super(20);
    }

    @Override
    public boolean validLabourHours(){

        float counter = 0.0f;

        for (float labourHour : this.getLabourHours()) {

            counter += labourHour;

            if (counter > 48) {
                return false;
            }
        }

        return true;

    }
}
