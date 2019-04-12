package task2.films;

import task2.Film;
import task2.FilmData;

public class TheAvangers extends FilmData implements Film {
    public TheAvangers(String subtittres) {
        super(subtittres);
    }

    @Override
    public void showFilm() {
        System.out.println(subtittres);
    }
}
