package de.hrw.progra2.assignment4;

import java.util.ArrayList;

public class StampCollection {

    private final ArrayList<Stamp> stampArrayList;

    public StampCollection() {
        stampArrayList = new ArrayList<>();
    }

    public void addStamp(Stamp stamp) {
        stampArrayList.add(stamp);
    }

    public void removeStamp(Stamp stamp) {
        stampArrayList.remove(stamp);
    }

    public int numberOfExtravagantStamps() {

        int counter = 0;

        for (Stamp stamp : stampArrayList) {
            if (stamp.estimateRarity().equals("extravagante Seltenheit")) {
                counter++;
            }
        }

        return counter;
    }

    public ArrayList<Stamp> historicValuableStamps() {

        ArrayList<Stamp> historicValuableStampsList = new ArrayList<>();

        for (Stamp stamp : stampArrayList) {
            if (stamp.isGermanHistoryStamp() && stamp.getCollectibleValue() > 5) {
                historicValuableStampsList.add(stamp);
            }
        }

        return historicValuableStampsList;

    }

    public float averageShippingValue() {

        float sumShippingValue = 0;

        for (Stamp stamp : stampArrayList) {
            sumShippingValue += stamp.getShippingValue();
        }

        return sumShippingValue / stampArrayList.size();

    }

    public void printValueStatistic() {

        int counter = 0;

        for (Stamp stamp : stampArrayList) {
            if (stamp.increasedInValue()) {
                counter++;
            }
        }

        System.out.println(counter);

    }

    @Override
    public String toString() {
        return "StampCollection: " + stampArrayList;
    }


}
