package com.jamesladdcode.east;

public class Main {

	public static void main(String[] args) {

		new ExampleMovieLister(new ExampleMovieFinder())
		    .applyToTheMoviesDirectedBy(
		    		new ExampleAddMovieAction(new ExampleMoviesClientConsoleAdaptor(System.out)), 
		    		"David Lynch");
		
		new ExampleMovieLister(new ExampleMovieFinder())
		    .applyToTheMoviesDirectedBy(
		    		new ExampleAddMovieAction(new ExampleMoviesClientFileAdaptor("movies.txt")), 
		    		"David Cronenberg");
	}
}
