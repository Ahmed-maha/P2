package de.hrw.progra2.assignment5;

public class Freelancer extends ContractEmployee {

    private boolean tradeRegulation;

    public Freelancer(String name, float mo, float tu, float we, float th, float fr, float payPerHour, boolean tradeRegulation) {
        super(name, mo, tu, we, th, fr, payPerHour);
        this.tradeRegulation = tradeRegulation;
    }

    public boolean isTradeRegulation() {
        return tradeRegulation;
    }

    public void setTradeRegulation(boolean tradeRegulation) {
        this.tradeRegulation = tradeRegulation;
    }

    @Override
    public boolean validLabourHours() {
        return true;
    }

    public boolean tradeRegulationSigned(){
        return this.tradeRegulation;
    }
}
