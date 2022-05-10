package de.hrw.progra2.assignment5;

import java.util.Arrays;

public abstract class Employee {

    private String name;
    private final float[] labourHours;


    public Employee(String name, float mo, float tu, float we, float th, float fr) {
        this.name = name;
        this.labourHours = new float[]{mo, tu, we, th, fr};
    }

    // Gibt zurück, ob die vertraglich vereinbarten Arbeitsstunden
    // gesetzlich zulässig sind oder nicht
    public abstract boolean validLabourHours();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float[] getLabourHours() {
        return labourHours;
    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", labourHours=" + Arrays.toString(labourHours);
    }
}
