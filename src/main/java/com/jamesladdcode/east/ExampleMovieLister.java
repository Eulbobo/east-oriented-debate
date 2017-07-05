package com.jamesladdcode.east;

import com.jamesladdcode.east.interfaces.MovieAction;
import com.jamesladdcode.east.interfaces.MovieFinder;
import com.jamesladdcode.east.interfaces.MovieLister;

public class ExampleMovieLister implements MovieLister {

    private final MovieFinder finder;

	public ExampleMovieLister(final MovieFinder finder) {
		this.finder = finder;
	}

    @Override
    public void applyToTheMovies(final MovieAction action) {
        this.finder.findAllAndApply(action);
    }

}
