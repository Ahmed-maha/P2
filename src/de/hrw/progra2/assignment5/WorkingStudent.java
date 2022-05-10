package de.hrw.progra2.assignment5;

public class WorkingStudent extends RegularEmployee {


    public WorkingStudent(String name, float mo, float tu, float we, float th, float fr, float salary, int bonus) {
        super(name, mo, tu, we, th, fr, 18, salary, bonus);
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

    @Override
    public String toString() {
        return "WorkingStudent{" + super.toString() +  "}";
    }

}
