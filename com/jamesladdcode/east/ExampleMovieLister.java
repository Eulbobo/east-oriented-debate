package com.jamesladdcode.east;

class ExampleMovieLister implements MovieLister {
	
	public ExampleMovieLister(MovieFinder finder) {
		
		this.finder = finder;
	}
	
	public void applyToTheMoviesDirectedBy(final MovieAction movieAction, final String director) {
		
		finder.findAllAndApply(
		    
		    new MovieAction() {
		    	
		    	public void applyTo(Movie movie) {
		    		
		    		movie.ifDirectedByDo(director, movieAction);
		    	}
		    }
		);
	}
	
	private final MovieFinder finder;
}
