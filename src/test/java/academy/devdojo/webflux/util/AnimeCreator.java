package academy.devdojo.webflux.util;

import academy.devdojo.webflux.domain.Anime;

public class AnimeCreator {

    public static Anime createAnimeToBeSaved(){
        return Anime.builder()
                .name("Naruto")
                .build();
    }

    public static Anime createValidAnime(){
        return Anime.builder()
                .id(1)
                .name("Naruto")
                .build();
    }

    public static Anime createValidUpdatedAnime(){
        return Anime.builder()
                .id(1)
                .name("Naruto shippuden")
                .build();
    }
}
