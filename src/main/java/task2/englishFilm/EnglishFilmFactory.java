package task2.englishFilm;

import task2.SomeFilm;
import task2.films.EternalSunshine;
import task2.films.TheAvangers;
import task2.films.TheGodFather;

public class EnglishFilmFactory extends SomeFilm {
    @Override
    public TheGodFather showTheGodFather() {
        return new TheGodFather("The GodFather with English subtittres");
    }

    @Override
    public TheAvangers showTheAvangers() {
        return new TheAvangers("The Avangers with English subtittres");
    }

    @Override
    public EternalSunshine showEternalSunshine() {
        return new EternalSunshine("Eternal Sunshine with English subtittres");
    }
}
