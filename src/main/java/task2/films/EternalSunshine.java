package task2.films;

import task2.Film;
import task2.FilmData;

import java.io.FileNotFoundException;

public class EternalSunshine extends FilmData implements Film {
    public EternalSunshine(String subtittres) {
        super(subtittres);
    }

    @Override
    public void showFilm() {
        System.out.println(subtittres);
    }
}
