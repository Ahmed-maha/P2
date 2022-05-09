package de.hrw.progra2.assignment5;

public abstract class Employee {

    private String name;
    protected final float[] labourHours = new float[5];


    // Gibt zurück, ob die vertraglich vereinbarten Arbeitsstunden
    // gesetzlich zulässig sind oder nicht
    public abstract boolean validLabourHours();

}
