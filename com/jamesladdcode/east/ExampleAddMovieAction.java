package com.jamesladdcode.east;

class ExampleAddMovieAction implements MovieAction {

	private final MoviesClient moviesClient;
	
	public ExampleAddMovieAction(MoviesClient moviesClient) {
	
		this.moviesClient = moviesClient;
	}
	
	public void applyTo(Movie movie) {

		moviesClient.add(movie);
	}
}
