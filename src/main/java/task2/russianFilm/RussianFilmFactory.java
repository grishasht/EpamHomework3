package task2.russianFilm;

import task2.SomeFilm;
import task2.films.EternalSunshine;
import task2.films.TheAvangers;
import task2.films.TheGodFather;

public class RussianFilmFactory extends SomeFilm {
    @Override
    public TheGodFather showTheGodFather() {
        return new TheGodFather("The GodFather with Russian subtittres");
    }

    @Override
    public TheAvangers showTheAvangers() {
        return new TheAvangers("The Avangers with Russian subtittres");
    }

    @Override
    public EternalSunshine showEternalSunshine() {
        return new EternalSunshine("Eternal Sunshine with Russian subtittres");
    }
}
