package com.hackday.andy.jztv;

import java.util.ArrayList;
import java.util.List;

public final class MovieList {
    public static final String MOVIE_CATEGORY[] = {
            "浙江地方台"
    };

    public static List<Movie> list;

    public static List<Movie> setupMovies() {
        list = new ArrayList<Movie>();
        String title[] = {
                "Zeitgeist 2010_ Year in Review",
                "Google Demo Slam_ 20ft Search",
                "Introducing Gmail Blue",
                "Introducing Google Fiber to the Pole",
                "Introducing Google Nose"
        };

        String description = "ok andy";

        String videoUrl[] = {
                "http://v3.cztv.com/cztv/vod/2016/12/13/f3f48fc320794f55bd1c7a389fce9e7d/h264_800k_mp4.mp4_playlist.m3u8"
        };
        String bgImageUrl[] = {
                "https://www.andydog.top/resources/test1.png",
        };
        String cardImageUrl[] = {
                "https://www.andydog.top/resources/test1.png",
        };

        list.add(buildMovieInfo("category", title[0],
                description, "Studio Zero", videoUrl[0], cardImageUrl[0], bgImageUrl[0]));

        return list;
    }

    private static Movie buildMovieInfo(String category, String title,
            String description, String studio, String videoUrl, String cardImageUrl,
            String bgImageUrl) {
        Movie movie = new Movie();
        movie.setId(Movie.getCount());
        Movie.incCount();
        movie.setTitle(title);
        movie.setDescription(description);
        movie.setStudio(studio);
        movie.setCategory(category);
        movie.setCardImageUrl(cardImageUrl);
        movie.setBackgroundImageUrl(bgImageUrl);
        movie.setVideoUrl(videoUrl);
        return movie;
    }
}
