package de.hrw.progra2.assignment5;

public abstract class ContractEmployee extends Employee{

    private float payPerHour;


    public float writeInvoice () {

        float counter = 0.0f;

        for (float labourHour : labourHours) {
            counter += labourHour;
        }

        return counter * payPerHour;
    }

}
