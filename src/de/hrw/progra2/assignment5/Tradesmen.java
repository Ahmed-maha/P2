package de.hrw.progra2.assignment5;

public class Tradesmen extends Freelancer{

    public Tradesmen(String name, float mo, float tu, float we, float th, float fr, float payPerHour, boolean tradeRegulation) {
        super(name, mo, tu, we, th, fr, payPerHour, tradeRegulation);
    }

    @Override
    public float writeInvoice(){
        if (!tradeRegulationSigned()){
            return 0;
        } else {
            return super.writeInvoice();
        }
    }

    @Override
    public String toString() {
        return "Tradesmen{" + super.toString() +  "}";
    }

}
