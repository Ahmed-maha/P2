package de.hrw.progra2.assignment5;

public abstract class ContractEmployee extends Employee {

    private float payPerHour;

    public ContractEmployee(String name, float mo, float tu, float we, float th, float fr, float payPerHour) {
        super(name, mo, tu, we, th, fr);
        this.payPerHour = payPerHour;
    }

    public float getPayPerHour() {
        return payPerHour;
    }

    public void setPayPerHour(float payPerHour) {
        this.payPerHour = payPerHour;
    }

    public float writeInvoice() {

        float counter = 0.0f;

        for (float labourHour : this.getLabourHours()) {
            counter += labourHour;
        }

        return counter * payPerHour;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", payPerHour=" + payPerHour;
    }
}
