package task2.films;

import task2.Film;
import task2.FilmData;

import java.io.FileNotFoundException;

public class TheGodFather extends FilmData implements Film {
    public TheGodFather(String subtittres) {
        super(subtittres);
    }

    @Override
    public void showFilm() {
        System.out.println(subtittres);
    }
}
