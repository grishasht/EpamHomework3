package task2.ukrainianFilm;

import task2.SomeFilm;
import task2.films.EternalSunshine;
import task2.films.TheAvangers;
import task2.films.TheGodFather;

public class UkrainianFilmFactory extends SomeFilm{
    @Override
    public TheGodFather showTheGodFather() {
        return new TheGodFather("The GodFather with Ukrainian subtittres");
    }

    @Override
    public TheAvangers showTheAvangers() {
        return new TheAvangers("The Avangers with Ukrainian subtittres");
    }

    @Override
    public EternalSunshine showEternalSunshine() {
        return new EternalSunshine("Eternal Sunshine with Ukrainian subtittres");
    }


}
