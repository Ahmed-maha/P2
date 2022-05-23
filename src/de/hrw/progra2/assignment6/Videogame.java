package de.hrw.progra2.assignment6;

public abstract class Videogame {

    public static final PlaytimeComparator AMOUNT_PLAYTIME_COMPARATOR = new PlaytimeComparator(); //Wo soll das verwendet werden und wie?

    private String name;
    private int ageRating;
    private double playtime;
    private boolean isIndexed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAgeRating() {
        return ageRating;
    }

    public void setAgeRating(int ageRating) {
        this.ageRating = ageRating;
    }

    public double getPlaytime() {
        return playtime;
    }

    public void setPlaytime(double playtime) {
        this.playtime = playtime;
    }

    public boolean isIndexed() {
        return isIndexed;
    }

    public void setIndexed(boolean indexed) {
        isIndexed = indexed;
    }
}
