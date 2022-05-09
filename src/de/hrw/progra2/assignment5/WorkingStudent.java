package de.hrw.progra2.assignment5;

public class WorkingStudent extends RegularEmployee {


    public WorkingStudent() {
        super(18);
    }

    @Override
    public boolean validLabourHours(){

        float counter = 0.0f;

        for (float labourHour : this.getLabourHours()) {

            if (labourHour > 8){
                return false;
            }

            counter += labourHour;

            if (counter > 20) {
                return false;
            }

        }

        return true;

    }
}
