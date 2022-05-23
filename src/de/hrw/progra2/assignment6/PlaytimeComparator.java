package de.hrw.progra2.assignment6;

import java.util.Comparator;

public class PlaytimeComparator implements Comparator<Videogame> {


    @Override
    public int compare(Videogame o1, Videogame o2) {
        if (o1.getPlaytime() < o2.getPlaytime()){
            return -1;
        } else if (o1.getPlaytime() == o2.getPlaytime()) {
            return 0;
        } else {
            return 1;
        }
    }
}
