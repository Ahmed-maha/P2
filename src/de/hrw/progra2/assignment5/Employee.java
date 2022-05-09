package de.hrw.progra2.assignment5;

public abstract class Employee {

    private String name;
    private final float[] labourHours = new float[5];


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
}
