package com.jamesladdcode.east;

import java.io.PrintWriter;

import com.jamesladdcode.east.interfaces.Movie;
import com.jamesladdcode.east.interfaces.MovieAction;

public class ExampleMovie implements Movie {

	private final String title;
	private final String director;

	public ExampleMovie(final String title, final String director) {
		this.title = title;
		this.director = director;
	}

	@Override
    public void doActionWithDirector(final String director, final MovieAction action) {
		if (this.director.equals(director)) {
            action.applyTo(this);
        }
	}

	@Override
    public void doActionWithTitle(final String title, final MovieAction action) {
		if (this.title.equals(title)) {
            action.applyTo(this);
        }
	}

	@Override
    public void printOn(final PrintWriter writer) {

		writer.print("Movie (");
		writer.print("title: '");
		writer.print(title);
		writer.print("', director: '");
		writer.print(director);
		writer.println("')");

		writer.flush();
	}
}
