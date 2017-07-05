package com.jamesladdcode.east;

import java.io.PrintWriter;

import com.jamesladdcode.east.interfaces.Movie;
import com.jamesladdcode.east.interfaces.MovieAction;
import com.jamesladdcode.east.interfaces.MovieFinder;

public class Main {

    private static final Movie[] movies = {
            new ExampleMovie("StarWars", "George Lucus"),
            new ExampleMovie("Lost Highway", "David Lynch"),
            new ExampleMovie("Naked Lunch", "David Cronenberg"),
            new ExampleMovie("Mulholland Dr", "David Lynch"),
            new ExampleMovie("The Adventures of Buckaroo Banzai Across the 8th Dimension", "W.D.Richter"),
            new ExampleMovie("Wild At Heart", "David Lynch")
    };

    public static void visitAndApplyAction(final MovieAction selector) {
        for (int i = 0; i < movies.length; i++) {
            selector.applyTo(movies[i]);
        }
    }

    public static void findAndApply(final MovieFinder finder, final MovieAction action) {
        finder.findAllAndApply(action);
    }

    public static void main(final String[] args) {
        findAndApply((action) -> visitAndApplyAction(action),
                (movie) -> movie.doActionWithDirector("David Lynch",
                        (m) -> m.printOn(new PrintWriter(System.out))));
    }

}
